package day31Different_types_of_Dropdown;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BootStrapDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://mdbootstrap.com/docs/standard/extended/dropdown-checkbox/");
		
		WebDriverWait mywait= new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele=mywait.until(ExpectedConditions.elementToBeClickable(By.id("accept_cookies_btn")));
		ele.click();
		
//		select single option
		driver.findElement(By.xpath("//button[@class='btn btn-primary dropdown-toggle']")).click();
		
//		print multiple options from dropdown
		List<WebElement> options= driver.findElements(By.xpath("//ul[@class='dropdown-menu show']//label"));
		System.out.println(options.size());
		
////		using for loop
//		for(int i=0;i<options.size();i++) {
//			System.out.println(options.get(i).getText());
//		}
		
//		using enhanced for loop
		for(WebElement e:options) {
			System.out.println(e.getText());
		}
		
//		select multiple options 
		for (WebElement e1:options){
			String op1=e1.getText();
			if(op1.equals("Check me")||op1.equals("Check me")||op1.equals("Check me")||op1.equals("Check me")) {
				e1.click();
			}
		}
		driver.quit();

	}

}
