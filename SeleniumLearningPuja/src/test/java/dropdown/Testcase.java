package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testcase
{
	WebDriver driver;

	@Test
	public void Testcase1()
	{

		System.setProperty("webdriver.chrome.driver", "chromedriver_80.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/PUJA/Desktop/NewIndex.html");
		WebElement str =driver.findElement(By.xpath("//input[contains(@id,'inputEmail')]"));
		str.click();
		System.out.println(str.getAttribute("validationMessage"));
		WebElement str1 =driver.findElement(By.xpath("//input[contains(@id,'inputPassword')]"));
		str1.click();
		System.out.println(str1.getAttribute("validationMessage"));
		WebElement dropdownvalues=driver.findElement(By.xpath("//button[contains(@id,'dropdownMenuButton')]"));
		//dropdownvalues.click();
		
		Select dd=new Select(dropdownvalues);
		System.out.println(dd.getFirstSelectedOption().getText());
		//dd.selectByIndex(1);
	}
		//driver.findElement(By.xpath("//input[contains(@id,'inputEmail')]")).sendKeys("pujamaths10@mail.com");
//		//driver.findElement(By.xpath("//input[contains(@id,'inputPassword')]")).sendKeys("abcde");
//		WebElement element=driver.findElement(By.xpath("//input[contains(@id,'inputEmail')]"));
//		element.sendKeys("abcde");
//		System.out.println(element.isDisplayed());
		//driver.findElement(By.id("p0submit")).click();
		//driver.findElement(By.id("emailId_err")).getText();
		
		
//		@Test
//		public void Testcase2()
//		{
//			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//			WebElement dropdownvalues=driver.findElement(By.xpath("//button[contains(@id,'dropdownMenuButton')]"));
//			Select dd=new Select(dropdownvalues);
//			System.out.println(dd.getFirstSelectedOption().getText());
//		}
//		
		
		
		
		
}

