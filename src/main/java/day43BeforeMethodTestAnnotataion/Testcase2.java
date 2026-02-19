package day43BeforeMethodTestAnnotataion;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
/*test case 1
 * 1. login
 * 2. search
 * testcase2
 * 3. advance search
 * 4. logout
 * */
public class Testcase2 {

	@BeforeClass
	void login() {
		System.out.println("login");	
	}
	@Test(priority=1)
	void search() {
		System.out.println("test1");
	}
	@Test(priority=2)
	void Advancesearch() {
		System.out.println("test2");	
	}
	@AfterClass
	void logout() {
		System.out.println("logout");
	}
}
