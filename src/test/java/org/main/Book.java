package org.main;

import java.util.Date;

import org.base.LibGlobal;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.locator.Facebook;
import org.openqa.selenium.WebElement;

public class Book extends LibGlobal{
	static LibGlobal global;
	@BeforeClass
	public static void before() {
		// TODO Auto-generated method stub
 global = new LibGlobal();
global.getDriver("chrome");
global.launchUrl("https://www.facebook.com/");
	}
	
	@Before
	public void before1() {
		// TODO Auto-generated method stub
Date dd = new Date();
System.out.println(dd);
	}
	@After
	public void after1() {
		// TODO Auto-generated method stub
Date ddd = new Date();
System.out.println(ddd);
	}
	@Test
	public void test3() {
		// TODO Auto-generated method stub
	Facebook fb = new Facebook();
	WebElement user = fb.getUser();
	global.passText(user, "prabhuroger7@gmail.com");
	WebElement authen = fb.getAuthen();
	global.passText(authen, "praishu252677");
	WebElement btn = fb.getBtn();
	global.btnClick(btn);
	}
	}
