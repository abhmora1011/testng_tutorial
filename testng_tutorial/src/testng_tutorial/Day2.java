package testng_tutorial;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

	@Test (timeOut = 4000) // it will not fail for 4 seconds if this is failing 
	public void print() {
		System.out.println("Hi I'm from day2");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is a Before Test");
	}
	
	
	
}
