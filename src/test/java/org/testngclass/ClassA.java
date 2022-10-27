package org.testngclass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ClassA {

	
@BeforeSuite	
    private void test1() {
    System.out.println("ClassA @Beforesuite");
		
 }
@AfterSuite	

    private void test2() {
    System.out.println("ClassA @Aftersuite");

}
@BeforeSuite
    
   private void test3() {
   System.out.println("ClassA @BeforeTest");
}
@AfterTest

   private void test4() {
   System.out.println("ClassA @AfrterClass");
	
}
@BeforeClass
   private void test5() {
   System.out.println("ClassA @BeforeClass");
}
@AfterClass
   private void test6() {
   System.out.println("ClassA @AfterClass");
	
}
@BeforeMethod
    private void test7() {
    System.out.println("ClassA @BeforeMethod");
}
@AfterClass
   private void test8() {
   System.out.println("ClassA @AfterClass");
}
@Test
    private void test9() {
    System.out.println("ClassA @Test");
}

}
