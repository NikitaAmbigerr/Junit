package day31Different_types_of_Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HidenDropDownHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

//		Click on PIM
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement e1=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='PIM']")));
		e1.click();
		
//		Click on Dropdown
		driver.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='oxd-table-filter']/div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[6]/div[1]/div[2]/div[1]/div[1]")).click();
		Thread.sleep(3000);
		
//      Select single option
		driver.findElement(By.xpath("//span[normalize-space()='Automaton Tester']")).click();
        
//		Capture list of options
        List<WebElement> options=driver.findElements(By.xpath("//div[@role='listbox']//span"));
		Thread.sleep(5000);
        System.out.println("Number of elements:"+options.size());

//      Print list of hidden elements
        for(WebElement role:options) {
        	System.out.println(role.getText());
        }
        
		driver.quit();
	}

}
