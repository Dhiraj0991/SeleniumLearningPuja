package keyboardActivity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import lib.BaseClass;
import lib.MouseAction;

public class KeyBoardActionDemo2
{

	WebDriver driver;
	

	@Test
	public void rightClickDemo() throws Exception
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/");

		WebElement link = driver.findElement(By.xpath("//a[contains(.,'Insurance Project')]"));
//		MouseAction.right_Click(driver, link);
		
		String keyscombination= Keys.chord(Keys.CONTROL,Keys.ENTER);
		link.sendKeys(keyscombination);

		
	}

}

