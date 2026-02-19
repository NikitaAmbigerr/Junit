package day43Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hard_vs_Soft_Assertion {
	@Test
	void test_HardAssertion() {
		
		System.out.println("testing...");
		System.out.println("testing...");
		
		Assert.assertEquals(1,1);
//		Assert.assertEquals(1,2);
		
		System.out.println("testing...");
		System.out.println("testing...");
		
		
	}
		@Test
		void test_SoftAssertion() {
				
	    System.out.println("testing...");
		System.out.println("testing...");
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(1, 2);   //soft Assertion
		
		System.out.println("testing...");
		System.out.println("testing...");
		
		
		
		}
}
