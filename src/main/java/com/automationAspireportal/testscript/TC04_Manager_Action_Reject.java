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

public class TC04_Manager_Action_Reject extends TestsuiteBase
{
	//ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	LoadProperties load=new LoadProperties();
	@Test
	public void manageractionreject() throws InterruptedException {
		//Extent_Report report=new Extent_Report();
		Extent_Report.getTestScript("manageractionreject", "Reject employee Timesheet");

		/*
		 * EmployeePageHelper helper=new EmployeePageHelper(driver);
		 * helper.employeeHelper();
		 */
		//extentTest=extentReports.createTest("manageractionreject","Reject the employee timesheet");
		//extentTest=report.extentReports.createTest("manageractionreject","Reject the employee timesheet");
		ManagerLogin login = new ManagerLogin(driver);
		login.managerlogin();
		Timeouts.time(5);
		driver.findElement(By.xpath(load.readlocatorvalue("loc.Projectdrpd.drp"))).click();
		WebElement project=driver.findElement(By.xpath(load.readlocatorvalue("loc.mangerproject.txt")));
		project.sendKeys(load.readlocatorvalue("loc.mangerprojectname.txt")+Keys.ENTER);
		Timeouts.time(5);   	
		driver.findElement(By.xpath(load.readlocatorvalue("loc.rejectaction.btn"))).click();
		Timeouts.time(5);
		WebElement textareacomment=driver.findElement(By.xpath(load.readlocatorvalue("loc.comment.txt")));
		textareacomment.click();
		textareacomment.sendKeys(load.readlocatorvalue("loc.rejectcommenttext.txt"));
		driver.findElement(By.xpath(load.readlocatorvalue("loc.popupreject.btn"))).click();
		Timeouts.time(5);
		String Actualres1=driver.findElement(By.xpath(load.readlocatorvalue("loc.actualrejectalert.txt"))).getText();
		String Expectedres1=load.readlocatorvalue("loc.expectedrejecttalert.txt");
		//assertEquals(Actualres1, Expectedres1);
		Validationhelper.verification(Actualres1, Expectedres1);
		Thread.sleep(5000);
		driver.findElement(By.xpath(load.readlocatorvalue("loc.profile.picture"))).click();
		driver.findElement(By.xpath(load.readlocatorvalue("loc.logout.btn"))).click();
		Timeouts.time(5);


	}

}
