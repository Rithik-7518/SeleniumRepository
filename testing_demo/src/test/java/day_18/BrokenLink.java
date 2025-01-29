package day_18;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) {

		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:" +links.size());
		
		int noofbrokenlink=0;
		
		for(WebElement linkElement:links) {
			String hrefvalue=linkElement.getAttribute("href");
			if(hrefvalue==null || hrefvalue.isEmpty()) {
				System.out.println("href value is empty and not possible to check");
				continue;
			}
			
			// send to server
			try {
				URL linkurl=new URL (hrefvalue);
				HttpURLConnection conn=(HttpURLConnection) linkurl.openConnection();
				conn.connect();
				
				if (conn.getResponseCode()>=400) {
					System.out.println(hrefvalue+ "----->broken link");
					noofbrokenlink++;
					
				}
				else {
					System.out.println(hrefvalue+"------->not a broken link");
				}
			}
			catch(Exception e) {
			
			}
		}
		
		System.out.println("number of broken links :"+noofbrokenlink);
		
		
		
		
	}

}
