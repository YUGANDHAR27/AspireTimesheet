package com.automationAspireportal.testscript;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.EmployeePageHelper;
import com.automationAspireportal.helper.ManagerLogin;
import com.automationAspireportal.helper.Timeouts;
import com.automationAspireportal.helper.Validationhelper;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.Extent_Report;
import com.automationAspireportal.utils.LoadProperties;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC02_Manager_Action_Approve extends TestsuiteBase
{
	//ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	LoadProperties load=new LoadProperties();
	@Test
	public void manageractionapprove() throws InterruptedException
	{
		//Extent_Report.getTestScript("Manager Module", "Reject timesheet");
		EmployeePageHelper helper=new EmployeePageHelper(driver);
		helper.employeeHelper();
		Extent_Report.getTestScript("ManagerActionApprove", "Approving the Employee Timesheet");
		ManagerLogin login = new ManagerLogin(driver);
		login.managerlogin();
		 driver.findElement(By.xpath(load.readlocatorvalue("loc.Projectdrpd.drp"))).click();
	     WebElement project=driver.findElement(By.xpath(load.readlocatorvalue("loc.mangerproject.txt")));
	     project.sendKeys(load.readlocatorvalue("loc.mangerprojectname.txt")+Keys.ENTER);
	     Timeouts.time(5);;
		driver.findElement(By.xpath(load.readlocatorvalue("loc.approve.check"))).click();
		Timeouts.time(5);
		String Actualres=driver.findElement(By.xpath(load.readlocatorvalue("loc.actionapprove.xpath"))).getText();
		String Expectedres=load.readlocatorvalue("loc.actionapprovealert.msg");
		//assertEquals(Actualres, Expectedres);
		Validationhelper.verification(Actualres, Expectedres);
		Thread.sleep(5000);
		driver.findElement(By.xpath(load.readlocatorvalue("loc.profile.picture"))).click();
		driver.findElement(By.xpath(load.readlocatorvalue("loc.logout.btn"))).click();
		Timeouts.time(5);		
		
	}
	
}
//*[@id="alert-message"]