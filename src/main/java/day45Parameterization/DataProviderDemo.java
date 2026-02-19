package day45Parameterization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	WebDriver driver;
	@BeforeClass
	void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test(dataProvider="Data")
	void login(String email, String pass)  {
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys(email);
	
		driver.findElement(By.id("input-password")).sendKeys(pass);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		boolean status=driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		if(status==true) {
			driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
			driver.findElement(By.xpath("(//a[normalize-space()='Logout'])[1]")).click();
			Assert.assertTrue(true);

		}
		else {
			Assert.fail();
		}
	}
	
	@AfterClass
	void teardown() {
		driver.close();
	}
	
	@DataProvider(name="Data",indices= {0,4})
	Object[][] logindata() {
		Object data[][]={   {"xyz@gmail.com","xyz@123"},//indices=0
							{"abc@gmail.com","abc@123"},//indices=1
							{"lmn@gmail.com","lmn@123"},//indices=2
							{"opq@gmail.com","opq@123"},//indices=3
							{"rst@gmail.com","rst@123"},//indices=4
							{"uvw@gmail.com","uvw@123"} //indices=5
							};
		return data;
		
	}
}

