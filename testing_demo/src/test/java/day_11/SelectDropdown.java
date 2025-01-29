package day_11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {


		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drpcountryElem=driver.findElement(By.xpath("//select[@id='country']"));
		
		Select drpcountry= new Select(drpcountryElem);
		
		// select option from dropdown
		/*1)selectByVisibleText()
		
		drpcountry.selectByVisibleText("India");
		*/
		
		/* 2)selectByValue()
		drpcountry.selectByValue("uk");
		*/
		
		/* 3)selectByIndex
		drpcountry.selectByIndex(3);
		*/
		
		
		// count option from select dropdown
		List<WebElement>option=drpcountry.getOptions();
		System.out.println("number of options from select is :"+option.size());
		
		// printing number of options
		/*for(int i=0; i<option.size();i++) {
		}
			System.out.println( option.get(i).getText());
			
		}
		*/
		for(WebElement op:option) 
		{
			System.out.println(op.getText());
		}
		
		
		
		
		
	}

}
