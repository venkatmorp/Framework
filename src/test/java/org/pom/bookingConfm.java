package org.pom;

import java.io.IOException;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bookingConfm extends Baseclass {
	
	public bookingConfm() {
    PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(id="order_no")
	private WebElement OrderNum;

	public WebElement getOrderNum() {
		return OrderNum;
	}
	
	public void BookOrderNumPrint() throws IOException, InterruptedException {
		threadSleep(5000);
		String elementGetAttribute = elementGetAttribute(getOrderNum(), "value");
		insertDateInCell("Hotel", 1, 18,elementGetAttribute);
		
	} 
	
}
