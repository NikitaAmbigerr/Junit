package day35MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
//		capture the web element
		WebElement e1= driver.findElement(By.xpath("//button[@class='dropbtn']"));	
		WebElement e2= driver.findElement(By.xpath("//a[text()='Mobiles']"));

//		Create Actions class
		Actions Act= new Actions(driver);
		
//		1.Mouse hover action
		Act.moveToElement(e1).moveToElement(e2).click().build().perform();
		Thread.sleep(3000);	

//		2.Double click
		WebElement box1=driver.findElement(By.xpath("//input[@id='field1']"));
		box1.clear();
		box1.sendKeys("hello");
		WebElement box2=driver.findElement(By.xpath("//button[text()='Copy Text']"));
		Act.doubleClick(box2).build().perform();
		
//		validation
		String text=box2.getAttribute("value");
		System.out.println("Captured value is:"+text);
		
		if(text.equals("hello")) {
			System.out.println("Text is coppied");
		}else {
			System.out.println("Text is not coppied");

		}
		
		
		driver.quit();
	}

}
