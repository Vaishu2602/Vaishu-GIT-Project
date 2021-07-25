package org.main;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;

public class NewClass extends BaseClass {
public static void main(String[] args) throws InterruptedException {
	
	BaseClass b = new BaseClass();
	b.Browser("chrome");
	b.launchurl("https://en-gb.facebook.com/");
	Thread.sleep(3000);
WebElement btn = b.locators("xpath", "//a[text()='Create New Account']");
b.btn(btn);
	WebElement fname = b.locators("xpath", "//input[@name='firstname']");
	b.Typetext(fname, "prabhu");
	WebElement day = b.locators("id", "day");
	b.Drop(day, "visible text", "11");
	WebElement mon = b.locators("id", "month");
	b.Drop(mon, "Visible text", "Apr");
}
}
