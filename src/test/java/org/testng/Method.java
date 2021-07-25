package org.testng;

import org.testng.annotations.Test;

public class Method {
	@Test(groups="@sanity")
	private void tc1() {
		System.out.println("method1");
}
	@Test(groups="@reg",dependsOnGroups="@sanity")
	private void tc2() {
		System.out.println("method2");

	}
@Test(groups="@smoke",dependsOnMethods ="tc1")
private void tc3() {
	
System.out.println("method3");
}
@Test(groups="@sanity")
private void tc4() {
	
System.out.println("method4");
}
@Test(groups="@reg",dependsOnGroups="@sanity")
private void tc5() {
	
System.err.println("method5");
}
@Test(groups="@smoke")
private void tc6() {
	
System.out.println("method6");
}
	}


