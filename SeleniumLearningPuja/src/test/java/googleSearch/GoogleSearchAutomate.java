package googleSearch;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.BaseClass;

public class GoogleSearchAutomate extends BaseClass
{

	public GoogleSearchAutomate() throws Exception 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void googleSearch()
	{
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		List<WebElement> list= driver.findElements(By.xpath("//ul[@role='listbox']//span"));
		
		System.out.println("Total number of Suggestion in search box::: ===>"+list.size());
		
		for(int i=0;i< list.size();i++)
		{
			System.out.println(list.get(i).getText());
			
			if(list.get(i).getText().contains("selenium tutorial"))
			{
				list.get(i).click();
				break;
			}
		}
		
	}

	
}
