package day29CheckBoxHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_popups {

	public static void main(String[] args) {
//		Three type of alerts
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		Normal alert 
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Alert A1=driver.switchTo().alert();
		A1.accept();
		
//      Alert with Text and ok/cancel button
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert a2= driver.switchTo().alert();
		String s=a2.getText();
		if(s.equals("I am  JS Confirm")) {
		a2.accept();
		}else {
			a2.dismiss();
		}
		
//		alert with text box
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert a3=driver.switchTo().alert();
		a3.sendKeys("yess");
		a3.accept();
		
		driver.quit();
	}

}
