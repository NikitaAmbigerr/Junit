package day26WebdriverMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webddriver_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver= new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     // 1. Get Method
     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     
     //2. getWindowHandle Method
     System.out.println(driver.getWindowHandle());
     
     //3. getWindowHandles Method
     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     driver.findElement(By.partialLinkText("OrangeHRM")).click();
     Set<String> Wid=driver.getWindowHandles();
     System.out.println(Wid);
     
     
     driver.quit();
	}

}
