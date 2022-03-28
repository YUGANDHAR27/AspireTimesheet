package com.automationAspireportal.utils;

import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extent_Report 
{
	public static ExtentReports extentReports;//genarating reports
	public static ExtentTest extentTest;//testcase name and description whether it passed or failed
	public static ExtentSparkReporter extentSparkReporter;//decoration
	
	public static void startTest(String testScriptName) 
	{
		extentSparkReporter=new ExtentSparkReporter("TestReport.html");
		extentSparkReporter.config().setDocumentTitle("Aspire Portal Timesheet Test Report");
		extentSparkReporter.config().setReportName(testScriptName);
		extentSparkReporter.config().setTheme(Theme.DARK);
		extentSparkReporter.config().setTimeStampFormat("dd/MM/yyyy  hh-mm-ss");
		extentReports=new ExtentReports();
		extentReports.attachReporter(extentSparkReporter);
		extentReports.setSystemInfo("os", "WIN10");
		extentReports.setSystemInfo("BrowserName", "Chrome");
		
	}
	public static void getTestScript(String testScript,String testDescription) 
	{
		extentTest=extentReports.createTest(testScript,testDescription);
		
		
	}
	public static void getResult(ITestResult iTestResult)
	{
		if(iTestResult.getStatus()==ITestResult.SUCCESS)
		{
			extentTest.log(Status.PASS,MarkupHelper.createLabel(iTestResult.getName() + "PASSED", ExtentColor.GREEN ));
		}
		else if (iTestResult.getStatus()==ITestResult.FAILURE)
		{
			extentTest.log(Status.FAIL,MarkupHelper.createLabel(iTestResult.getName() + "FAILED", ExtentColor.RED ));
		}
		else if (iTestResult.getStatus()==ITestResult.SKIP) 
		{
			extentTest.log(Status.SKIP,MarkupHelper.createLabel(iTestResult.getName() + "SKIP", ExtentColor.BROWN ));
		}
	}
	public static void tearDown() 
	{
		extentReports.flush();
		
	}

}
