package day_18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleSVGElement {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		
		// it is working based on it has  name()=svg 
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[4]/a[1]/*[name()='svg'][1]")).click();
		
		
		
		// using svg it shows error 
		//driver.findElement(By.xpath("//a[normalize-space()='']//*[name()='svg']")).click();
		
		
		
		
		
	}

}
