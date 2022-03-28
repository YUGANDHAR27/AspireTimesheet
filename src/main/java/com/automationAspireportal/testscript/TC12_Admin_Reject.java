package com.automationAspireportal.testscript;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.AdminLogin;
import com.automationAspireportal.helper.Timeouts;
import com.automationAspireportal.helper.Validationhelper;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.Extent_Report;
import com.automationAspireportal.utils.LoadProperties;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC12_Admin_Reject extends TestsuiteBase {
	ReadTimesheetModuleLocators read = new ReadTimesheetModuleLocators();
	LoadProperties load=new LoadProperties();
	@Test
	public void adminreject() throws InterruptedException
	{
		Extent_Report.getTestScript("AdminReject", "Reject the employee imesheet which is approve by manager");
		AdminLogin login = new AdminLogin(driver);
		login.adminlogin();
		Thread.sleep(2000);
		Select select = new Select(driver.findElement(
				By.xpath(load.readlocatorvalue("loc.adminrejectselectproject.drpdwn"))));
		select.selectByValue(load.readlocatorvalue("loc.selectprojectvalue.num"));
		driver.findElement(By.xpath(read.clickoncheckbox())).click();
		driver.findElement(By.xpath(read.clickonreject())).click();
		Thread.sleep(2000);
		WebElement textareacomment=driver.findElement(By.xpath(load.readlocatorvalue("loc.comment.txt")));
		textareacomment.click();
		textareacomment.sendKeys(load.readlocatorvalue("loc.rejectcommenttext.txt"));
		driver.findElement(By.xpath(load.readlocatorvalue("loc.popupreject.btn"))).click();
		Thread.sleep(2000);
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
