package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RahulShetty
{
	WebDriver driver;
	@Test
	public void name()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver_80.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/#/practice-project");
		
		driver.findElement(By.xpath("//*[@id=\"form-submit\"]")).click();
	}
}
