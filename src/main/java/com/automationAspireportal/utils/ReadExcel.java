package com.automationAspireportal.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.automationAspireportal.constants.FilePathConstants;

public class ReadExcel {
	XSSFSheet sheet;
	int sheetindex = 0;
	File file = new File(FilePathConstants.EMPLOYEE_credentials);
	FileInputStream inputstream ;
	XSSFWorkbook wb;

	public ReadExcel(int sheetindex) {
		this.sheetindex = sheetindex;
		try {
			inputstream=new FileInputStream(file);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
		try {
			wb = new XSSFWorkbook(inputstream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFSheet sheet = wb.getSheetAt(sheetindex);
		this.sheet = sheet;
	}
		public String getmail() {
		String mail = sheet.getRow(0).getCell(1).getStringCellValue();
		return mail;

	}

	public String password() {
		String password = sheet.getRow(1).getCell(1).getStringCellValue();
		return password;
	}

	public String Workinghour() {
		return sheet.getRow(2).getCell(1).getStringCellValue();

	}
	
	
}
