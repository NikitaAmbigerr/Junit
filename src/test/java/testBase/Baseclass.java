package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Baseclass {
	public  static WebDriver driver;
	protected Logger logger;
	public Properties p;
	
	@BeforeClass(groups= {"sanity","regression","master"})
	@Parameters({"os","browser"})
	public void Setup(String os,String br) throws IOException  {
		
//		Loading config.properties
		FileReader file=new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		
		logger=LogManager.getLogger(this.getClass());
		switch (br.toLowerCase())
				{
			case "chrome":driver=new ChromeDriver();break;
			case "edge" :driver=new EdgeDriver();break;
			case "firefox":driver=new FirefoxDriver();break;
			default:System.out.println("Invalid browser name");return;
				}
			
//		driver.get("https://tutorialsninja.com/demo/");
		driver.get(p.getProperty("appURL"));
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	
	
	
	@AfterClass(groups= {"sanity","regression","master"})
	public void TearDown() {	
		driver.quit();
	}
	
	
	public String randomeString() {
		String email=RandomStringUtils.randomAlphabetic(5);
		return email;
	}
	public String randomeNumber() {
		String lname=RandomStringUtils.randomAlphabetic(5);
		return lname;
	}
	public String randomeAlphaNumeric() {
		String pass=RandomStringUtils.randomAlphanumeric(8);
		return pass;
		
	}


	public String captureScreen(String tname) throws IOException  {
		String timestamp=new SimpleDateFormat("yyyy.mm.DD.HH.mm.ss").format(new Date());// timestamp 
		
		TakesScreenshot takescreenshot=(TakesScreenshot)driver;		
		File SourceFile=takescreenshot.getScreenshotAs(OutputType.FILE);
		
		String TargetFilePath=System.getProperty("user.dir")+"\\screeenshots\\"+tname+"_"+timestamp;
		File targetFile=new File(TargetFilePath);
		
		SourceFile.renameTo(targetFile);
		return TargetFilePath;
		
	} 
}
