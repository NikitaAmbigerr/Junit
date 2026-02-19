package day31Different_types_of_Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandeling {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='country']"));
		Select s1=new Select(dropdown);
		
		s1.selectByValue("usa");
		
		s1.selectByVisibleText("India");
		
		s1.selectByIndex(7);
		
		s1.selectByContainsVisibleText("rance");
		
		
		//Capture the option from the dropdown 
		List<WebElement> options=s1.getOptions();
		System.out.println(options.size());
		
////		printing the options
//		
//		for(int i=0;i<=10;i++) {
//			System.out.println(options.get(i).getText());
//			
//		}
		
//		print using enhanced loop
		for(WebElement e:options) {
			System.out.println(e.getText());
		}
		
driver.quit();
	}

}
