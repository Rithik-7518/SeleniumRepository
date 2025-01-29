package day_17;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessTesting {

	public static void main(String[] args) throws InterruptedException {
		
		// headless testing means we cannot see the ui and ux of testing running
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless==new");  // setting for headless mode of execution
		
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String title =driver.getTitle();
		if (title.equals("Your Store")) {
			
			System.out.println("test success");
			
		}
		else {
			System.out.println("test failed");
		}
		Thread.sleep(5000);
		driver.close();

	}

}
