package listener;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import UtilityPackage.Utility;
import baseClasses.Base;

public class Listener extends Base  implements ITestListener
{
	
	public void onTestFailure(ITestResult result)
	{
		String TCName1 = result.getName();
		System.out.println("Failed Tc name is "+result.getName());
		try {
			takeScreenshot(TCName1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void onTestSuccess(ITestResult result) 
	{
	
		System.out.println("Passed TC name is "+result.getName());
	}

}