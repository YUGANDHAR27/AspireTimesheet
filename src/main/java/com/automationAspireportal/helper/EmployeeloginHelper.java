package com.automationAspireportal.helper;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automationAspireportal.utils.ReadExcel;
import com.automationAspireportal.utils.ReadLocators;

public class EmployeeloginHelper {
 WebDriver driver;
	ReadLocators read = new ReadLocators();
	ReadExcel excel= new ReadExcel(0);
	
	  public EmployeeloginHelper(WebDriver driver)
	  {
	this.driver = driver;
}

	public void employeelogin() {
		WebElement user = driver.findElement(By.xpath(read.emailPath()));
		user.sendKeys(excel.getmail());
		WebElement epassword = driver.findElement(By.xpath(read.passwordPath()));
		epassword.sendKeys( excel.password());
		WebElement click = driver.findElement(By.xpath(read.clickOnLogin()));
		click.click();
	

		
	}
}
