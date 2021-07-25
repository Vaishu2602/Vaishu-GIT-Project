package org.testng;

import org.testng.annotations.Test;

public class Grouping2 {
	@Test(groups="@smoke")
	private void tc1() {
		//Assert.assertTrue(false);
		System.out.println("Java");
	}
@Test(groups="@sanity")
private void tc2() {
	System.out.println("Phython");
}
@Test(groups="@reg",dependsOnMethods="tc1")
private void tc3() {
	System.out.println("Selenium");
}
@Test(groups="@smoke")
private void tc4() {
	System.out.println("Hadoop");
}
@Test(groups="@sanity")
private void tc5() {
	System.out.println("Visual");
}
@Test(groups="@reg",dependsOnGroups="@smoke",alwaysRun=true)
private void tc6() {
	System.out.println("Studio");
	}
@Test(groups="@smoke")
private void tc7() {
	System.out.println("Hadoop2");
}
@Test(groups="@reg",dependsOnGroups="@smoke")
private void tc8() {
	System.out.println("Studio2");
	}
}
