package day_14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) {

		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame("iframeResult");
		
		
		WebElement box1=driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2=driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		box1.clear();          // clear box1
		box1.sendKeys("Hello"); // type Hello
		
		// double click action on the button
		Actions act=new Actions(driver);
		
		act.doubleClick(button).perform();
		
		String textbox2=box2.getAttribute("value");
		
		System.out.println("captured text of box2:"+textbox2);
		
		if (textbox2.equals("Hello")) {
			System.out.println("Copied text successfully");
		}
		else {
			System.out.println("not copied propertly");
		}
		
	}

}
