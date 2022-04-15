
package waitOrSynchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitStudy {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\Dec-2021 Class\\4thDecEvening\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.discoveryplus.in/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//checking Get OTP button is enabled or not
		
		WebElement getOTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
		boolean ButtonStatus = getOTPButton.isEnabled();

	}

}