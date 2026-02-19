package day37JavaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
//		1.scroll down the page by pixel number
		js.executeScript("window.scrollBy(0,3000)", "");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
//		2.scroll the baar till the element is visible
		WebElement e1=driver.findElement(By.xpath("//a[text()='Youtube']"));
		js.executeScript("arguments[0].scrollIntoView();", e1);
		
//		3.scrolldown till end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
	}

}
