package com.automationAspireportal.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import com.automationAspireportal.constants.FilePathConstants;

public class ReadLocators {
	File file = new File(FilePathConstants.CONFIG_FILE);
	File file1 = new File(FilePathConstants.ASPIREPORTAL_locators);

	FileInputStream inputstream = null;
	FileInputStream inputstream1 = null;
	Properties property = null;

	public ReadLocators() {
		try {
			inputstream = new FileInputStream(file);
			inputstream1 = new FileInputStream(file1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		property = new Properties();
		try {
			property.load(inputstream);
			property.load(inputstream1);
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}

	public String Url() {
		return property.getProperty("Dashboard_URL");

	}

	public String emailPath() {
		return property.getProperty("loc.mailpath.input");

	}

	public String passwordPath() {
		return property.getProperty("loc.passwordpath.input");

	}

	public String clickOnLogin() {
		return property.getProperty("loc.login.btn");

	}
	public String clickontimesheet() 
	{
		return property.getProperty("loc.timesheet.txt");
	}
//	public int Sheet(int n)
//	{
//		return n;
//	}
		
	}
