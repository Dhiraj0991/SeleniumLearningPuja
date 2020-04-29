package changeWebpageText;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TextChange
{
	WebDriver driver;

	@Test
	public void openmail() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver_80.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://accounts.google.com/signin");
		Thread.sleep(2000);
		WebElement oldtext= driver.findElement(By.xpath("//span[@class='NlWrkb snByac']"));
		String newtext = "arguments[0].innerHTML='already have an account,so no need to create'";
		((JavascriptExecutor) driver).executeScript(newtext, oldtext);
		
	}
}
