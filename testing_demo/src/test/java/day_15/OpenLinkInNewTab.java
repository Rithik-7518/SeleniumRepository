package day_15;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkInNewTab {

	public static void main(String[] args) throws InterruptedException {

		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		WebElement mac=driver.findElement(By.xpath("//a[normalize-space()='MacBook']"));
		
		Actions act =new Actions(driver);
		
		act.keyDown(Keys.CONTROL).click(mac).keyUp(Keys.CONTROL).perform();
		
		// switching to mac page
		List<String> ids=new ArrayList(driver.getWindowHandles());
		
		driver.switchTo().window(ids.get(1));   // switch to mac page
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@id='button-cart']")).click();
		
		Thread.sleep(5000);
		
		
		// back to home page
		driver.switchTo().window(ids.get(0));
		
		
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("mac book pro");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
