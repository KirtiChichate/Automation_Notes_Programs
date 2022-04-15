
package PositionAndSize;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Positiontest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\Dec-2021 Class\\11thBMorning\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
	//	driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//1.create object of point class, which will accept x and y cordinate 
		//(10,10)--> default value
		Point p= new Point(190, 500);
		
		//2. use set position pass object
		driver.manage().window().setPosition(p);
		//to get current position use getPosition
		System.out.println(driver.manage().window().getPosition());

	}

}