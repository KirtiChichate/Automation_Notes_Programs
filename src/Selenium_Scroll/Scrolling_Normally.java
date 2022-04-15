
package scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\Dec-2021 Class\\11thBMorning\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("window.scrollBy(0,999)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-500)");
	}
	

}