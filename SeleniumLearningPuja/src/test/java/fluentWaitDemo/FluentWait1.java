package fluentWaitDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

import lib.BaseClass;

public class FluentWait1 extends BaseClass
{

	public FluentWait1() throws Exception
	{
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void fluentWait()
	{
		driver.get("file:///C:/Users/PUJA/Downloads/SeleniumPractice1/SeleniumPractice1/Selenium%20Practise.html");
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(15))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>()
		{
			public WebElement apply(WebDriver driver)
			{
				WebElement ele = driver.findElement(By.id("demo"));
				String value = ele.getAttribute("innerHTML");

				if (value.equalsIgnoreCase("WebDriver"))
					//if (ele.isDisplayed())
				{
					System.out.println("Current Text: " + value);
					return ele;
					//return null;
					
				} 
				else
				{
					System.out.println("Current Text: "+ value );
					return null;
				}

			}
		});

		System.out.println("Is Required Element Displayed ?"+element.isDisplayed());
	}

}
