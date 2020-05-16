package lib;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass
{

	public static WebDriver driver;

	public BaseClass() throws Exception
	{

		String browser = "chrome";
		if (browser.equalsIgnoreCase("chrome"))
		{
			
			String downloadFilePath = "C:\\Users\\dheer\\Desktop\\musicfile";

			HashMap<String, Object> chromepref = new HashMap<String, Object>();

			chromepref.put("profile.default_content_settings.popup", 0);
			chromepref.put("download.default_directory", downloadFilePath);
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			options.setExperimentalOption("prefs", chromepref);

// System.setProperty("webdriver.chrome.driver", "chromedriver_79.exe");
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		}

		else if (browser.equalsIgnoreCase("firefox"))
		{

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}

	}

}
