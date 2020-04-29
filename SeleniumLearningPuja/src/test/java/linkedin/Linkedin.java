package linkedin;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Linkedin
{
	WebDriver driver;
	
	@Test
	public void erroremail()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver_80.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.linkedin.com/");
		driver.findElement(By.xpath("(//a[text()='Join now'])")).click();
		driver.findElement(By.xpath("(//button[text()='Agree & Join'])")).click();
		
		String str1=driver.findElement(By.xpath("/html/body/div/main/form/div[3]/div/p")).getText();
		System.out.println(str1);
		Assert.assertEquals(str1,"Please enter your email address or mobile number.");
		
		driver.findElement(By.xpath("//input[contains(@id,'email-or-phone')]")).sendKeys("sanjibadhikari791@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id,'email-or-phone')]")).sendKeys(Keys.ENTER);
	}
	@Test
	public void errorpassword()
	{
		
		//String str2=driver.findElement(By.xpath("/html/body/div/main/form/div[3]/div/p")).getText();
		String str2=driver.findElement(By.xpath("(//p[text()='Please enter your password.'])")).getText();
		System.out.println(str2);
		Assert.assertEquals(str2, "Please enter your password.");
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("sanjib");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(Keys.ENTER);
		
		
	}

}
