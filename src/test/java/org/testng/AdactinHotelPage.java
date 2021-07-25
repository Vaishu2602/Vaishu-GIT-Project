package org.testng;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AdactinHotelPage {
	WebDriver driver ;
@BeforeClass
private void browserLaunch() {
	// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Desktop\\eclipse\\Mavenday\\Driver\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://adactinhotelapp.com/");
driver.manage().window().maximize();
}
@AfterClass
private void BrowserClose() {
	// TODO Auto-generated method stub
driver.close();
}
@Parameters({"username","password"})
@Test
private void page1(String s1,String s2) throws InterruptedException {
	WebElement txtUser = driver.findElement(By.id("username"));
	txtUser.sendKeys(s1);
	WebElement txtPass = driver.findElement(By.id("password"));
	txtPass.sendKeys(s2);
	WebElement btn = driver.findElement(By.id("login"));
	btn.click();
	Thread.sleep(3000);
}

@Test
private void page2() {
	WebElement location = driver.findElement(By.id("location"));
	Select s = new Select(location);
	s.selectByVisibleText("London");
	WebElement hotel = driver.findElement(By.id("hotels"));
	Select v = new Select(hotel);
	v.selectByVisibleText("Hotel Sunshine");
	WebElement room = driver.findElement(By.id("room_type"));
	Select r = new Select(room);
	r.selectByVisibleText("Double");
	WebElement no = driver.findElement(By.id("room_nos"));
	Select n = new Select(no);
	n.selectByVisibleText("7 - Seven");
	WebElement adult = driver.findElement(By.id("adult_room"));
	Select a = new Select(adult);
	a.selectByVisibleText("2 - Two");
	WebElement child = driver.findElement(By.id("child_room"));
	Select c = new Select(child);
	c.selectByVisibleText("0 - None");
	WebElement btn2 = driver.findElement(By.id("Submit"));
	btn2.click();
}

@Test
private void page3() throws InterruptedException {
	// TODO Auto-generated method stub
WebElement radiobtn = driver.findElement(By.id("radiobutton_0"));
radiobtn.click();
WebElement btncontinue = driver.findElement(By.id("continue"));
btncontinue.click();
Thread.sleep(3000);
}

@Parameters({"firstname","lastname","address","ccno","cvvno"})
@Test
private void page4(String s1,String s2,String s3,String s4,String s5) throws InterruptedException {
	// TODO Auto-generated method stub
WebElement fName = driver.findElement(By.id("first_name"));
fName.sendKeys(s1);
WebElement lname = driver.findElement(By.id("last_name"));
lname.sendKeys(s2);
WebElement address = driver.findElement(By.id("address"));
address.sendKeys(s3);
WebElement creditcard = driver.findElement(By.id("cc_num"));
creditcard.sendKeys(s4);
WebElement cctype = driver.findElement(By.id("cc_type"));
Select ss = new Select(cctype);
ss.selectByVisibleText("American Express");
WebElement expmon = driver.findElement(By.id("cc_exp_month"));
Select e = new Select(expmon);
e.selectByVisibleText("February");
WebElement expyear = driver.findElement(By.id("cc_exp_year"));
Select ey=new Select(expyear);
ey.selectByVisibleText("2022");
WebElement cvv = driver.findElement(By.id("cc_cvv"));
cvv.sendKeys(s5);
WebElement book = driver.findElement(By.id("book_now"));
book.click();
Thread.sleep(5000);


}
@Test
private void page5() throws InterruptedException {
	// TODO Auto-generated method stub
WebElement orderno = driver.findElement(By.id("order_no"));
String ono = orderno.getAttribute("value");
System.out.println(ono);
Thread.sleep(3000);
}
}
