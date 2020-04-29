package seleniumSession;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass
{
	static WebDriver driver;

	public static void main(String[] args)
	{
	
//		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Browser_Drivers\\chromedriver_80\\chromedriver_80.exe");
//		System.setProperty("webdriver.chrome.driver", ".\\chromedriver\\chromedriver_80.exe");
		System.setProperty("webdriver.chrome.driver", "chromedriver_80.exe");
		driver= new ChromeDriver();
		String url="https://www.google.com/";
		driver.get(url);
		
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		if (currentUrl.equals(url))
		{
			System.out.println("PASS");
		} else
		{
			System.out.println("FAIL");
		}
	
		
//		driver.findElement(By.name("q")).sendKeys("Puja");
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
//		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/div[2]/center/input[1]")).click();

	}

}
