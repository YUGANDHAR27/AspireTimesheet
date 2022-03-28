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

public class TC15_Admin_ActivityReport extends TestsuiteBase
{
	ReadTimesheetModuleLocators read = new ReadTimesheetModuleLocators();
	LoadProperties load=new LoadProperties();
	@Test
	public void adminactivityreport() throws InterruptedException {
		Extent_Report.getTestScript("AdmiActivityReportTab", "Search the employee activity");
		AdminLogin login = new AdminLogin(driver);
		login.adminlogin();
		DateHelper helper=new DateHelper(driver);
		driver.findElement(By.xpath(load.readlocatorvalue("loc.reports.btn"))).click();
		driver.findElement(By.xpath(load.readlocatorvalue("loc.activityreoprt.tab"))).click();
		driver.findElement(By.xpath(load.readlocatorvalue("loc.manageractivityreportclient.drpdwn"))).click();
		WebElement mangerclient=driver.findElement(By.xpath(load.readlocatorvalue("loc.adminreportsclient.txtbox")));
		mangerclient.sendKeys(load.readlocatorvalue("loc.reportclientname.txt")+Keys.ENTER);
		//Select selectclient = new Select(driver.findElement(By.xpath(read.clickonselectclient())));
		//selectclient.selectByVisibleText("Hyper Loop");
		//Select selectproject = new Select(driver.findElement(By.xpath(load.readlocatorvalue("loc.selectproject.dropdwn"))));
		//selectproject.selectByValue("435");
		//selectproject.deselectByValue(load.readlocatorvalue("loc.managerreportdeselectvalue.num"));
		//selectproject.selectByValue(load.readlocatorvalue("loc.managerreportselectproject.num"));
		Select selectproject = new Select(driver.findElement(By.xpath(load.readlocatorvalue("loc.activityreportproject.txtbox"))));
		selectproject.deselectByVisibleText(load.readlocatorvalue("loc.activityreportdeselectproject.txt"));
		selectproject.selectByVisibleText(load.readlocatorvalue("loc.activityreportselectproject.txt"));
		helper.timesheetreport();
		driver.findElement(By.xpath(load.readlocatorvalue("loc.activityreportsearch.btn"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(load.readlocatorvalue("loc.profile.picture"))).click();
		driver.findElement(By.xpath(load.readlocatorvalue("loc.logout.btn"))).click();
		Timeouts.time(5);
	}
}
