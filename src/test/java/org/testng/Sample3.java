package org.testng;

import org.testng.annotations.Test;

public class Sample3 {
	@Test
private void tc31() {
		System.out.println("Method 31");
		System.out.println("Sample test 3:"+ Thread.currentThread().getId());
	}
	@Test
	private void tc32() {
			System.out.println("Method 32");
			System.out.println("Sample test 3:"+ Thread.currentThread().getId());
		}
	@Test
	private void tc33() {
			System.out.println("Method 33");
			System.out.println("Sample test 3:"+ Thread.currentThread().getId());
		}
	@Test
	private void tc34() {
			System.out.println("Method 34");
			System.out.println("Sample test 3:"+ Thread.currentThread().getId());
		}
	
}
