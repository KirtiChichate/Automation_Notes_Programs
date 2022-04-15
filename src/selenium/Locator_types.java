package selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\Dec-2021 Class\\4thDecEvening\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Velocity Pune");
		//locator-->id
		driver.findElement(By.id("email")).sendKeys("Velocity Pune");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		// locator-->classname
		//driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();
		
		//locator-->name
			//driver.findElement(By.name("login")).click();
		
		//driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
		
		// locator--> tagname
		driver.findElement(By.tagName("button")).click();
		

	}

}