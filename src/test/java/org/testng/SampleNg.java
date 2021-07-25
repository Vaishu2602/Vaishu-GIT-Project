package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleNg {

	@BeforeClass
	private void beforeClass() {
		// TODO Auto-generated method stub
System.out.println("Before Class Method");
	}
	@AfterClass
	private void afterClass() {
		// TODO Auto-generated method stub
System.out.println("After Class Method");
	}
	
	@BeforeMethod
	private void beforeMethod() {
		// TODO Auto-generated method stub
System.out.println("Before Method");

	}
	@AfterMethod
	private void afterMethod() {
		// TODO Auto-generated method stub
System.out.println("After Method");
	}
	@Test
	private void test() {
		// TODO Auto-generated method stub
System.out.println("Test Started");
	}
	
	
}
