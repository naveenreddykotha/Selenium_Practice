package stepdefinations;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefination {
//	String username;
//	String password;
	ArrayList<String> username=new ArrayList();
	ArrayList<String> password=new ArrayList();
	WebDriver driver;
	String text;
	String error_text;
	static int i=0;
	static {
		System.out.println(i);
	}
	
	@Given("JDBC connection through {string} and {string}")
	public void jdbc_connection_through_and(String db_username, String db_password) throws ClassNotFoundException, SQLException {
Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logindetails",db_username,db_password);
		//once you have a connection to the database,you can create a statenment object to execute sql commands
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from credentails");
		while(rs.next()) {
//			username=rs.getString(1);
//			password=rs.getString(2);
			username.add(rs.getString(1));
			password.add(rs.getString(2));
			//System.out.println(rs.getString(1));
			//System.out.println(rs.getString(2));
			
		}
		con.close();
		System.out.println(username);
		System.out.println(password);
		
	}
	@When("retrieve the data from db and login to website")
	public void retrieve_the_data_from_db_and_login_to_website() throws InterruptedException {
	    
        driver=new ChromeDriver();
        System.out.println(i);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(username.get(i));
		driver.findElement(By.name("inputPassword")).sendKeys(password.get(i));
		i += 1;
		System.out.println(i);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
//		text= driver.findElement(By.tagName("p")).getText();
//		System.out.println(text);
////		assertEquals(text,"You are successfully logged in.");
//		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
//		driver.close();
	}
	@Then("I validate the login sucessfull")
	public void i_validate_the_login_sucessfull() {
		
		//assertEquals(text,"You are successfully logged in.");
		text= driver.findElement(By.tagName("p")).getText();
		System.out.println(text);
		assertEquals(text,"You are successfully logged in.");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.close();
	}
	
	@Then("I validate the login was unsuccessfull")
	public void i_validate_the_login_was_unsuccessfull() {
		error_text=driver.findElement(By.className("error")).getText();
		System.out.println(error_text);
		assertEquals(error_text,"* Incorrect username or password");
		
		driver.close();
	}
	
	

}
