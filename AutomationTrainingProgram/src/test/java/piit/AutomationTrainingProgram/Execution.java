package piit.AutomationTrainingProgram;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethodsIf.List;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Execution {
  @Test
 
  public void f() {
	  System.out.println("This is test annotation");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is before method annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is after method annotation");
  }
  @Test
 public void test2( ) {
	  System.out.println("This is test2");

}
  

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is before class annotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is after class annotation");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is before test annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is after test annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is before suite annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is after suite annotation");
  }

}
