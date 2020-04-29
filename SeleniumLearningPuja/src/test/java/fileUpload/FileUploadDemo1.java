package fileUpload;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import lib.BaseClass;

public class FileUploadDemo1 extends BaseClass
{

	public FileUploadDemo1() throws Exception
	{
		super();
// TODO Auto-generated constructor stub
	}

	@Test
	public void fileUpload()
	{
		driver.get("https://demoqa.com/automation-practice-form/");

		driver.findElement(By.id("photo")).sendKeys("C:\\Users\\Gaurav\\Pictures\\img880.jpg");

	}

}
