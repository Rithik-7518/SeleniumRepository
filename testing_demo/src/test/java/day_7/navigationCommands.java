package day_7;

import org.openqa.selenium.chrome.ChromeDriver;

public class navigationCommands {

	public static void main(String[] args) {

		/*
		 * 
		 * navigation commands
		 * 
		 *  1)navigate().to()
		 *  2)navigate().back()
		 *  3)navigate().forward()
		 *  4)navigate().refresh()
		 *  
		 */
		ChromeDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://demo.nopcommerce.com/");
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
	}

}
