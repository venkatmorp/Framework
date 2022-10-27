package org.pom;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logInPage extends Baseclass {
	
	public logInPage() {
    PageFactory.initElements(driver, this);
	
	}
	
	
	@FindBy(id="username")
	private WebElement txtuserName;
	
	@FindBy(id="password")
	private WebElement txtpassword;
	
	@FindBy(id="login")
	private WebElement btnlogin;

	public WebElement getTxtuserName() {
		return txtuserName;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	public void login(String UserName, String Password) {
		elementsendkeys(getTxtuserName(), UserName);
		elementsendkeys(getTxtpassword(), Password);
		elementClick(getBtnlogin());
		
		
		

	}
	
	
	
	
}
