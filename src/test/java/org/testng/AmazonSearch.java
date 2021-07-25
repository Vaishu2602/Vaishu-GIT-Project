package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonSearch {
	@Test(dataProvider="Data",dataProviderClass=AmazonDataProvider.class)
	private void tc(String s1) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Desktop\\eclipse\\Mavenday\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/");
WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
search.sendKeys(s1);
WebElement lens = driver.findElement(By.id("nav-search-submit-button"));
lens.click();
	}

}
