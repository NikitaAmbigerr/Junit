package day43packBeforeTestAnnotation;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
/*test case 1
 * 1. login
 * 2. search
 * */
public class Testcase1 {

	@BeforeTest
	void BT() {
		System.out.println("BeforeTest");	
	}
	@Test
	void A() {
		System.out.println("test1");
	}
	
}
