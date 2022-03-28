package com.automationAspireportal.testscript;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.DateHelper;
import com.automationAspireportal.helper.ManagerLogin;
import com.automationAspireportal.helper.Timeouts;
import com.automationAspireportal.helper.Validationhelper;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.Extent_Report;
import com.automationAspireportal.utils.LoadProperties;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC10_Manager_MoreThan31Days extends TestsuiteBase
{
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();	
	LoadProperties load=new LoadProperties();
	@Test
	public void reportsmorethan31days() throws InterruptedException
	{
		Extent_Report.getTestScript("ManagerreportsTab", "Export The Employee Timesheet report for more than 31 days");
		DateHelper helper=new  DateHelper(driver);
		ManagerLogin login = new ManagerLogin(driver);
		login.managerlogin();
		driver.findElement(By.xpath(load.readlocatorvalue("loc.reports.btn"))).click();
		driver.findElement(By.xpath(load.readlocatorvalue("loc.reportclient.drpdwn"))).click();
		WebElement mangerclient=driver.findElement(By.xpath(load.readlocatorvalue("loc.managerreportsclient.txtbox")));
		mangerclient.sendKeys(load.readlocatorvalue("loc.reportclientname.txt")+Keys.ENTER);
		//Select selectclient = new Select(driver.findElement(By.xpath(read.clickonselectclient())));
		//selectclient.selectByVisibleText("Hyper Loop");
		Select selectproject = new Select(driver.findElement(By.xpath(load.readlocatorvalue("loc.selectproject.drpdwn"))));
		selectproject.selectByValue(load.readlocatorvalue("loc.selectprojectvalue.num"));
		selectproject.deselectByValue(load.readlocatorvalue("loc.deselectprojectvalue.num"));
		helper.selectdatemorethan31days();
		Select selectemployee = new Select(driver.findElement(By.xpath(load.readlocatorvalue("loc.selectemployee.txtbox"))));
		selectemployee.deselectByValue(load.readlocatorvalue("loc.deselectemployevalue.num"));
		selectemployee.selectByValue(load.readlocatorvalue("loc.selctemployevalue.num"));
		Select ActivityReports = new Select(driver.findElement(By.xpath(load.readlocatorvalue("loc.selectactivity.dropdwn"))));
		ActivityReports.selectByVisibleText(load.readlocatorvalue("loc.reportselectactivity.txt"));
		Select SelectStatus = new Select(driver.findElement(By.xpath(load.readlocatorvalue("loc.selectstatus.dropdwn"))));
		SelectStatus.selectByValue(load.readlocatorvalue("loc.deselectprojectvalue.num"));
		Select BillingType = new Select(driver.findElement(By.xpath(load.readlocatorvalue("loc.billing.dropdwn"))));
		BillingType.selectByVisibleText(load.readlocatorvalue("loc.reportbillingtype.txt"));
		Select ExportAs = new Select(driver.findElement(By.xpath(load.readlocatorvalue("loc.export.dropdwn"))));
		ExportAs.selectByVisibleText(load.readlocatorvalue("loc.reportexportas.txt"));
		Select Reporttype = new Select(driver.findElement(By.xpath(load.readlocatorvalue("loc.reportas.dropdwn"))));
		Reporttype.selectByVisibleText(load.readlocatorvalue("loc.reportas.txt"));
		Select template = new Select(driver.findElement(By.xpath(load.readlocatorvalue("loc.reporttemplatetype.drpdwn"))));
		template.selectByVisibleText(load.readlocatorvalue("loc.reporttemplatetype.txt"));
		driver.findElement(By.xpath(load.readlocatorvalue("loc.export.btn"))).click();
		Thread.sleep(3000);
		String Actualres1=driver.findElement(By.xpath(load.readlocatorvalue("loc.timesheetreport31daysalert.alert"))).getText();
		String Expectedres1=load.readlocatorvalue("loc.timesheetreport31daysalert.txt");
		//assertEquals(Actualres1, Expectedres1);
		Validationhelper.verification(Actualres1, Expectedres1);
		Thread.sleep(3000);
		driver.findElement(By.xpath(load.readlocatorvalue("loc.profile.picture"))).click();
		driver.findElement(By.xpath(load.readlocatorvalue("loc.logout.btn"))).click();
		Timeouts.time(5);


	}
}
