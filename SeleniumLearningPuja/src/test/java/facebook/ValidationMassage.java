package facebook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ValidationMassage extends BaseClassForFacebook
{
	public ValidationMassage() 
	{
		super();
		
	}
	
	@Test//(priority = 1)
	public void validateErrormassageForName() throws Exception
	{	
		driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
		String str1 = driver.findElement(By.xpath("//div[contains(@id,'js')]")).getText();
		System.out.println(str1);
		assertion.assertEquals(str1, "What's your name?");
		
		
	}
	
	
	
	@Test(priority = 2)
	public void validateErrorMassageForSurname()
	{
		driver.findElement(By.xpath("(//input[contains(@id,'u_0')])[5]")).click();
		String str2=driver.findElement(By.xpath("(//div[contains(@id,'js')])[2]")).getText();
		System.out.println(str2);
		assertion.assertEquals(str2, "What's your name?");	
	}
	
	
	@Test(priority = 3)
	public void validateErrorMassageFormobilenumber()
	{
		driver.findElement(By.xpath("(//input[contains(@id,'u_0')])[6]")).click();
		String str3 = driver.findElement(By.xpath("(//div[contains(@id,'js')])[2]")).getText();
		System.out.println(str3);
		assertion.assertEquals(str3, "You'll use this when you log in and if you ever need to reset your password.");
	}
	
	
	@Test(priority=4)
	public void validateErrorMassageForPassword()
	{
		driver.findElement(By.xpath("(//input[contains(@id,'u_0')])[8]")).click();
		String str4 = driver.findElement(By.xpath("(//div[contains(@id,'js')])[3]")).getText();
		System.out.println(str4);
		assertion.assertEquals(str4, "Enter a combination of at least six numbers, letters and punctuation marks (such as ! and &).");
	}
	
	
	@Test(priority=5)
	public void validateErrorMassageForGender()
	{
		driver.findElement(By.xpath("//i[@class='_5dbc _8esb img sp_UQETc8Y6QpO sx_ad93cf']")).click();
		String str5 = driver.findElement(By.xpath("(//div[contains(@id,'js')])[2]")).getText();
		System.out.println(str5);
		assertion.assertEquals(str5, "Please choose a gender. You can change who can see this later.");
		driver.findElement(By.xpath("//label[contains(text(),'Custom')]")).click();
		driver.findElement(By.xpath("//select[@name='preferred_pronoun']")).click();
		driver.findElement(By.xpath("(//div[@class='clearfix'])[1]")).click();
		driver.findElement(By.xpath("//i[@class='mrm _5dbc _8esb img sp_UQETc8Y6QpO sx_ad93cf']")).click();
		String str6=driver.findElement(By.xpath("(//div[contains(@id,'js')])[3]")).getText();
		System.out.println(str6);
		assertion.assertEquals(str6, "Please select your pronoun.");
		
		
	}
	
}
