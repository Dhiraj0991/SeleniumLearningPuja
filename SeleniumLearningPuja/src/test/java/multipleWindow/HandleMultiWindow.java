package multipleWindow;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.BaseClass;
import lib.MouseAction;
import lib.MultipleWindowUtil;

public class HandleMultiWindow extends BaseClass
{

	

	public HandleMultiWindow() throws Exception
	{
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void multiWindowHandleDemo() throws Exception
	{

		driver.get("http://demo.guru99.com/");

		System.out.println("The title of Parent window is: "+driver.getTitle());
		WebElement link = driver.findElement(By.xpath("//a[contains(.,'Insurance Project')]"));
		MouseAction.right_Click(driver, link);
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.setAutoDelay(2000);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.setAutoDelay(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.setAutoDelay(2000);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		MultipleWindowUtil.switchToWindow(2);
		
		System.out.println("The title of Child window is: "+driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("Puja");
		driver.findElement(By.id("password")).sendKeys("Puja");
		driver.close();
		MultipleWindowUtil.switchToWindow(1);
		System.out.println("The title of Parent window is: "+driver.getTitle());
		
	}

}

