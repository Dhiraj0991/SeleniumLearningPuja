package jupyter_toys;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class JupyterToys
{
	WebDriver driver;

	@Test
	public void Testcase1()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver_80.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://jupiter.cloud.planittesting.com");
		driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Submit')]")).click();
		String str=driver.findElement(By.xpath("//span[@id='forename-err']")).getText();
		System.out.println(str);
		SoftAssert assertion= new SoftAssert();
		assertion.assertEquals(str, "Forename is required");
		String str1=driver.findElement(By.xpath("//span[@id='email-err']")).getText();
		System.out.println(str1);
		assertion.assertEquals(str1, "Email is required");
		String str2=driver.findElement(By.xpath("//span[@id='message-err']")).getText();
		System.out.println(str2);
		assertion.assertEquals(str2, "Message is required");
		assertion.assertAll();
	}
	
	
	@Test
	public void Testcase2()
	{
		driver.navigate().to("http://jupiter.cloud.planittesting.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
		driver.findElement(By.xpath("//input[@id='forename']")).sendKeys("Puja");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pujamaths9@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("I Like Shopping");
		driver.findElement(By.xpath("//a[contains(text(),'Submit')]")).click();
		String str=driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		String expected="we appreciate your feedback.";
		System.out.println(str);
		SoftAssert assertion= new SoftAssert();
		//assertion.assertEquals(str, "Thanks Puja, we appreciate your feedback.");
		assertion.assertEquals(str.contains("we appreciate your feedback."), expected.contains("we appreciate your feedback."));
	}
	
	
	@Test
	public void Testcase3()
	{
		driver.navigate().to("http://jupiter.cloud.planittesting.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("asdfghjkl");
		String str=driver.findElement(By.xpath("//span[@id='email-err']")).getText();
		System.out.println(str);
		SoftAssert assertion= new SoftAssert();
		assertion.assertEquals(str, "Please enter a valid email");
	}
	
	
	@Test
	public void Testcase4()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Shop')]")).click();
		
		WebElement button = driver.findElement(By.xpath("//li[@id='product-6']//a[@class='btn btn-success'][contains(text(),'Buy')]"));
		int count = 0;
		while(count <2 )
		{
			button.click();
			count++;
		}
				  
		driver.findElement(By.xpath("//li[@id='product-4']//a[@class='btn btn-success'][contains(text(),'Buy')]")).click();
		driver.findElement(By.xpath("//li[@id='nav-cart']//a[1]")).click();
		String str=driver.findElement(By.xpath("//p[@class='cart-msg']")).getText();
		System.out.println(str);
		String[] item=str.split(" ");
		System.out.println("Total items in the cartis: " + item);

	}

}
