package day44dependencymethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency_Methods {
	WebDriver driver;
	@Test(priority=1)
	void openApp() {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/logi");
		driver.manage().window().maximize();
		Assert.assertTrue(true);
	}
	@Test(priority=2, dependsOnMethods= {"openApp"})
	void login() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Assert.assertTrue(true);
	}
	@Test(priority=3, dependsOnMethods= {"login"})
	void search() {
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("PIM");
		
	}
	
//	@Test(priority=4)
//	void click() {
//		Assert.assertTrue(true);
//	}
	
	@Test(priority=4, dependsOnMethods= {"login"})
	void Logout() {
	driver.close();	
	}
	
	@Test(priority=5)
	void teardown() {
		driver.close();
	}
	
}
