package day_14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {

		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement desktop=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement mac =driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		Actions act=new Actions(driver);
		
		// mouse hover action
		act.moveToElement(desktop).moveToElement(mac).click().build().perform();
		// build()---> create an action
		// perform()----> complete an action
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
