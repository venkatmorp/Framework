package interview;

import java.awt.Desktop.Action;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpathprogram {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.wpjobboard.net/wp-login.php?redirect_to=https%3A%2F%2fdemo.wpjobboard");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		WebElement jobboard = driver.findElement(By.xpath("//div[text()='Job Board']"));
		Actions action = new Actions(driver);
		action.moveToElement(jobboard).perform();
		
		
		driver.findElement(By.xpath("//a[@href='admin.php?page=wpjb-application']")).click();
		WebElement name1 = driver.findElement(By.xpath("//a[text()='Content Creator']//parent::td//preceding-sibling::td//strong"));
		System.out.println(name1.getText());
		
//To print pre-sib
		
       List<WebElement> list1 = driver.findElements(By.xpath("//a[text()='Content Creator']//parent::td//preceding-sibling::td"));
      
       for (int i = 0; i < list1.size(); i++) {
    	  
       System.out.println(list1.get(i).getText());	  
       }
       
//To follow -sib
       
   	   List<WebElement> list2 = driver.findElements(By.xpath("//a[text()='Content Creator']//parent::td//following-sibling::td"));
	
	   for (int i = 0; i < list2.size(); i++) {
		
	   System.out.println(list2.get(i).getText());
		
	}
//Ancestor concept-grndparent
	
	   List<WebElement> list3 = driver.findElements(By.xpath("//a[text()='Content Creator']//ancestor::tr//preceding-sibling::tr"));
	   
	   for (int i = 0; i < list3.size(); i++) {
		   
		   System.out.println(list3.get(i).getText());
		   
	}
//folw-to find o/b/o
	   
      List<WebElement> list4 = driver.findElements(By.xpath("//a[text()='Content Creator']//ancestor::tr//following-sibling::tr"));
	   
	   for (int i = 0; i < list4.size(); i++) {
		   
	   System.out.println(list4.get(i).getText());
   
   }
//To print Email get
	   
	   List<WebElement> list5 = driver.findElements(By.xpath("//a[text()='Content Creator']//parent::td//preceding::td[@data-colname='E-mail']"));
	   for (int i = 0; i < list5.size(); i++) {
		   
	   System.out.println(list5.get(i).getText());
  }
//folow find 	
	   
	   
	   List<WebElement> list6 = driver.findElements(By.xpath("//a[text()='Content Creator']//parent::td//following::td[@data-colname='E-mail']"));
	   for (int i = 0; i < list6.size(); i++) {
		   
	   System.out.println(list6.get(i).getText());
	   
	   
	   }
	   
//to print prece
	   
		List<WebElement> list7 = driver.findElements(By.xpath("//a[text()='Content Creator']//parent::td//preceding::td[@data-colname='Job']"));
				
		for (int i = 0; i < list7.size(); i++) {
					
			System.out.println(list7.get(i).getText());
		}
		
//To print following get
		
		List<WebElement> list8 = driver.findElements(By.xpath("//a[text()='Content Creator']//parent::td//following::td[@data-colname='Job']"));
						
		for (int i = 0; i < list8.size(); i++) {
							
			System.out.println(list8.get(i).getText());
			
			
				}
		
		List<WebElement> list9 = driver.findElements(By.xpath("//a[text()='Content Creator']//ancestor::tr//preceding::tr"));
		   
		   for (int i = 0; i < list9.size(); i++) {
			   
			   System.out.println(list9.get(i).getText());
			   
		}
	//folw-to find o/b/o
		   
	      List<WebElement> list10 = driver.findElements(By.xpath("//a[text()='Content Creator']//ancestor::tr//following::tr"));
		   
		   for (int i = 0; i < list10.size(); i++) {
			   
		   System.out.println(list10.get(i).getText());
	   
	   }	   
		 //To print pre-sib
			
	       List<WebElement> list11 = driver.findElements(By.xpath("//a[text()='Content Creator']//parent::td//preceding::td"));
	      
	       for (int i = 0; i < list11.size(); i++) {
	    	  
	       System.out.println(list11.get(i).getText());	  
	       }
	       
	//To follow -sib
	       
	   	   List<WebElement> list12 = driver.findElements(By.xpath("//a[text()='Content Creator']//parent::td//following::td"));
		
		   for (int i = 0; i < list12.size(); i++) {
			
		   System.out.println(list12.get(i).getText());
			
		}  
	}
}
