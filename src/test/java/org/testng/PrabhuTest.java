package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrabhuTest {
	@BeforeClass
	private void beforeclass() {
		// TODO Auto-generated method stub
System.out.println("Prabhu");
	}
@BeforeMethod
private void beforemethod() {
	// TODO Auto-generated method stub
System.out.println("is");
}
@AfterMethod
private void aftermethod() {
	// TODO Auto-generated method stub
System.out.println("gamer");
}

@AfterClass
private void afterclass() {
	// TODO Auto-generated method stub
System.out.println("cricket");
}
@Test(priority=5)
private void test() {
	// TODO Auto-generated method stub
System.out.println("fielder");
}
@Test(priority=7)
private void test1() {
	// TODO Auto-generated method stub
System.out.println("cat");
}
@Test(priority=3,invocationCount=7)
private void test2() {
	// TODO Auto-generated method stub
System.out.println("dog");
}
@Test(priority=9,enabled=false)
private void test3() {
	// TODO Auto-generated method stub
System.out.println("parrot");
}
}

