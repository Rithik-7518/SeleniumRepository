package day_21;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {

	@Test
	void testTitle() {
		String Exp_Title="Opencart";
		String act_title="Openc";
		
		/*if(Exp_Title.equals(act_title)) {
			System.out.println("Test is Passed");
		}
		else {
			System.out.println("Test is Failed");
		}
		*/
		
		// Assert.assertEquals(Exp_Title, act_title);
		
		if(Exp_Title.equals(act_title)) {
			System.out.println("Test is Passed");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("Test is Failed");
			Assert.assertTrue(false);		}
		
		
	}
}
