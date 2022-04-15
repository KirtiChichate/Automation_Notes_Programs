
package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutTest {
	@Test(timeOut = 2000)
	  public void a() throws InterruptedException
	  {
		Thread.sleep(3000);
		Reporter.log("Running method A ", true);
	  }
	  @Test
	  public void b()
	  {
		  Reporter.log("Running method B ", true);
	  }
	  @Test
	  public void c()
	  {
		  Reporter.log("Running method C ", true);
	  }
	  @Test
	  public void d()
	  {
		  Reporter.log("Running method D ", true);
	  }
}