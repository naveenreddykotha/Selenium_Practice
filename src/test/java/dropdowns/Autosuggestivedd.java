package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autosuggestivedd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Download\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
	   List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	   
	   for(WebElement option:options) {
		   if(option.getText().equalsIgnoreCase("India")) {
			   option.click();
		   }
	   }
	   driver.findElement(By.id("autosuggest")).getAttribute("value");
	   System.out.println(driver.findElement(By.id("autosuggest")).getAttribute("value"));
	   driver.quit();
	}

}
