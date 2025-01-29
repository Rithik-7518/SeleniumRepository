package day_17;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;


public class CaptureScreenShot {

	public static void main(String[] args) {
	
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		/*
		 *  capture full page screenshot 
		 *  
		 *  
		 
		TakesScreenshot ts=driver;
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		File targetfile =new File("C:\\Users\\Parthi\\Desktop\\rithik\\STA workspace\\testing_demo\\src\\test\\java\\screenshot\\fullpage.png");
		//File targetfile2 =new File(System.getProperty("user.dir")+"\\screenshot\\fullpage.png");    // path in dynamic 
		sourcefile.renameTo(targetfile);   // copy source file
		*/
		
		
		/*
		 * capture scrrenshot from specific section
		 
		WebElement WebTable=driver.findElement(By.xpath("//div[@id='HTML1']"));
		File sourcefile= WebTable.getScreenshotAs(OutputType.FILE);
		File targetfile =new File("C:\\Users\\Parthi\\Desktop\\rithik\\STA workspace\\testing_demo\\src\\test\\java\\screenshot\\webtable_ss.png");
		sourcefile.renameTo(targetfile);
		*/
		
		
		
		//capture screenshot of webelement
		WebElement logo=driver.findElement(By.xpath("//img[@class='wikipedia-icon']"));
		File sourcefile= logo.getScreenshotAs(OutputType.FILE);
		File targetfile =new File("C:\\Users\\Parthi\\Desktop\\rithik\\STA workspace\\testing_demo\\src\\test\\java\\screenshot\\logo_ss.png");
		sourcefile.renameTo(targetfile);
		
		
		
		
		
		
		
		
		
	}

}
