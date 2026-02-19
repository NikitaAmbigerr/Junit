package day28BrowserAndNavigationCommand;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificBrowserWindows {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.partialLinkText("OrangeHRM")).click();
		
		Set<String> W_IDs=driver.getWindowHandles();
		
		List<String>Win_Id=new ArrayList(W_IDs);
		
		for(String Win:Win_Id) {
			String title=driver.switchTo().window(Win).getTitle();
			System.out.println(title);
			
			if(title.equals("OrangeHRM")) {
				driver.close();
			}
		}
		
	}

}
