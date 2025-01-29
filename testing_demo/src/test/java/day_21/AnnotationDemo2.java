package day_21;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
 * login 	-->@BeforeClass
 * search   -->@test
 * adv search  --> @Test
 * logout	-->@AfterClass
 * 
 */
public class AnnotationDemo2 {

	@BeforeClass
	void login() {
		System.out.println("This is login....");
	}
	
	@Test(priority=2)
	void search() {
		System.out.println("this is search...");
	}
	
	@Test(priority=123)
	void advanceSearch() {
		System.out.println("this is advance search .....");
	}
	
	@AfterClass
	void logout() {
		System.out.println("this is logout....");
	}
}
