package day26WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Quit_Command {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver= new ChromeDriver();
     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     Thread.sleep(3000);
     driver.findElement(By.partialLinkText("OrangeHRM")).click();
     
     driver.close();
//   driver.quit();
	}

}
