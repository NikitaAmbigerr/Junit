package day43BeforeMethodTestAnnotataion;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/*test case 1
 * 1. login
 * 2. search
 * 3. logout
 * testcase 2
 * 4. login
 * 5. advance search
 * 6. logout
 * */
public class Testcase1 {

	@BeforeMethod
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
	@AfterMethod
	void logout() {
		System.out.println("logout");
	}
}
