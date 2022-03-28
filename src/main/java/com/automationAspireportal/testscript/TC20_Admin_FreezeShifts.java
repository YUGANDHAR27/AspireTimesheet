package com.automationAspireportal.testscript;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.AdminLogin;
import com.automationAspireportal.helper.Timeouts;
import com.automationAspireportal.helper.Validationhelper;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.Extent_Report;
import com.automationAspireportal.utils.LoadProperties;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC20_Admin_FreezeShifts extends TestsuiteBase
{
	ReadTimesheetModuleLocators read= new ReadTimesheetModuleLocators();
	LoadProperties load=new LoadProperties();
	@Test
	public void freezeshifts() throws InterruptedException 
	{
		Extent_Report.getTestScript("AdminFreezeShiftsTab", "Freeze shifts");
		AdminLogin login=new AdminLogin(driver);
		login.adminlogin();
		driver.findElement(By.xpath(load.readlocatorvalue("loc.shifts.txt"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(load.readlocatorvalue("loc.freezeshifts.tab"))).click();
		driver.findElement(By.xpath(load.readlocatorvalue("loc.freezedate.txtbox"))).click();
		driver.findElement(By.xpath(load.readlocatorvalue("loc.freezemonth.txt"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(load.readlocatorvalue("loc.Adfreeze.btn"))).click();
		Thread.sleep(3000);
		String Actualres=driver.findElement(By.xpath(load.readlocatorvalue("loc.confirmationmsg.txt"))).getText();
		String Expectedres=load.readlocatorvalue("loc.freezeshiftsconfirmation.txt");
		Validationhelper.verification(Actualres, Expectedres);
		Thread.sleep(2000);
		driver.findElement(By.xpath(load.readlocatorvalue("loc.closepopup.btn"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(load.readlocatorvalue("loc.profile.picture"))).click();
		driver.findElement(By.xpath(load.readlocatorvalue("loc.logout.btn"))).click();
		Timeouts.time(5);	

	}
}
