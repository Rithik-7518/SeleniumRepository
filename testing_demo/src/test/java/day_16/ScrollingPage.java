package day_16;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {

		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = driver;
		
		/*
		 *  scroll down page by pixel number
		 *  
		js.executeScript("window.scrollBy(0,1000)","");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		*/
		
		
		
		
		/*
		 * scroll down the page till element is visible
		 * 
		WebElement elem = driver.findElement(By.xpath("//h2[normalize-space()='Drag and Drop']"));
		
		js.executeScript("arguments[0].scrollIntoView()",elem);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		*/
		
		
		
		//scroll down till end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		Thread.sleep(5000);
		
		
		//scrolling up to initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		
	}

}
