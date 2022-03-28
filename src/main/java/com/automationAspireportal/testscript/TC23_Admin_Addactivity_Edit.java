package com.automationAspireportal.testscript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.automationAspireportal.helper.AdminLogin;
import com.automationAspireportal.helper.Timeouts;
import com.automationAspireportal.helper.Validationhelper;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.Extent_Report;
import com.automationAspireportal.utils.LoadProperties;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;
public class TC23_Admin_Addactivity_Edit extends TestsuiteBase
{
	ReadTimesheetModuleLocators read= new ReadTimesheetModuleLocators();
	LoadProperties load=new LoadProperties();
	@Test
	public void editactivity() throws InterruptedException 
	{
		Extent_Report.getTestScript("AdminAddactivityTab", "Edit the activity");
		AdminLogin login=new AdminLogin(driver);
		login.adminlogin();
		driver.findElement(By.xpath(load.readlocatorvalue("loc.clickonadminaddactivity.label"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(load.readlocatorvalue("loc.addactivitysearch.txtbox"))).sendKeys(load.readlocatorvalue("loc.adaddactivity.txt"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(load.readlocatorvalue("loc.addactivityedit.toggle"))).click();
		Thread.sleep(3000);
		WebElement editactivity=driver.findElement(By.xpath(load.readlocatorvalue("loc.adminactivity.drpdwn")));
		editactivity.clear();
		editactivity.sendKeys(load.readlocatorvalue("loc.adediactivity.txt"));
		driver.findElement(By.xpath(load.readlocatorvalue("loc.adminactivitysave.btn"))).click();
		Thread.sleep(4000);
		String Actualres1=driver.findElement(By.xpath(load.readlocatorvalue("loc.addactivitywrongmsgalert.txt"))).getText();
		String Expectedres1=load.readlocatorvalue("loc.adwrongmsgalert.txt");
		Validationhelper.verification(Actualres1, Expectedres1);
		driver.findElement(By.xpath(load.readlocatorvalue("loc.adpopupclose.label"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(load.readlocatorvalue("loc.profile.picture"))).click();
		driver.findElement(By.xpath(load.readlocatorvalue("loc.logout.btn"))).click();
		Timeouts.time(5);
	}
}
