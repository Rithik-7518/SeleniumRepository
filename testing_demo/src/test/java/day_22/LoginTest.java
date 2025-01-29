package day_22;

import org.testng.annotations.Test;

public class LoginTest {

	
	@Test(priority=1,groups= {"sanity"})
	void loginByMail() {
		System.out.println("this is login by email");
	}
	
	
	@Test(priority=2,groups= {"sanity"})
	void loginByFB() {
		System.out.println("this is login by FB");
	}
	
	@Test(priority=3,groups= {"sanity"})
	void loginByX() {
		System.out.println("this is login by X");
	}
}
