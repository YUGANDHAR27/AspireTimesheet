package com.automationAspireportal.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.automationAspireportal.constants.FilePathConstants;

public class LoadProperties 
{
	File timesheetfile = new File(FilePathConstants.Aspireportaltimesheet_locators);
	FileInputStream fis=null;
	Properties property=null;
	public LoadProperties() 
	{
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
	public String readlocatorvalue(String message)
	{
		return property.getProperty(message);
		
	}
	

}
