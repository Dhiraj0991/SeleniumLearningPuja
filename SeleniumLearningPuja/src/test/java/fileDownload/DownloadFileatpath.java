package fileDownload;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import lib.BaseClass;

public class DownloadFileatpath extends BaseClass 
{

	public DownloadFileatpath() throws Exception 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void downloadFileDemo() 
	{
		
		
		driver.get("https://www.last.fm/music/+free-music-downloads");

		driver.findElement(By.xpath("(//a[contains(.,'Download')])[1]")).click();
	}

}
