package com.automationAspireportal.testscript;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.EmployeePageHelper;
import com.automationAspireportal.helper.ManagerLogin;
import com.automationAspireportal.helper.Timeouts;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.Extent_Report;
import com.automationAspireportal.utils.LoadProperties;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC03_Manager_Approve extends TestsuiteBase
{
	//ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	LoadProperties load=new LoadProperties();
	@Test
	public void managerapprove() throws InterruptedException 
	{
		Extent_Report.getTestScript("ManagerApprove", "Approving the Employee Timesheet");
		EmployeePageHelper helper=new EmployeePageHelper(driver);
		helper.employeeHelper();
		ManagerLogin login = new ManagerLogin(driver);
		login.managerlogin();
		 driver.findElement(By.xpath(load.readlocatorvalue("loc.Projectdrpd.drp"))).click();
	     WebElement project=driver.findElement(By.xpath(load.readlocatorvalue("loc.mangerproject.txt")));
	     project.sendKeys(load.readlocatorvalue("loc.mangerprojectname.txt")+Keys.ENTER);	
	     Timeouts.time(5);	
	     driver.findElement(By.xpath(load.readlocatorvalue("loc.selectemployee.checkbox"))).click();
		driver.findElement(By.xpath(load.readlocatorvalue("loc.approve.txt"))).click();
		Thread.sleep(5000);	
		driver.findElement(By.xpath(load.readlocatorvalue("loc.profile.picture"))).click();
		driver.findElement(By.xpath(load.readlocatorvalue("loc.logout.btn"))).click();
		Timeouts.time(5);
		
	}

}
