package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.Baseclass;
import utilities.DataProviders;


public class Testcase_03_DDT extends Baseclass {
	
	@Test(dataProvider="Login_Data", dataProviderClass=DataProviders.class,groups={"datadriven"})
	public void verify_login(String Email, String pwd,String exp) {
		try 
		{
//		Homepage
		HomePage hp=new HomePage(driver);
		hp.click_myacc();
		hp.click_login();
		
//		Login 
		LoginPage lp=new LoginPage(driver);
		lp.Enter_email(Email);
		lp.Enter_pwd(pwd);
		lp.click_login();
		
//		My Account
		MyAccountPage ma=new MyAccountPage(driver);
		boolean targetpage=ma.displayed();
		
		if(exp.equalsIgnoreCase("valid")) 
		{
			if(targetpage==true)
			{
				ma.click_logout();
				Assert.assertTrue(true);
					
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		if(exp.equalsIgnoreCase("Invalid")) 
		{			
			if(targetpage==true) 
			{
				ma.click_logout();
				Assert.assertTrue(false);	
			
			}
			else
			{
				Assert.assertTrue(true);				
			}
		}

	    }
	catch(Exception e)
		{		
		Assert.fail();		
	    }
		
 }
}
