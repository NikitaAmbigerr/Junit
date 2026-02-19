package day32Autosugest_dropdown_and_staticwebTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTableHandeling {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();	
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		1)Find the number of rows from table
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr")).size();
		System.out.println("Number of rows in a Table="+rows);
		
//		2)Find the Header of the Table
		int column= driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Number of columns in a Table="+column);

//		3)Read Data from Specific row and column
		String data=driver.findElement(By.xpath("//table[@name='BookTable']//tr[3]//td[2]")).getText();
		System.out.println(data);
		
//		System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"price");
		
//		4)read all the data from the table
//		for(int r=2;r<=rows;r++) {			
//			for(int c=1;c<=column;c++) {				
//				String datas= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
//				System.out.print(datas+"\t");		
//			}
//			System.out.println();			
//		}
		
//		5)Condition based data retrieval( print the second colum data)
//		for(int i=2;i<=rows;i++) {
//			String Author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[2]")).getText();
//			if(Author.equals("Mukesh")) {
//			    String BookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]")).getText();
//			    System.out.println(BookName+"\t"+Author);
//		}
		int total=0;
//	   6)Find the total price of books
			for(int r=2;r<=rows;r++) {
				String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
				 total =total+Integer.parseInt(price);
			}
	            System.out.println("Total Price of book:"+total);
	            
		driver.quit();

	}

}
