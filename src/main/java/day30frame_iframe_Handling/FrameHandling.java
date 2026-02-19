package day30frame_iframe_Handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		Frame1
		WebElement f1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(f1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Hi");
		
//		before entering to next frame switch to default content
		driver.switchTo().defaultContent();
		
//		Frame2
		WebElement f2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(f2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Welcome to frame 2");
		driver.switchTo().defaultContent();
		
//		Frame3
		WebElement f3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(f3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("this is the third frame");
	
//		iframe intereaction using index
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//span[text()='Hi, I am the UI.Vision IDE']")).click();
		driver.findElement(By.xpath("//span[text()='Web Testing']")).click();
		driver.findElement(By.xpath("//span[text()='Choose']")).click();
		driver.findElement(By.xpath("//span[text()='Well, now I know :-)']")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		

		
	}

}
