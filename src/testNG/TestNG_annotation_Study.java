
package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy {
  @Test
  public void MyMethod()
  {
	  Reporter.log("Test Case is running");
	  System.out.println("Test Case is running");
  }
  
  @AfterClass
  public void afterClass()
  {
	  Reporter.log("After class is running");
	  System.out.println("After class is running");
  }
  @AfterMethod
  public void am()
  {
	  Reporter.log("After method is running");
	  System.out.println("After method is running");

  }
  
  @BeforeClass
  public void beforeClass()
  {
	  Reporter.log("Running Before Class");
	  System.out.println("Running Before Class");
  }
  
  @BeforeMethod
  public void bm()
  {
	  Reporter.log("Before Method is running");
	  System.out.println("Before Method is running");
  }
  
}