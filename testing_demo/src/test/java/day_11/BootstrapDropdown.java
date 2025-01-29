package day_11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

	public static void main(String[] args) {

		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect ')]")).click();  // open dropdown options
		
		// select single options
		//driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		// capture all the option and find out size
		List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println("number of options :"+options.size());
		
		/* print options
		for(WebElement op:options) {
			System.out.println(op.getText());
		}
		*/
		
		
		
		//select multiple options
		for(WebElement op:options) {
			String option =op.getText();
			
			if(option.equals("Java") || option.equals("python") || option.equals("MySQL")) {
				op.click();
				
			}
			
		}
		
		
		
		
	}

}
