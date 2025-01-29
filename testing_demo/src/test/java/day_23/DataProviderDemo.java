package day_23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	
	ChromeDriver driver;
	
	
	@BeforeClass
	void setup() {
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	
	@Test(dataProvider="dp")
	void testLogin(String email, String pwd) throws InterruptedException {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);
		boolean status=driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		if (status=true) {
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
			Assert.assertTrue(true);
		}
		else {
			Assert.fail();
			
		}
	}
	
	
	@AfterClass
	void teardown(){
		driver.quit();
	}
	
	
	@DataProvider(name="dp",indices= {0,3})    // 0,3 is not range is row value
	Object[][] LoginData() {
		
		
		Object data[][]= {
				{"abc@gmail.com","test123"},
				{"xyz@gmail.com","@test123"},
				{"pqr@gmail.com","test@123"},
				{"rithikrosan7518@gmail.com","@TestNG"},
				{"ghi@gmail.com","test123"}
				
		};
		
		return data;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
