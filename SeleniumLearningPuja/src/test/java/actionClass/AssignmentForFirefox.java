package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import lib.BaseClassForFireFox;
import lib.MouseAction;

public class AssignmentForFirefox extends BaseClassForFireFox

{

	public AssignmentForFirefox() throws Exception
	{
		super();
	}
	
	@Test
	public void assignment() throws Exception
	{
		driver.get("http://executeautomation.com/blog/mouse-hover-click-selenium/");
		Thread.sleep(2500);
		WebElement element=driver.findElement(By.xpath("(//a[contains(text(),'Functional Testing')])[2]"));
		MouseAction.mouse_Hover(driver, element);
		Thread.sleep(3000);
		WebElement element1=driver.findElement(By.xpath("(//a[contains(text(),'Tools')])[2]"));
		MouseAction.mouse_Hover(driver, element1);
		driver.findElement(By.xpath("(//a[contains(text(),'Puppeteer')])[2]")).click();
	}
		

}

