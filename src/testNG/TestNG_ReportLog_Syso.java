
package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void TestMethod1()
  {
	  System.out.println("HI I AM test 1");
  }
  
  @Test
  public void TestMethod2()
  {
	  Reporter.log("HI I AM test2");
	  //System.out.println("HI I AM test 1");
  }
}