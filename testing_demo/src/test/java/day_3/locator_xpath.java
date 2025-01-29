package day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_xpath {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver=new  ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		//relative xpath with single attributes
		//driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("hello");
		
		//driver.findElement(By.xpath("//*[@id='small-searchterms']")).sendKeys("hello");

		//relative xpath with double attributes
		//driver.findElement(By.xpath("//input[@placeholder='Search store'][@id='small-searchterms']")).sendKeys("hi");
		
		//xpath with and or operator
		// And operator
		//driver.findElement(By.xpath("//input[@placeholder='Search store' and @id='small-searchterms']")).sendKeys("hi"); // if both attributes true then it typ hi
		
		// Or operator
		//driver.findElement(By.xpath("//input[@placeholder='Search store' or @id='small']")).sendKeys("hi"); // if any one attribute is true it typ hi
		
		
		// xpath with inner text
		//driver.findElement(By.xpath("//*[text()='Register']")).click();
		
		
		
		
		//xpath with contain
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("hi");		
		
		// xpath with starts-with()
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("hello");
		
		//chained xpath
		boolean logosts=driver.findElement(By.xpath("//div[@class='header-logo']/a/img")).isDisplayed();
		System.out.println(logosts);
		
		
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
