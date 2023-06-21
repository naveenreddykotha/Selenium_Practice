package handling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
		// Open new window by clicking the button
        driver.findElement(By.id("windowButton")).click();
        
        // Click on the new window element and read the text displayed on the window
        //WebElement text = driver.findElement(By.id("sampleHeading"));
        // Fetching the text using method and printing it     
        //System.out.println("Element found using text: " + text.getText());
        //driver.quit();
//the above code will get error because we didn't handling child window now we handle below code
        
        String mainWindow=driver.getWindowHandle();
        System.out.println(mainWindow);
         Set<String> allWindowHandles= driver.getWindowHandles();
         System.out.println(allWindowHandles);
         Iterator<String> it=allWindowHandles.iterator();
         while(it.hasNext()) {
        	 String childWindow=it.next();
        	 System.out.println(childWindow);
        	 if(!mainWindow.equalsIgnoreCase(childWindow)) {
        		 driver.switchTo().window(childWindow);
        		 WebElement text = driver.findElement(By.id("sampleHeading"));
                 System.out.println("Heading of child window is " + text.getText());
        	 }
         }
	}

}
