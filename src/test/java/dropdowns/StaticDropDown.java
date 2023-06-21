package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 
		 // in static dropdown the elements are fixed
		 //if you see select has tagname then it is static dropdown
		 //there is a class called select which we perform some method to select dropdown
		 WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		 Select dropdown=new Select(staticDropdown);
		 dropdown.selectByIndex(2);
		 System.out.println(dropdown.getFirstSelectedOption().getText());
		 dropdown.selectByValue("INR");
		 System.out.println(dropdown.getFirstSelectedOption().getText());
		 dropdown.selectByVisibleText("USD");
		 System.out.println(dropdown.getFirstSelectedOption().getText());
	}

}
