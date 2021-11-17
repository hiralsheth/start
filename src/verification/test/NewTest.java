package verification.test;

import org.testng.annotations.*;

public class NewTest {
  @Test
  public void TestFunctionOne() {
	  System.out.println("First test executed!");
  }
  @Test
  public void TestFunctionTwo() {
	  System.out.println("Second test executed!");
  }
  @Test
  public void TestFunctionThree() {
	  System.out.println("Third test executed!");
  }
  
  @AfterSuite
  public void AfterSuitTestFunction() {
	  System.out.println("-----> After suite function executed!");
  }
  
  @BeforeMethod
  public void BeforeSuitFunction() {
	  System.out.println(" ~~ Before suite executed! ~~ ");
  }
  
  @Test(groups={"regression"})
  public void RegressionFunction() {
	  System.out.println(" Regresion test case executed!");
  }
  
  @Test
  @Parameters({"val1", "val2"})
  public void FunctionWithParams(int a, int b) {
	  System.out.println("Entered values are "+a+" and "+b+" with sum of " + (a+b));
  }
  
}
