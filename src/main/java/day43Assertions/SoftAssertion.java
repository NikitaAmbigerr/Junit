package day43Assertions;

import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	SoftAssert sa;
	
	void test() {
		
		System.out.println("testing");
		System.out.println("testing");
		System.out.println("testing");
		
		sa.assertAll();
	}
}
