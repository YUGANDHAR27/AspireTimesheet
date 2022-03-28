package com.automationAspireportal.testsuite;

import java.sql.Time;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.automationAspireportal.constants.FilePathConstants;
import com.automationAspireportal.helper.Timeouts;
import com.automationAspireportal.utils.Extent_Report;
import com.automationAspireportal.utils.ReadLocators;

public class TestsuiteBase extends Extent_Report

{
	public static WebDriver driver;
	ReadLocators read = new ReadLocators();
	// public Properties properties;

	@BeforeClass
	public void launchAspire() {

		System.setProperty("webdriver.chrome.driver", FilePathConstants.CHROME_FILE);
		driver = new ChromeDriver();
		String path = read.Url();
		driver.get(path);
		driver.manage().window().maximize();
		Timeouts.time(5);

	}

	
	
	  @AfterMethod public void result(ITestResult iTestResult) {
	  Extent_Report.tearDown();
	  
	  Extent_Report.getResult(iTestResult); }
	  
	  
	  
	  @BeforeSuite public void report() {
	  Extent_Report.startTest("Aspire Portal Timesheet ");
	  
	  }
	  
	  
	  @AfterSuite public void extentFlush() { Extent_Report.tearDown(); }
	 	
	
	  @AfterClass public void teardown() {
	  
	  driver.close(); }
	

}
