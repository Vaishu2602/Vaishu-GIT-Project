package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
@Parameters({"Prabhu"})
@Test
	private void tc1(String s1) {
		// TODO Auto-generated method stub
System.out.println("Method77");
System.out.println(s1);
	}
@Parameters({"username","password"})
@Test
private void tc2(String s1,String s2) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Desktop\\eclipse\\Mavenday\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	WebElement txtUser = driver.findElement(By.id("email"));
	txtUser.sendKeys(s1);
	WebElement txtPass = driver.findElement(By.id("pass"));
	txtPass.sendKeys(s2);
}
	
@Test
private void tc3() {
	// TODO Auto-generated method stub
System.out.println("Method99");
}
}
