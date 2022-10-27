package com.datapro;

import org.base.Baseclass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameterprog extends Baseclass {
	
   @Parameters({"first","last","mail","pass"})
    
    @Test	
    private void login(String firstname,String lastname,String email,String password) {
      getdriver();
	  getUrl("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804944%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804944&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D9061904%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIqeTN5abY-gIVlpJmAh0UrQqlEAAYASAAEgKjIPD_BwE");
	  maximizeWindow();
   	  findLocatorByName("firstname").sendKeys(firstname);
      findLocatorByName("lastname").sendKeys(lastname);
      findLocatorByName("reg_email__").sendKeys(email);
      findLocatorByName("reg_passwd__").sendKeys(password);
      
      
	}
	
	
	

}
