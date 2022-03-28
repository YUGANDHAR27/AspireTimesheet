package com.automationAspireportal.helper;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import com.automationAspireportal.testsuite.TestsuiteBase;

public class Timeouts extends TestsuiteBase
{
	public static void time(int Ti)
	{
		
		driver.manage().timeouts().implicitlyWait(Ti, TimeUnit.SECONDS);
	}

}
