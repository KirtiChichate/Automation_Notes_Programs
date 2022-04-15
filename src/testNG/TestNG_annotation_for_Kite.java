
package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class KiteSample {
  @Test
  public void validateUserID() {
	  System.out.println("userID Vlidated TC is passed");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Login to Kite Application");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Logout form application");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Launch the browser");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Close browser");
  }

}