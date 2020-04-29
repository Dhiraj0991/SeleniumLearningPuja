package lib;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class Utility
{
	public static String getScreenshot(WebDriver driver,String screenShotName) throws Exception
	{
		try
		{
			TakesScreenshot tS = (TakesScreenshot) driver;
			File src = tS.getScreenshotAs(OutputType.FILE);
			String destination = "./Screenshots/"+new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
			//String destination = "C:\\Users\\PUJA\\eclipse-workspace\\SeleniumLearning\\Screenshots\\";
			FileUtils.copyFile(src, new File(destination+screenShotName+".png"));
			return destination;
		} 
		catch (Exception e)
		{
			System.out.println("There is some error capturing the screenshot"+e.getMessage());
		}
		return screenShotName;
	}
}
