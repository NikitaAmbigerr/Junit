package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
// My Account module
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement myaccount;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")
	WebElement register;
	
	@FindBy(xpath="(//a[normalize-space()='Login'])[1]")
	WebElement login;
	
	public void click_myacc() {
		myaccount.click();
	}
	public void click_Register() {
		register.click();
	}
	public void click_login() {
		login.click();
	}
	
//	WishList
	
//	Shopping Cart
//	CheckOut
//	
}
