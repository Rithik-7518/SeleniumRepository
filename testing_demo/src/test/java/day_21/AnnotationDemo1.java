package day_21;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * login 	-->@BeforeMethod
 * search   -->@test
 * logout	-->@AfterMethod
 * adv search 
 * logout
 */
public class AnnotationDemo1 {

	@BeforeMethod
	void login() {
		System.out.println("This is login....");
	}
	
	@Test(priority=2)
	void search() {
		System.out.println("this is search...");
	}
	
	@Test(priority=3)
	void advanceSearch() {
		System.out.println("this is advance search .....");
	}
	
	@AfterMethod
	void logout() {
		System.out.println("this is logout....");
	}
}
