package org.locator;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  FlipkartLogin extends LibGlobal {
	public  FlipkartLogin( ) {
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement textid;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement usrpwd;
	
	@FindBy(xpath="//Button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement login;

	public WebElement getTextid() {
		return textid;
	}

	public WebElement getUsrpwd() {
		return usrpwd;
	}

	public WebElement getLogin() {
		return login;
	}
}

