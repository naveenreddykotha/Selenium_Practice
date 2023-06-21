package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.amazon.in/");
		
		//Actions is one of the class in selinium like select
		//which is used to hover mouse on certain webelement to access
		Actions a=new Actions(driver); //now action class has the all the methods of driver object
		//to make sendkeys capital we can use actions class
		//doubleclick() method will select the text
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello 123").doubleClick().perform();
		
		//contextclick() method will right click on that web element
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().perform();

	}

}
