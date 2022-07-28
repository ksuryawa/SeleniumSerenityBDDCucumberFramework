package com.ksuryawa.pages;

import constants.FrameworkConstants;
import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.openqa.selenium.By;
import utils.DecodeUtils;
import utils.JsonUtils;

/**
 * @author Kapil Suryawanshi
 * 25/07/2022
 */
@UseTestDataFrom(value = "src/test/resources/testdata/testdata.csv", separator = ',')
public class ActiTimeLoginPage extends UIInteractions {

	private static final By inputUserName = By.id("username");
	private static final By inputPassword = By.xpath("//input[@name='pwd']");
	private static final By buttonLogin = By.id("loginButton");

	private String userName;
	private String password;

	@Step
	public void enterUserName(String userName) {
		getUserName();
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

	@Qualifier
	public void getUserName() {
		System.out.println(userName + " => " + password);
	}

	public void loginToApplication(String role) {
	String jsonFileName= role + ".json";

		enterUserName(JsonUtils.readJson
				(FrameworkConstants.getTestDataDirPath()
						+jsonFileName, "userName"));
		enterPassword(DecodeUtils.getDecodedString(
				JsonUtils.readJson
				(FrameworkConstants.getTestDataDirPath()
						+jsonFileName, "password")));
		clickOnLoginButton();
	}
}