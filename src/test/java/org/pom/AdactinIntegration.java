package org.pom;

import java.io.IOException;

import org.base.Baseclass;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AdactinIntegration extends Baseclass{
	
   @BeforeClass

    public static void Beforeclass() {
	getdriver();
	getUrl("https://adactinhotelapp.com/");
	maximizeWindow();
}
    @AfterClass
     public static void Afterclass() {
   //  WindowQuit();	
}
    @Test
     public void Integration() throws Exception {
     logInPage logInPage = new logInPage();
     logInPage.login(getDataformCell("Hotel", 1, 0), getDataformCell("Hotel", 1, 1));
     
     searchHotel searchHotel = new searchHotel();
     searchHotel.SearchHotelMetd(getDataformCell("Hotel", 1, 2), getDataformCell("Hotel", 1, 3),
    		 getDataformCell("Hotel", 1, 4), getDataformCell("Hotel", 1, 5),
    		 getDataformCell("Hotel", 1, 6), getDataformCell("Hotel", 1, 7),
    		 getDataformCell("Hotel", 1, 8), getDataformCell("Hotel", 1, 9));

    selectHotel selectHotel = new selectHotel();
    selectHotel.Selecthotelmethod();
    
    bookHotel bookHotel = new bookHotel();
    bookHotel.Bookinghotelmethod(getDataformCell("Hotel", 1, 10),
    		getDataformCell("Hotel", 1, 11), getDataformCell("Hotel", 1, 12), 
    		getDataformCell("Hotel", 1, 13), getDataformCell("Hotel", 1, 14),
    		getDataformCell("Hotel", 1, 15), getDataformCell("Hotel", 1, 16),
    		getDataformCell("Hotel", 1, 17));
    
    
    bookingConfm bookingConfm = new bookingConfm();
    bookingConfm.BookOrderNumPrint();
    
    cancelbooking cancelbooking = new cancelbooking();
    cancelbooking.cancel(getDataformCell("Hotel", 1, 18));
        
    
    }
    
    
    
    
}
