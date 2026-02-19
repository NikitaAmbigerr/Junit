package day43Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	void title() {
		String Exp_title="orangeHRM";
		String Act_title="orangeHRM";
		
//		approach 1
		if( Exp_title.equals(Act_title)) {
			System.out.println("Testpass");
		}
		else {
			System.out.println("Testfail");
		}
	
//		approach 2
		Assert.assertEquals(Act_title, Exp_title);
	
//		approach 3
		if( Exp_title.equals(Act_title)) {
//			System.out.println("Testpass");
			Assert.assertTrue(true);
		}
		else {
//			System.out.println("Testfail");
			Assert.assertTrue(false);
		}
   }
}
