package day43packBeforeTestAnnotation;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
/* testcase 2
 * 5. advance search
 * 6. logout
 * */
public class Testcase2 {

	
	@Test
	void B() {
		System.out.println("test2");	
	}
	@AfterTest
	void AT() {
		System.out.println("AfterTest");
	}
}
