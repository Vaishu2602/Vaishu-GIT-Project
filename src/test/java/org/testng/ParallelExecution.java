package org.testng;

import org.testng.annotations.Test;

public class ParallelExecution {
	@Test
	private void method1() {
		System.out.println("Name 1 in meth0d 1" + Thread.currentThread().getId());
	}
	
	@Test
	private void method2() {
		// TODO Auto-generated method stub
System.out.println("Name 2 in method 2" + Thread.currentThread().getId());
	}
	
	@Test
	private void method3() {
		// TODO Auto-generated method stub
System.out.println("Name 3 in meth0d 3" + Thread.currentThread().getId());
	}
	
	@Test
	private void method4() {
		// TODO Auto-generated method stub
System.out.println("Name 4 in meth0d 4" + Thread.currentThread().getId());
	}
	
  
}
