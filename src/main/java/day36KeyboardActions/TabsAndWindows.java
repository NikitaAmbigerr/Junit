package day36KeyboardActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriver driver= new ChromeDriver();
         
         driver.get("https://demo.nopcommerce.com/");
//       driver.switchTo().newWindow(WindowType.TAB); //opens the next link in same window but in new tab
         driver.switchTo().newWindow(WindowType.WINDOW);//opens the next link in new window
         driver.get("https://www.orangehrm.com/");
         
         driver.quit();
         
         }

}
