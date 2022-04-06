package testng_tutorial;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	// The sequence will be alphabetical if not declare a priorotization
	
	@Parameters({"URL","Name"}) // to use parameterization
	@Test
	public void webLogin(String url, String name) // Declare parameter to catch the URL value
	{
		System.out.println("Web " + url + " " + name);
	}
	
	@Test (dependsOnMethods = "webLogin")
	public void sampleListener() {
		Assert.assertEquals(true, false);
	}
	
	@Test(dependsOnMethods = "webLogin" )
	public void mobileLogin() {
		System.out.println("Mobile");
	}
	
	@Test (dependsOnMethods = "mobileLogin")
	public void mobileLogin2() {
		System.out.println("Mobile2");
	}
	
	@Test (dependsOnMethods = "mobileLogin2")
	public void mobileLogin3() {
		System.out.println("Mobile3");
	}
	
	@Test (groups = "Smoke")
	public void apiLogin() {
		System.out.println("API");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is a Before Suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("This is a After Suite");
	}
	
}
