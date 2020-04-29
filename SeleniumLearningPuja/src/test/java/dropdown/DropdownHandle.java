package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class DropdownHandle
{
	WebDriver driver;

	@Test
	public void Testcase1()
	{

		System.setProperty("webdriver.chrome.driver", "chromedriver_80.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement dropdownvalues=driver.findElement(By.id("select-demo"));
		Select dd=new Select(dropdownvalues);
		//dd.getFirstSelectedOption().getText();
	System.out.println(dd.getFirstSelectedOption().getText());
		//dd.selectByIndex(7);
		//dd.selectByValue("Thursday");
		dd.selectByVisibleText("Friday");
		
		List<WebElement> elements=dd.getOptions();
//		for (WebElement ele:elements)
//		{
//			
//			System.out.println(ele.getText());
//		}
		
		for (int i = 0; i <elements.size(); i++)
		{
			System.out.println(elements.get(i).getText()+" Is at poisition ------> "+i);
		}
	
		
		
		
		
		
		
		
	}
}
