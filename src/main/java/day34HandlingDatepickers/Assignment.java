package day34HandlingDatepickers;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignment {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
//		Date picker2
		String month="Sep";
		String date="7";
		int index=6;
		driver.findElement(By.xpath("//input[@id='txtDate']")).click();
		
		WebElement months=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select selectMonth=new Select(months);
		selectMonth.selectByVisibleText(month);
		
		WebElement year=driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
		Select selectYear=new Select(year);
		selectYear.selectByIndex(index);
		
		List <WebElement> Date=driver.findElements(By.xpath("//tbody//tr//td[@data-handler='selectDay']"));
		
		for(WebElement e1:Date) {
			if(e1.getText().equals(date)) {
				e1.click();
				break;
			}
			
		}
		
//		Date picker3
		driver.findElement(By.xpath("//input[@id='start-date']")).sendKeys("04/09/1999");
		driver.findElement(By.xpath("//input[@id='end-date']")).sendKeys("29/01/2026");
		
//		Close the Browser
		driver.quit();

	}

}
