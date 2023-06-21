package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\Download\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
			
			
			//driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_originStation1']")).click();
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			driver.findElement(By.cssSelector("a[value='DEL']")).click(); 
			//driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_originStation1_CTXT'] //*[@value='DEL']")).click();
			//not working
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//option[@value='PNQ'][2]")).click();
			driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
			//by not using indexing like above
			//here we using parent child relationship xpath
			driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
			Thread.sleep(2000);
			//calender date choosing sample
			//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
			driver.findElement(By.xpath("//a[contains(text(),'30')]")).click();
			
			//radio-buttons
//			System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).isEnabled());
//			driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
			System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
			driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
			System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
			if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
				System.out.println("its enabled");
				Assert.assertTrue(true);
				
			}
			else {
				Assert.assertTrue(false);
			}
			driver.quit();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
