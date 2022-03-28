package com.automationAspireportal.testscript;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.DateHelper;
import com.automationAspireportal.helper.ManagerLogin;
import com.automationAspireportal.helper.Timeouts;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.Extent_Report;
import com.automationAspireportal.utils.LoadProperties;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC11_Manger_ActivityReport extends TestsuiteBase
{
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	LoadProperties load=new LoadProperties();
	@Test
	public void manageractivityReports() throws InterruptedException  {
		Extent_Report.getTestScript("ManageractivityreportsTab", "Search the Employee activity");
		ManagerLogin login = new ManagerLogin(driver);
		login.managerlogin();
		DateHelper helper=new DateHelper(driver);
		driver.findElement(By.xpath(load.readlocatorvalue("loc.reports.btn"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(load.readlocatorvalue("loc.activityreoprt.tab"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(load.readlocatorvalue("loc.manageractivityreportclient.drpdwn"))).click();
		WebElement mangerclient=driver.findElement(By.xpath(load.readlocatorvalue("loc.managerreportsclient.txtbox")));
		mangerclient.sendKeys(load.readlocatorvalue("loc.reportclientname.txt")+Keys.ENTER);
		//Select selectclient = new Select(driver.findElement(By.xpath(read.clickonselectclient())));
		//selectclient.selectByVisibleText("Hyper Loop");
		//Select selectproject = new Select(driver.findElement(By.xpath(load.readlocatorvalue("loc.selectproject.dropdwn"))));
		//selectproject.selectByValue("435");
		//selectproject.deselectByValue(load.readlocatorvalue("loc.managerreportdeselectvalue.num"));
		//selectproject.selectByValue(load.readlocatorvalue("loc.managerreportselectproject.num"));
		Select selectproject = new Select(driver.findElement(By.xpath(load.readlocatorvalue("loc.activityreportproject.txtbox"))));
		selectproject.selectByVisibleText(load.readlocatorvalue("loc.activityreportselectproject.txt"));
		selectproject.deselectByVisibleText(load.readlocatorvalue("loc.activityreportdeselectproject.txt"));
		helper.timesheetreport();
		driver.findElement(By.xpath(load.readlocatorvalue("loc.activityreportsearch.btn"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(load.readlocatorvalue("loc.profile.picture"))).click();
		driver.findElement(By.xpath(load.readlocatorvalue("loc.logout.btn"))).click();
		Timeouts.time(5);

	}

}
