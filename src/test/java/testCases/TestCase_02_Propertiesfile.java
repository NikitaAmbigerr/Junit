package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.Baseclass;

public class TestCase_02_Propertiesfile extends Baseclass {
	@Test(groups={"sanity","master"})
	void login_TestCase() {
		logger.info("***  started TestCase_02 Login ****");
		try {
		HomePage hp=new HomePage(driver);
		logger.info("clicking on login");
		hp.click_myacc();
		hp.click_login();
		
		LoginPage lp=new LoginPage(driver);
		logger.info("entering Email");
		lp.Enter_email(p.getProperty("email"));
		logger.info("Entering password");
		lp.Enter_pwd(p.getProperty("password"));
		logger.info("clicking on login button");
		lp.click_login();
		
		logger.info("verifying msg dispalyed");
		MyAccountPage ma=new MyAccountPage(driver);
		boolean targetpage=ma.displayed();
		
//		Assertion
		Assert.assertEquals(targetpage,true,"Login fail");
		}
		catch(Exception e) {
			Assert.fail();
		}
		logger.info("*** Finished TestCase_02 Login ****");
	}
}
