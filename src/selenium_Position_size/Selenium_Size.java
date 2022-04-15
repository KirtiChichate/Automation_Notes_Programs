
package PositionAndSize;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\Dec-2021 Class\\11thBMorning\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
	//	driver.manage().window().maximize();
		Thread.sleep(3000);
		
		System.out.println(driver.manage().window().getSize());
		//default value (1050, 660)
		//create an object of dimension class which will accept width and height
		
		Dimension d= new Dimension(700, 700);
		
		//use setSize method and pass Dimension object
		
		driver.manage().window().setSize(d);
	}

}