package org.testng;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AmazonProducts {
	WebDriver driver;
@BeforeClass
private void beforeClass() {
	// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\eclipse\\Mavenday\\Driver\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
}
@AfterClass
private void afterClass() throws InterruptedException {
	// TODO Auto-generated method stub
Thread.sleep(3000);
driver.close();
}
@Parameters({"search"})
@Test
private void tc0(String s1) {
	// TODO Auto-generated method stub
WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
search.sendKeys(s1);
WebElement lens = driver.findElement(By.id("nav-search-submit-button"));
lens.click();

}

@Test
private void tc1() {
	// TODO Auto-generated method stub
List<WebElement> iphone = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
//Set<WebElement> tSet=new TreeSet<WebElement>();
//boolean addAll = tSet.addAll(price);
//System.out.println(tSet);
//for (WebElement x : tSet) {
//	System.out.println(x.getText());
//}
int size = iphone.size();
System.out.println("Total products:" + size);
for (int i = 0; i < size; i++) {
	
	WebElement pro = iphone.get(i);
	String text = pro.getText();
	WebElement cost = price.get(i);
	String text2 = cost.getText();
	System.out.println(text + "-" + text2);	
}
}

}
