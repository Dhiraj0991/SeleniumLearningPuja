package googleSearch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.BaseClass;

public class GoogleSearchTest extends BaseClass
{

	public GoogleSearchTest() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}


	
	@Test
	public void search() throws Exception
	{

//		System.setProperty("webdriver.chrome.driver", "chromedriver_80.exe");

		logger = extent.createTest("Smoke test for Applications_1");

		driver.get("https://www.google.com/");

		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//span"));

		System.out.println("total number of suggestions in search box:::===>" + list.size());

		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().contains("selenium tutorial"))
			{
				Thread.sleep(2000);
				list.get(i).click();
				break;
			}

		}

	}
	
	
	

	

}
