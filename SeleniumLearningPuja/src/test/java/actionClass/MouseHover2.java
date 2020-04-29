package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import lib.BaseClass;

public class MouseHover2 extends BaseClass
{

	public MouseHover2() throws Exception
	{
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void mouseHover() throws Exception
	{
		
		driver.get("http://executeautomation.com/demosite/index.html");
		Actions actions=new Actions (driver);
		actions.moveToElement(driver.findElement(By.xpath("//span[@id='Automation Tools']"))).build().perform();
		actions.moveToElement(driver.findElement(By.xpath("//span[@id='Selenium']"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='Selenium WebDriver']")).click();
		
		
	}
	
}
