package takeScreenShot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.BaseClass;

public class TakeWebElementScreenShot2 extends BaseClass 
{

	
	@Test
	public void takeWebElementScreenshot() throws Exception
	{
		driver.get("https://www.google.com/");
		WebElement logo=driver.findElement(By.xpath("//div[@id='hplogo']"));
		
		File source = logo.getScreenshotAs(OutputType.FILE);
		String destination = "./Images/LogoImage.png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
	}
}
