package day_22;

import org.testng.annotations.Test;

public class PaymentTest {

	

	@Test(priority=1,groups= {"sanity","regression","function"})
	void paymentinRupees() {
		System.out.println("payment in rupees");
	}
	
	@Test(priority=2,groups= {"sanity","regression","function"})
	void paymentinDollars() {
		System.out.println("payment in dollars");
	}
}
