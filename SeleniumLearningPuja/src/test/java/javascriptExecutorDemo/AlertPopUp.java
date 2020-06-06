package javascriptExecutorDemo;

import org.testng.annotations.Test;

import lib.BaseClass;

public class AlertPopUp extends BaseClass 
{

	@Test
	public void alert() throws Exception
	{
		logger = extent.createTest("Smoke test for Applications_3");
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		js.executeScript("alert('Welcome to Selenium Learning Puja !');");
	}
}
