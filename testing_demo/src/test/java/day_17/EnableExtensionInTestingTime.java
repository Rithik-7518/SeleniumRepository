package day_17;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtensionInTestingTime {

	public static void main(String[] args) {

		
		ChromeOptions options = new ChromeOptions();
		
		File file= new File("C:\\Users\\Parthi\\Desktop\\rithik\\crx for selectorhub\\SelectorsHub.crx");
		
		options.addExtensions(file);
		
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://text-compare.com/");
		
		
		
	}

}
