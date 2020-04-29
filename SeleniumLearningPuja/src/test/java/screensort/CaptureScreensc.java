package screensort;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import lib.Utility;

public class CaptureScreensc
{
	WebDriver driver;

	@Test
	public void Testcase1() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver_80.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://jupiter.cloud.planittesting.com");
		Utility.getScreenshot(driver, "screenShot");
//		TakesScreenshot tS = (TakesScreenshot) driver;
//		File src = tS.getScreenshotAs(OutputType.FILE);
//		String destination = "C:\\Users\\PUJA\\eclipse-workspace\\SeleniumLearning\\Screenshots\\";
//		FileUtils.copyFile(src, new File(destination+"jupytertoysopen"+".png"));
		driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
		Utility.getScreenshot(driver, "screenShot1");
//		 src = tS.getScreenshotAs(OutputType.FILE);
//		 destination = "C:\\Users\\PUJA\\eclipse-workspace\\SeleniumLearning\\Screenshots\\";
//		FileUtils.copyFile(src, new File(destination+"conctbutton"+".png"));
//		
		
	}
	
	
}
