package takeScreenShot;

import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

import lib.BaseClass;

public class TakeScreenshot extends BaseClass
{
	
	@Test
	public void takeScreenShot()
	{
		driver.get("https://www.google.com/");
		
		Shutterbug.shootPage(driver).withName("SampleScreenshot").save("./Images/");
	}

}
