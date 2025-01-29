package day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_selector_demo {

	public static void main(String[] args) {
		
		
		ChromeDriver driver=new  ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		// css selector 
		
		// tag#id 
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("virat");
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("virat");

		
		// tag.class
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("virat");
		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("virat");
	
		//tag[attribute='value']
		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("virat");
		driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("virat");

		
		//tag.class[attribute='value']
		driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("virat");
		driver.findElement(By.cssSelector(".search-box-text[placeholder='Search store']")).sendKeys("virat");

        driver.close();
	}

}
