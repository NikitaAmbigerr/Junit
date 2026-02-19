package day28BrowserAndNavigationCommand;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommand {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
 WebDriver driver= new ChromeDriver();
// getmethod
 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 
// navigate to method
 URL myurl=new URL("https://demo.nopcommerce.com/");
// 1
 driver.navigate().to(myurl);
 
// 2
 driver.navigate().back();
 System.out.println(driver.getCurrentUrl());
 
// 3
 driver.navigate().forward();
 System.out.println(driver.getCurrentUrl());
 
// 4
 driver.navigate().refresh();
 
 driver.quit();
	}

}
