package day_21;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotation {

	

	@BeforeSuite
	void bs() {
		System.out.println("this is BeforeSuite.....");
	}
	
	@AfterSuite
	void as() {
		System.out.println("this is AfterSuite.....");
	}
	
	@BeforeTest
	void bt() {
		System.out.println("this is BeforeTest ....");
	}
	
	@AfterTest
	void at() {
		System.out.println("this is AfterTest....");
	}
	
	
	@BeforeClass
	void bc() {
		System.out.println("This is login from BeforeClass....");
	}
	
	
	@AfterClass
	void ac() {
		System.out.println("this is logout from AfterClass....");
	}
	
	
	
	
	@BeforeMethod
	void bm() {
		System.out.println("This is login from BeforeMethod....");
	}
	
	
	@AfterMethod
	void am() {
		System.out.println("this is logout from AfterMethod....");
	}
	
	
	
	@Test(priority=2)
	void tm1() {
		System.out.println("this is search TestMethod 1...");
	}
	
	@Test(priority=2123)
	void tm2() {
		System.out.println("this is search TestMethod 2...");
	}
}
