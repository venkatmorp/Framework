package org.pom;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bookHotel extends Baseclass {
	
	public bookHotel() {
		
	PageFactory.initElements(driver, this);	
		
	}
	
	@FindBy(id="first_name")
	private WebElement shname;
	
	@FindBy(id="last_name")
	private WebElement shlastname;
	
	@FindBy(id="address")
	private WebElement shaddress;
	
	@FindBy(id="cc_num")
	private WebElement shccnum;
	
	@FindBy(id="cc_type")
	private WebElement shcctype;
	
	@FindBy(id="cc_exp_month")
	private WebElement shexpmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement shexpyear;
	
	@FindBy(id="cc_cvv")
	private WebElement shcvvnum;
	
	@FindBy(id="book_now")
	private WebElement shbooknow;

	public WebElement getShname() {
		return shname;
	}

	public WebElement getShlastname() {
		return shlastname;
	}

	public WebElement getShaddress() {
		return shaddress;
	}

	public WebElement getShccnum() {
		return shccnum;
	}

	public WebElement getShcctype() {
		return shcctype;
	}

	public WebElement getShexpmonth() {
		return shexpmonth;
	}

	public WebElement getShexpyear() {
		return shexpyear;
	}

	public WebElement getShcvvnum() {
		return shcvvnum;
	}

	public WebElement getShbooknow() {
		return shbooknow;
	}
	
	public void Bookinghotelmethod(String name,String lastname,String address,String ccnum,
			String cctype,String expmonth,String expyear,String cvvnum) {
		elementsendkeys(getShname(), name);
		elementsendkeys(getShlastname(), lastname);
		elementsendkeys(getShaddress(), address);
		elementsendkeys(getShccnum(), ccnum);
		selectOptionByText(getShcctype(), cctype);
		selectOptionByText(getShexpmonth(), expmonth);
		selectOptionByText(getShexpyear(), expyear);
		elementsendkeys(getShcvvnum(), cvvnum);
		elementClick(getShbooknow());
		
}
	}	
	

