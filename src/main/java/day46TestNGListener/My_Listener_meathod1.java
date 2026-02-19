package day46TestNGListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//1.listener class is a utility file used to generate report
//2.To perform post actions
public  class My_Listener_meathod1 implements ITestListener{
	
	public void onStart(ITestContext context) {
		System.out.println("Test execution started............");
	  }
	public void onTestStart(ITestResult result) {
		System.out.println("Test started............");
	  }
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test successfull............");
	  }
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed............");
	  }
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped............");
      }
	public void onTestFinished(ITestResult result) {
		System.out.println("Test Finished............");
      }
}
