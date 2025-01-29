package day_21;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionDemo {

	@Test
	void test() {
		
		//Assert.assertEquals("xyz","xyz1"); // test failed
		//Assert.assertEquals(1234,1234);	 // test passed
		
		//Assert.assertEquals("asdcvb", 123456); // test failed
		//Assert.assertEquals("1234", 1234);  	// test failed
		
		//Assert.assertNotEquals(123, 123);		// test failed
		//Assert.assertNotEquals(123, 4567);		// test passed
		
		//Assert.assertTrue(true); 	// test pass
		//Assert.assertTrue(false);	// test fail
		
		//Assert.assertTrue(1==2);	// test fail
		//Assert.assertTrue(1==1);	// test pass
		
		//Assert.assertFalse(1==2);	// test pass
		//Assert.assertFalse(1==1);	// test fail
		
		Assert.fail();		// test fail
	}
}
