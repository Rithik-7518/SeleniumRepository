package day_20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRM_Test {
	
  ChromeDriver driver;
  
  @Test(priority=1)
  void openapp() {
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
  }
  
  
  @Test(priority=2)
  void tesingLogo() throws InterruptedException {
	  Thread.sleep(4000);
	  boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	  System.out.println("logo displayed: " +status);
  }
  
  
  
  @Test(priority=3)
  void testingLogin() throws InterruptedException {
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	  
  }
  
  
  
  @Test(priority=4)
  void closeapp() {
	  driver.close();
	  
  }
}
