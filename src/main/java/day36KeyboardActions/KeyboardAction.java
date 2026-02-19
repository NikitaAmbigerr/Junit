package day36KeyboardActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
//		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		Actions act= new Actions(driver);
		
		WebElement minSlider=driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
		System.out.println("Before Slider"+minSlider.getLocation());
		act.dragAndDropBy(minSlider,59, 247).perform();
		System.out.println("After Slider"+minSlider.getLocation());
		
		WebElement maxSlider=driver.findElement(By.xpath("//span[2]"));
		System.out.println("Before Slider"+maxSlider.getLocation());	//565, 29	
		act.dragAndDropBy(maxSlider,-100,48 ).perform();
		System.out.println("After Slider"+maxSlider.getLocation());
		
		driver.quit();

	}

}
