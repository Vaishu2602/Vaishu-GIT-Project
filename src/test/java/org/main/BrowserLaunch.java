package org.main;

import org.base.LibGlobal;
import org.locator.AdactinLoginPage;
import org.openqa.selenium.WebElement;

public class BrowserLaunch extends LibGlobal{
	public static void main(String[] args) {
		LibGlobal global = new LibGlobal();
		global.getDriver("chrome");
		global.launchUrl("https://adactinhotelapp.com/");
		AdactinLoginPage page = new AdactinLoginPage();
		WebElement txtUserName = page.getTxtUserName();
		global.passText(txtUserName, "Vaish123");
		WebElement txtPassword = page.getTxtPassword();
		global.passText(txtPassword, "redmi123");
		WebElement btnClick = page.getBtnClick();
		global.btnClick(btnClick);
		
	}
	
	
	
	
}
