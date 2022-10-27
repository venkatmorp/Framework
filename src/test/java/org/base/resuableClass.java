package org.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class resuableClass {
		WebDriver driver;
		WebElement element; 
		
	//1
		public void getdriver() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} 
	//2
		public void GetUrl(String url) {
			driver.get(url);
		}
	//3	
		public void MaxWindow() {
			driver.manage().window().maximize();
		}
	//4	
		public void elementsendkeys(WebElement element,String data) {
			element.sendKeys(data); 
		}
	//5	
		public void elementBySendkeysJs(WebElement element,String data ) {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].setAttribute('value','"+data+"')", element);
		}
	//6	
		public void elementClick(WebElement element) {
			element.click(); 
		}
	//7	
		public WebElement findLocatorById(String attributevalue) {
			WebElement element = driver.findElement(By.id(attributevalue));
			return element;
			
		}
	//8	
		public WebElement findLocatorByName(String name) {
			WebElement element = driver.findElement(By.name(name));
			return element;
		}
	//9	
		public WebElement findElementByClass(String className) {
			WebElement element = driver.findElement(By.className(className));
			return element;
		}
		
	//10	
		public WebElement findElementByXpath(String xpath) {
			WebElement element = driver.findElement(By.xpath(xpath));
			return element;
		}
	//11	
		public String GetApplnTitle() {
			String title = driver.getTitle();
			return title;
		}
	//12	
		public String GetCurUrl() {
			String currentUrl = driver.getCurrentUrl();
			return currentUrl;
		}
	//13	
		public void WindowClose() {
			driver.close(); 
		}
	//14	
		public void WindowQuit() {
			driver.quit();
		}
	//15	
		public String GetText(WebElement element ) {
			String text = element.getText();
			return text;
		} 
	//16	
		public void selectOptionByText(WebElement element, String text ) {
			 Select select = new Select(element);
			 select.selectByVisibleText(text); 
		} 
	//17	
		public void selectOptionByIndex(WebElement element ,int index) {
			Select select = new Select(element);
			select.selectByIndex(index);
		}
	//18	
		public void alertOk() {
			driver.switchTo().alert().accept();
		}
	//19	
		public void alertCancel() {
			driver.switchTo().alert().dismiss();
		}
	//20	
		public void alertSendkeys(String keysToSend) {
			driver.switchTo().alert().sendKeys(keysToSend);
		}
	//21	
		public Timeouts implicitWait(long arg0) {
			Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(arg0));
			return implicitlyWait;
		}
	//22	
		public void thrSleep(long millis, int nanos) throws InterruptedException {
			Thread.sleep(millis, nanos);
		} 
	//23	
		public WebElement  jsClick() {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
			return element;
		}
	//24	
		public void frameIndex(String index) {
			driver.switchTo().frame(index);
		}
	//25	
		public void frameId(String nameOrId) {
			driver.switchTo().frame(nameOrId);
		}
	//26	
		public void frame(String frameElement) {
			driver.switchTo().frame(frameElement);
		}
	//27	
		public List<WebElement> GetAllOptDropDown(WebElement element  ) {
			Select select = new Select(element);
			List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
			return allSelectedOptions;
		} 
	//28	
		public void deselectAll(WebElement element) {
			Select select =new Select(element);
			select.deselectAll(); 
		}  
	//29	
		public boolean isMultiple(WebElement element) {
			Select select =new Select(element);
			boolean multiple = select.isMultiple();
			return multiple;
		}
	//30	
		public WebElement getFirstSelectedOpt(WebElement element) {
			Select select = new Select(element);
			WebElement firstSelectedOption = select.getFirstSelectedOption();
			return firstSelectedOption;
		}
	//31	
		public void deselectByIndex(WebElement element,int index) {
			Select select =new Select(element);
			select.deselectByIndex(index);
		}
	//32	
		public void deselectByValue(WebElement element,String value ) {
			Select select = new Select(element);
			select.deselectByValue(value);
		}
	//33	
		public void deselectByVisibleText(WebElement element, String text) {
			Select select =new Select(element);
			select.deselectByVisibleText(text);
		}
	//34	
		public void notify(WebElement element) {
			Select select =new Select(element);
			select.notify();
		}
	//35	
		public void notifyAll(WebElement element) {
			Select select =new Select(element);
			select.notifyAll(); 
		}
	//36	
		public WebElement getWrappedElement(WebElement element) {
			Select select =new Select(element);
			WebElement wrappedElement = select.getWrappedElement();
			return wrappedElement; 
		}
	//37	
		public void moveToElement(WebElement target) {
			Actions actions = new Actions(driver);
			actions.moveToElement(target).perform();
		}
	//38	
		public void click() {
			Actions actions =new Actions(driver);
			actions.click().perform();
		}
	//39	
		public void clickWithTarget(WebElement target) {
			Actions actions =new Actions(driver) ;
			actions.click(target).perform();
		}
	//40	
		public void doubleClick() {
			Actions actions = new Actions(driver);
			actions.doubleClick().perform();
		} 
	//41	
		public void doubleClickTarget(WebElement target) {
			Actions actions =new Actions(driver);
			actions.doubleClick(target).perform();
		} 
	//42	
		public void rightClick() {
			Actions actions = new Actions(driver);
			actions.contextClick().perform();
		}
	//43	
		public void rightClickTarget(WebElement target) {
			Actions actions =new Actions(driver);
			actions.contextClick(target).perform();
		}
	//44	
		public void dragAndDrop(WebElement source, WebElement target) {
			Actions actions =new Actions(driver);
			actions.dragAndDrop(source, target).perform();
		}
	//45	
		public void keyDown(CharSequence key) {
			Actions actions =new Actions(driver);
			actions.keyDown(key).perform();
		}
	//46	
		public void keyUp(CharSequence key) {
			Actions actions =new Actions(driver);
			actions.keyUp(key).perform();
		}
	//47	
		public void keyDownTarget(WebElement target, CharSequence key) {
			Actions actions =new Actions(driver);
			actions.keyDown(target, key).perform();
		}
	//48	
		public void keyUpTarget(WebElement target, CharSequence key) {
			Actions actions =new Actions(driver);
			actions.keyUp(target, key).perform();
		}
	//49	
		public void sendKeys(CharSequence keys) {
			Actions actions =new Actions(driver);
			actions.sendKeys(keys).perform();
		}
	//50	
		public String toString() {
			Actions actions =new Actions(driver);
			return actions.toString();  
		}
	//51
		public void getAttribute(WebElement element ) {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("return arguments[0].getAttribute('value')", element);
		}
	//52
		public void scrollDown(WebElement element ) {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].scrollIntoView(true)", element);
		}
	//53
		public void scrollUp(WebElement element ) {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].scrollIntoView(false)", element);
		}
	//54
		public void parentFrame() {
			driver.switchTo().parentFrame();
		}
	//55
		public void backWard() {
			driver.navigate().back();
		}
	//56
		public void forWard() {
			driver.navigate().forward();
		}
	//57
		public void refresh() {
			driver.navigate().refresh();
		}
	//58
		public void launch(String key, String value) {
			System.setProperty(key, value);
		}
	//59
		public List<WebElement> webTable(String tagName) {
			List<WebElement> findElements = driver.findElements(By.tagName(tagName));
			return findElements;
		}
	//60
		public TakesScreenshot scrnst(OutputType<TakesScreenshot> target, TakesScreenshot WebDriver) {
			TakesScreenshot screenshot = ((TakesScreenshot)WebDriver).getScreenshotAs(target);
			return screenshot;
		}
	//61
		public boolean file(String pathname) {
			File file = new File(pathname);
			boolean mkdir = file.mkdir();
			return mkdir;
		}
	//62
		public boolean files(String pathname) {
			File file = new File(pathname);
			boolean canExecute = file.canExecute();
			return canExecute;
		}
		
	//63	
		public boolean creatNewFile(String pathname) throws IOException {
			File file = new File(pathname);
			boolean createNewFile = file.createNewFile();
			return createNewFile;
		}
	//64
		public boolean addList(Object e) {
			List list = new ArrayList();	
			boolean add = list.add(e);
			return add;
		}
	//65
		public void addListIndex(Object e, int index) {
			List list = new ArrayList();	
			list.add(index, e);
		}
	//66
		public boolean addL1istIndex(Object e, Collection c) {
			List list = new ArrayList();	
			boolean addAll = list.addAll(c);
			return addAll;
		}
	//67
		public void clearList(Object e) {
			List list = new ArrayList();	
			list.clear(); 
		}
	//68
		public boolean containsList(Object o) {
			List list = new ArrayList();	
			boolean contains = list.contains(o);
			return contains; 
		}
	//69
		public Object getIndex(int index) {
			List list = new ArrayList();	
			Object object = list.get(index);
			return object; 
		}
	//70
		public int indexofList(Object o) {
			List list = new ArrayList();	
			int indexOf = list.indexOf(o);
			return indexOf;  
		}
	//71
		public int lastIndexOf(Object o) {
			List list = new ArrayList();	
			int lastIndexOf = list.lastIndexOf(o);
			return lastIndexOf;
		}
	//72
		public int sizeList() {
			List list = new ArrayList();	
			int size = list.size();
			return size;
		}
	//73
		public int StringLength(String data) {
			String s = data;
			int length = s.length();
			return length;
		}
	//74
		public String StringUpcase(String data) {
			String s = data;
			String upperCase = s.toUpperCase();
			return upperCase;
		}
	//75
		public String StringLowcase(String data) {
			String s = data;
			String lowerCase = s.toLowerCase();
			return lowerCase;
		}


}
