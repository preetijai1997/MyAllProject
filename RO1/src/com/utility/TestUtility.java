package com.utility;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestUtility {
	
	static Xls_Reader reader;
	
	 
	 public static ArrayList<Object[]> getDataForExcel()
	 {
		 ArrayList<Object[]> myData=new  ArrayList<Object[]>();
		 try
		 {
			 FileInputStream fis=new FileInputStream("C:\\Users\\bs0452\\eclipse-workspace\\RO1\\Test.xlsx");
				XSSFWorkbook excel=new XSSFWorkbook(fis);
	   }
		 catch(Exception e)
		 {
			e.printStackTrace(); 
		 }
		 
		 for(int rowNum=2; rowNum<=excel.getRowCount();rowNum++)
		 {
			 
		 }
				 
	 }
}

