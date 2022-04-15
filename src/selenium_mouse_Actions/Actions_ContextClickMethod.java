
package selenium_mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\Dec-2021 Class\\11thBMorning\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));

		Actions act= new Actions(driver);
		Thread.sleep(2000);
//		act.moveToElement(rightClickButton).perform();
//		act.contextClick().perform();// this method is for right click on element
		
		act.contextClick(rightClickButton).perform();
	}

}