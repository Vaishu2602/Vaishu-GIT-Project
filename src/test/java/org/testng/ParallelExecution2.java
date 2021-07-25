package org.testng;

import org.testng.annotations.Test;

public class ParallelExecution2 {
	@Test
	private void method5() {
		System.out.println("Name 5 in meth0d 5 " + Thread.currentThread().getId());
	}
	
	@Test
	private void method6() {
		// TODO Auto-generated method stub
System.out.println("Name 6 in method 6 " + Thread.currentThread().getId());
	}
	
	@Test
	private void method7() {
		// TODO Auto-generated method stub
System.out.println("Name 7 in meth0d 7 " + Thread.currentThread().getId());
	}
	
	@Test
	private void method8() {
		// TODO Auto-generated method stub
System.out.println("Name 8 in meth0d 8 " + Thread.currentThread().getId());
	}
	

}
