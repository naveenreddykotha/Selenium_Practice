package waits;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;


public class FluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Download\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/dynamic-properties");
		//use FluentwaitTest if fluentwait doesnot work
//		Wait<WebDriver> wait = new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver)
//				  .withTimeout(Duration.ofSeconds(30))
//				  .pollingEvery(Duration.ofSeconds(5))
//				  .ignoring(NoSuchElementException.class);
//		
//		wait.until(new)

		//Wait<WebDriver> wait= new FluentWait<WebDriver>(driver);
        //FluentWait wait = new FluentWait<WebDriver>(driver);
//		wait.
	}

}
