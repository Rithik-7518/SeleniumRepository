package day_13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {

	public static void main(String[] args) {

		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.xpath("//input[@id='input-username']"));
		username.clear();
		username.sendKeys("demo");
		
		WebElement pass=driver.findElement(By.xpath("//input[@id='input-password']"));
		pass.clear();
		pass.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		
		
		//close window if avaible
		if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed())
		{
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}
		
		driver.findElement(By.xpath("//a[@class='parent']")).click();   // customer main menu
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();  // customer sub menu
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
