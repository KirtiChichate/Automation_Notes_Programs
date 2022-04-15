
package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectBoxMultiSelect {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\Dec-2021 Class\\4thDecEvening\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//1.Identify list box to be handled and store it in reference variable
		WebElement MultiSelectDropDwon = driver.findElement(By.id("cars"));
		
		//2.Create an object of Select class which will accept WebElement as argument
		Select s= new Select(MultiSelectDropDwon);
		
		//3. checking drop down can have multi select options
		
		boolean result = s.isMultiple();
		System.out.println("is Multiple result is "+result);
		
		//1.select by visible text
		
		s.selectByVisibleText("Volvo");
		Thread.sleep(2000);
		//2.select by value
		
		s.selectByValue("opel");
		
		Thread.sleep(2000);
		//3.select by Index
		
		s.selectByIndex(3);
		System.out.println("First selected option is "+s.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		//s.deselectByIndex(0);
		s.deselectAll();
		
		
		
		
	}

}