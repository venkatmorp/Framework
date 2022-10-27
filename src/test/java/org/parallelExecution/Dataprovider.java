package org.parallelExecution;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider extends Baseclass {
	
 @Test(dataProvider="login1")
 
  private void login(String user,String pass) {
  
	getdriver();
	getUrl("https://www.facebook.com/");
	findLocatorById("email").sendKeys(user);
	findLocatorById("pass").sendKeys(pass);
	}
	
@DataProvider(name="login1")

   private Object [][] datapro(){
	
//arraysyntax
	
	Object[][] data = new Object [3][2];
	
//0 th row 
	
	data [0][0] ="Selva";
	data [0][1]  = "pass";
	
//1 st row 
	
	data [1][0] = "venkat";
	data [1][1]   ="vei@123";
	
//2 nd row 
	
	data [2][0] = "sugi";
	data [2][1]   = "sugi@145";
	
	
   return data;
  
    
   
}
}
