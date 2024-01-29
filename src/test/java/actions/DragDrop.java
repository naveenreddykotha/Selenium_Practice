package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "D:\\Download\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://demoqa.com/menu/#");
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Main Item 2')]"))).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'SUB SUB LIST »')]"))).perform();
		WebElement el=driver.findElement(By.xpath("//a[contains(text(),'Sub Sub Item 2')]"));
		//el.click();
		System.out.println("desired element is clicked");
	}

}
