package day_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalMethod {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		
		// isDisplayed()
		//boolean logoStatus =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		//System.out.println(logoStatus);
		
		//isEnabled()
		//boolean inputBoxStatus = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		//System.out.println(inputBoxStatus);
		
		// isSelected();
		WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
		male.click();
		
		System.out.println(male.isSelected());
		
		
		driver.close();
		
	}

}
