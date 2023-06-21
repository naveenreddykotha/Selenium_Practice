package JSExecutors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Textboxgetting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/client");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('userEmail').value='naveen123@gmail.com'");
		//to retrieve value from textbox
		String text= (String) js.executeScript("return document.getElementById('userEmail').value");
		System.out.println(text);
		
		WebElement passwordele=driver.findElement(By.xpath("//input[@id='userPassword']"));
		js.executeScript("arguments[0].value='Naveen@123'", passwordele);
		
		//using xpath in js
		//js.executeScript("document.evaluate("//input[@id='userPassword']",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.value='Naveen@123')";
		
		
		

	}

}
