package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.BaseClass;

public class ClickTheTCSCheckbox extends BaseClass 
{

	@Test
	public void checkBox() throws Exception 
	{	
		//Generic Solution
		
		driver.get(System.getProperty("user.dir")+"/NewIndex.html");
//		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
//		List<WebElement> list = driver.findElements(By.xpath("//table[@class='table table-bordered table-dark']/tbody/tr"));
//		System.out.println("total number of suggestions in search box:::===>" + list.size());
//		for (int i = 0; i < list.size(); i++) 
//		{
//			System.out.println(list.get(i).getText());
//			if (list.get(i).getText().contains("TCS Cognizant Wipro")) 
//			{
//				Thread.sleep(2000);
//				((WebElement) checkbox.get(i)).click();
//				break;
//			}
//		}
		
		
		//Smart Solution
		driver.findElement(By.xpath("//td[contains(text(),'TCS')]//preceding-sibling::td/input[@type='checkbox']")).click();
	}
}
