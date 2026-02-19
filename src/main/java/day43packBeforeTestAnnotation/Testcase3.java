package day43packBeforeTestAnnotation;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Testcase3 {
	@Test
	void c() {
		System.out.println("test3");	
	}
	@AfterSuite
	void AS() {
		System.out.println("AfterSuite");
	}
	@BeforeSuite
	void BS() {
		System.out.println("BeforeSuite");
	}
}
