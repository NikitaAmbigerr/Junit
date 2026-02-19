package allAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class All_Annotations {
	@BeforeSuite
	void BS() {
		System.out.println("BeforeSuite");
	}
	@AfterSuite
	void AS() {
		System.out.println("AfterSuite");
	}
	@BeforeTest
	void BT() {
		System.out.println("BeforeTest");	
	}
	@AfterTest
	void AT() {
		System.out.println("AfterTest");
	}
	@BeforeClass
	void BC() {
		System.out.println("Beforeclass");
	}
	@AfterClass
	void AC() {
		System.out.println("Afterclass");
	}
	@BeforeMethod
	void BM() {
		System.out.println("login");	
	}
	@AfterMethod
	void AM() {
		System.out.println("logout");
	}
	@Test
	void T1() {
		System.out.println("test1");
	}
	@Test
	void T2() {
		System.out.println("test2");
	}
}
