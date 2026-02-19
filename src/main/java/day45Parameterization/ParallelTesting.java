package day45Parameterization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParallelTesting {
	WebDriver driver;
	@BeforeClass
	@Parameters({"browser"})
	void setup(String br)throws InterruptedException{
		switch (br.toLowerCase()) {
		case "chrome":driver=new ChromeDriver();
						break;
		case "edge":driver=new EdgeDriver();
						break;
		case "firefox":driver=new FirefoxDriver();
						break;
		default:System.out.println("invalid browser input");return;//return will exit from entire code				
		}
		
		
		
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
	void TestTitle(){
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	@Test(priority=3)
	void TestUrl(){
		Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@AfterClass
	void teardown(){
		driver.close();
	}
}
