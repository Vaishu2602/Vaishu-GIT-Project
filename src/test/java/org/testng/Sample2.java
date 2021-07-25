package org.testng;

import org.testng.annotations.Test;

public class Sample2 {
	@Test
private void tc21() {
		System.out.println("Method 21");
		System.out.println("Sample test 2:"+ Thread.currentThread().getId());
	}
	@Test
	private void tc22() {
			System.out.println("Method 22");
			System.out.println("Sample test 2:"+ Thread.currentThread().getId());
		}
	@Test
	private void tc23() {
			System.out.println("Method 23");
			System.out.println("Sample test 2:"+ Thread.currentThread().getId());
		}
	@Test
	private void tc24() {
			System.out.println("Method 24");
			System.out.println("Sample test 2:"+ Thread.currentThread().getId());
		}
	
}
