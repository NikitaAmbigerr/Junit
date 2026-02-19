package day39;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkHandeling {

	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		int noofbrokenlink=0;
		
		for(WebElement Link:links) {
			String hrefval=Link.getAttribute("href");
			if(hrefval==null||hrefval.isEmpty()) {
				System.out.println("not possible");
				continue;
			}
		try {	
		URL LinkUrl=new URL(hrefval);
		HttpURLConnection conn=(HttpURLConnection) LinkUrl.openConnection();
		conn.connect();
		
		if(conn.getResponseCode()>=400) {
			System.out.println("is a broken link");
			noofbrokenlink++;
		}else 
		{
		    System.out.println("is not a broken link");	
		}
		}
		catch(Exception e){
				
		}
		
		}
		System.out.println(noofbrokenlink);
	}

}
