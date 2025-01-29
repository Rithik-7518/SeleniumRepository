package day_16;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoominZoomOut {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		//Thread.sleep(5000);
		// to minimize page
		//driver.manage().window().minimize();
		
		
		//Thread.sleep(5000);
		driver.manage().window().maximize();
		
		JavascriptExecutor js = driver;
		js.executeScript("document.body.style.zoom='50%'");   // zoom out webpage
		
		
		
		
		
		
	}

}
