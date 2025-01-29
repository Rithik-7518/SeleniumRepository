package day_22;

import org.testng.annotations.Test;

public class SignUpTest {

	
	@Test(priority=1,groups= {"regression"})
	void SignUpByMail() {
		System.out.println("this is signUp by email");
	}
	
	

	@Test(priority=2,groups= {"regression"})
	void SignUpByFB() {
		System.out.println("this is signUp by FB");
	}
	

	@Test(priority=3,groups= {"regression"})
	void SignUpByX() {
		System.out.println("this is signUp by X");
	}
}
