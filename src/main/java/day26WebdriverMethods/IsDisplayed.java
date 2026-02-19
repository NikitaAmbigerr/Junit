package day26WebdriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://demo.nopcommerce.com/");
    //IsDispalyed()
    boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
    System.out.println("Is the Logo Dispalyed="+status);
    
    //IsEnabled
    driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
    WebElement RadioM=driver.findElement(By.xpath("//input[@type='radio']"));
    WebElement RadioF=driver.findElement(By.xpath("//input[@id='gender-female']"));
    System.out.println("Radio Button is Enabled="+RadioM.isEnabled());
    RadioM.click();
    // IsSelected
    System.out.println("Radio Button M is Selected="+RadioM.isSelected());
    System.out.println("Radio Button F is Selected="+RadioF.isSelected());
    driver.quit();
	}

}
