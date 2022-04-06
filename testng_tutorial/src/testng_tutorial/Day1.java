package testng_tutorial;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Day1 {
	
	// @Test annotation is needed to trigger the TestNG

	@Test (enabled = false)
	public void demo() {
		System.out.println("Hello");
	}
	
	@Test (groups = "Smoke", priority = 2)
	public void demo2() {
		System.out.println("Abe");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is before every class is invoke");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This is after every class is invoke");
	}
}
