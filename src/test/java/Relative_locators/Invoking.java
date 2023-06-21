package Relative_locators;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invoking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Download\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String>windows= driver.getWindowHandles();
		Iterator<String> it= windows.iterator();
		String parent_id=it.next();
		String child_id=it.next();
		driver.switchTo().window(child_id);
		driver.get("https://rahulshettyacademy.com/");
		String url=driver.findElements(By.cssSelector("a[href*='courses.rahulshettyacademy.com/p']")).get(1).getText();
		driver.switchTo().window(parent_id);
		driver.findElement(By.cssSelector("[name='name']")).sendKeys(url);
		driver.quit();
	}

}
