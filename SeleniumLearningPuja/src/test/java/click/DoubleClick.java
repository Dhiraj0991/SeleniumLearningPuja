package click;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.BaseClass;
import lib.MouseAction;

public class DoubleClick extends BaseClass
{

	public DoubleClick() throws Exception
	{
		super();
// TODO Auto-generated constructor stub
	}

	@Test
	public void doubleClickDemo() throws Exception
	{
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");

		WebElement doubleClickButton = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));

		MouseAction.doubleClick(driver, doubleClickButton);

		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();

		System.out.println("The Alert text is: " + alert.getText());
		alert.accept();

	}

}
