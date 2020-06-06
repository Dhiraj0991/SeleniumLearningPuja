package javascriptExecutorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.BaseClass;

public class SendKeysClick extends BaseClass
{

	public SendKeysClick() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void login()
	{
		logger = extent.createTest("Smoke test for Applications_2");
		
		driver.get("http://www.facebook.com/");
		
		
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		
		WebElement loginButton=driver.findElement(By.xpath("//input[contains(@id,'u_0')]"));
		
		//Sendkeys Event
		js.executeScript("arguments[0].value='Dhiraj';", email);
		js.executeScript("arguments[0].value='Mishra';", pass);
		
		//Click Event
		js.executeScript("arguments[0].click();", loginButton);
		
	}

}
