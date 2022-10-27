package org.testngclass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ClassB {
	@BeforeSuite	
    private void test1() {
    System.out.println("ClassB @Beforesuite");
		
 }
@AfterSuite	

    private void test2() {
    System.out.println("ClassB @Aftersuite");

}
@BeforeSuite
    
   private void test3() {
   System.out.println("ClassB @BeforeTest");
}
@AfterTest

   private void test4() {
   System.out.println("ClassB @AfrterClass");
	
}
@BeforeClass
   private void test5() {
   System.out.println("ClassB @BeforeClass");
}
@AfterClass
   private void test6() {
   System.out.println("ClassB @AfterClass");
	
}
@BeforeMethod
    private void test7() {
    System.out.println("ClassB @BeforeMethod");
}
@AfterClass
   private void test8() {
   System.out.println("ClassB @AfterClass");
}
@Test
    private void test9() {
    System.out.println("ClassB @Test");
}

	
 }



   






























