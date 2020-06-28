package lib;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseClass
{

	public static WebDriver driver=null;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest logger;
	
	public JavascriptExecutor js;
	
	String concantenate=".";

	@BeforeSuite
	public void startReport()
	{

		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy hh_mm a");
		Date date = new Date();
		String Updated_Time = dateFormat.format(date);

		htmlReporter = new ExtentHtmlReporter(
				System.getProperty("user.dir") + "./Reports/ " + Updated_Time +" Automation Report"+ ".html");
		// Create an object of Extent Reports
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Application Name", "Test Automation");
		extent.setSystemInfo("Environment", "Quality Assurance");
		extent.setSystemInfo("User Name", "Puja Das");
		htmlReporter.config().setDocumentTitle("Selenium Automation Report ");
		// Name of the report
		htmlReporter.config().setReportName("Test Automation");
		// Dark Theme
		htmlReporter.config().setTheme(Theme.DARK);
	}
	
	
	public static String getScreenShot(WebDriver driver, String screenshotName) throws IOException
	{
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		// after execution, you could see a folder "FailedTestsScreenshots" under src
		// folder
		String destination = System.getProperty("user.dir") + "\\Screenshots\\" + screenshotName + dateName + ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}
	

	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName)
	{
		
		System.out.println("Brwoser name is: "+browserName);
//		String browser = "chrome";
		if (browserName.equalsIgnoreCase("chrome"))
		{
			
//			String downloadFilePath = "C:\\Users\\dheer\\Desktop\\musicfile";
//
//			HashMap<String, Object> chromepref = new HashMap<String, Object>();
//
//			chromepref.put("profile.default_content_settings.popup", 0);
//			chromepref.put("download.default_directory", downloadFilePath);
//			
//			ChromeOptions options = new ChromeOptions();
//			options.addArguments("--disable-notifications");
//			options.setExperimentalOption("prefs", chromepref);
//
//// System.setProperty("webdriver.chrome.driver", "chromedriver_79.exe");
//			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
//			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//			driver = new ChromeDriver(options);
			
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		}

		else if (browserName.equalsIgnoreCase("firefox"))
		{

			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver=new FirefoxDriver();

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		}
		
		js= (JavascriptExecutor) driver;
	}
	
	
	@BeforeMethod
	public void createReportTest(Method method)
	{
		String descriptiveTestName=method.getAnnotation(Test.class).testName();
		
		logger = extent.createTest(descriptiveTestName);
		
	}
	
	@AfterMethod
	public void getResult(ITestResult result) throws Exception
	{

		if (result.getStatus() == ITestResult.FAILURE)
		{
			logger.log(Status.FAIL,MarkupHelper.createLabel(result.getMethod().getDescription() + " - Test Case Failed", ExtentColor.RED));
			logger.log(Status.FAIL,MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
			String screenshotPath = concantenate+Utility.takeDesktopScreenshot(driver, result.getName());
			System.out.println("screenshotPath" + screenshotPath);
			logger.fail("Test Case Failed Snapshot is below ", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
			System.out.println("Begin...GetResult..");
		} 
		else if (result.getStatus() == ITestResult.SKIP)
		{

			logger.log(Status.SKIP,
					MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE));
		} 
		else if (result.getStatus() == ITestResult.SUCCESS)
		{

			logger.log(Status.PASS,
					MarkupHelper.createLabel(result.getName() + " Test Case PASSED", ExtentColor.GREEN));
		}
		// driver.close();

	}
	
	@AfterTest
	public void tearDown() throws Exception
	{
		extent.flush();
		Thread.sleep(10000);
		driver.quit();
		
	}
	


}
