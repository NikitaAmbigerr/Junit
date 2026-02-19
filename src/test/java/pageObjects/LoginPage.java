package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
    @FindBy(xpath="//input[@id='input-email']")
    WebElement Email;
    
    @FindBy(xpath="//input[@id='input-password']")
    WebElement pwd;
    
    @FindBy(xpath="//input[@value='Login']")
    WebElement login;
    
    public void Enter_email(String email) {
    	Email.sendKeys(email);
    }
	public void Enter_pwd(String pass) {
	    pwd.sendKeys(pass);	
	    }
	public void click_login() {
		login.click();
	}
}
