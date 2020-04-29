package jupyter_toys;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import lib.BaseClass;

public class Fortest extends BaseClass
{

	public Fortest() throws Exception
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void Testcase1()
	{
		
		driver.get("http://jupiter.cloud.planittesting.com");
		driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
		driver.findElement(By.xpath("//input[@id='email']")).click();
//		String puja=driver.findElement(By.xpath("//input[@id='email']")).getAttribute("validationMessage");
//		System.out.println(puja);
		WebElement str=driver.findElement(By.xpath("//input[@id='forename']"));
		driver.findElement(By.xpath("//a[contains(text(),'Submit')]")).click();
		str.sendKeys("Puja");
//		//SoftAssert assertion = new SoftAssert();
//		//assertion.assertEquals(str.length(), 0);
		
		String str1=str.getAttribute("validationMessage");
		Assert.assertEquals(str1.length(), 0);
//		if (str1.length() > 0)
//		{
//			System.out.println(str1); // do your validation to check if the message is the one expected
//		} 
//		else 
//		{
//			System.out.println("Warning message was not displayed properly");
//		}
		
		
	}
}
