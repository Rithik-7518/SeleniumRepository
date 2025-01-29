package day_15;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {

	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.opencart.com/");
		
		//driver.switchTo().newWindow(WindowType.TAB);// open next your in new tab
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		
		driver.get("https://www.orangehrm.com/");
		

	}

}
