package day25Xpath_Axes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_axesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriver driver= new ChromeDriver();
 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
 driver.findElement(By.xpath("//button[@type='submit']")).click();
 
 for(int i=1;i<1;i++) {
driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li["+i+"]")).click();
	}
// driver.findElement(By.xpath(""));
// driver.findElement(By.xpath(""));
// driver.findElement(By.xpath(""));
// driver.findElement(By.xpath(""));
  
 driver.quit();
	}

}
