package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.BaseClass;
import lib.DynamicWait;
import lib.MouseAction;

public class Assignment extends BaseClass

{

	public Assignment() throws Exception
	{
		super();
	}
	
	@Test
	public void assignment() throws Exception
	{
		WebElement element=driver.findElement(By.xpath("(//a[contains(text(),'Functional Testing')])[2]"));
		DynamicWait.dyanmicWaitClickable(element, driver, 10);
		MouseAction.mouse_Hover(driver, element);
		
		WebElement element1=driver.findElement(By.xpath("(//a[contains(text(),'Tools')])[2]"));
		DynamicWait.dyanmicWaitClickable(element1, driver, 10);
		MouseAction.mouse_Hover(driver, element1);
		driver.findElement(By.xpath("(//a[contains(text(),'Puppeteer')])[2]")).click();
	}
		

}
