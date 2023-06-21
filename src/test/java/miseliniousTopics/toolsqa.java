package miseliniousTopics;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toolsqa {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Download\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		//https://demoqa.com/links
		driver.manage().window().maximize();
	    driver.get("https://demoqa.com/broken");
	    String url;
	    List<WebElement>allLinks= driver.findElements(By.tagName("a"));
	    System.out.println("Total link count: "+allLinks.size());
	    
//	    Iterator<WebElement> it= allLinks.iterator();
//	    while(it.hasNext()) {
//	    	WebElement links=it.next();
//	    	//url=it.next().getText();
//	    	//System.out.println(url);
//	    	verifyurls(links);
//	    }
	    
	    for(int i=0;i<allLinks.size();i++)
        {
            WebElement E1= allLinks.get(i);
            url= E1.getAttribute("href");
            verifyurls(url);
        }
	    driver.close();
	    
	}

	private static void verifyurls(String url2) {
		// TODO Auto-generated method stub
		try {
			
			URL url = new URL(url2);
			
			HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
			httpURLConnect.setRequestMethod("GET");
            //httpURLConnect.setConnectTimeout(5000);
            httpURLConnect.connect();
            
            System.out.println(httpURLConnect.getResponseCode());
            
            if(httpURLConnect.getResponseCode()>=400)
            {
            	System.out.println(url2+" - "+httpURLConnect.getResponseMessage()+"is a broken link");
            }    
            else{
                System.out.println(url2+" - "+httpURLConnect.getResponseMessage());
            }
		}
		catch(Exception e) {
			
		}
		
		
	}
	
	

}
