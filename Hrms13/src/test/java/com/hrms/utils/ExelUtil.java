package com.hrms.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.format.CellDateFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelUtil {

	public static Workbook book;
	public static Sheet sheets;

	public static void exeleReader(String filePath) {
		try {
			FileInputStream fis = new FileInputStream(filePath);
			book = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void sheetReadet(String sheetName) {
		sheets = book.getSheet(sheetName);
	}

	public static int rowsGet() {
		return sheets.getPhysicalNumberOfRows();

	}

	public static int colGet(int rowIndex) {
		return sheets.getRow(rowIndex).getLastCellNum();
	}

	public static String dataGet(int rowIndex, int colIndex) {
		return sheets.getRow(rowIndex).getCell(colIndex).toString();
	}
	
	public static List<Map<String, String>> exelListOfMaps(String filePath, String sheetName){
		exeleReader(filePath);
		sheetReadet(sheetName);

		List<Map<String, String>>listMap=new ArrayList<>();
		Map<String, String>excelMap;
		
		for(int r=1; r<rowsGet(); r++) {
			excelMap=new LinkedHashMap<>();
			
			for(int c=0;c<colGet(r);c++) {
				excelMap.put(dataGet(1, c), dataGet(r, c));
				
			}
			listMap.add(excelMap);
		}
		return listMap;
	}
	
	
	
	
	
	
	public static Object[][] exelArray(String filePath, String sheetName) {
		exeleReader(filePath);
		sheetReadet(sheetName);

		

		Object[][] data = new Object[rowsGet() - 1][colGet(0)];

		for (int i = 1; i <rowsGet(); i++) {
			for (int j = 0; j <colGet(i); j++) {
				data[i - 1][j] = dataGet(i, j);
			}

		}

		return data;

	}

}
