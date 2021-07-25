package org.main;

import java.util.Date;

import org.base.LibGlobal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.locator.AdactinLoginPage;
import org.locator.AdactinSearchPage;
import org.openqa.selenium.WebElement;

public class AdactinBrowserLaunch extends LibGlobal{
	static	LibGlobal global;
	@BeforeClass

	public static void beforeClass() throws InterruptedException {
		
		global = new LibGlobal();
		global.getDriver("chrome");
		global.launchUrl("https://adactinhotelapp.com/");
		Thread.sleep(7000);
	}
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


		AdactinLoginPage page = new AdactinLoginPage();
		WebElement txtUserName = page.getTxtUserName();
		
		global.passText(txtUserName, "Vaish123");
		WebElement txtPassword = page.getTxtPassword();
		global.passText(txtPassword, "redmi123");
		
		WebElement btnClick = page.getBtnClick();
		global.btnClick(btnClick);
	}
	
	@Test
	public void tc1() {
	AdactinSearchPage p2 = new AdactinSearchPage();
	WebElement location = p2.getLocation();
	global.selectByDropdown(location, "visibletext", "Sydney");		

	}
	
	@AfterClass
	public static void afterClass() {
		driver.close();

	}
	
	
	
	
	
	
	
	
	
	
	
}
