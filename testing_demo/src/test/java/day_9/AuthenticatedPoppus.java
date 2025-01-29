package day_9;

import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatedPoppus {

	public static void main(String[] args) {

		
		ChromeDriver driver = new ChromeDriver();

		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
