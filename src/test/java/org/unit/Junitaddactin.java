package org.unit;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junitaddactin {
	
	static WebDriver driver ;
	
	@BeforeClass
	public static void beforeclass() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@AfterClass
	public static void afterclass() {
		driver.quit();
    }
    @Test
    public void login() {
    	 WebElement txtuser = driver.findElement(By.id("username"));
    	 txtuser.sendKeys("venkatesh12345");
    	 
    	 WebElement txtpassword = driver.findElement(By.id("password"));
    	 txtpassword.sendKeys("venkatRamya");
    	 
    	 WebElement btnclick = driver.findElement(By.id("login"));
    	 btnclick.click();
	}
    @Before
    public void beforemethod() throws IOException {
    	TakesScreenshot screenshot = (TakesScreenshot)driver;
    	File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
    	System.out.println(screenshot);
    	
    	File file = new File("C:\\Users\\kcrve\\OneDrive\\Pictures\\Screenshots\\Before.png");
    	FileUtils.copyFile(screenshotAs, file);
    	
   }
  @After
    public void after() throws IOException {
	  TakesScreenshot screens = (TakesScreenshot)driver;
	  File screenshotAs = screens.getScreenshotAs(OutputType.FILE); 
	  System.out.println(screenshotAs);

	  File file =new File("C:\\Users\\kcrve\\OneDrive\\Pictures\\Screenshots\\after.png");
	  FileUtils.copyFile(screenshotAs, file);
}
  
  
}
