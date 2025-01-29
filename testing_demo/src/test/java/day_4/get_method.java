package day_4;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_method {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver=new ChromeDriver();
		// 1)get(url)
		driver.get("https://demo.nopcommerce.com/");
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[text()='Register']")).click();
		//Thread.sleep(2000);
		
		// 2)getCurrentUrl()
		//System.out.println(driver.getCurrentUrl());
		
		//Thread.sleep(2000);
		
		// 3)getPageSource()
		//System.out.println(driver.getPageSource());
		
		// 4)getWindowHandle()
		//String windowId = driver.getWindowHandle();
		//System.out.println(windowId);    //6484F612E991D4BDC7E72EBAD802DE4F
		
		// 5)getWindowHandles()
		
		driver.findElement(By.xpath("//*[text()='Register']")).click();
		Set<String> WindowId= driver.getWindowHandles();
		System.out.println(WindowId);
		
		
		driver.close();

	}

}
