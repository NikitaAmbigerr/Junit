package day37JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZhoomInandOut {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		Thread.sleep(5000);

//		ZOOM In and ZOOM Out
		JavascriptExecutor js =(JavascriptExecutor) driver;
		
		js.executeScript("document.body.style.zoom='50%'");
		Thread.sleep(5000);
		
//		driver.quit();
		
	}
	

}
