package day46TestNGListener;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(day46TestNGListener.My_Listener_meathod1.class)
public class Testcase {
	WebDriver driver;
	@BeforeClass
	void setup() throws InterruptedException {	
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
	}
	@Test(priority=1)
	void Testlogo() {
		
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	
		Assert.assertEquals(status, true);
	}
	
	@Test(priority=2)
	void TestUrl(){
		Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test(priority=3,dependsOnMethods="TestUrl")
	void TestTitle(){
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	@AfterClass
	void teardown(){
		driver.close();
	}

}
