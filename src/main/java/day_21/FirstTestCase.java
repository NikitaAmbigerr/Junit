package day_21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 
		WebDriver driver= new ChromeDriver();
//		WebDriver driver= new EdgeDriver();	
		driver.get("https://www.facebook.com/login.php");
		Thread.sleep(3000);
		String title=driver.getTitle();
		
		if(title.equals("Log in to Facebook")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}		
		
		driver.close();
	}
}


