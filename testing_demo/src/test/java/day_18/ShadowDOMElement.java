package day_18;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMElement {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://books-pwakit.appspot.com/");
		driver.manage().window().maximize();
		
		//This Element is inside single shadow DOM.
		
		SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
		Thread.sleep(1000);
		shadow.findElement(By.cssSelector("#input")).sendKeys("SELENIUM");
		
		
	}

}
