package JSExecutors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Highlightele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("document.getElementById('email').style.border='2px solid red';");
		//js.executeScript("document.getElementById('email').style.background='green';");
		//js.executeScript("document.getElementById('email').setAttribute('style','border:2px solid red;background:blue');");
		
		//through webelemnt
		WebElement ele=driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('style','border:2px solid red;background:blue');",ele);
	}

}
