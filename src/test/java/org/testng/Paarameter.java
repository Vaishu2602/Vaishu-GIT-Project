package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paarameter {
//@Parameters({"username"})
	//@org.testng.annotations.Test
	
	//private void para1(String s1) {
		//System.out.println("method 1");
		//System.out.println(s1);

	//}
@Parameters({"Username","password"})	
@Test
private void tc1(@Optional ("Vaishu")String s1,String s2) {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Desktop\\eclipse\\Mavenday\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	WebElement txtUser = driver.findElement(By.id("email"));
	txtUser.sendKeys(s1);
	WebElement txtPass = driver.findElement(By.id("pass"));
	txtPass.sendKeys(s2);
}
}
