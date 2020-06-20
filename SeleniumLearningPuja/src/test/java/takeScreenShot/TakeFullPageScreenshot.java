package takeScreenShot;

import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;

import lib.BaseClass;

public class TakeFullPageScreenshot extends BaseClass 
{

	@Test
	public void takeFullPageScreenShot()
	{
		driver.get("http://automationtesting.in/");
		
		Shutterbug.shootPage(driver, ScrollStrategy.BOTH_DIRECTIONS, 500, true).withName("FullPage").save("./Images/");
	}
}
