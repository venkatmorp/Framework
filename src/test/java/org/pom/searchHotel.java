package org.pom;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchHotel extends Baseclass {

	 public searchHotel() {
     PageFactory.initElements(driver, this);
	 
	 }
	
	
		@FindBy(id="location")
		private WebElement shlocation;
		
		@FindBy(id="hotels")
		private WebElement shhotel;
		
		@FindBy(id="room_type")
		private WebElement shRoomtype;

        @FindBy(id="room_nos")
        private WebElement shRoomnos;
        
        @FindBy(id="datepick_in")
        private WebElement shchkdate;
        
        @FindBy(id="datepick_out")
        private WebElement shchkout;
        
        @FindBy(id="adult_room")
        private WebElement shadultroom;
        
        @FindBy (id="child_room")
        private WebElement shchildroom;
        
        @FindBy(id="Submit")
        private WebElement shsubmit;

		public WebElement getShlocation() {
			return shlocation;
		}

		public WebElement getShhotel() {
			return shhotel;
		}

		public WebElement getShRoomtype() {
			return shRoomtype;
		}

		public WebElement getShRoomnos() {
			return shRoomnos;
		}

		public WebElement getShchkdate() {
			return shchkdate;
		}

		public WebElement getShchkout() {
			return shchkout;
		}

		public WebElement getShadultroom() {
			return shadultroom;
		}

		public WebElement getShchildroom() {
			return shchildroom;
		}

		public WebElement getShsubmit() {
			return shsubmit;
		}
        
        public void SearchHotelMetd(String Location, String Hotel, String Roomtype, String Roomnos, String chkdate, String chkout, String childroom, String adultroom) {
        	selectOptionByText(getShlocation(), Location);
        	selectOptionByText(getShhotel(), Hotel);
        	selectOptionByText(getShRoomtype(), Roomtype);
        	selectOptionByAttribute(getShRoomnos(), Roomnos);
        	elementsendkeys(getShchkdate(), chkdate);
        	elementsendkeys(getShchkout(), chkout);
        	selectOptionByText(getShchildroom(), childroom);
        	selectOptionByText(getShadultroom(), adultroom);
        	elementClick(getShsubmit());
        	
        	
		}
		
		
		
}
