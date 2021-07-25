package org.testng;

import org.testng.annotations.DataProvider;

public class AmazonDataProvider {
	@DataProvider(name="Data")
	public static Object[][] Data() {
		
		return new Object[][] {
			{"redmi"},{"samsung"},{"realme"},{"Narzo"},{"Apple"},{"Vivo"},{"Oppo"},{"Nexus"},{"Moto"},{"Nokia"}
		};
		
		
		
	}
	

}
