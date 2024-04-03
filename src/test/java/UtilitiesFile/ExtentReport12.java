package UtilitiesFile;

import java.io.File;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import TestCaseFile.BaseClass12;
import junit.framework.TestCase;

public class ExtentReport12 extends BaseClass12 implements ITestListener {
	
	ExtentSparkReporter createReport;
	ExtentReports createTest1;
	ExtentTest createlog;
	
 public	void setup() 
	{
		createReport =new ExtentSparkReporter("MyReport12.html");
		createTest1 =new ExtentReports();
		createTest1.attachReporter(createReport);
		
		createTest1.setSystemInfo("Operating System", "Window");
		createTest1.setSystemInfo("Browser", "chrome");
		createTest1.setSystemInfo("Browser Version", "120.00.6699.227");
		createTest1.setSystemInfo("Username", "Shashank");
		
		createReport.config().setDocumentTitle("MyExetent_Report");
		createReport.config().setReportName("NewReport");
		createReport.config().setTheme(Theme.DARK);
		
	}
	
	public void onStart(ITestContext Result) 
	{
		setup();
		System.out.println("OnStart");
	}
	public void onTestStart(ITestResult Result) 
	{
		System.out.println("OnTestStart");
	}
	public void onTestSuccess(ITestResult Result) 
	{
		createlog=createTest1.createTest(Result.getName());
		createlog.log(Status.PASS,MarkupHelper.createLabel("The Test Case is Pass",ExtentColor.GREEN));
	}
	public void onTestFailure(ITestResult Result) 

	{
		try {
			ScreenS();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String path="C:\\Eclipse\\Samsung\\ScreenShot\\ss1.png";
		createlog=createTest1.createTest(Result.getName());
		createlog.log(Status.FAIL,MarkupHelper.createLabel("The Test Case is Failed",ExtentColor.RED));
		createlog.fail("CaptureScreenshot"+createlog.addScreenCaptureFromPath(path));
	}
	
	public void onTestSkip(ITestResult Result) 
	{ 
		createlog=createTest1.createTest(Result.getName());
		createlog.log(Status.SKIP,MarkupHelper.createLabel("The Test Case is Skipped",ExtentColor.ORANGE));
		
	}
	public void onFinish(ITestContext Result) 
	{
		createTest1.flush();
		System.out.println("On_Finish");
	}
	public void onTestFailedButwithinSuccessPercentage(ITestResult Result) 
	{
		
	}

}
