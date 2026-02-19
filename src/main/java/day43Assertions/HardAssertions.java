package day43Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
	@Test
	void test(){
	
//		Assert.assertEquals("xyz", "xyz");// pass
//		Assert.assertEquals(123, "xyz");  // fail
//		Assert.assertEquals("123", 123);  // fail
		
//		Assert.assertNotEquals(123,123);// fail
//		Assert.assertNotEquals(123,124);// pass
		
//		Assert.assertTrue(1==1);   // pass
//		Assert.assertTrue(1!=1);   // fail
//		Assert.assertFalse(1==10); //pass
//		Assert.assertFalse(1==1);  //fail
		
		Assert.fail();
		
		
	}
}
