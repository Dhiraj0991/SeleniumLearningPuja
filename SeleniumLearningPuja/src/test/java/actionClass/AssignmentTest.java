package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.BaseClass;
import lib.MouseAction;

public class AssignmentTest extends BaseClass
{

	public AssignmentTest() throws Exception
	{
		super();
	}
	
	@Test
	public void assignment() throws Exception
	{
		driver.get("http://executeautomation.com/blog/mouse-hover-click-selenium/");
		Thread.sleep(2500);
		//WebElement element=driver.findElement(By.linkText("Functional Testing"));
		//WebElement element=driver.findElement(By.xpath("//nav[@id='site-navigation']//a[contains(text(),'Functional Testing')]"));
		WebElement element=driver.findElement(By.xpath("(//a[contains(text(),'Functional Testing')])[2]"));
		MouseAction.mouse_Hover(driver, element);
		Thread.sleep(2500);
		//WebElement element1=driver.findElement(By.linkText("Tools"));
		//WebElement element1=driver.findElement(By.xpath("//nav[@id='site-navigation']//a[contains(text(),'Tools')]"));
		WebElement element1=driver.findElement(By.xpath("(//a[contains(text(),'Tools')])[2]"));
		MouseAction.mouse_Hover(driver, element1);
		//Thread.sleep(3000);
		//driver.findElement(By.linkText("Puppeteer")).click();
		//driver.findElement(By.xpath("//nav[@id='site-navigation']//a[contains(text(),'Puppeteer')]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Puppeteer')])[2]")).click();
	}
	
	

}
