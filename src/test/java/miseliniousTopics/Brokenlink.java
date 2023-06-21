package miseliniousTopics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Brokenlink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Download\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links= driver.findElements(By.cssSelector("li[class=gf-li] a"));
		SoftAssert a=new SoftAssert();
		for(WebElement link:links) {
			String url= link.getAttribute("href");
			HttpURLConnection conn= (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int rescode=conn.getResponseCode();
			String text= link.getText();
			//System.out.println(text);
			//System.out.println(rescode);
//			if(rescode>400) {
//				String text= link.getText();
//				System.out.println("The broken link is"+text+"the status code is"+rescode);
//				Assert.assertTrue(false); //hard assertion
//				//this will stops the execution immediately
//				//you want that test could not stop even it fails assertion there is soft assertion in testng
//				
//			}
			if(rescode>400) {
				System.out.println(text);
			}
			a.assertTrue(rescode<400,"The broken link is\""+text+"\"the status code is\""+rescode+"\"");
		}
		a.assertAll();

	}

}
