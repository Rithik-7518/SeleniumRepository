package day_13;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerUsingMethod {
	
	static void selectMonthandYear(WebDriver driver, String month , String year) {
		while(true) {
			String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if (currentmonth.equals(month)  && currentyear.equals(year)) {
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //next
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();  // prevoius
		}
	}

	static void selectDate(WebDriver driver , String date) 
	{
		List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement dt:dates) {
			if(dt.getText().equals(date)) {
				dt.click();
				break;
			}
			
		}
	}
	public static void main(String[] args) {

		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		// switch frame
		driver.switchTo().frame(0);
		
		String year="2025";
		String month="July";
		String date= "24";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		selectMonthandYear(driver,month,year);
		selectDate(driver,date);
		
		
	}

}
