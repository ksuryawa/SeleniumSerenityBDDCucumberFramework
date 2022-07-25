package com.ksuryawa.pages;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

/**
 * @author Kapil Suryawanshi
 * 25/07/2022
 */
public class ActiTimeHomePage extends UIInteractions {

	private static final By linkUser = By.xpath("//a[contains(@class,\"userProfileLink username\" )]");
	private static final By linkLogout = By.xpath("//a[contains(@class,\"logoutLink\" )]");
	private static final By logoActi = By.xpath("//*[@id='logo_aT']");

	@Step
	public void clickOnUser() {
		$(linkUser).click();
	}

	@Step
	public void clickOnLogout() {
		$(linkLogout).click();
	}

	@Step
	public void clickOnLogo() {
		$(logoActi).click();
	}

	@Step
	public String getPageTitle() {
		return $(logoActi).getText();
	}

	@Step
	public void verifyLogo() {
		$(logoActi).shouldBePresent();
	}



}