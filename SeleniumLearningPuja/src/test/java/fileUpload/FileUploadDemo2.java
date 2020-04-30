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
		driver.get("https://smallpdf.com/word-to-pdf");

		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\592570\\Desktop\\DeletedTool.docx");

	}

}
