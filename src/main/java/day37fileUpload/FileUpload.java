package day37fileUpload;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
////		single file upload
//		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("D:\\Testing\\My Notes\\Automation by me\\day21 .txt");
//		
//		if(driver.findElement(By.xpath("//ul[@id='fileList']")).getText().equals("day21 .txt")) {
//			System.out.println("file successsfully uploaded");
//		}
//		else {
//			System.out.println("File is not uploade");
//		}
//		Multiple file Upload
		String file1="D:\\Testing\\My Notes\\Automation by me\\day23.txt";
		String file2="D:\\Testing\\My Notes\\Automation by me\\day22.txt";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		int noOfFilesUploaded=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		
//		Validate number of files uploaded
		if(noOfFilesUploaded==2 ) {
			System.out.println("all files are uploaded");
		}else {
			System.out.println("files not uploaded correctly");
		}
		
//		validating the name of files
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("day23.txt")
		&& driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("day22.txt")) {
			System.out.println("Correct files are uploaded");
		}
		else {
			System.out.println("Correct File are not uploade");
		}
		
		driver.quit();
	}

}
