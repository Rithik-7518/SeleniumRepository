package day_24;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {

	
	public ExtentSparkReporter sparkReporter;   // UI report
	public ExtentReports extent;	// populate common info on the report
	public ExtentTest Test;			// update status of test method
	
	public void onStart(ITestContext context) {
		sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+ "/reports/myReport.html");//speci

		sparkReporter.config().setDocumentTitle("Automation Report"); // Title of report 
		sparkReporter.config().setReportName("Functional Testing"); // name of the report

		sparkReporter.config().setTheme (Theme.STANDARD);

		extent=new ExtentReports();
		extent.attachReporter (sparkReporter);
		
		extent.setSystemInfo("Computer Nane", "localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester Name", "Rithik");
		extent.setSystemInfo("os", "Windows10");
		extent.setSystemInfo("Browser name", "Chrome");

	  }
	
	
	
	public void onTestSuccess(ITestResult result) {

		Test = extent.createTest(result.getName()); // create a new enty in the report
		Test.log(Status.PASS, "Test case PASSED is:" + result.getName()); // update status p/f/s
	}


	public void onTestFailure (ITestResult result) {

		Test=extent.createTest(result.getName());
		Test.log(Status.FAIL, "Test case FAILED is:" + result.getName());
		Test.log(Status.FAIL, "Test Case FAILED cause is: "+ result.getThrowable());
	}
	

	public void onTestSkipped(ITestResult result) {

		Test=extent.createTest(result.getName());
		Test.log(Status.SKIP, "Test case SKIPPED is: "+result.getName());

	}

	public void onFinish (ITestContext context) {

		extent.flush();

	}

	
}
