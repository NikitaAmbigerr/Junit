package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="(//a[@class='list-group-item'][normalize-space()='Logout'])[1]")
	WebElement logout;
	@FindBy(xpath="//h2[normalize-space()='My Account']")
	WebElement MyaccDisplay;
	
	
	public boolean displayed() {
		try {
		return(MyaccDisplay.isDisplayed());
		}
		catch(Exception e) {
			return false;
		}
	}
	public void click_logout() {
		logout.click();
	}
	

}
