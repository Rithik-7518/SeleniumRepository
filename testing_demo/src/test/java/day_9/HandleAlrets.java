package day_9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlrets {

	public static void main(String[] args) throws InterruptedException {

		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		// normal alert with ok button
		/*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(5000);
		
		Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
		*/
		
		
		
		
		// conformation alert 
		/*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(5000);
		
		//driver.switchTo().alert().accept();   // close alert using ok button
		driver.switchTo().alert().dismiss();   // close alert using cancel button
		*/
		
		
		
		
		//prompt alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		
		Alert mypromptalert=driver .switchTo().alert();
		mypromptalert.sendKeys("hello");
		mypromptalert.accept();
		
		
	}

}
