package testng_tutorial;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	
	@Parameters({"URL","Name"}) // to use parameterization
	@Test
	public void webLogin(String url, String name) // Declare parameter to catch the URL value
	{
		System.out.println("Web " + url + " " + name);
	}
	
	@Test
	public void webLoginHome() {
		System.out.println("WebHome");
	}
	
	@Test (dataProvider = "getData")
	public void mobileLoginHome(String user, String pass) {
		System.out.println("MobileHome");
		System.out.println(user + " " + pass);
	}
	
	@Test
	public void sampleListener() {
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void mobileLoginHome2() {
		System.out.println("MobileHome");
	}
	
	@Test (groups = "Smoke")
	public void mobileLoginHome3() {
		System.out.println("MobileHome");
	}
	
	@BeforeMethod 
	public void beforeMethod() {
		System.out.println("This is a Before Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is a After Method");
	}
	
	@Test
	public void apiLoginHome() {
		System.out.println("APIHome");
	}
	
	
	@AfterTest
	public void afterTest() {
		System.out.println("This is a After Test");
	}
	
	@DataProvider () // To feed the test with multiple sets of data (declaring test once but run multiple times
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		
		data[0][0] = "username";
		data[0][1] = "password";
		
		data[1][0] = "username2";
		data[1][1] = "password2";
		
		data[2][0] = "username3";
		data[2][1] = "password3";
		
		return data;
	}
	
}
