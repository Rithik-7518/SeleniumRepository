package day_6;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitMethods {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		// implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		
		
		// explicit wait
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement txtname=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		txtname.sendKeys("Admin");
		
		
		// fluentWait
		
		/* error 
		
		Wait<WebDriver> mywait= new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(15))
				.pollingEvery(Duration.ofSeconds(20))
				.ignoring(NoSuchElementException.class);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement txtUsername = mywait.until(new Function<WebDriver, WebElement>(){
		    public WebElement apply(WebDriver driver){
		      return driver.findElement(By.xpath("//input[@placeholder='Username']"));
		    }
		});
		txtUsername.sendKeys("Admin");
		*/
		
		
		
	}
	

}
