package day36KeyboardActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardShortcuts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://text-compare.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@name='text1']")).sendKeys("Hi, welcome to textbox");
		
		Actions act = new Actions(driver);
		//ctrl+a- to select all
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		
		//ctrl+c- to copy the text
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		
		//TAB - to shift between the box
		act.keyDown(Keys.TAB).keyUp(Keys.TAB);
		
		//ctrl+v- to past the text copied
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		
//		//ctrl+shift+a
//		act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("a").keyUp(Keys.CONTROL).keyUp(Keys.SHIFT);
//		
//		//Enter
//		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER);
	}

}
