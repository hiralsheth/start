package verification.test;

import org.testng.annotations.*;

public class Lecture1 {
  @Test
  public void testOne() {
	  System.out.print("Lecture 1");
  }
  @Test
  public void testTwo() {
	  System.out.print("This is test two");
  }
  
  @Test(groups={"regression"})
  public void RegressionFunctionTwo() {
	  System.out.println(" Regresion test case executed - TWO!");
  }
  
  @AfterSuite
  public void AfterSuieFunc() {
	  System.out.print("After suite executed! Lec-1 ");
  }
}
