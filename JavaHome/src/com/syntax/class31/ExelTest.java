package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelTest {

	public static void main(String[] args) throws IOException {
		
		String filePath="testData\\dataBase.xls";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Workbook wbook=new HSSFWorkbook(fis);
		Sheet sheet=wbook.getSheet("Sheet1");
		
		int row=sheet.getPhysicalNumberOfRows();
		
		int colls=sheet.getRow(0).getLastCellNum();
		
		System.out.println(row+ " "+ colls);
		
		for(int r=0; r<row; r++) {
			for(int c=0; c<colls; c++) {
				String value=sheet.getRow(r).getCell(c).toString();
				System.out.print(value+" ");
			}
			System.out.println();
		}
	}

}
