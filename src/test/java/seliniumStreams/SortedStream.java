package seliniumStreams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SortedStream {
	List<String>itemPrice;
	@Test
	public void stream1() {
		System.setProperty("webdriver.chrome.driver", "D:\\Download\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> elementsList= driver.findElements(By.xpath("//tr/td[1]"));
		List<String> originalList= elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String>sortedList= originalList.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(originalList.equals(sortedList));
		
		do {
			List<WebElement> row= driver.findElements(By.xpath("//tr/td[1]"));
			itemPrice= row.stream().filter(s->s.getText().contains("Rice"))
					.map(s->getPrice(s)).collect(Collectors.toList());
					//easy way to print all elemnts in list
					itemPrice.forEach(s->System.out.println(s));
			if(itemPrice.size()<1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
			
		}while(itemPrice.size()<1);
		
		
	}

	private String getPrice(WebElement s) {
		// TODO Auto-generated method stub
		String price=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}
	

}
