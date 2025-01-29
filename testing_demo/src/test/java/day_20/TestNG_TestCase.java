package day_20;
/*
 * open app
 * login
 * logout
 * 
 */

import org.testng.annotations.Test;

public class TestNG_TestCase {

	@Test(priority=10)
	void openapp() {
		System.out.println("opening app...........");
	}
	
	
	@Test(priority=23)
	void login() {
		System.out.println("login to app.......");
	}
	
	
	@Test(priority=35)
	void logout() {
		System.out.println("logout from app......");
	}
	
	/*
	 * 1) TestNG execute test methods based on alphabetical order.

		2) @Test(priority=num) controls the order of execution.
		
		3) Once you provide priorty to the test methods, then order of methods is not considered.
		
		4) priorities can be random numbers (no need to have consecutive numbers)
		
		5) If you dont provide priority then default value is Zero (0).
		
		6) If the priorities are same then again execute methods in alphabetical order.
		
		7) Negitive values are allowed in priority.
		
		8) TestNG execute test methods only if they are having @Test annotation.

	 */
	
	
}
