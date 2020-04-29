package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateAccount extends BaseClassForFacebook
{
	public CreateAccount() 
	{
		super();
		
	}
	
	@Test
	public void WriteInformation()
	{	
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sanjib");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Adhikari");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sanjibadhikari1992@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("sanjibadhikari1992@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("don'tknow9");
		WebElement dropdownvalues=driver.findElement(By.id("day"));
		Select dd=new Select(dropdownvalues);
		dd.selectByValue("11");
		WebElement dropdownvalues1=driver.findElement(By.id("month"));
		Select dd1=new Select(dropdownvalues1);
		dd1.selectByValue("8");
		WebElement dropdownvalues2=driver.findElement(By.id("year"));
		Select dd2=new Select(dropdownvalues2);
		dd2.selectByValue("1994");
		driver.findElement(By.xpath("(//input[@name='sex'])[3]")).click();
		WebElement dropdownvalues3=driver.findElement(By.name("preferred_pronoun"));
		Select dd3=new Select(dropdownvalues3);
		System.out.println(dd3.getFirstSelectedOption().getText());
		dd3.selectByValue("6");
		driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
		String str=driver.findElement(By.xpath("//div[@id='reg_error_inner']")).getText();
		System.out.println(str);
		assertion.assertEquals(str, "There was an error with your registration. Please try registering again.");
		
	}
}
