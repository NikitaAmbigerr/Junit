package utilities;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testBase.Baseclass;

public class ExtentReportManager implements ITestListener {

	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	String repName;
	
	public void onStart(ITestContext testcontext)
	{		
		/*SimpleDateFormat df=new SimpleDateFormat("yyyy.mm.DD.HH.mm.ss");
		Date dt=new Date();
		String timestamp=df.format(dt);//specify time stamp */
		
		String timestamp=new SimpleDateFormat("yyyy.mm.DD.HH.mm.ss").format(new Date());// timestamp
		
		repName="Test-Report-"+timestamp+".html";
		sparkReporter =new ExtentSparkReporter(".\\reports\\"+repName);//specifying the location of the report folder
		
		sparkReporter.config().setDocumentTitle("OpenCart Automation Report");//title of report
		sparkReporter.config().setReportName("Opencart Functional Testing");//name of report
		sparkReporter.config().setTheme(Theme.DARK);
		
		extent= new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Application","opencart");
		extent.setSystemInfo("Module","Admin");
		extent.setSystemInfo("Sub Module","Customers");
		extent.setSystemInfo("User Name", System.getProperty("User.name"));
		extent.setSystemInfo("Environment", "QA");
		
		String os=testcontext.getCurrentXmlTest().getParameter("os");
		extent.setSystemInfo("operating system", os);	
		
		String browser=testcontext.getCurrentXmlTest().getParameter("browser");
		extent.setSystemInfo("Browser", browser);
		
		List<String> includedGroups=testcontext.getCurrentXmlTest().getIncludedGroups();
		if(!includedGroups.isEmpty()) {
			extent.setSystemInfo("Groups",includedGroups.toString());		
		}
		
    }
		
	public void onTestSuccess(ITestResult result) 
	{  
		test=extent.createTest(result.getTestClass().getName());
		test.assignCategory(result.getMethod().getGroups());
		test.log(Status.PASS, result.getName()+"got executed Successfully");		
	}
	
	public void onTestFailure(ITestResult result) 
	{	
		test=extent.createTest(result.getTestClass().getName());
		test.assignCategory(result.getMethod().getGroups());
		
		test.log(Status.FAIL, result.getName()+"got Failed");
		test.log(Status.INFO, result.getThrowable().getMessage());
		
		try 
		{
		String imgPath=new Baseclass().captureScreen(result.getName());
		test.addScreenCaptureFromPath(imgPath);
		}
		catch(IOException e1) 
		{
			e1.printStackTrace();
		}
	}	
	
	public void onTestSkipped(ITestResult result) 
	{		
		test=extent.createTest(result.getTestClass().getName());
		test.assignCategory(result.getMethod().getGroups());
		test.log(Status.SKIP, result.getName()+"got skiped");
		test.log(Status.INFO, result.getThrowable().getMessage());
    }
	
	public void onFinish(ITestContext testcontext)
	{
		extent.flush();
		
		String pathOfExtentReport=System.getProperty("user.dir")+"\\reports\\"+repName;
		File extentReport= new File(pathOfExtentReport);
		
		try 
		{
			Desktop.getDesktop().browse(extentReport.toURI());
		}
		catch(IOException e) {
			e.printStackTrace();
		}
    }
}
