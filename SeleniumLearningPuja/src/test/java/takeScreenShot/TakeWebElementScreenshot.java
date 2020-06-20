package takeScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

import lib.BaseClass;

public class TakeWebElementScreenshot extends BaseClass
{
	
	@Test
	public void takeScreenShot()
	{
		driver.get("https://www.google.com/");
		
		WebElement logo=driver.findElement(By.xpath("//div[@id='hplogo']"));
		
		Shutterbug.shootElement(driver, logo).withName("Logo").save("./Images/");
	}

}
