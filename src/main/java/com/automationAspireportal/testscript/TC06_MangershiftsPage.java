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
import com.automationAspireportal.utils.ReadExcel;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC06_MangershiftsPage extends TestsuiteBase {
	//ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	ReadExcel excel= new ReadExcel(3);
	LoadProperties load=new LoadProperties();
	@Test
	public void updatingshifts() throws InterruptedException 
	{
		Extent_Report.getTestScript("updatingshifts", "Update the shifts");
		DateHelper helper=new DateHelper(driver);
		ManagerLogin login = new ManagerLogin(driver);
		login.managerlogin();
		driver.findElement(By.xpath(load.readlocatorvalue("loc.shifts.txt"))).click();
		driver.findElement(By.xpath(load.readlocatorvalue("loc.Projectdrpd.drp"))).click();
		WebElement project=driver.findElement(By.xpath(load.readlocatorvalue("loc.managershiftsproject.txt")));
		project.sendKeys(load.readlocatorvalue("loc.mangerprojectname.txt")+Keys.ENTER);
		Timeouts.time(5);;
		driver.findElement(By.xpath(load.readlocatorvalue("loc.updateshifts.txt"))).click();
		Timeouts.time(5);		
//		WebElement selectemployee=driver.findElement(By.xpath(load.readlocatorvalue("loc.managershiftemploye.xpath")));
//		selectemployee.sendKeys(load.readlocatorvalue("loc.managershiftemployeename.txt")+Keys.ENTER);
		//Select selectemployee=new Select(driver.findElement(By.xpath(read.cickonselectemployee())));
		//selectemployee.deselectByValue("0");
		//selectemployee.selectByValue("1089");
		helper.selectdateforshifts();
		driver.findElement(By.xpath(load.readlocatorvalue("loc.shifttype.txt"))).click();
		Select selectshift=new Select(driver.findElement(By.xpath(load.readlocatorvalue("loc.shifts.textbox"))));
		selectshift.selectByVisibleText(load.readlocatorvalue("loc.managershifttype.txt"));
		Thread.sleep(2000);
		driver.findElement(By.xpath(load.readlocatorvalue("loc.profile.picture"))).click();
		driver.findElement(By.xpath(load.readlocatorvalue("loc.logout.btn"))).click();
		Timeouts.time(5);
	}

}
