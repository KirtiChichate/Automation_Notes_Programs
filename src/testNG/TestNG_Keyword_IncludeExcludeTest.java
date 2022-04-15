
package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class IncludeExcludeTest {
	
	//total 100--> 30 want to execute--> 70 dont want
	//I have a,b,c d
	//I want a,c
	//I dont want b,d
	@Test
	  public void a()  
	  {
		
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