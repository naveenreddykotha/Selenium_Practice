package constructors;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ps {
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("1st execute this..");
	}
	
	public void dothis() {
		System.out.println("execute this");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("last execute this..");
	}
}
