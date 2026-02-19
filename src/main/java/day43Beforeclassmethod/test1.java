package day43Beforeclassmethod;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test1 {
	@BeforeTest
	void BT() {
		System.out.println("Beforetest");
	}
	@BeforeClass
	void A() {
		System.out.println("Beforeclass");
	}
	
	@Test
	void T1() {
		System.out.println("test1");
	}
	@AfterTest
	void B() {
		System.out.println("Aftertest");
	}
	@AfterClass
	void AT() {
		System.out.println("Afterclass");
	}
}
