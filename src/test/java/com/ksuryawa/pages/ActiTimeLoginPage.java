package com.ksuryawa.pages;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

/**
 * @author Kapil Suryawanshi
 * 25/07/2022
 */
public class ActiTimeLoginPage extends UIInteractions {

	private static final By inputUserName = By.id("username");
	private static final By inputPassword = By.xpath("//input[@name='pwd']");
	private static final By buttonLogin = By.id("loginButton");

	@Step
	public void enterUserName(String userName) {
		$(inputUserName).sendKeys(userName);
	}

	@Step
	public void enterPassword(String password) {
		$(inputPassword).click();
		$(inputPassword).sendKeys(password);
	}

	@Step
	public void clickOnLoginButton() {
		$(buttonLogin).click();
	}



}