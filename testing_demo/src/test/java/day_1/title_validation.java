package day_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class title_validation {

	public static void main(String[] args) throws InterruptedException {
		
		// open chromedriver
		ChromeDriver driver = new ChromeDriver();
		
		//open url
		driver.get("https://demo.opencart.com/");
		
		// maximize the chromeDriver
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		// store the web page title in title variable
		String title =driver.getTitle();
		
		//validate the title
		if (title.equals("Your Store")) {
			
			System.out.println("test success");
			
		}
		else {
			System.out.println("test failed");
		}
		
		
		// close chromeDriver
		driver.close();

	}

}
