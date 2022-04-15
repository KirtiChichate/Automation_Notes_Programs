
package multiple_ElementsHandeling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleCheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Velocity\\Java Class\\Dec-2021 Class\\4thDecEvening\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

		System.out.println("Total check boxes are "+checkBoxes.size());
		
		for(WebElement w:checkBoxes)
		{
			Thread.sleep(2000);
			w.click();
			
		}
		for(WebElement w:checkBoxes)
		{
			Thread.sleep(2000);
			w.click();
		}
		
		
	}

}
