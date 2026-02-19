package day29CheckBoxHandling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxHandeling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		driver.findElement(By.id("male")).click();
//		driver.findElement(By.id("female")).click();
//		
//		select all the check boxes
	    List <WebElement>Checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
         
////	    1.using for loop
//		for(int i=0;i<Checkboxes.size();i++) {
//			Checkboxes.get(i).click();
//		}
		
////		2. using enhanced for loop
//		
//		for(WebElement Checkboxe:Checkboxes) {
//			Checkboxe.click();
//		}
	    
//	    select last three check boxes
	    
//	    for (int i=4;i<Checkboxes.size();i++) {
//	    	
//	    	Checkboxes.get(i).click();
//	    }
	    
//	    Select first 3 check box
	    for (int i=0;i<3;i++) {	
	    	Checkboxes.get(i).click();    	
	    }
	    
//	    uncheck the boxes Check if the boxes are unchecked or not
	    for (int i=0;i<3;i++) {	
	    	
	    	if(Checkboxes.get(i).isSelected())
	    	Checkboxes.get(i).click();    	
	    }
	    driver.quit();	
		
	}

}
