package org.testng;

import org.testng.annotations.Test;

public class PriorityTest {

	@Test(priority=7)
	private void tc0() {
		// TODO Auto-generated method stub
System.out.println("Test 0");
	}
	@Test(priority=-4)
	private void tc1() {
		// TODO Auto-generated method stub
System.out.println("Test 1");
	}
	@Test(priority=5,invocationCount=5)
	private void tc2() {
		// TODO Auto-generated method stub
System.out.println("Test 2");
	}
	@Test(priority=-10,enabled=false)
	private void tc3() {
		// TODO Auto-generated method stub
System.out.println("Test 3");
	}
	@Test(priority=3)
	private void tc4() {
		// TODO Auto-generated method stub
System.out.println("Test 4");
	}
	@Test(priority=9)
	private void tc5() {
		// TODO Auto-generated method stub
System.out.println("Test 5");
	}
}
