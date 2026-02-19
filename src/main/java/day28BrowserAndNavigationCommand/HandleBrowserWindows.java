package day28BrowserAndNavigationCommand;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		driver=new ChromeDriver();
//		driver=new EdgeDriver();
//		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("OrangeHRM")).click();
		
		Set<String> WinIds= driver.getWindowHandles();
		System.out.println(WinIds);
		
//		Approach 1
		List<String> WinList=new ArrayList(WinIds);
		String parentId=WinList.get(0);
		String childId=WinList.get(1);
		
////		Switching from child to parent
//		driver.switchTo().window(parentId);
//		System.out.println(driver.getTitle());
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		
////		Switch from parent to child
//		driver.switchTo().window(childId);
//		System.out.println(driver.getTitle());
//		Thread.sleep(3000);
		
//		Approach 2
		for(String Wid:WinIds) {
			
			String Title=driver.switchTo().window(Wid).getTitle();
			
			if(Title.equals("OrangeHRM")) {
				driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
				driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				
			}else {
				System.out.println(driver.getTitle());

			}
		}
		driver.quit();
		
	}

}
