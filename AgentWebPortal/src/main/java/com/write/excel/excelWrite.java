package com.write.excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelWrite {

	public static void main(String[] args) throws Exception {
	
		
		XSSFWorkbook wb= new XSSFWorkbook();
		
	   XSSFSheet sheet=	wb.createSheet("Preeti");
	   
	   Row r0=sheet.createRow(0);
	   
	   Cell c0= r0.createCell(0);
	   
	   c0.setCellValue("Preethvi");
	   
       Row r1=sheet.createRow(1);
	   
	   Cell c1= r1.createCell(1);
	   
	   c1.setCellValue("Preeti");
	   
	   
	   File file= new File("C:\\Users\\bs0452\\eclipse-workspace\\AgentWebPortal\\src\\main\\java\\com\\excel\\file\\TestData.xlsx");
		
	   FileOutputStream fos= new FileOutputStream(file);
	   
	   wb.write(fos);
	   
	   fos.close();
	   
	   System.out.println("Written Successfully");
	   
		

	}

}
