package day_5;

import org.openqa.selenium.chrome.ChromeDriver;

public class browserMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		
		driver.close();  // close the browser focused single browser
		
		driver.quit();  // close the multiple browser
		
		
		
		
		
		
	}

}
