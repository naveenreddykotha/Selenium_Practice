package miseliniousTopics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class EventHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		//WebDriverEventListener eventDriver = new WebDriverEventListener(driver);

		EventHandler handler = new EventHandler();
		//eventDriver.register(handler);
		//eventDriver.get("https://toolsqa.com/automation-practice-switch-windows/");
		//WebElement element = eventDriver.findElement(By.id("target"));
		//element.click();

	}

}
