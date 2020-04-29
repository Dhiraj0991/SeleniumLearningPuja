package facebook_1st;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FacebookClass {
	 WebDriver driver;


	@Test(priority = 1)
	public void errorMessage() {

		System.setProperty("webdriver.chrome.driver", "chromedriver_80.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
		String str = driver.findElement(By.xpath("//div[contains(@id,'js')]")).getText();
		System.out.println(str);
		Assert.assertEquals(str, "What's your name?");

	}
	

	@Test(priority = 2)
	public void validmobilenumber() {
		driver.findElement(By.xpath("(//input[contains(@id,'u_0')])[6]")).click();
		String str = driver.findElement(By.xpath("(//div[contains(@id,'js')])[2]")).getText();
		System.out.println(str);
		Assert.assertEquals(str, "You'll use this when you log in and if you ever need to reset your password.");
		
	}
	
	
	@Test(priority = 3)
	public void password()
	{
		driver.findElement(By.xpath("(//input[contains(@id,'u_0')])[8]")).click();
		String str = driver.findElement(By.xpath("(//div[contains(@id,'js')])[3]")).getText();
		System.out.println(str);
		
		
		
	}
	
	
	@Test
	public void logIn()
	{
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		driver.findElement(By.id("email")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
