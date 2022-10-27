package org.hcl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\eclipse-workspace\\Name\\Excel Data\\Adactin Hotel.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Adactin");
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				switch (cellType) {
				case STRING:
					String stringCellValue = cell.getStringCellValue(); 
					System.out.println(stringCellValue);
					break; 
				case NUMERIC:
					double d = cell.getNumericCellValue();
					BigDecimal b = BigDecimal.valueOf(d);
					String string = b.toString();
					System.out.println(string);
					break;
				case FORMULA:
					Date dateCellValue = cell.getDateCellValue(); 
					SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
					String format = simpleDateFormat.format(dateCellValue);
					System.out.println(format); 

				default:
					break;
				}
				
			} 
			
		}
		
		
	}

}
