package seleniumSession;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstClassTestNG
{
	WebDriver driver;
	String url;

	@Test
	public void main()
	{
	
//		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Browser_Drivers\\chromedriver_80\\chromedriver_80.exe");
//		System.setProperty("webdriver.chrome.driver", ".\\chromedriver\\chromedriver_80.exe");
		System.setProperty("webdriver.chrome.driver", "chromedriver_80.exe");
		driver= new ChromeDriver();
		url="https://www.google.com/";
		driver.get(url);
		
		
		
//		driver.findElement(By.name("q")).sendKeys("Puja");
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
//		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/div[2]/center/input[1]")).click();

	}
	
	@Test
	public void name()
	{
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		
		Assert.assertEquals(currentUrl, url);
//		Assert.assertEquals(currentUrl.equalsIgnoreCase(currentUrl), url.equalsIgnoreCase(url));
		
		System.out.println("xyz");
//		if (currentUrl.equals(url))
//		{
//			System.out.println("PASS");
//		} else
//		{
//			System.out.println("FAIL");
//		}
//	
		
	}
	
	@Test
	public void tearDown()
	{
		driver.quit();
	}

}
