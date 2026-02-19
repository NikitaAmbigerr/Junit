package day27WebdriverWaiting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
// Thread Sleep
WebDriver driver= new ChromeDriver();
driver.get("https://demo.nopcommerce.com/");
Thread.sleep(3000);

// Implicit wait
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
boolean status=driver.findElement(By.xpath("//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']")).isDisplayed();
System.out.println(status);
driver.quit();


	}

}
