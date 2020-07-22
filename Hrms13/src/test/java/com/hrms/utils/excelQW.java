package com.hrms.utils;

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
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelQW {
	private static Workbook book;
	private static Sheet sheet;

	private static void openExcel(String filePath) {
		try {
			FileInputStream fileIS = new FileInputStream(filePath);
			book = new HSSFWorkbook(fileIS);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void loadSheet(String sheetName) {
		sheet = book.getSheet(sheetName);
	}

	private static int rowCount() {
		return sheet.getPhysicalNumberOfRows();
	}

	private static int colsCount(int rowIndex) {
		return sheet.getRow(rowIndex).getLastCellNum();
	}

	private static String cellData(int rowIndex, int colIndex) {
		return sheet.getRow(rowIndex).getCell(colIndex).toString();
	}

	// return a 2d object array of data
	public static Object[][] excelIntoArray(String filePath, String sheetName) {
		openExcel(filePath);
		loadSheet(sheetName);

		int rows = rowCount();
		int cols = colsCount(0);

		Object[][] data = new Object[rows - 1][cols];

		// iterating rows
		for (int i = 1; i < rows; i++) {
			// iterating cols
			for (int j = 0; j < cols; j++) {
				// storing values into 2D array
				data[i - 1][j] = cellData(i, j);
			}
		}

		return data;
	}

	public static List<Map<String, String>> excelIntoListOfMaps(String filePath, String sheetName) {

		openExcel(filePath);
		loadSheet(sheetName);

		List<Map<String, String>> list = new ArrayList<>();
		Map<String, String> excelMap;

		for (int row = 1; row < rowCount(); row++) {
			excelMap = new LinkedHashMap<>();

			for (int c = 0; c < colsCount(row); c++) {
				excelMap.put(cellData(0, c), cellData(row, c));
			}
			list.add(excelMap);
		}

		return list;
	}
	
	
//	public static List<Map<String, String>> excelMAp(String filePath, String sheetName) {
//		List<Map<String, String>> list = new ArrayList<>();
//		try {
//		FileInputStream fileIS = new FileInputStream(filePath);
//		Workbook book= new HSSFWorkbook(fileIS);
//		Sheet sheet=book.getSheet(sheetName);
//		int row=sheet.getPhysicalNumberOfRows();
//		System.out.println(row);
//		int col=sheet.getRow(0).getLastCellNum();
//		System.out.println(col);
//		
//		Map<String, String> excelMap;
//		for(int r=1; r<row; r++) {
//			excelMap = new LinkedHashMap<>();
//			for(int c=0; c<col; c++) {
//				String data=sheet.getRow(r).getCell(c).toString();
//				String key=sheet.getRow(0).getCell(c).toString();
//			excelMap.put(key, data);
//					
//			}
//			list.add(excelMap);
//			//System.out.println(excelMap);
//		}
//		}catch(Exception c){
//		
//	
//	return list;
//	
//}
//}
}
	
	
	
	
	
	