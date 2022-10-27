package org.pom;

import org.base.Baseclass;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectHotel extends Baseclass{
	
	public selectHotel() {
    PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement shbtnRadio;
	
	@FindBy(id="continue")
	private WebElement shcontinue;

	public WebElement getShbtnRadio() {
		return shbtnRadio;
	}

	public WebElement getShcontinue() {
		return shcontinue;
	}
	
	public void Selecthotelmethod() {
		elementClick(getShbtnRadio());
		elementClick(getShcontinue());
		
	}
	
	
	
	

}
