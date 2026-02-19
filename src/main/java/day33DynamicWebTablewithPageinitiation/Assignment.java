package day33DynamicWebTablewithPageinitiation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
//		capture String Regarding the pages
		int num_of_pages=driver.findElements(By.xpath("//ul[@class='pagination']//li")).size();
//		count the number of rows in table
		int num_of_rows=driver.findElements(By.xpath("//table[@id='productTable']//tr//th")).size();

		
		driver.findElement(By.xpath("//table[@id='productTable']//thead//tr[1]")).getText();
//		Print the header	
		for(int head=2;head<=4;head++) 
		{
			String header=driver.findElement(By.xpath("//table[@id='productTable']//thead//tr[1]//th["+head+"]")).getText();
			System.out.print(header+"\t");	
		}
		System.out.println();
//		Run a for loop to access all the pages
		for(int p=1;p<=num_of_pages;p++) {
			if(p>1) {
				WebElement Active_page=driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()="+p+"]"));
			    Active_page.click();
			    Thread.sleep(3000);			
			}

//		Run a for loop to read the data 
		for(int r=1;r<=num_of_rows;r++) {
			
			String name=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[2]")).getText();	
			String price=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[3]")).getText();
			WebElement checkbox=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[4]"));
			checkbox.click();
			boolean Status=checkbox.isEnabled();
			System.out.println(name+"\t"+price+"\t"+Status);
		}
	}
		driver.quit();
		}
	


}
