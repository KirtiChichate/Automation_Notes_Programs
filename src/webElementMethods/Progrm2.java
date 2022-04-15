
package webElementsMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class IsEnabledTC {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\Dec-2021 Class\\4thDecEvening\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.discoveryplus.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//clicking on sign in Button
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(1000);
		
		//checking Get OTP button is enabled or not
		
		WebElement getOTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		WebElement MobileNumField = driver.findElement(By.id("mobileNumber"));
		boolean ButtonStatus = getOTPButton.isEnabled();
		
		if(ButtonStatus)
		{
			getOTPButton.click();
			System.out.println("Get OTP is alreday enabled ");
		}
		else 
		{
			System.out.print("get OTP button is disabled, entering mobile number");
			MobileNumField.sendKeys("8888888888");
			Thread.sleep(1000);
			getOTPButton.click();
		}
		
	}

}
