package day35MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsVsAction {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://vinothqaacademy.com/mouse-event/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
//		3.Right Click Action
		WebElement rightclick=driver.findElement(By.xpath("//button[@oncontextmenu='myFunction2()']"));
		
//		Create Actions class
		Actions Act= new Actions(driver);		
		
//      building and storing the action in to Action variable
		Action myaction=Act.contextClick(rightclick).build();//Action is an interface used to store created action

		myaction.perform();
				
		driver.quit();
	}

}
