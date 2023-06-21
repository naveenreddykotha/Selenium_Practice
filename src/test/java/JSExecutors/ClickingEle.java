package JSExecutors;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickingEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('femalerb').click()");
		
		//checkboxes
		List checkboxes= (List) js.executeScript("return document.getElementsByName('language')");
		for(Object ob:checkboxes) {
			js.executeScript("arguments[0].click()",ob);
		}
		
		WebElement link=driver.findElement(By.xpath("//a[text()='Click here to navigate to the home page']"));
		js.executeScript("arguments[0].click()",link);
		

	}

}
