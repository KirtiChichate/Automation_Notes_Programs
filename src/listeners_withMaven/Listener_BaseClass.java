
package baseClasses;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Base 
{

	protected static WebDriver driver;
	public void launchBrowser()
	 {
	 System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\Dec-2021 Class\\11thBMorning\\chromedriver_win32\\chromedriver.exe");
	 ChromeOptions opt= new ChromeOptions();
	 opt.addArguments("--disable-notifications");
	 driver= new ChromeDriver(opt);	 
	 driver.get("https://kite.zerodha.com/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 driver.manage().window().maximize();
	 Reporter.log("Browserlaunched sussess",true);
	 
	 }
	public void takeScreenshot(String TCName) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("D:\\Velocity\\Java Class\\Dec-2021 Class\\11thBMorning\\Screenshot\\TC"+TCName+"Screenshot.png");
		FileHandler.copy(src, dest);
		Reporter.log("screenshot taken for TC " +TCName,true);
	}
	
	public void closeBrowser()
	{
		driver.close(); 
		Reporter.log("Browser closed sussess",true);
	}
}