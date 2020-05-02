package fileUpload;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import lib.BaseClass;

public class FileUploadDemo2 extends BaseClass
{

	public FileUploadDemo2() throws Exception
	{
		super();
	}

	@Test
	public void fileUpload()
	{
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		String projectDirectory=System.getProperty("user.dir");
		String fileToUpload=projectDirectory+"\\DeletedTool.docx";
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(fileToUpload);

	}

}
