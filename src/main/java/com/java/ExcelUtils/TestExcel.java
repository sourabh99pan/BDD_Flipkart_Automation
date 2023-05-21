package com.java.ExcelUtils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestExcel {

	public static void main(String[] args) throws IOException {
		
	
		XSSFSheet sheet= (XSSFSheet) ExcelUtilities.getWorkSheet("D:\\Adactin Details\\Adactin_TC.xlsx","TestCases");
		
		int totalRows = sheet.getPhysicalNumberOfRows();

		System.out.println(totalRows);
		
		

	}

}
