package day_21;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hard_VS_SoftAssertions {

	//@Test
	void test_hardAssertions() {
		
		System.out.println("testing.....");
		System.out.println("testing.....");
		
		Assert.assertEquals(1, 2);
		/*
		 * when hard assertions fails rest of the code is not execute
		 * 
		 * output
		 * 
		 * testing
		 * testing
		 * 
		 *
		 */
		
		Assert.assertEquals(1, 1);
		/*
		 * when hard assertions passes rest of the code is  execute
		 * 
		 * output
		 * 
		 * testing
		 * testing
		 * testing
		 * testing
		 *
		 */
		
		System.out.println("testing.....");
		System.out.println("testing.....");
		
		
	}
	
	@Test
	void Test_SoftAssertion() {
		System.out.println("testing.....");
		System.out.println("testing.....");
		
		SoftAssert sa= new SoftAssert();
		
		sa.assertEquals(1, 2);
		
		System.out.println("testing.....");
		System.out.println("testing.....");
		
		sa.assertAll();
	}
	
	
	
	
	
}
