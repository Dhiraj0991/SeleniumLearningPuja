package gmail;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Gmail
{
	WebDriver driver;
	
	@Test
	public void openmail() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver_80.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://accounts.google.com/signin");
		//driver.findElement(By.xpath("(//input[@id='identifierId'])")).click();
		driver.findElement(By.xpath("(//input[@id='identifierId'])")).sendKeys("pujamaths10@gmail.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("simasrikanta12345");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
	}
	
	
}
