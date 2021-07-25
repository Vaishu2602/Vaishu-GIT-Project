package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider {
@Test(dataProvider="Mydata",dataProviderClass=SampleDataProv.class)
private void tc1(String s1,String s2) {
	//System.out.println("Method 1");
	//System.out.println(s1);
	//System.out.println(s2);

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Desktop\\eclipse\\Mavenday\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement txtUser = driver.findElement(By.id("email"));
	txtUser.sendKeys(s1);
	WebElement txtPass = driver.findElement(By.id("pass"));
	txtPass.sendKeys(s2);
}


//@org.testng.annotations.DataProvider(name="mytest")
//public Object[][] getData() {

//return new Object[][]
	//	{
	//{"hijava","welcomejava"},{"hipython","welcomepython"},{"hic++","welcomec++"}
		//};

//}
}
