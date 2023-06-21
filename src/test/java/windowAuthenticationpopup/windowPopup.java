package windowAuthenticationpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this is different from browser popups
		
		WebDriver driver=new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/");
		//driver.findElement(By.linkText("Basic Auth")).click();
		driver.get("http://admin:admin@the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Basic Auth")).click();
	}

}
