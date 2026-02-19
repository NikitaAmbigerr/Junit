package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.MyAccountPage;
import pageObjects.RegisterationPage;
import testBase.Baseclass;

public class TestCase_01 extends Baseclass {
	
	@Test(groups={"regression","master"})
	public void Registration_TestCase() {
	 
		logger.info("Starting TC_001 AccountRegisteration");
		try {
		HomePage hp= new HomePage(driver);
		logger.info("clicked on my account");
		hp.click_myacc();
		logger.info("clicked on Register");
		hp.click_Register();
		
		RegisterationPage rp=new RegisterationPage(driver);
		logger.info("Entering first name ");
		rp.entername(randomeString().toUpperCase());
		logger.info("Entering last name ");
		rp.eneterlname(randomeString().toLowerCase());
		logger.info("Entering email ");
		rp.enteremail(randomeString()+"@gmail.com");
		logger.info("Entering telephone ");
		rp.entertelphone(randomeNumber());
		 
		String password=randomeAlphaNumeric();
		logger.info("Entering password ");
		rp.eneterpwd(password);
		logger.info("Entering confirm password ");
		rp.enetercpwd(password);
		
		logger.info("Check privacy box ");
		rp.clickagree();
		logger.info("click on continue ");
		rp.clickcontinue();
		logger.info("validating expected message");
		
		String msg=rp.getConfirmationMsg();
		Assert.assertEquals( msg,"Your Account Has Been Created!" );
		
		MyAccountPage ma=new MyAccountPage(driver);
		ma.click_logout();
		}
		catch(Exception e) {
			logger.error("test failed");
			Assert.fail();
		}
	}

		
	

}
