package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Country {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/apitestingtraininginchennaiomr");
		WebElement element = driver.findElement(By.id("country-list"));
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		
		File file = new File("D:\\eclipse-workspace\\Name\\Excel Data\\country.xlsx");
		
		Workbook workbook = new XSSFWorkbook();
		Sheet createSheet = workbook.createSheet("sheet1");
		
		for (int i = 0; i < options.size(); i++) {
		WebElement element2 = options.get(i);	
		String text = element2.getText();
		Row createRow = createSheet.createRow(i);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue(text);
		}
		
	   FileOutputStream out = new FileOutputStream(file);
	   workbook.write(out);
	   
		
	}
	
}
