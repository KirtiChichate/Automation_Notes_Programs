
package selenium_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySelenium1stCode {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Velocity\\Java Class\\Dec-2021 Class\\4thDecEvening\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://vctcpune.com/");// to enter url in browser or to open an application

		driver.get("https://www.google.co.in/");
//		
//		Thread.sleep(2000);
//		
		//driver.close();// to close the current tab of the browser opened by Selenium tool.
//		
//		
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		//driver.manage().window().minimize();
//		
//		driver.navigate().back();
//		Thread.sleep(500);
//		driver.navigate().forward();
//		Thread.sleep(500);
//		driver.navigate().refresh();
//		driver.navigate().to("https://kite.zerodha.com/");

//		System.out.println(driver.getTitle());
//
//		String title = driver.getTitle();
//
//		System.out.println("Title of web page is " + title);

		System.out.println(driver.getCurrentUrl());

	}

}
