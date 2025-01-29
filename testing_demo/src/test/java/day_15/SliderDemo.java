package day_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {


		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions act =new Actions(driver);
		
		// min slider
		WebElement min_slider=driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
		//min_slider.getLocation();  // current location of slider
		System.out.println("Default location of min slider :"+min_slider.getLocation());   // x,y --->(59, 250)		
		act.dragAndDropBy(min_slider, 100, 250).perform();
		System.out.println("location of min slider after moving :"+min_slider.getLocation());   // x,y --->	(161, 250)	
		
		
		// max slider 
		WebElement max_slider=driver.findElement(By.xpath("//span[2]"));
		System.out.println("Default location of max slider :"+max_slider.getLocation());   // x,y --->	(544, 250)
		act.dragAndDropBy(max_slider, -75, 250).perform();
		System.out.println("location of max slider after moving :"+max_slider.getLocation());   // x,y --->	(466, 250)
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
