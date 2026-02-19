package day34HandlingDatepickers;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UserDefinedDatePicker {
	
//	user defined method to convert month from string-->Month object
	static Month convertMonth(String month) {
		HashMap<String,Month>monthMap=new HashMap<String,Month>();
		monthMap.put("January", Month.JANUARY);
		monthMap.put("February", Month.FEBRUARY);
		monthMap.put("March", Month.MARCH);
		monthMap.put("April", Month.APRIL);
		monthMap.put("May", Month.MAY);
		monthMap.put("June", Month.JUNE);
		monthMap.put("July", Month.JULY);
		monthMap.put("August", Month.AUGUST);
		monthMap.put("September", Month.SEPTEMBER);
		monthMap.put("October", Month.OCTOBER);
		monthMap.put("November", Month.NOVEMBER);
		monthMap.put("December", Month.DECEMBER);
		
		Month vmonth=monthMap.get(month);
		
		if(vmonth==null) {
			System.out.println("invalid month.....");
		}
		return vmonth;
	}
	
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
		
//		Select Year	
		WebElement year=driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
		Select selectYear=new Select(year);
		selectYear.selectByIndex(index);

//		select month
		String months=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")).getText();
		
//		convert requiredmonth and displaymonth into month objects
		Month expectedMonth =convertMonth(month);
		Month currentMonth=convertMonth(months);
		
//		compare
		int result=expectedMonth.compareTo(currentMonth);
		
//		0  month are equal
//		>0 future month
//		<0 past
		
		if(result<0) {
           //select past month
			driver.findElement(By.xpath("")).click();
		}
		else if(result>0){
           //future month
			driver.findElement(By.xpath("")).click();
		}
		else
		{
			
		}
	
		List <WebElement> Date=driver.findElements(By.xpath("//tbody//tr//td[@data-handler='selectDay']"));
		
		for(WebElement e1:Date) {
			if(e1.getText().equals(date)) {
				e1.click();
				break;
			}
			
		}

	}

}
