package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	public ExcelDataProvider() throws IOException {
		
		String excelpath=System.getProperty("user.dir")+"\\TestData\\Data.xlsx";
		
		FileInputStream fis=new FileInputStream(excelpath);
		 wb=new XSSFWorkbook(fis);
		
	}
	public String getStringData(String sheetname,int row,int cell) {
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
	

}
