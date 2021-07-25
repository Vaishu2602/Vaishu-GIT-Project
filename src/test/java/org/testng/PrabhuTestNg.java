package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrabhuTestNg {
	@Test
	@BeforeClass
	private void classbefore() {
		// TODO Auto-generated method stub
System.out.println("method 1");
	}
	
	@Test
	@AfterClass
	private void classafter() {
		// TODO Auto-generated method stub
System.out.println("method 2");
	}
	
	@Test
	@BeforeMethod
	private void methodbefore() {
		// TODO Auto-generated method stub
System.out.println("method 3");
	}
	
	@Test
	@AfterMethod
	private void methodafter() {
		// TODO Auto-generated method stub
System.out.println("method 4");
	}

}
