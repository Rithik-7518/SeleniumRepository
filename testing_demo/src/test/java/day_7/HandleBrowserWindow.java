package day_7;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindow {

	

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		
		
		
		Set<String> window=driver.getWindowHandles();
		List<String> windowList = new ArrayList(window);
		 
		String parent=windowList.get(0);
		String child=windowList.get(1);
		
		System.out.println(parent);
		System.out.println(child);
		
		//System.out.println(driver.getTitle()); // get only parent title ie) OrangeHRM
		
		// switch to child window
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		
		// switch to parent window
		driver.switchTo().window(parent);
		String parentTitle= driver.getTitle(); 
		System.out.println(parentTitle);
		
		

	
		
		
	}

}
