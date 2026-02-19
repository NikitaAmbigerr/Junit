package day34HandlingDatepickers;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
//selecting future date
	static void selectFutureMonthandYear(WebDriver driver,String month,String year,String date) 
	{
//		Step 3 looping statement to select the month and year
		while(true) 
		{
			String current_month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String current_year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(current_month.equals(month) && current_year.equals(year)) 
			{
				
				break;
			}
			
			driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();// for next year
	   }
//		Select the date
		List <WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
		
		for(WebElement e1:dates) 
		{
			if(e1.getText().equals(date)) 
			{
			e1.click();
			break;
			}
		}
	}
	
	//selecting future date
		static void selectPastdate(WebDriver driver,String month,String year,String date) 
		{
//			Step 3 looping statement to select the month and year
			while(true) 
			{
				String current_month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
				String current_year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
				
				if(current_month.equals(month) && current_year.equals(year)) 
				{
					
					break;
				}
				
				driver.findElement(By.xpath("//span[normalize-space()='Prev']")).click();// for next year
		   }
//			Select the date
			List <WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
			
			for(WebElement e1:dates) 
			{
				if(e1.getText().equals(date)) 
				{
				e1.click();
				break;
				}
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
//		Step1: switch to frame
		driver.switchTo().frame(0);
		
//		method1:  using sendkeys
//		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("01/21/2026");//mm/yy/yyyy
		
//		method:2 Date picker
//		step 1  store the values in string
		String year="2026";
		String month="January";
		String date="30";
		
//		step 2 locate and click on the input box
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
//		selectFutureMonthandYear(driver,month,year,date);
        selectPastdate(driver,"September","1999","04");
        
        driver.quit();
	}

}
