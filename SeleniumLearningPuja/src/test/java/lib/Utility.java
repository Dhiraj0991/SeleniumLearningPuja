package lib;

import java.io.File;
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
			String projectDirectory=System.getProperty("user.dir");
			String destination = projectDirectory+"\\Screenshots\\"+new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
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
	
	
	public static String captureScreenshotforReport(WebDriver driver, String screenshotName)
	{
		int i=0;
		 TakesScreenshot ts =(TakesScreenshot) driver;
		 
		 File source= ts.getScreenshotAs(OutputType.FILE);
		 
		 String path= System.getProperty("user.dir")+"/Screenshots/"+new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date())+screenshotName+(++i)+".png";
		 
		 File destination=new File(path);
		 
		 try
		 {
			 Thread.sleep(1000);
			 FileUtils.copyFile(source, destination);
		 }
		 catch (Exception e)
		 {
			 System.out.println("There is some error capturing the screenshot"+e.getMessage());
		 }
		 
		 return path;
	}
	
}
