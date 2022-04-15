
package popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\Dec-2021 Class\\4thDecEvening\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("NewWindow")).click();
		String idofMainPage = driver.getWindowHandle();//will handle single id-->main page

		System.out.println("Id of main page is "+idofMainPage);
			
		Set<String> allids = driver.getWindowHandles();
		
		System.out.println("ids of all pages is "+allids);
		
		Iterator<String>it=allids.iterator();// initially pointing to index-1
		String idofMainPage1 = it.next();//pointing to 0th index-->mainpage
		String idofchildpage = it.next();//pointing to 1st index-->childpage1
		
		//switching to child page
		driver.switchTo().window(idofchildpage);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement searchBarofChildpage = driver.findElement(By.xpath("//input[@id='the7-search']"));
		Thread.sleep(2000);
		searchBarofChildpage.sendKeys("Selenium");
		Thread.sleep(2000);
		driver.close();
		//switching to main page
		Thread.sleep(3000);
		driver.switchTo().window(idofMainPage1);
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
		
	}

}
