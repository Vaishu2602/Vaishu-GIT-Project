package org.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertSample {
	@Test
	private void assertone()
	{
		String p = ("testNG");
		SoftAssert s = new SoftAssert();
		s.assertEquals(p, "TESTNG");
		s.assertAll();
		System.out.println(p);
	}

}
