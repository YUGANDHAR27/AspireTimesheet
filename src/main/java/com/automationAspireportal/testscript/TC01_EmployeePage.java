package com.automationAspireportal.testscript;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.EmployeePageHelper;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.Extent_Report;
import com.aventstack.extentreports.ExtentReports;

public class TC01_EmployeePage extends TestsuiteBase 
{
	@Test
	public void employeeModule() throws InterruptedException 
	{
		//Extent_Report.startTest("TC01_EmployeePage");
		Extent_Report.getTestScript("employeeModule", "Submitting the employee timesheet");
		//extentTest=extentReports.createTest("employeeModule","Submitting the employee timesheet");
		EmployeePageHelper page = new EmployeePageHelper(driver);
		page.employeeHelper();	
		
	}
	

}
