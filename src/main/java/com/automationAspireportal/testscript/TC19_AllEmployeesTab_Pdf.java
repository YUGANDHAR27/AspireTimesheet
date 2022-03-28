package com.automationAspireportal.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.AdminLogin;
import com.automationAspireportal.helper.DateHelper;
import com.automationAspireportal.helper.Timeouts;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.Extent_Report;
import com.automationAspireportal.utils.LoadProperties;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC19_AllEmployeesTab_Pdf  extends TestsuiteBase
{
	ReadTimesheetModuleLocators read = new ReadTimesheetModuleLocators();
	LoadProperties load=new LoadProperties();
	@Test
	public void allemployeesPdf() throws InterruptedException 
	{
		Extent_Report.getTestScript("AdminAllemployeeTab", "Download the Employee timesheet Pdf format");
		DateHelper helper=new DateHelper(driver);
		AdminLogin login = new AdminLogin(driver);
		login.adminlogin();
		Select admindrp = new Select(driver.findElement(By.xpath(read.changeloginasadmin())));
		admindrp.selectByVisibleText("Admin");
		driver.findElement(By.xpath(load.readlocatorvalue("loc.reports.btn"))).click();
		driver.findElement(By.xpath(read.clickonallemployeestab())).click();
		Thread.sleep(4000);		
		Select selectemployee=new Select(driver.findElement(By.xpath(load.readlocatorvalue("loc.allslectemployee.drpdwn"))));
		selectemployee.selectByVisibleText(load.readlocatorvalue("loc.adminemployeevisibletext.txt"));
		selectemployee.deselectByVisibleText(load.readlocatorvalue("loc.adminallemployee.txt"));
		helper.selectdateforallemployeesstab();
		driver.findElement(By.xpath(read.allemployeesexport())).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(read.clickonpdf())).click();
		Thread.sleep(3000);
		//download PDF is not working
		driver.findElement(By.xpath(load.readlocatorvalue("loc.profile.picture"))).click();
		driver.findElement(By.xpath(load.readlocatorvalue("loc.logout.btn"))).click();
		Timeouts.time(5);
		

	
	}



}
