package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static WebDriver driver;
	WebElement element;
	
	
	public static void getdriver() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	}

	public static void getUrl(String url) {
		driver.get(url);
	}	
	
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public static void minimizeWindow() {
		driver.manage().window().minimize();
	}
	
	public static void launchUrl(String url) {
		driver.navigate().to(url);
	}
	
	public void moveBackward() {
		driver.navigate().back();
	}
	
	public void moveForward() {
		driver.navigate().forward();
	}
	
	public void refresh() {
		driver.navigate().refresh();
	}

	public void elementsendkeys(WebElement element,String data) {
		element.sendKeys(data); 
	}
	
	public void elementBySendkeysJs(WebElement element,String data ) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].setAttribute('value','"+data+"')", element);
	}

	public void getdate() {
    new Date();
    
	}
	public void elementClick(WebElement element) {
		element.click(); 
	}

	public WebElement findLocatorById(String attributevalue) {
		WebElement element = driver.findElement(By.id(attributevalue));
		return element;
	}

	public WebElement findLocatorByName(String name) {
		WebElement element = driver.findElement(By.name(name));
		return element;
	}
	
	public WebElement findElementByClass(String className) {
		WebElement element = driver.findElement(By.className(className));
		return element;
	}
	
	public WebElement findElementByXpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}
	
	public String getApplnTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public String getCurUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	
	public void WindowClose() {
		driver.close(); 
	}
	
	public static void WindowQuit() {
		driver.quit();
	}
	
	public String getText(WebElement element ) {
		String text = element.getText();
		return text;
	} 
	
	public void selectOptionByText(WebElement element, String text ) {
		 Select select = new Select(element);
		 select.selectByVisibleText(text); 
	} 
	
	public void selectOptionByIndex(WebElement element ,int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	public void alertOk() {
		driver.switchTo().alert().accept();
	}
	
	public void alertCancel() {
		driver.switchTo().alert().dismiss();
	}
	
	public void alertSendkeys(String keysToSend) {
		driver.switchTo().alert().sendKeys(keysToSend);
	}

	public void implicitWait(long arg0) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(arg0));
		
	}
	
	public void threadSleep(long millis) throws InterruptedException {
		Thread.sleep(millis);
	} 
	
	public WebElement  jsClick(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		return element;
	}
	
	public void frameIndex(String index) {
		driver.switchTo().frame(index);
	}

	public void frameId(String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}
	
	public void frame(String frameElement) {
		driver.switchTo().frame(frameElement);
	}
	
	public void selectOptionByAttribute(WebElement element,String text) {
    	Select select = new Select(element);
    	select.selectByValue(text);
	} 
	
	public void elementclear(String id) {
		driver.findElement(By.id(id));
		element.clear();
	}
	
	 public String elementGetAttribute(WebElement element,String attributeName) {
	    	String attribute = element.getAttribute(attributeName);
	    	return attribute;
	}

	
	public List<WebElement> GetAllOptDropDown(WebElement element  ) {
		Select select = new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		return allSelectedOptions;
	} 
	
	public void deselectAll(WebElement element) {
		Select select =new Select(element);
		select.deselectAll(); 
	}  
	
	public boolean isMultiple(WebElement element) {
		Select select =new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}
	
	public WebElement getFirstSelectedOpt(WebElement element) {
		Select select = new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		return firstSelectedOption;
	}

	public void deselectByIndex(WebElement element,int index) {
		Select select =new Select(element);
		select.deselectByIndex(index);
	}
	
	public void deselectByValue(WebElement element,String value ) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}
	
	public void deselectByVisibleText(WebElement element, String text) {
		Select select =new Select(element);
		select.deselectByVisibleText(text);
	}
 
	
	public void moveToElement(WebElement target) {
		Actions actions = new Actions(driver);
		actions.moveToElement(target).perform();
	}
	
	public void click() {
		Actions actions =new Actions(driver);
		actions.click().perform();
	}
	
	public void clickWithTarget(WebElement target) {
		Actions actions =new Actions(driver) ;
		actions.click(target).perform();
	}
	
	public void doubleClick() {
		Actions actions = new Actions(driver);
		actions.doubleClick().perform();
	} 
	
	public void rightClick() {
		Actions actions = new Actions(driver);
		actions.contextClick().perform();
	}
	
	public void dragAndDrop(WebElement source, WebElement target) {
		Actions actions =new Actions(driver);
		actions.dragAndDrop(source, target).perform();
	}
	
	public void sendKeys(CharSequence keys) {
		Actions actions =new Actions(driver);
		actions.sendKeys(keys).perform();
	}

	public void getAttribute(WebElement element ) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("return arguments[0].getAttribute('value')", element);
	}

	public void scrollDown(WebElement element ) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public void scrollUp(WebElement element ) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	public void parentFrame() {
		driver.switchTo().parentFrame();
	}

	public void launch(String key, String value) {
		System.setProperty(key, value);
	}

	public List<WebElement> webTable(String tagName) {
		List<WebElement> findElements = driver.findElements(By.tagName(tagName));
		return findElements;
	}

	public TakesScreenshot scrnst(OutputType<TakesScreenshot> target, TakesScreenshot WebDriver) {
		TakesScreenshot screenshot = ((TakesScreenshot)WebDriver).getScreenshotAs(target);
		return screenshot;
	}

	public boolean file(String pathname) {
		File file = new File(pathname);
		boolean mkdir = file.mkdir();
		return mkdir;
	}
	
	public boolean creatNewFile(String pathname) throws IOException {
		File file = new File(pathname);
		boolean createNewFile = file.createNewFile();
		return createNewFile;
	}

		public String getDataformCell(String sheetName, int rownum, int cellnum) throws IOException {
			
			String res= "";
			
			File file = new File("D:\\eclipse-workspace\\Name\\Excel Data\\Base Adactin.xlsx");
			FileInputStream stream = new FileInputStream(file);
			Workbook book = new XSSFWorkbook(stream);
			Sheet sheet = book.getSheet(sheetName);
            Row row = sheet.getRow(rownum);
			Cell cell = row.getCell(cellnum);
			CellType type = cell.getCellType();
			
			switch (type) {
			case STRING:
				res= cell.getStringCellValue();
				break;
			case NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat dateFormat=  new SimpleDateFormat("dd/MM/yyyy");
				res = dateFormat.format(dateCellValue);
				}
				else {
					double numericCellValue = cell.getNumericCellValue();
					
					long check = Math.round(numericCellValue);
					if (numericCellValue==check) {
						res = String.valueOf(check);
					} else {
						res= String.valueOf(numericCellValue);
					}
			}
			default:
				break;
			}
			return res;
		}

		public void updateDataInCell(String sheetName, int rownum, int cellnum, String oldData, String newData) throws IOException {
			
			File file = new File("D:\\eclipse-workspace\\Name\\Excel Data\\Base Adactin.xlsx");
			FileInputStream stream = new FileInputStream(file);
			Workbook book = new XSSFWorkbook(stream);
			Sheet sheet = book.getSheet(sheetName);
			Row row = sheet.getRow(rownum);
			Cell cell = row.getCell(cellnum);
			String value = cell.getStringCellValue();
			
			if (value.equals(oldData)) {
				cell.setCellValue(newData);
			}
			FileOutputStream out = new FileOutputStream(file);
			book.write(out);
			
		
		}
		

		public void insertDateInCell(String sheetName, int rownum, int cellnum, String data) throws IOException {

			File file = new File("D:\\eclipse-workspace\\Name\\Excel Data\\Base Adactin.xlsx");
			FileInputStream stream = new FileInputStream(file);
			Workbook book = new XSSFWorkbook(stream);
			Sheet sheet = book.getSheet(sheetName);
			Row row = sheet.getRow(rownum);
			Cell createCell = row.createCell(cellnum);
			createCell.setCellValue(data);
			
			FileOutputStream out = new FileOutputStream(file);
			book.write(out);
		}

		
		
		
}
