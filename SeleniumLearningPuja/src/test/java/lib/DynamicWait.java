package lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicWait
{

	public static void dyanmicWaitVisibile(WebElement element, WebDriver driver, long timeout)
	{
		new WebDriverWait(driver, timeout)
		.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void dyanmicWaitClickable(WebElement element, WebDriver driver, long timeout)
	{
		new WebDriverWait(driver, timeout)
		.until(ExpectedConditions.elementToBeClickable(element));
	}
}
