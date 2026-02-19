package day33DynamicWebTablewithPageinitiation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		Thread.sleep(5000);
		driver.get("https://demo.opencart.com/TlbeVW/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.xpath("//input[@id='input-username']"));	
		username.clear();
		username.sendKeys("demo");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='input-password']"));	
		password.clear();
		password.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
//		click on customer dropdown
		driver.findElement(By.xpath("//i[@class='fa fa-user fw']")).click();	
		driver.findElement(By.xpath("//ul//a[text()='Customers']")).click();
		
//		Capture the String regarding pages
	    String Text= driver.findElement(By.xpath("//div[text()='Showing 1 to 7 of 7 (1 Pages)']")).getText();
//      get the total count of pages
	    int total_pages=Integer.parseInt(Text.substring(Text.indexOf("(")+1,Text.indexOf("Pages")-1));
		
//		repeat the pages
		for(int p=1;p<=5;p++) {
			if(p>1) {
				WebElement Active_page=driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+")"));
				Active_page.click();
				Thread.sleep(3000);
			
				int num_of_rows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
//				Reading Data from the Page   
				for(int i=0;i<=num_of_rows;i++) {
				String Customer_name= driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+i+"]//td[2]")).getText();
				String email= driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+i+"]//td[3]")).getText();
				String Status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+i+"]//td[5]")).getText();

				System.out.println(Customer_name+"/t"+ email+"/t"+Status);
				}
			}
		}
		
		
		
		driver.quit();
		
	}
}
