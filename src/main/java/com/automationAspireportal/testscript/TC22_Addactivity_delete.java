package com.automationAspireportal.testscript;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.automationAspireportal.helper.AdminLogin;
import com.automationAspireportal.helper.Timeouts;
import com.automationAspireportal.helper.Validationhelper;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.Extent_Report;
import com.automationAspireportal.utils.LoadProperties;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;
public class TC22_Addactivity_delete extends TestsuiteBase
{
	ReadTimesheetModuleLocators read= new ReadTimesheetModuleLocators();
	LoadProperties load=new LoadProperties();
	@Test
	public void deleteactivity() throws InterruptedException 
	{
		Extent_Report.getTestScript("AdminAddactivityTab", "Delete the activity");
		AdminLogin login=new AdminLogin(driver);
		login.adminlogin();
		driver.findElement(By.xpath(load.readlocatorvalue("loc.clickonadminaddactivity.label"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(load.readlocatorvalue("loc.addactivitysearch.txtbox"))).sendKeys(load.readlocatorvalue("loc.adaddactivity.txt"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(load.readlocatorvalue("loc.adminactivitydelete.toggle"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(load.readlocatorvalue("loc.adminaddactivitydelete.btn"))).click();
		Thread.sleep(3000);
		/*
		 * String Actualres1=driver.findElement(By.xpath(load.readlocatorvalue(
		 * "loc.addactivityexistalert.txt"))).getText(); String
		 * Expectedres1=load.readlocatorvalue("loc.addactivityalertmsg.txt");
		 * Validationhelper.verification(Actualres1, Expectedres1);
		 */
		//driver.findElement(By.xpath(load.readlocatorvalue("loc.addactivitycancel.btn"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(load.readlocatorvalue("loc.profile.picture"))).click();
		driver.findElement(By.xpath(load.readlocatorvalue("loc.logout.btn"))).click();
		Timeouts.time(5);
		//		
		//	    driver.findElement(By.xpath("//*[@id=\"delete_61\"]/i")).click();
		//	   
	}

}
