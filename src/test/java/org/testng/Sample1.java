package org.testng;

import org.testng.annotations.Test;

public class Sample1 {
	@Test
private void tc1() {
		System.out.println("Method 1");
		System.out.println("Sample test 1:"+ Thread.currentThread().getId());
	}
	@Test
	private void tc2() {
			System.out.println("Method 2");
			System.out.println("Sample test 1:"+ Thread.currentThread().getId());
		}
	@Test
	private void tc3() {
			System.out.println("Method 3");
			System.out.println("Sample test 1:"+ Thread.currentThread().getId());
		}
	@Test
	private void tc4() {
			System.out.println("Method 4");
			System.out.println("Sample test 1:"+ Thread.currentThread().getId());
		}
	
}
