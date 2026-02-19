package day23CSSselectors;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   WebDriver driver =new ChromeDriver();
   driver.get("https://demo.nopcommerce.com/");
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   
//   Tag &Id
   driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("iphone 16");
//   Tag & Attribute
   driver.findElement(By.cssSelector("button[type='submit']")).click();
//   Tag & class
   driver.findElement(By.cssSelector("a.ico-register")).click();
//   Tag &classname[attribute="value"]
   driver.findElement(By.cssSelector("div.menu__toggle[role='button']"));
   
   driver. quit();
	}

}
