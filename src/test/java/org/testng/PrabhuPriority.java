package org.testng;

import org.testng.annotations.Test;

public class PrabhuPriority {

	@Test(priority = 3)
	private void t1() {
		// TODO Auto-generated method stub
System.out.println("t1 = prabhu");
	}
	
	@Test(priority = -3)
	private void t2() {
		// TODO Auto-generated method stub
System.out.println("t2 = roger");
	}
	
	@Test(priority = 7)
	private void tc3() {
		// TODO Auto-generated method stub
System.out.println("t3 = dhoni");
	}
	
	@Test(priority = -5)
	private void tc4() {
		// TODO Auto-generated method stub
System.out.println("t4 = kholi");
	}
	
	@Test(priority = -1)
	private void tc5() {
		// TODO Auto-generated method stub
System.out.println("t5 = Msd");
	}
	
}
