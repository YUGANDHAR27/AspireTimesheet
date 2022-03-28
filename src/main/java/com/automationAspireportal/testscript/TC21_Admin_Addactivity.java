package com.automationAspireportal.testscript;



import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.AdminLogin;
import com.automationAspireportal.helper.Timeouts;
import com.automationAspireportal.helper.Validationhelper;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.Extent_Report;
import com.automationAspireportal.utils.LoadProperties;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC21_Admin_Addactivity extends TestsuiteBase
{
	ReadTimesheetModuleLocators read= new ReadTimesheetModuleLocators();
	LoadProperties load=new LoadProperties();
	@Test
	public void adminaddactivity() throws InterruptedException 
	{
		Extent_Report.getTestScript("AdminAddactivityTab", "Add the activity");
		AdminLogin login=new AdminLogin(driver);
		login.adminlogin();
		driver.findElement(By.xpath(load.readlocatorvalue("loc.clickonadminaddactivity.label"))).click();
		driver.findElement(By.xpath(load.readlocatorvalue("loc.adminaddactivity.label"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(load.readlocatorvalue("loc.adminactivity.drpdwn"))).sendKeys(load.readlocatorvalue("loc.adaddactivity.txt"));
		Select Activiftyfor = new Select(driver.findElement(By.xpath(load.readlocatorvalue("loc.adminactivityforprojecttype.drpdwn"))));
		Activiftyfor.selectByVisibleText(load.readlocatorvalue("loc.adaddactivityproject.txt"));
		Select Selectclinet = new Select(driver.findElement(By.xpath(load.readlocatorvalue("loc.adminactivityclient.drpdwn"))));
		Selectclinet.selectByVisibleText(load.readlocatorvalue("loc.adaddactivityclient.txt"));
		Select Selectproject = new Select(driver.findElement(By.xpath(load.readlocatorvalue("loc.adminactivityselectproject.drpdwn"))));
		Selectproject.selectByVisibleText(load.readlocatorvalue("loc.adaddactivityprojectname.txt"));
		driver.findElement(By.xpath(load.readlocatorvalue("loc.adminactivitysave.btn"))).click();
		String Actualres1=driver.findElement(By.xpath(load.readlocatorvalue("loc.adaddactivityalert.txt"))).getText();
		String Expectedres1=load.readlocatorvalue("loc.addactivitysuccessalert.txt");
		//assertEquals(Actualres1, Expectedres1);
		Validationhelper.verification(Actualres1, Expectedres1);
		Thread.sleep(5000);
		driver.findElement(By.xpath(load.readlocatorvalue("loc.profile.picture"))).click();
		driver.findElement(By.xpath(load.readlocatorvalue("loc.logout.btn"))).click();
		Timeouts.time(5);
		//Activity already exist
	}
}