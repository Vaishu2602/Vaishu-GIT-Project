package org.main;

import java.util.Date;

import org.base.LibGlobal;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.locator.FlipkartLogin;
import org.openqa.selenium.WebElement;

public class FlipkartLaunch extends LibGlobal {
	static LibGlobal global;
	@BeforeClass
	public static void beforeclass() {
	 global = new LibGlobal();
	global.getDriver("chrome");
global.launchUrl("https://www.flipkart.com/account/login");

}
	
 @Before
 public void before() {
	Date ddd = new Date();
	System.out.println(ddd);
}
 @After
 public void after() {
 Date eee = new Date();
 System.out.println(eee);
}
 @Test
 public void t1() throws InterruptedException {
	 FlipkartLogin fl = new FlipkartLogin();
	 WebElement textid = fl.getTextid();
	 global.passText(textid, "prabhuroger7@gmail.com");
	 WebElement usrpwd = fl.getUsrpwd();
	 global.passText(usrpwd, "Shadow777");
	 Thread.sleep(3000);
	 WebElement login = fl.getLogin();
	 global.btnClick(login);
	

}
}
