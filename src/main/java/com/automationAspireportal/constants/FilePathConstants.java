package com.automationAspireportal.constants;

import java.io.File;

public class FilePathConstants {

	public static final String USER_HOME = System.getProperty("user.dir") + File.separator;

	public static final String CHROME_FILE = USER_HOME + "lib1" + File.separator + "chromedriver.exe";
	public final static String IE_FILE = USER_HOME + "lib" + File.separator + "IEDriverServer.exe";

	public final static String FIREFOX_FILE = USER_HOME + "lib" + File.separator + "geckodriver.exe";

	public static final String CONFIG_FILE = USER_HOME + File.separator + "src/main/resources" + File.separator
			+ "configue.properties";
	public final static String ASPIREPORTAL_locators = USER_HOME + File.separator + "src/main/resources"
			+ File.separator + "locators" + File.separator + "atmecs" + File.separator + "aspireportal.properties";
	public final static String Aspireportaltimesheet_locators = USER_HOME + File.separator + "src/main/resources"
			+ File.separator + "locators" + File.separator + "atmecs" + File.separator + "aspireportaltimesheet.properties";
	public final static String managertimesheet_locators = USER_HOME + File.separator + "src/main/resources"
			+ File.separator + "locators" + File.separator + "atmecs" + File.separator + "managertimesheet.properties";
	public final static String EMPLOYEE_credentials = USER_HOME + File.separator + "src/main/resources" + File.separator
			+ "testdata" + File.separator +"AspireportalnewLogin.xlsx";
	

	// public final static String MANAGER = USER_HOME + File.separator +
	// "src/main/resources" + File.separator + "locators" + File.separator +
	// "managerLogin.properties";
}

