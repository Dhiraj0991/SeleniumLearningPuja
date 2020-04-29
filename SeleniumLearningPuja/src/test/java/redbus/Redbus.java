package redbus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Redbus
{
	WebDriver driver;

	@Test(priority = 1)
	public void errorMessage()
	{
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "chromedriver_80.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//div[contains(@id,'select_box_sign')]")).click();
		driver.findElement(By.xpath("//li[@id='signInLink']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		
		//driver.switchTo().alert().dismiss();
//		driver.findElement(By.xpath("//input[@id='mobileNoInp']")).sendKeys("1234");
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//div[@class='mobileInput clearfix']//input[@id='mobileNoInp']")).sendKeys("1234");
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id='mobileNoInp']")).click();
				//*[@id="mobileNoInp"]
		//driver.findElement(By.xpath("//div[@class='mobileInput clearfix']//input[@id='mobileNoInp']")).sendKeys("1234");
//		String str = driver.findElement(By.xpath("//input[@id='mobileNoInp']")).getText();
//		System.out.println(str);
//		Assert.assertEquals(str, "What's your name?");
	}
}
