package org.locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLocators{
WebDriver driver;
	public FlipkartLocators() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement userName;
	
	
	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	private WebElement password;
	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getUserName() {
		return userName;
	}


	public WebElement getPassword() {
		return password;
	}
	
	
}
