package seliniumStreams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Searchfilter {
	@Test
	public void stream2() {
		System.setProperty("webdriver.chrome.driver", "D:\\Download\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys("Rice");
		List<WebElement> allRows= driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement>matchrows= allRows.stream().filter(item->item.getText().contains("Rice")).collect(Collectors.toList());
		
		Assert.assertEquals(allRows.size(), matchrows.size());
		driver.close();
	}

}
