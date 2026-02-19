package day37JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptexecuter {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
//		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement inputbox=driver.findElement(By.xpath("//input[@id='name']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
//		JavascriptExecutor js=driver;
		
//		sendkeys action using javascript executer
		js.executeScript("arguments[0].setAttribute('value','jhon')", inputbox);
		
//	    click Action using javaScript executer to executea radiobutton/checkbox/
		WebElement radiobutton=driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()",radiobutton);
		
		
	    driver.quit();
	}

}
