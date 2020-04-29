package jupyter_toys;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class FreeText
{
	WebDriver driver;
	@Test(priority = 1)
	public void freetext()
	{

		System.setProperty("webdriver.chrome.driver", "chromedriver_80.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://jupiter.cloud.planittesting.com");
		driver.findElement(By.xpath("//a[contains(text(),'Shop')]")).click();
		for (int i = 0; i < 2; i++)
		{

			driver.findElement(By.xpath("(//a[contains(text(),'Buy')])[6]")).click();

		}
		driver.findElement(By.xpath("(//a[contains(text(),'Buy')])[4]")).click();
		driver.findElement(By.xpath("//li[@id='nav-cart']//a[1]")).click();
		String str = driver.findElement(By.xpath("//tr[1]//td[3]//input[1]")).getAttribute("value");
		System.out.println(str);

	}
}
