package day24Xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver= new ChromeDriver();
    driver.get("https://demo.nopcommerce.com/");

    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//   1 Xpath with single attribute
    driver.findElement(By.xpath("//input[@type='text'])")).sendKeys("iphone");
  
//   2 xpath with multiple attribute
    driver.findElement(By.xpath("//input[@type='text'][name='q']")).sendKeys("iphone");
    
//   3 xpath with and & or operator
    driver.findElement(By.xpath("//input[@type='text'and @name='q']")).sendKeys("laptop");
    driver.findElement(By.xpath("//input[@type='text'or @placeholder='Search store']")).sendKeys("laptop");
    
//   4 xpath with innertext
    driver.findElement(By.xpath("//a[text()='Register']")).click();
    
//   5 xpath with contains method
    driver.findElement(By.xpath("//a[contains(@class,'register')]")).click();
    
//   6 xpath with starts with method
    driver.findElement(By.xpath("//a[starts-with(@class,'ico-re')]")).click();
    
//   7 chained xpath
    
//   8 Handling dynamic elements using or/contains/startswith functions
    
    
	}

}
