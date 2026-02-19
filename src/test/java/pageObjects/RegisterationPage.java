package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterationPage extends BasePage {

	public RegisterationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement Fname;
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement Lname;
	@FindBy(xpath="//input[@id='input-email']")
	WebElement Email;
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement Telephone;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement pwd;
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement cpwd;
	@FindBy(xpath="//input[@name='agree']")
	WebElement agree;
	@FindBy(xpath="//input[@value='Continue']")
	WebElement Continue;
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	public void entername(String fname) {
		Fname.sendKeys(fname);
	}
	public void eneterlname(String lname) {
		Lname.sendKeys(lname);
	}
	public void enteremail(String email) {
		Email.sendKeys(email);
	}
	public void entertelphone(String telphone) {
		Telephone.sendKeys(telphone);
	}
	public void eneterpwd(String pass) {
		pwd.sendKeys(pass);
	}
	public void enetercpwd(String cpass) {
		cpwd.sendKeys(cpass);
	}
	public void clickagree() {
		agree.click();
	}
	public void clickcontinue() {
		Continue.click();	
	}
	public String getConfirmationMsg() {
		try{	
			return (msgConfirmation.getText());
		}
		catch(Exception e) {
			return (e.getMessage());
		}
		
		
	}

}
