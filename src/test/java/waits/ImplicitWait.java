package waits;

import java.net.SocketException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {
	static WebDriver driver;

	public static void main(String[] args) throws SocketException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "D:\\Download\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.get("https://www.google.com/");
        // launch Chrome and redirect it to the URL
       	driver.get("https://demoqa.com/dynamic-properties");
       	driver.manage().window().maximize();

        //This element will appear after 5 secs
//       	WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
//       	w.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("visibleAfter"))));
	driver.findElement(By.id("visibleAfter")).click();
	System.out.println("element identified successfully");

        //close browser
        driver.close();
	}

}
