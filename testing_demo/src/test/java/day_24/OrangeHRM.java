package day_24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners(day_24.TestNG_Listener.class)
public class OrangeHRM {

	
	ChromeDriver driver;
	  
	  @BeforeClass
	  void setup() throws InterruptedException {
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
	  }
	  
	  
	  @Test(priority=2)
	  void tesingLogo() throws InterruptedException {
		  Thread.sleep(5000);
		  boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		  Assert.assertEquals(status,true);
	  }
	  
	  
	  
	  @Test(priority=3)
	  void testingUrl()  {
		 Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/");
	  }
	  
	  @Test(priority=4,dependsOnMethods={"testingUrl"})
	  void testingPageTitle()  {
		 Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	  }
	  
	  @AfterClass
	  void closeapp() {
		  driver.close();
		  
	  }
}
