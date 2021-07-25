package org.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Ng {
	@Test
	private void pp() {
		// TODO Auto-generated method stub
System.out.println("Method");
	}
	@Parameters({"prabhu" , "shadow"})
	@Test
	private void vp(String S1, String s2) {
		// TODO Auto-generated method stub
System.out.println("Is");
System.out.println(S1);
System.out.println(s2);
	}
	@Test
	private void pv() {
		// TODO Auto-generated method stub
System.out.println("TestNg");

	}

}
