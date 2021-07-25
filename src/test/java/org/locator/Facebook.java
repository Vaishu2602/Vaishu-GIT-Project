package org.locator;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook extends LibGlobal {
public Facebook() {
	PageFactory.initElements(driver, this);

}

@FindBy(id="email")
private WebElement user;

public WebElement getUser() {
	return user;
}

public WebElement getAuthen() {
	return authen;
}

public WebElement getBtn() {
	return btn;
}

@FindBy(id="pass")
private WebElement authen;

@FindBy(id="u_0_h_SE")
private WebElement btn;


}

