package day36KeyboardActions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkinNewTab {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement register=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		Actions act=new Actions(driver);
		
		//ctrl+register
		act.keyDown(Keys.CONTROL).click(register).keyUp(Keys.CONTROL).perform();
		
		//Switching to registration page
		List<String> ids=new ArrayList(driver.getWindowHandles());
		String id2=ids.get(1);
		driver.switchTo().window(id2);
		

	}

}
