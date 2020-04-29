package fileUpload;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import lib.BaseClass;

public class FileUploadDemo2 extends BaseClass
{

	public FileUploadDemo2() throws Exception
	{
		super();
// TODO Auto-generated constructor stub
	}

	@Test
	public void fileUpload()
	{
		driver.get("https://www.ilovepdf.com/word_to_pdf");

		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).sendKeys("C:\\Users\\Gaurav\\Pictures\\img880.jpg");

	}

}
