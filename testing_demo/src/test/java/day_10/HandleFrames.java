package day_10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {

		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		
		//frame 1
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));    // //frame[@src='frame_1.html'] this is created by own 
		
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
		
		// back to page
		driver.switchTo().defaultContent();
		
		// frame2
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("how are you");
		
		driver.switchTo().defaultContent();
		
		
		// frame3
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("hiiii");
		
		// inner frame part of frame 3
		driver.switchTo().frame(0);
		
		//driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click(); // if it not working use below js method 
		
		WebElement rb=driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", rb);
		
		driver.switchTo().defaultContent();
		
		
		// frame 5 
		WebElement frame5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("how are you");
		
		driver.findElement(By.xpath("//a[normalize-space()='https://a9t9.com']")).click();
		
		boolean logo=driver.findElement(By.xpath("//img[@alt='UI Vision by a9t9 software - Image-Driven Automation']")).isDisplayed();
		System.out.println(logo);
		driver.switchTo().defaultContent();
		
		
		
		
		
		
		
		
		
		
		
	}

}
