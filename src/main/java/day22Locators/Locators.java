package day22Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver= new ChromeDriver();
      driver.get("https://www.facebook.com/");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.manage().window().maximize();
       // Findelements
      List<WebElement>headerlinks = driver.findElements(By.tagName("link"));
      System.out.println(headerlinks.size());
//      System.out.println(headerlinks.get(1));
      driver.findElement(By.id("email")).sendKeys("XYZ@123");
      driver.findElement(By.name("pass")).sendKeys("xyz@1432");
      driver.findElement(By.xpath("//button[@type='submit']")).click();
       
      driver.quit();
	}

}
