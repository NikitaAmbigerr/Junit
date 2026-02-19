package day32Autosugest_dropdown_and_staticwebTable;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://blazedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
//		Select the options
		WebElement e1=driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select s1=new Select(e1);
		s1.selectByValue("Boston");	
		
		WebElement e2=driver.findElement(By.xpath("//select[@name='toPort']"));
		Select s2= new Select(e2);
		s2.selectByValue("Dublin");
		
//		Locating find Flights
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
//		Select the flight from table
		driver.findElement(By.xpath("//table[@class='table']//tr[2]//td[1]//input[@type='submit']")).click();
		
//		Book the Ticket
		driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Xyz");
		driver.findElement(By.xpath("//input[@name='address']")).sendKeys("123at xyx,groundflor");
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("xyzxyz");
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("vijaywada");
        driver.findElement(By.xpath("//input[@name='zipCode']")).sendKeys("123456");
        
        WebElement e=driver.findElement(By.xpath("//select[@name='cardType']"));
        Select s=new Select(e);
        
        s.selectByValue("amex");
        
        driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("12467896542");
        driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("10");
        driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2015");
        driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("xyz");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        
	}

}
