package day27WebdriverWaiting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
	
WebDriver driver= new ChromeDriver();
// Explicit wait
WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(10));// Declaration		
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//Without any explicit wait 
//WebElement e0=driver.findElement(By.xpath("//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']"));
//e0.isDisplayed();

//With an Explicit wait condition
WebElement e1=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']")));
e1.isDisplayed();

WebElement e2=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
e2.sendKeys("Admin");
WebElement e3=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
e3.sendKeys("admin123");
driver.quit();
		
	}

}
