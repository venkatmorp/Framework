package com.base;

import java.io.IOException;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;

public class Employee {

	public static void main(String[] args) throws IOException, InterruptedException{
		
		Employee employee = new Employee();
		employee.booking();

	}
 
	public void booking() throws IOException, InterruptedException  {
     
		Baseclass baseclass = new Baseclass();
		baseclass.getdriver();
		baseclass.getUrl("https://adactinhotelapp.com/");
		baseclass.maximizeWindow();
		 
		baseclass.implicitWait(30);
		 
		WebElement txtuser = baseclass.findLocatorById("username");
        String userName = baseclass.getDataformCell("Hotel", 1, 0);
        baseclass.elementsendkeys(txtuser, userName);
         
        WebElement txtPassword = baseclass.findLocatorById("password");
 		String pass = baseclass.getDataformCell("Hotel", 1, 1);
 		baseclass.elementsendkeys(txtPassword, pass);
 		
 		WebElement btnLogin = baseclass.findLocatorById("login");
 		baseclass.elementClick(btnLogin);
 		
 		
 	    WebElement uulocation = baseclass.findLocatorById("location");
 	    String location = baseclass.getDataformCell("Hotel", 1, 2);
 		baseclass.selectOptionByText(uulocation, location);
 		
 		WebElement uuhotels = baseclass.findLocatorById("hotels");
 		String hotels = baseclass.getDataformCell("Hotel", 1, 3);
 		baseclass.selectOptionByAttribute(uuhotels, hotels);
 		
 		WebElement uuroomType = baseclass.findLocatorById("room_type");
 		String roomType = baseclass.getDataformCell("Hotel", 1, 4);
 		baseclass.selectOptionByAttribute(uuroomType, roomType);
 		
 		WebElement uurooms = baseclass.findLocatorById("room_nos");
 		String rooms = baseclass.getDataformCell("Hotel", 1, 5);
 		baseclass.selectOptionByAttribute(uurooms, rooms);
 		
 		WebElement uuchechkIn = baseclass.findLocatorById("datepick_in");
 		baseclass.elementclear("datepick_in");
 		String inDate = baseclass.getDataformCell("Hotel", 1, 6);
 		baseclass.elementsendkeys(uuchechkIn, inDate);
 		
 		WebElement uuchechkOut = baseclass.findLocatorById("datepick_out");
 		baseclass.elementclear("datepick_out");
 		String outDate = baseclass.getDataformCell("Hotel", 1, 7);
 		baseclass.elementsendkeys(uuchechkOut, outDate);
 		
 		WebElement uuadults = baseclass.findLocatorById("adult_room");
 		String adults = baseclass.getDataformCell("Hotel", 1, 8);
 		baseclass.selectOptionByAttribute(uuadults, adults);
 		
 		WebElement uuchildrens = baseclass.findLocatorById("child_room");
 		String childrens = baseclass.getDataformCell("Hotel", 1, 9);
 		baseclass.selectOptionByAttribute(uuchildrens, childrens);
 		
 		WebElement uusubmit = baseclass.findLocatorById("Submit");
 		baseclass.elementClick(uusubmit);
 		
 		WebElement uuclick = baseclass.findLocatorById("radiobutton_0");
 		baseclass.elementClick(uuclick);
 		
 		WebElement uucontinue = baseclass.findLocatorById("continue");
 		baseclass.elementClick(uucontinue);
 		
 		WebElement uufirstName = baseclass.findLocatorById("first_name");
 		String firstName = baseclass.getDataformCell("Hotel", 1, 10);
 		baseclass.elementsendkeys(uufirstName, firstName);
 		
 		WebElement uusecondName = baseclass.findLocatorById("last_name");
 		String lastName = baseclass.getDataformCell("Hotel", 1, 11);
 		baseclass.elementsendkeys(uusecondName, lastName);
 		
 		WebElement uuaddress = baseclass.findLocatorById("address");
 		String address = baseclass.getDataformCell("Hotel", 1, 12);
 		baseclass.elementsendkeys(uuaddress, address);
 		
 		WebElement uucardNo = baseclass.findLocatorById("cc_num");
 		String creditCard = baseclass.getDataformCell("Hotel", 1, 13);
 		baseclass.elementsendkeys(uucardNo, creditCard);
 		
 		WebElement uuType = baseclass.findLocatorById("cc_type");
 		String cardType = baseclass.getDataformCell("Hotel", 1, 14);
 		baseclass.selectOptionByAttribute(uuType, cardType);
 		
 		WebElement uuMonth = baseclass.findLocatorById("cc_exp_month");
 		String cardmonth = baseclass.getDataformCell("Hotel", 1, 15);
 		baseclass.selectOptionByAttribute(uuMonth, cardmonth);
 		
 		WebElement uuyear = baseclass.findLocatorById("cc_exp_year");
 		String cardYear = baseclass.getDataformCell("Hotel", 1, 16);
 		baseclass.selectOptionByAttribute(uuyear, cardYear);
 		
 		WebElement uucvv = baseclass.findLocatorById("cc_cvv");
 		String cvv = baseclass.getDataformCell("Hotel", 1, 17);
 		baseclass.elementsendkeys(uucvv, cvv);
 		
 		WebElement uubookNow = baseclass.findLocatorById("book_now");
 		baseclass.elementClick(uubookNow);
 		
 		baseclass.threadSleep(3000);
 		
 		WebElement uuorderNo = baseclass.findLocatorByName("order_no");
 		String orderNo = baseclass.elementGetAttribute(uuorderNo, "value");
 		baseclass.insertDateInCell("Hotel", 1, 18, orderNo);
 		
         
	}
	
}
