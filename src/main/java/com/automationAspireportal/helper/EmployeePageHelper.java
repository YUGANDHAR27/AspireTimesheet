package com.automationAspireportal.helper;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.automationAspireportal.utils.LoadProperties;
import com.automationAspireportal.utils.ReadExcel;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class EmployeePageHelper 
{
	WebDriver driver;
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	ReadExcel excel= new ReadExcel(0);
	public EmployeePageHelper(WebDriver driver)
	{
		this.driver = driver;
	}
	LoadProperties load=new LoadProperties();
	public void employeeHelper() throws InterruptedException 
	{

		EmployeeloginHelper helper=new EmployeeloginHelper(driver);
		helper.employeelogin();
		Validationhelper validationhelper=new Validationhelper(driver);
		WebElement clickonts = driver.findElement(By.xpath(read.clickonTimesheet()));
		clickonts.click();
		Select employeeactivity=new Select(driver.findElement(By.xpath(load.readlocatorvalue("loc.activity.dropdown"))));
		employeeactivity.selectByVisibleText(load.readlocatorvalue("loc.employeeactivity.txt"));;
		//	driver.findElement(By.xpath(read.activity())).click();
		driver.findElement(By.xpath(read.clickonMonday())).sendKeys(excel.Workinghour());
		driver.findElement(By.xpath(read.clickonTuesday())).sendKeys(excel.Workinghour());
		driver.findElement(By.xpath(read.clickonwednesday())).sendKeys(excel.Workinghour());
		driver.findElement(By.xpath(read.clickonThursday())).sendKeys(excel.Workinghour());
		driver.findElement(By.xpath(read.clickonFriday())).sendKeys(excel.Workinghour());
		driver.findElement(By.xpath(read.clickonNotes())).click();
		WebElement enternote=driver.findElement(By.xpath(load.readlocatorvalue("loc.givenotes.txt")));
		enternote.click();
		enternote.clear();
		enternote.sendKeys(load.readlocatorvalue("loc.employeenote.txt"));
		Timeouts.time(5);
		driver.findElement(By.xpath(load.readlocatorvalue("loc.clickoncheck.btn"))).click();
		Timeouts.time(3);
		driver.findElement(By.xpath(load.readlocatorvalue("loc.addactivity.btn"))).click();
		driver.findElement(By.xpath(load.readlocatorvalue("loc.deleteactivity.btn"))).click();
		Timeouts.time(3);
//		driver.findElement(By.xpath(load.readlocatorvalue("loc.save.btn"))).click();	
//		Timeouts.time(10);
		driver.findElement(By.xpath(load.readlocatorvalue("loc.submit.btn"))).click();
		Timeouts.time(3);
		//driver.findElement(By.xpath("//span[contains(text(),'×')]")).click();
		String Actualres=driver.findElement(By.xpath(load.readlocatorvalue("loc.timesheetalertmsg.txt"))).getText();
		String Expectedres=load.readlocatorvalue("validate.timesheetsubmit.txt");
		Validationhelper.verification(Actualres, Expectedres);
		Thread.sleep(5000);
		driver.findElement(By.xpath(load.readlocatorvalue("loc.profile.picture"))).click();
		driver.findElement(By.xpath(load.readlocatorvalue("loc.logout.btn"))).click();
		Timeouts.time(5);

	}


}
