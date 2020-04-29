package changeWebpageText;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CoronaTextChange
{
	WebDriver driver;

	@Test
	public void openmail() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver_80.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mygov.in/covid-19/");
		Thread.sleep(2000);
		WebElement oldtext= driver.findElement(By.xpath("(//span[@class='icount'])[4]"));
		//String newtext = "arguments[0].innerHTML='no more death case'";
		String newtext = "arguments[0].innerHTML='SUKRITI DHARA'";
		((JavascriptExecutor) driver).executeScript(newtext, oldtext);
		
	}
}
