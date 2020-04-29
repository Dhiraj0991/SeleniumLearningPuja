package facebook;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BaseClassForFacebook 
{
	WebDriver driver;
	SoftAssert assertion=new SoftAssert();
	@Test
	
	public void searchFacebooksite() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","chromedriver_80.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='sbtc']//span)[1]")).click();
		driver.findElement(By.xpath("//h3[contains(text(),'Facebook - Log In or Sign Up')]")).click();	
		
		
	}
	
}
