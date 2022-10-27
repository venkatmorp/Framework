package org.unit;

import java.io.IOException;

import org.base.Baseclass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Hotel extends Baseclass {

	static Baseclass ht;
	
@BeforeClass
    
    public static void beforeclass() {
    ht = new Baseclass();
    ht.getdriver();
    ht.getUrl("https://adactinhotelapp.com/");
    ht.maximizeWindow();
    ht.implicitWait(30);
	
}

@Before

   public void beforemethod() {
   ht.getdate();
	
}

@Test
   
   public void logintest() throws IOException {
     WebElement txtuser = ht.findLocatorByName("username");
     String userInput = ht.getDataformCell("Sheet1", 1, 0);
     ht.elementsendkeys(txtuser, userInput);
   
     WebElement txtpass = ht.findLocatorById("password");
     String passInput = ht.getDataformCell("Sheet1", 1, 1);
     ht.elementBySendkeysJs(txtpass, passInput);
     
     WebElement btnlogin = ht.findLocatorById("login");
     ht.clickWithTarget(btnlogin);
     
}
@Test

       public void searchhotels() throws IOException {
       WebElement htlocation = ht.findLocatorById("location");
	   String locationInput = ht.getDataformCell("Sheet1", 1, 2);
	   ht.selectOptionByAttribute(htlocation, locationInput);
	   
	   WebElement hthotel = ht.findLocatorById("hotels");
	   String hthotelInput = ht.getDataformCell("Sheet1", 1, 3);
	   ht.selectOptionByAttribute(hthotel,hthotelInput);

	   WebElement htHotel = ht.findLocatorById("room_type");
	   String roomTypeInput = ht.getDataformCell("Sheet1", 1, 4);
	   ht.selectOptionByAttribute(htHotel, roomTypeInput);
	   
	   WebElement htnumofroom = ht.findLocatorById("room_nos");
	   String numofroom = ht.getDataformCell("Sheet1", 1, 5);
	   ht.selectOptionByAttribute(htnumofroom, numofroom);
	   
	   ht.elementclear("datepick_in");
	   WebElement htchkIn = ht.findLocatorById("datepick_in");
	   String htchkInInput = ht.getDataformCell("Sheet1", 1, 6);
	   ht.elementsendkeys(htchkIn, htchkInInput);
	   
	   ht.elementclear("datepick_out");
	   WebElement htchkoutt = ht.findLocatorById("datepick_out");
	   String htchkouttInput = ht.getDataformCell("Sheet1", 1, 7);
	   ht.elementsendkeys(htchkoutt, htchkouttInput);
	 
	   WebElement htadult = ht.findLocatorById("adult_room");
	   String adultinput = ht.getDataformCell("Sheet1", 1, 8);
	   ht.selectOptionByAttribute(htadult, adultinput);
	   
	   WebElement htroom = ht.findLocatorById("child_room");
	   String htroominput = ht.getDataformCell("Sheet1", 1, 9);
	   ht.selectOptionByAttribute(htroom, htroominput);
	   
	   WebElement htsearch = ht.findLocatorById("Submit");
	   ht.clickWithTarget(htsearch);
	   
}

   @Test 
   public void selecthotel() throws IOException {
       WebElement htFirstName = ht.findLocatorById("first_name");
	   String htname = ht.getDataformCell("sheet1", 1, 10);
       ht.selectOptionByAttribute(htFirstName, htname);
	   
	   WebElement htlastname = ht.findLocatorById("last_name");
	   String htlaname = ht.getDataformCell("sheet1", 1, 11);
	   ht.selectOptionByAttribute(htFirstName, htlaname);
	   
	   WebElement htaddress = ht.findLocatorById("address");
	   String addressinput = ht.getDataformCell("sheet1", 1, 12);
	   ht.selectOptionByAttribute(htaddress, addressinput);
	   
	   WebElement htcvv = ht.findLocatorById("cc_num");
	   String htcvvinput = ht.getDataformCell("sheet1", 1, 13);
	   ht.selectOptionByAttribute(htaddress, htcvvinput);
	   
	   WebElement htcardtype = ht.findLocatorById("cc_type");
	   String htcardinput = ht.getDataformCell("sheet1", 1, 14);
	   ht.selectOptionByAttribute(htcardtype, htcardinput);
	   
	   WebElement htexpmonth = ht.findLocatorById("cc_exp_month");
	   String htexmonth = ht.getDataformCell("sheet1", 1, 15);
	   ht.selectOptionByAttribute(htexpmonth, htexmonth);
	   
	   WebElement htexpyr = ht.findLocatorById("cc_exp_year");
	   String htexpyear = ht.getDataformCell("sheet1", 1, 16);
	   ht.selectOptionByAttribute(htexpyr, htexpyear);
	   
	   WebElement htvvnum = ht.findLocatorById("cc_cvv");
	   String htcvnum = ht.getDataformCell("sheet1", 1, 17);
	   ht.selectOptionByAttribute(htvvnum, htexpyear);
	   
	   WebElement htsubmit = ht.findLocatorById("book_now");
	   String htsubmitinput = ht.getDataformCell("sheet1", 1, 18);
	   ht.selectOptionByAttribute(htsubmit, htsubmitinput);
	   
}

 @Test
 
     public void printorderNoincell() throws IOException, Exception {
     ht.threadSleep(5000);
	 
     WebElement htordernum = ht.findLocatorById("order_no");
     String htordernumvalue = ht.elementGetAttribute(htordernum, "value");
	 ht.insertDateInCell("sheet1", 1, 19, htordernumvalue);
     
}
@After

     public void aftermethod() {
	 ht.getdate();
	
}
@AfterClass
    public static void afterclass() throws InterruptedException {
    ht.threadSleep(3000);
    ht.WindowQuit();
	}

}
