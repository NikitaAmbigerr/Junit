package day29CheckBoxHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingpopupwithcaptcha {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mypage.rediff.com/login/dologin");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='txtlogin']")).sendKeys("nikitaambiger@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("niKita@1432");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Alert a1=driver.switchTo().alert();
		a1.accept();
		
		driver.quit();
		
		
	}

}
