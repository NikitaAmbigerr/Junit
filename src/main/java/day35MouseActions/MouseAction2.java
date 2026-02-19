package day35MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://vinothqaacademy.com/mouse-event/");
		driver.manage().window().maximize();
		
//		3.Right Click Action
		WebElement rightclick=driver.findElement(By.xpath("//button[@oncontextmenu='myFunction2()']"));
		
//		Create Actions class
		Actions Act= new Actions(driver);		
		Act.contextClick(rightclick).build().perform();
		Thread.sleep(3000);
		WebElement registration=driver.findElement(By.xpath("//div[@id='myDiv']//a[normalize-space()='Registration Form']"));
		Act.moveToElement(registration).click().build().perform();
	}

}
