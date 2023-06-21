package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeliniumIntroduction {

	public static void main(String[] args) {
		
		//if you facing ConnectionFailedException use below code chromeOptions to overcome
		//after writing code and Just pass this 'ops' object to ChromeDriver() as argument
//		ChromeOptions ops = new ChromeOptions();
//		ops.addArguments("--remote-allow-origins=*");
//		WebDriver driver=new ChromeDriver(ops);
		
		System.setProperty("webdriver.chrome.driver", "D:\\Download\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		driver.quit();

	}

}
