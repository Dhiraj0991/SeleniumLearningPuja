package datePicker;

import org.apache.commons.lang3.ArrayUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.BaseClass;

public class HandleDatePicker extends BaseClass {

	public HandleDatePicker() throws Exception {
		super();
	}

	@Test
	public void selectDate() {
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		driver.findElement(By.xpath("//img[@class='imgdp']")).click();

		String[] monthNames = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		String inputDate = "1-January-2021";
		

		String dateParts[] = inputDate.split("-");

		String daypart = dateParts[0];
		String monthpart = dateParts[1];
		String yearpart = dateParts[2];

		WebElement calenderMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
		String fetchedMoth = calenderMonth.getText();

		WebElement calenderYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
		String fetchedYear = calenderYear.getText();

		int yearToCompare1 = Integer.parseInt(fetchedYear);
		int yearToCompare2 = Integer.parseInt(yearpart);

		int monthIndex1 = ArrayUtils.indexOf(monthNames, fetchedMoth);
		int monthIndex2 = ArrayUtils.indexOf(monthNames, monthpart);

		if (yearToCompare2 >= yearToCompare1 && monthIndex1 >= monthIndex2) 
		{
			while (true) 
			{
				calenderMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
				calenderYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));

				WebElement monthNext = driver.findElement(By.xpath("//a[@title='Next']"));

				if ((calenderMonth.getText().contains(monthpart)) && (calenderYear.getText().contains(yearpart))) 
				{
					driver.findElement(By.xpath("//a[text()='" + daypart + "']")).click();
					break;
				}
				
				monthNext.click();
			}
		}

	}

}
