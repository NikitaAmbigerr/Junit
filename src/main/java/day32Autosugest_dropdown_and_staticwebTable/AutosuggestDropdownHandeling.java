package day32Autosugest_dropdown_and_staticwebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestDropdownHandeling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		search box
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("selenium");
		Thread.sleep(5000);
		
//		Capture the list Items
		List<WebElement> options=driver.findElements(By.xpath("//ul[@role='listbox']//li[@role='presentation']"));
		Thread.sleep(5000);
		
//		Get Size of List Items
		System.out.println(options.size());
	
//		Print list Items
		for(WebElement e1:options) {
			System.out.println(e1.getText());
			if(e1.equals("selenium")) {
				e1.click();
				break;
			}
		}
		driver.quit();
		
	}

}
