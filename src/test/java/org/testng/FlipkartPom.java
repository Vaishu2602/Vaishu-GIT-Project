package org.testng;

import org.locator.FlipkartLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FlipkartPom extends FlipkartLocators {
	WebDriver driver;
	@BeforeClass
	private void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Desktop\\eclipse\\Mavenday\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/account/login");
		driver.manage().window().maximize();
	
	}
	@AfterClass
	private void afterclass() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(7000);
driver.close();
	}
@Parameters({"user","pass"})
	@Test
	private void tc0(String s1,String s2) {
		// TODO Auto-generated method stub
FlipkartLocators f = new FlipkartLocators();;
WebElement userName = f.getUserName();
userName.sendKeys(s1);
	WebElement password = f.getPassword();
	password.sendKeys(s2);
	
	
	
	
//Assert.assertEquals(s1, "prabhuroger7@gmail.com");
//String attribute = pass.getAttribute("value");
//Assert.assertEquals(s2, attribute);
System.out.println("done");
	}
	
}
