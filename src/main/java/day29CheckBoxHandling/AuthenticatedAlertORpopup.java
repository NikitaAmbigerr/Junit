package day29CheckBoxHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatedAlertORpopup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
//		Handling authenticated alerts using injection process and injecting username and pass along with url

		driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.quit();
		
		
		
		

	}

}
