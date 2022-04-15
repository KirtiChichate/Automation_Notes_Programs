package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethodStudy {

	public static void main(String[] args) throws InterruptedException  {
System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\Dec-2021 Class\\4thDecEvening\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
//		driver.findElement(By.name("email")).sendKeys("Pune Katraj");
//		driver.findElement(By.name("email")).clear();
//		driver.findElement(By.name("email")).sendKeys("Velocity Pune");

		//This class is about sendKeys, Clear and click
		WebElement UserName = driver.findElement(By.name("email"));
		
		UserName.sendKeys("Pune Katraj");
		UserName.clear();
		UserName.sendKeys("Velocity Pune");	
		
		WebElement Password = driver.findElement(By.id("pass"));
		
		Password.sendKeys("1234");
		
		WebElement LoginButton = driver.findElement(By.name("login"));
		
		LoginButton.click();
		Thread.sleep(2000);
		driver.navigate().back();
	}

}