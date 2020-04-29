package facebook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LogInAnAccount extends BaseClassForFacebook
{
	public LogInAnAccount() 
	{
		super();
		
	}
	@Test
	public void writeinfo()
	{
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--disable-notifications");
//		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8240856660");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("sumansksms");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		
	}
	
}
