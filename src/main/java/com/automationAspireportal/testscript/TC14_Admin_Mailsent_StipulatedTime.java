package com.automationAspireportal.testscript;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.AdminLogin;
import com.automationAspireportal.helper.DateHelper;
import com.automationAspireportal.helper.Timeouts;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.Extent_Report;
import com.automationAspireportal.utils.LoadProperties;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC14_Admin_Mailsent_StipulatedTime extends TestsuiteBase {
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	LoadProperties load=new LoadProperties();
	@Test
	public void stipulatedmail() throws InterruptedException
	{
		Extent_Report.getTestScript("AdminTimesheetsentTab", "Search Employee timesheet");
		DateHelper helper=new DateHelper(driver);
		AdminLogin adminlogin = new AdminLogin(driver);
		adminlogin.adminlogin();
		driver.findElement(By.xpath(load.readlocatorvalue("loc.reports.btn"))).click();
		driver.findElement(By.xpath(load.readlocatorvalue("loc.timesheetsent.tab"))).click();
		Timeouts.time(5);
		driver.findElement(By.xpath(load.readlocatorvalue("loc.timesheetsentclient.drpdwn"))).click();
		WebElement mangerclient=driver.findElement(By.xpath(load.readlocatorvalue("loc.adminreportsclient.txtbox")));
		mangerclient.sendKeys(load.readlocatorvalue("loc.reportclientname.txt")+Keys.ENTER);
		Select selectproject = new Select(driver.findElement(By.xpath(load.readlocatorvalue("loc.adminmailsenttabselctproject.drpdwn"))));
		selectproject.selectByValue(load.readlocatorvalue("loc.selectprojectvalue.num"));
		selectproject.deselectByValue(load.readlocatorvalue("loc.deselectprojectvalue.num"));
		helper.timesheetsenttab();
		driver.findElement(By.xpath(load.readlocatorvalue("loc.managertimesheetsentsearch.btn"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(load.readlocatorvalue("loc.profile.picture"))).click();
		driver.findElement(By.xpath(load.readlocatorvalue("loc.logout.btn"))).click();
		Timeouts.time(5);
	}

}



