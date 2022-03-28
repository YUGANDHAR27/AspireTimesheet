package com.automationAspireportal.helper;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.automationAspireportal.utils.ReadExcel;
import com.automationAspireportal.utils.ReadLocators;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class AdminLogin
{
	WebDriver driver;
	ReadLocators read=new ReadLocators ();
	ReadExcel excel;
	ReadTimesheetModuleLocators readloc=new ReadTimesheetModuleLocators();
	 public AdminLogin(WebDriver driver)
	  {
	this.driver = driver;
	  }
	public void adminlogin() 
	{
		
		 excel=new ReadExcel(2);
		 driver.findElement(By.xpath(read.emailPath())).sendKeys(excel.getmail());
		 driver.findElement(By.xpath(read.passwordPath())).sendKeys(excel.password());
		 driver.findElement(By.xpath(read.clickOnLogin())).click();
			WebElement clickonts = driver.findElement(By.xpath(readloc.clickonTimesheet()));
			clickonts.click();
		
		 Select admindrp = new Select(driver.findElement(By.xpath(readloc.changeloginasadmin())));
			admindrp.selectByVisibleText("Admin");
			 try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
	}

}
