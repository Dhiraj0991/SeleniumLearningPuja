package click;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.BaseClass;
import lib.MouseAction;

public class RightClick extends BaseClass
{

	public RightClick() throws Exception
	{
		super();
// TODO Auto-generated constructor stub
	}

	@Test
	public void rightClickDemo() throws Exception
	{
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");

		WebElement link = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		MouseAction.right_Click(driver, link);

		WebElement copyLink = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
		copyLink.click();

		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();
		System.out.println("The Alert Text is: " + alert.getText());

		alert.accept();
	}

}
