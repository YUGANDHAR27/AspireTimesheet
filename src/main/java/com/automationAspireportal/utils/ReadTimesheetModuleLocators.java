package com.automationAspireportal.utils;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.automationAspireportal.constants.FilePathConstants;

public class ReadTimesheetModuleLocators 
{
	File timesheetfile = new File(FilePathConstants.Aspireportaltimesheet_locators);
	FileInputStream fis=null;
	Properties property=null;
	public ReadTimesheetModuleLocators() 
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
	
	
	
	public String clickonTimesheet() {
		return property.getProperty("loc.Timesheet.txt");
	}

	public String slectActivity() {
		return property.getProperty("loc.activity.dropdown");
	}

	public String activity() {
		return property.getProperty("loc.activity.txt");

	}

	public String clickonMonday() {
		return property.getProperty("loc.monday.txt");

	}

	public String clickonTuesday() {
		return property.getProperty("loc.tuesday.txt");

	}

	public String clickonwednesday() {
		return property.getProperty("loc.wednesday.txt");

	}

	public String clickonThursday() {
		return property.getProperty("loc.thursday.txt");
	}

	public String clickonFriday() {
		return property.getProperty("loc.friday.txt");

	}

	public String clickonNotes() {
		return property.getProperty("loc.employeenotes.btn");
	}

	public String giveNotes() {
		return property.getProperty("loc.givenotes.txt");
	}

	public String clickcheck() {
		return property.getProperty("loc.clickoncheck.btn");

	}

	public String clickonAddactivity() {
		return property.getProperty("loc.addactivity.btn");

	}

//	public String selectactivity1() {
//		return property.getProperty("Loc.selectactivity1.dropdown");
//	}
//
//	public String activity2() {
//		return property.getProperty("Loc.activity1.txt");
//	}

	public String deleteactivity() {
		return property.getProperty("loc.deleteactivity.btn");
	}
	public String saveTimesheet() {
		return property.getProperty("loc.save.btn");
	}
	public String saveOk() 
	{
		return property.getProperty("loc.ok.btn");
	}
	public String submit() {
		return property.getProperty("loc.submit.btn");
	}
	public String timesheetsavealert() 
	{
		return property.getProperty("loc.timesheetsavealert.txt");
		
	}
	public String timesheetalertmsg(String message)
	{
		return property.getProperty(message);
		
	}
	public String profile()
	{
		return property.getProperty("loc.logout.btn");
	}
	public String  clickonlogout() {
		return property.getProperty("loc.logouttext.btn");
		
	}
	//manger locators//
	public String clickoncheckbox() {
		return property.getProperty("loc.selectemployee.checkbox");
	}
	public String clickonApprove()
	{
		return property.getProperty("loc.approve.txt");
	}
	public String clickonApproveaction() 
	{
		return property.getProperty("loc.approve.check");
	}

	public String clickonreject() {
		return property.getProperty("loc.reject.btn");
	}

	public String clickontextarea() {
		return property.getProperty("loc.comment.txt");
	}

	public String popupreject() {
		return property.getProperty("loc.popupreject.btn");
	}

	public String rejectaction()
	 {
	 return property.getProperty("loc.rejectaction.btn");
	 }
	public String clickonshifts() {
		return property.getProperty("loc.shifts.txt");
	}

	public String clickonselectprojecttb() {
		return property.getProperty("loc.selectprojecttextbox.txtbox");
	}

	public String selectproject() {
		return property.getProperty("loc.selectproject.txt");
	}

	public String updateshifts() {
		return property.getProperty("loc.updateshifts.txt");

	}

	public String cickonselectemployee() {
		return property.getProperty("loc.selectemployee.textbox");

	}

	public String selectemployeelogin() {
		return property.getProperty("loc.employeelogin.txt");
	}

	public String clickonstartdate() {
		return property.getProperty("loc.startdate.textbox");
	}

	public String enterstartingdate() {
		return property.getProperty("loc.sdate.txt");
	}

	public String clickonenddate() {
		return property.getProperty("loc.enddate.textbox");

	}

	public String enterenddate() {
		return property.getProperty("loc.edate.txt");

	}

	public String clickonshift() {
		return property.getProperty("loc.shifts.textbox");

	}

	public String selectshift() {
		return property.getProperty("loc.shifttype.txt");
	}

	public String clickonBack() {
		return property.getProperty("loc.back.btn");
	}
	
	//Reports//

	public String clickonreports() {
		return property.getProperty("loc.reports.txt");
	}
	public String clickonselectclient()
	{
		return property.getProperty("loc.selectclient.dropdwn");
		
	}
	public String clickonselectproject()
	{
		return property.getProperty("loc.selectproject.dropdwn");
		
	}
	public String project() 
	{
		return property.getProperty("loc.selectproject.txt");
	}
	public String clickonSelectemployeedrpdwn()
	{
		return property.getProperty("loc.selectemployee.drpdwn");
		
	}
	public String clickonselctactivity()
	
	{
		return property.getProperty("loc.selectactivity.dropdwn");
	}
	public String clickonselectstatus() 
	{
		return property.getProperty("loc.selectstatus.dropdwn");
	}
	public String clickonbiling()
	{
		return property.getProperty("loc.billing.dropdwn");
	}
	public String clickonexportAs() 
	{
		return property.getProperty("loc.export.dropdwn");
	}
	public String clickonreportAs() 
	{
		return property.getProperty("loc.reportas.dropdwn");
	}
	public String timesheetalert()
	{
		return property.getProperty("loc.timesheetalert.text");
	}
	
	public String clickonexport() {
		return property.getProperty("loc.export.btn");
	}
	public String clickonpdf() 
	{
		return property.getProperty("loc.downloadpdf.btn");
	}
	public String clickonexcel() 
	{
		return property.getProperty("loc.downloadxcel.btn");
	}
	 public String activityreport()
	 {
		 return property.getProperty("loc.activityreoprt.tab");
	 }
	//Admin reeject selectproject##
	
	public String admintimesheetSelectproject()
	{
		return property.getProperty("loc.adminrejectselectproject.drpdwn");
	}
	//Admin reports //
	
	public String changeloginasadmin()
	{
		return property.getProperty("loc.admintimesheet.drpdwn");
	}
	public String clickonsendtimesheet() 
	{
		return property.getProperty("loc.sendtimesheet.btn");
	}
	public String clickonreportinggmail()
	{
		return property.getProperty("loc.reportinggmail.txtbox");
		
	}
	public String clickonsendgmailbtn()
	{
		return property.getProperty("loc.sendreportinggmail.btn");
	}
	public String catchpopuptext() 
	{
		return property.getProperty("loc.popuptext.txt");
	}
	public String clickonclosepopup() 
	{
		return property.getProperty("loc.closepopup.btn");
		
	}
	public String clickontimesheetsenttab()
	{
		return property.getProperty("loc.timesheetsent.tab");
	}
	public String clickontimesheesenttclient() 
	{
		return property.getProperty("loc.slectclienttimeshetsent.drpdwn");
	}
	public String clickontimeshetsentproject() 
	{
		return property.getProperty("loc.selectprojecttimeshetsent.drpdwn");
		
	}
	public String tsstartingdate()
	{
		return property.getProperty("loc.timesheetsentstartdate");
	}
	public String tsenddate() 
	{
		return property.getProperty("loc.timehsheetsentenddate");
	}
	public String timesheetsentsearch()
	{
		return property.getProperty("loc.timesheetsentsearch.btn");
	}
	public String timesheetsentapprove() 
	{
		return property.getProperty("loc.timesheetapprove.toggle");
	}
	public String timesheetsentcomments()
	{
		return property.getProperty("loc.Timesheetsentcomments.txtbox");
	}
	public String timesheetsentpopupclose() 
	{
		return property.getProperty("loc.timesheetsentpopupclose.btn");
		
	}
	public String timesheetsentactiondelete() 
	{
		return property.getProperty("loc.timehsheetsentdelete.toggle");
	}
	public String timesheetsentconfirmationpopup() 
	{
		return property.getProperty("loc.timesheetsentpopupdelete.txt");
	}
	public String clickontimesheetsentdelete() 
	{
		return property.getProperty("loc.timesheetsentdelete.btn");
	}
	//Admin Allemployees tab//
	public String clickonallemployeestab() 
	{
		return property.getProperty("loc.allemployees.tab");
	}
	public String allemployeesselectemployee()
	{
		return property.getProperty("loc.allslectemployee.drpdwn");
	}
	public String allstartdate()
	{
		return property.getProperty("loc.allemployeesstartday.label");
	}
	public String allenddate()
	{
		return property.getProperty("loc.allemployeesenddate.label");
	}
	public String allemployeesexport() 
	{
		return property.getProperty("loc.allemployeesexport.btn");
	}
	//freeze shifts//
	public String clickonfreezeshifts()
	{
		return property.getProperty("loc.freezeshifts.tab");
	}
	public String clickonfreezedate() 
	{
		return property.getProperty("loc.freezedate.txtbox");
	}
	public String freezemonth()
	{
		return property.getProperty("loc.freezemonth.txt");
	}
	public String clickonfreeze()
	{
		return property.getProperty("loc.freeze.btn");
	}
	public String confirmationmsg() 
	{
		return property.getProperty("loc.confirmationmsg.txt");
	}
	public String closefreezepopup()
	{
		return property.getProperty("loc.closepopup.btn");
	}
	//Admin Addactivity tab//
	public String adminaddactivity()
	{
		return property.getProperty("loc.clickonadminaddactivity.label");
		
	}
	public String adminaddactivitylabel()
	{
		return property.getProperty("loc.adminaddactivity.label");
		
	}
	public String adminactvity()
	{
		return property.getProperty("loc.adminactivity.drpdwn");
	}
	public String adminactivityproject() 
	{
		return property.getProperty("loc.adminactivityforprojecttype.drpdwn");
	}
	public String adminactivityclient()
	{
		return property.getProperty("loc.adminactivityclient.drpdwn");
	}
	public String adminactivityselectproject() 
	{
		return property.getProperty("loc.adminactivityselectproject.drpdwn");
	}
	
	public String adminactivitysave() 
	{
		return property.getProperty("loc.adminactivitysave.btn");
	}
	public String admindeleteactivity() 
	{
		return property.getProperty("loc.adminactivitydelete.toggle");
	}
	public String adminremoveactivity()
	{
		return property.getProperty("loc.adminaddactivitydelete.btn");
		
	}
	public String admineditactivity()
	{
		return property.getProperty("loc.admineditactivity.toggle");
	}
	


}
