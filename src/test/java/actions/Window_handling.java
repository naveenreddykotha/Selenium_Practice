package actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handling {
	static String emailId;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		String parentId=driver.getWindowHandle();
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String>windows= driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		while(it.hasNext()) {
			String childId=it.next();
			if(!parentId.equalsIgnoreCase(childId)) {
				driver.switchTo().window(childId);
				emailId=driver.findElement(By.cssSelector(".im-para.red")).getText().split(" ")[4];
				System.out.println(emailId);
			}
		}
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(emailId);

	}

}
