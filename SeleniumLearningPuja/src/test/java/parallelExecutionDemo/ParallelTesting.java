package parallelExecutionDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import lib.BaseClass;

public class ParallelTesting extends BaseClass
{
	
//	WebDriver driver=null;
//
//	@Parameters("browserName")
//	@BeforeTest
//	public void setUp(String browserName)
//	{
//		
//		System.out.println("Browser Name is:"+browserName);
//		if (browserName.equalsIgnoreCase("chrome"))
//		{
//			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//			driver=new ChromeDriver();
//		}
//		
//		else if (browserName.equalsIgnoreCase("firefox"))
//		{
//			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
//			driver=new FirefoxDriver();
//		}
//		
//		
//		
//	}
	
	
	// Dont execute this java class but execute the paralleltesting.xml file as TestNG Suite
	
	@Test
	public void test1() throws Exception
	{
//		driver.manage().window().maximize(); // maximize window
//		driver.manage().deleteAllCookies(); // delete all the cookies
//
//		// dynamic wait
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");

		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//span"));

		System.out.println("total number of suggestions in search box:::===>" + list.size());

		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().contains("selenium tutorial"))
			{
				list.get(i).click();
				break;
			}

		}

	}
	
	@AfterTest
	public void tearDown() throws Exception
	{
		Thread.sleep(15000);
		driver.quit();
	}
}
