package day_16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;



public class JavaScriptExecutorDemo {

	public static void main(String[] args) {

		// executeScript()---> used when the element interupted exeception
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		
		//driver.findElement(By.xpath("//input[@id='name']")).sendKeys("rithik");		
		// if above coding sendkeys is not working means use executeScript()
		
		
		
		WebElement inputbox=driver.findElement(By.xpath("//input[@id='name']"));
		JavascriptExecutor js=driver;
		js.executeScript("arguments[0].setAttribute('value','rithik')", inputbox);
		
		
		
		//driver.findElement(By.xpath("//input[@id='male']")).click();
		// if above coding click() is not working means use executeScript()
		
		
		
		WebElement radiobtn=driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()",radiobtn);
		
		
		
		
		
	}

}
