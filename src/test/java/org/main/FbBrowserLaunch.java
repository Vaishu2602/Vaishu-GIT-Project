package org.main;

import java.util.Date;

import org.base.LibGlobal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.locator.FbLoginPage;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class FbBrowserLaunch extends LibGlobal {
	static LibGlobal global;
	@BeforeClass
	public static void beforeClass() throws InterruptedException {
		global = new LibGlobal();
		global.getDriver("chrome");
		global.launchUrl("https://en-gb.facebook.com/");
		Thread.sleep(5000);

	}
	//@AfterClass
	//public static void afterClass() {
	//	driver.close();

	//}
	
	
	@Before
	public void before() {
		Date date = new Date();
		System.out.println(date);

	}
	
	
	@After
	public void after() {
		Date date = new Date();
		System.out.println(date);

	}
	
	
	@Test
	public void tc0() throws InterruptedException {
	FbLoginPage page = new FbLoginPage();
	WebElement txtUsername = page.getTxtUsername();
	global.passText(txtUsername, "Vaishnavi.krishnan@ymail.com");
	
	WebElement txtPassword = page.getTxtPassword();
global.passText(txtPassword, "260295");
Thread.sleep(2000);
WebElement btnClick = page.getBtnClick();
global.btnClick(btnClick);
Thread.sleep(2000);

	}
}
