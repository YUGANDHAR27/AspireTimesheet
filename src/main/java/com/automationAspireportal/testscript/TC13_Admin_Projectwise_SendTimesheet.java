package com.automationAspireportal.testscript;

import static org.testng.Assert.assertEquals;

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

public class TC13_Admin_Projectwise_SendTimesheet extends TestsuiteBase {

	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	LoadProperties load=new LoadProperties();
	@Test
	public void mail() throws InterruptedException 
	{
		Extent_Report.getTestScript("AdminTimesheetsentTab", "Send Employee timesheet to gmail");
		AdminLogin adminlogin = new AdminLogin(driver);
		adminlogin.adminlogin();
		DateHelper helper=new DateHelper(driver);
		driver.findElement(By.xpath(load.readlocatorvalue("loc.reports.btn"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(load.readlocatorvalue("loc.reportclient.drpdwn"))).click();
		WebElement client=driver.findElement(By.xpath(load.readlocatorvalue("loc.adminreportsclient.txtbox")));
		client.sendKeys(load.readlocatorvalue("loc.reportclientname.txt")+Keys.ENTER);
		//Select selectclient = new Select(driver.findElement(By.xpath(read.clickonselectclient())));
		//selectclient.selectByVisibleText("Hyper Loop");
		Select selectproject = new Select(driver.findElement(By.xpath(load.readlocatorvalue("loc.selectproject.drpdwn"))));
		selectproject.selectByValue(load.readlocatorvalue("loc.selectprojectvalue.num"));
		selectproject.deselectByValue(load.readlocatorvalue("loc.deselectprojectvalue.num"));
		helper.selectdate();
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
		driver.findElement(By.xpath(load.readlocatorvalue("loc.sendtimesheet.btn"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(load.readlocatorvalue("loc.reportinggmail.txtbox"))).sendKeys(load.readlocatorvalue("loc.gmail.txt"));
		driver.findElement(By.xpath(load.readlocatorvalue("loc.adminccmail.txtbox"))).sendKeys(load.readlocatorvalue("loc.Adccgmail.txt"));
		driver.findElement(By.xpath(load.readlocatorvalue("loc.adcomment.txtbox"))).sendKeys(load.readlocatorvalue("loc.adcomment.txt"));
		driver.findElement(By.xpath(load.readlocatorvalue("loc.sendreportinggmail.btn"))).click();
		Thread.sleep(2000);
		String Actualres=driver.findElement(By.xpath(load.readlocatorvalue("loc.sendtimesheetpopuptext.txt"))).getText();
		String Expectedres=load.readlocatorvalue("loc.sendgmailalert.txt");
		assertEquals(Actualres, Expectedres);
		driver.findElement(By.xpath(load.readlocatorvalue("loc.closepopup.btn"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(load.readlocatorvalue("loc.profile.picture"))).click();
		driver.findElement(By.xpath(load.readlocatorvalue("loc.logout.btn"))).click();
		Timeouts.time(5);

	}
}
