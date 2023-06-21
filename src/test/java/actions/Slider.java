package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Download\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://demoqa.com/slider/");
        System.out.println("demoqa webpage Displayed");
        
        Actions actions = new Actions(driver);
        //Retrieve WebElemnt 'slider' to perform mouse hover 
    	WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));
    	//Move mouse to x offset 50 i.e. in horizontal direction
    	actions.moveToElement(slider,50,0).perform();
    	slider.click();
    	System.out.println("Moved slider in horizontal directions");
    	
	}

}
