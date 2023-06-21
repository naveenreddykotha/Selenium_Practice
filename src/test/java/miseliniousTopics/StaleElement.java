package miseliniousTopics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		 WebElement ele = driver.findElement(By.xpath("//textarea[@title='Search']"));
		 driver.navigate().refresh();
		 //ele.sendKeys("Testing String");
		 
		 try {
			  //Pass string using sendkeys to the web element
			  ele.sendKeys("Testing String");
			  }
			  catch(StaleElementReferenceException e) {
				  WebElement elem = driver.findElement(By.xpath("//textarea[@title='Search']"));
				  elem.sendKeys("Selenium");
				  //Fetching the string entered in the search text box
				  String str = elem.getAttribute("value");
				  System.out.println("The string entered from catch block is - " +str);
			  }
		  //driver.close();

	}

}
