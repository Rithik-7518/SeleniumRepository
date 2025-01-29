package day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_demo {

public static void main(String[] args) throws InterruptedException {
		
		// open chromedriver
		ChromeDriver driver = new ChromeDriver();
		
		//open url
		driver.get("https://demo.opencart.com/");
		
		// maximize the chromeDriver
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		
		// in search bar typ msd (name attributes) 
		driver.findElement(By.name("search")).sendKeys("msd");
		
		
		// logo is displayed or not (id attributes) 
		boolean logoDisplay=driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(logoDisplay);
		
		
		// link text - give full text
		driver.findElement(By.linkText("Tablets")).click();
		
		// partial link text - give half text 
		driver.findElement(By.partialLinkText("Table")).click();
		
		// class attributes
		boolean logoDisplays=driver.findElement(By.className("img-fluid")).isDisplayed();
		System.out.println(logoDisplays);
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
		

	}

}
