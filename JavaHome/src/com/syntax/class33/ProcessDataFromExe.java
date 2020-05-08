package com.syntax.class33;

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


public class ProcessDataFromExe {

	public static void main(String[] args) throws IOException {
		
		String file=System.getProperty("user.dir")+"\\testData\\dataBase.xls";
		FileInputStream fis=new FileInputStream(file);
		
		Workbook book= new HSSFWorkbook(fis);
		Sheet sheet=book.getSheet("Sheet1");
		
		int rows=sheet.getPhysicalNumberOfRows();
		int sells=sheet.getRow(0).getLastCellNum();
		
		List<Map<String, String>> xlData=new ArrayList<>();
		
		for (int r=1; r<rows; r++) {
			Map<String, String> map= new LinkedHashMap<>();
			
			for (int c=0; c<sells; c++) {
				String key=sheet.getRow(0).getCell(c).toString();
				String value=sheet.getRow(r).getCell(c).toString();
				map.put(key, value);
			}
			xlData.add(map);
			
			}
		
		
	System.out.println(xlData);
		
	}

}
