package org.suite;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


public class Prabhu2 {
	@Test
	public void suite11() {
		System.out.println("practise 11");
	}
	@org.junit.Test
	public void suite12() {
		System.out.println("practise 12");
	}
	@org.junit.Test
	public void suite13() {
		Assert.assertTrue(false);
		System.out.println("practise 13");
	}
	@org.junit.Test
	public void suite14() {
		System.out.println("practise 14");
	}
	@org.junit.Test
	@Ignore
	public void suite15() {
		System.out.println("practise 15");
	}
	@org.junit.Test
	public void suite16() {
		System.out.println("practise 16");
	}
}
