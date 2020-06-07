package com.hrms.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelUtil {
	
	public static Workbook book;
	public static Sheet sheets;
	
	public static void exeleReader( String filePath) {
		try {
			FileInputStream fis=new FileInputStream(filePath);
			book=new HSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void sheetReadet(String sheetName) {
		sheets=book.getSheet(sheetName);
	}
	
	public static int rowsGet() {
		return	sheets.getPhysicalNumberOfRows();
		 
	}
	public static int colGet(int rowIndex) {
		return sheets.getRow(rowIndex).getLastCellNum();
	}
	public static String dataGet(int rowIndex,  int colIndex) {
		return sheets.getRow(rowIndex).getCell(colIndex).toString();
	}
	
	public static Object[][] exelArray (String filePath, String sheetName){
		exeleReader(filePath);
		sheetReadet(sheetName);
		
		int row=rowsGet();
		int col=colGet(0);
		
		Object[][] data=new Object[row-1][col];
		
		for(int i=1; i<row; i++) {
			for (int j=0; j<col; j++) {
				data[i-1][j]=dataGet(i, j);
			}
			
		}
		
		return data;
		
	}
	
	

}
