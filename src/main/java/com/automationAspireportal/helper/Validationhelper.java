package com.automationAspireportal.helper;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import com.automationAspireportal.constants.FilePathConstants;
import com.automationAspireportal.utils.ReadExcel;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;
public class Validationhelper 
{
	WebDriver driver;
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	ReadExcel excel= new ReadExcel(0);
	File timesheetfile = new File(FilePathConstants.Aspireportaltimesheet_locators);
	FileInputStream fis=null;
	Properties property=null;
	public Validationhelper(WebDriver driver)
	{
		this.driver = driver;
		try {
			fis=new FileInputStream(timesheetfile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		property=new Properties();
		try {
			property.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}


	public void validation(String message,String Expectedmessage) 
	{
		String Actualres=driver.findElement(By.xpath(read.timesheetalertmsg(message))).getText();
//		System.out.println(Actualres);
		String Expectedres=property.getProperty(Expectedmessage);
//		System.out.println(Expectedres);
		assertEquals(Actualres, Expectedres);

	}
	public static void verification(String message,String Expectedmessage) 
	{
		SoftAssert soft=new SoftAssert();
		boolean result=message.equals(Expectedmessage);
		soft.assertEquals(result, true);
	}
	
}
