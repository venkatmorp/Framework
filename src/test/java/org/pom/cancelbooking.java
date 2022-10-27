package org.pom;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cancelbooking extends Baseclass{
	
	public cancelbooking() {
	PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="//a[@href='BookedItinerary.php']")
	private WebElement lnkBookItnry;
	
	@FindBy(id="order_id_text")
	private WebElement SearchOrdeRId;
	
	@FindBy(id="search_hotel_id")
	private WebElement SearchGoId;
	
	@FindBy(name="ids[]")
	private WebElement clickCheck;
	
	@FindBy(name="cancelall")
	private WebElement btnCancel;

	public WebElement getLnkBookItnry() {
		return lnkBookItnry;
	}

	public WebElement getSearchOrdeRId() {
		return SearchOrdeRId;
	}

	public WebElement getSearchGoId() {
		return SearchGoId;
	}

	public WebElement getClickCheck() {
		return clickCheck;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}
	
	public void cancel(String getAttribute) {
		 elementClick(getLnkBookItnry());
         elementsendkeys(getSearchOrdeRId(), getAttribute);
		 elementClick(getSearchGoId());
         elementClick(getClickCheck());
         elementClick(getBtnCancel());
         alertOk();
	}

}
