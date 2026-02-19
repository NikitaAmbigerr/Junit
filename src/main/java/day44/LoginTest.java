package day44;

import org.testng.annotations.Test;

public class LoginTest {
	@Test(priority=1, groups= {"sanity"})
	void byemail() {
		System.out.println("Login by Email");
	}
	@Test(priority=2, groups= {"sanity"})
	void bytweeter() {
		System.out.println("Login by tweeter");
	}
	@Test(priority=3, groups= {"sanity"})
	void bynumber() {
		System.out.println("Login by number");
	}
}
