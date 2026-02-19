package day29CheckBoxHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handle_Alert_withoutSwitchto_Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

		
//		Handle alert using explicitwait
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		Alert a1= mywait.until(ExpectedConditions.alertIsPresent());
		System.out.println(a1.getText());
		a1.accept();
		
		driver.quit();
	}

}
