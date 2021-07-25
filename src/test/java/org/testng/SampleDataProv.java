package org.testng;

import org.testng.annotations.DataProvider;

public class SampleDataProv {
	@DataProvider(name="Mydata")
	public static Object[][] getData() {
		// TODO Auto-generated method stub
return new Object[][] {
	{"facebook","welcomefb"},{"instagram","welcomeinsta"},{"twitter","welcometwitter"}
};
	}

}
