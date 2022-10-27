package org.parallelExecution;

import org.testng.annotations.Test;

public class Parallel extends Baseclass{
	
@Test  
    private void instagram() {
	getdriver();
	getUrl("https://www.instagram.com/");
	
	}
@Test
    private void facebook() {
	getdriver();
    getUrl("https://www.facebook.com/");
    	
	}
@Test
    private void adactionhotel() {
	getdriver();
    getUrl("https://adactinhotelapp.com/");
    	
	}
@Test
    private void flipkart() {
	getdriver();
    getUrl("https://www.flipkart.com/");
    
	}
      
}





