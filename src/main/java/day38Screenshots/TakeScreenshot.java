package day38Screenshots;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		1.Take screenshot of full page
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		File targetFile=new File(System.getProperty("user.dir")+"\\ScreenShot\\fullpage.png");
		sourcefile.renameTo(targetFile);
		
//		2.Capture the screenshot of specific section
		
		WebElement featuredProduct=driver.findElement(By.xpath("//section[@class='product-grid home-page-product-grid']"));
		File Sourcefile=featuredProduct.getScreenshotAs(OutputType.FILE);
		File Targetfile=new File(System.getProperty("user.dir")+"\\ScreenShot\\ElementScreenshot.png");
		Sourcefile.renameTo(Targetfile);
		
//		3. Capture the Screenshot of particular Webelemnt
		
		WebElement  logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File S=logo.getScreenshotAs(OutputType.FILE);
		File T=new File(System.getProperty("user.dir")+"\\ScreenShot\\logo.png");
		S.renameTo(T);
		driver.quit();
		
	}

}
