

package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\Dec-2021 Class\\4thDecEvening\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()='Click me'])[1]")).click();
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		
		String alertText = alt.getText();
		System.out.println("alert text is "+alertText);
		Thread.sleep(2000);
		alt.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()='Click me'])[3]")).click();
		Alert alt1 = driver.switchTo().alert();
		alt1.dismiss();

	}

}