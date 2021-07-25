package junit;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	static WebDriver driver;
@BeforeClass
public static void beforeClass() {
	// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Desktop\\eclipse\\Mavenday\\Driver\\chromedriver.exe");
 driver = new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();
}

@AfterClass
public static void afterClass() {
	// TODO Auto-generated method stub
driver.close();
}
	
	@Before
	public void before() {
		// TODO Auto-generated method stub
Date date = new Date();
System.out.println(date);

	}
	
	@After
	public void after() {
		// TODO Auto-generated method stub
Date date = new Date();
System.out.println(date);
	}
	
	@Test
	public void test0() {
		// TODO Auto-generated method stub
WebElement findElement = driver.findElement(By.id("email"));
findElement.sendKeys("vaish");
	}
}
