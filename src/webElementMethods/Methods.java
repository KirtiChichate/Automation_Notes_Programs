
package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextStudy {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\Dec-2021 Class\\4thDecEvening\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect')]")).getText());

		WebElement Ele1 = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect')]"));
		
	//	System.out.println(Ele1.getText());
		
		String ActualText = Ele1.getText();
		
		String ExpextedText = "Facebook helps you connect and share with the people in your life.";
		System.out.println("Actual text is --> "+ActualText);
		
		if(ActualText.equals(ExpextedText))
		{
			System.out.println("text is matching Tc is passed");
		}
		
		else {
			System.out.println("text is Not-matching Tc is Faild");
		}
		
		
	}

}
