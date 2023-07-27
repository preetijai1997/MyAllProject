package com.writeExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelSheet {
	
	
	public void writeExcel(String sheetName, String CellValue, int row, int col) throws Exception
	{
		String excelPath="C:\\Users\\bs0452\\eclipse-workspace\\AgentWebPortal\\src\\test\\resources\\test.xlsx";
		
		File file= new File(excelPath);
		
		FileInputStream fis= new FileInputStream(file);
		
		XSSFWorkbook wb= new XSSFWorkbook();
		
		XSSFSheet sheet= wb.getSheet(sheetName);
		
		sheet.getRow(row).createCell(col).setCellValue(CellValue);
		
		FileOutputStream fos= new FileOutputStream(new File(excelPath));
		wb.write(fos);
		
		}
	
	public static void main(String[] args) throws Exception
	{
		WriteExcelSheet obj= new WriteExcelSheet();
		
		obj.writeExcel("Sheet1", "Female", 0, 0);
	}

}
