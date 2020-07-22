package com.java.reveiw01;

import java.awt.print.Book;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class qweqwrqwr {

	public static void main(String[] args) {
		
		try {
			FileInputStream fileIS = new FileInputStream("C:\\Users\\Yuri\\eclipse-workspace13\\JavaReviu\\dfg\\usersinfo.xls");
			Workbook book= new HSSFWorkbook(fileIS);
			Sheet sheet=book.getSheet("321");
			int row=sheet.getPhysicalNumberOfRows();
			System.out.println(row);
			int col=sheet.getRow(0).getLastCellNum();
			System.out.println(col);
			List<Map<String, String>> list = new ArrayList<>();
			Map<String, String> excelMap;
			for(int r=1; r<row; r++) {
				excelMap = new LinkedHashMap<>();
				for(int c=0; c<col; c++) {
					String data=sheet.getRow(r).getCell(c).toString();
					String key=sheet.getRow(0).getCell(c).toString();
				excelMap.put(key, data);
						
				}
				System.out.println(excelMap);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
