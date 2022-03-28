package com.automationAspireportal.helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automationAspireportal.utils.ReadExcel;
import com.automationAspireportal.utils.ReadLocators;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class ManagerLogin 
{
	WebDriver driver;
	ReadLocators read = new ReadLocators();
	ReadTimesheetModuleLocators read1=new ReadTimesheetModuleLocators();
	ReadExcel excel;
	  public ManagerLogin(WebDriver driver)
	  {
	this.driver = driver;
}

	public void managerlogin() {
		excel = new ReadExcel(1);
		String username = read.emailPath();
		String password = read.passwordPath();
		String email = excel.getmail();
		String employeepassword = excel.password();
		String clicklogin = read.clickOnLogin();
		WebElement user = driver.findElement(By.xpath(username));
		user.sendKeys(email);
		WebElement epassword = driver.findElement(By.xpath(password));
		epassword.sendKeys(employeepassword);
		WebElement click = driver.findElement(By.xpath(clicklogin));
		click.click();
		Timeouts.time(5);
//		WebElement timesheet = driver.findElement(By.xpath(read.clickontimesheet()));
//		timesheet.click();
		WebElement clickonts = driver.findElement(By.xpath(read1.clickonTimesheet()));
		clickonts.click();
		Timeouts.time(5);

		
	}
	

}
