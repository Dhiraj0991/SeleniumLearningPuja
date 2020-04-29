package keyboardActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import lib.BaseClass;

public class KeyBoardActionDemo extends BaseClass
{

	public KeyBoardActionDemo() throws Exception
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void actionKeyboard()
	{
		
		driver.get("https://www.facebook.com/");
		Actions actions=new Actions(driver);

		actions.sendKeys(driver.findElement(By.name("firstname")), "Gaurav")
		.sendKeys(Keys.TAB)
		.sendKeys("Dwiwedy")
		.sendKeys(Keys.TAB)
		.sendKeys("9038331081")
		.build()
		.perform();
	}

}
