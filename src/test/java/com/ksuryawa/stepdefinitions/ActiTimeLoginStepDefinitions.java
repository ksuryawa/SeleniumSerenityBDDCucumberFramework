package com.ksuryawa.stepdefinitions;

import com.ksuryawa.pages.ActiTimeHomePage;
import com.ksuryawa.pages.ActiTimeLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * @author Kapil Suryawanshi
 * 25/07/2022
 */
public class ActiTimeLoginStepDefinitions {

	@Steps
	ActiTimeLoginPage loginPage;

	@Steps
	ActiTimeHomePage homePage;

	@Given("I am on the ActiTime login page")
	public void i_am_on_the_acti_time_login_page() {
		loginPage.open();
	}
	@When("I enter {string} into the username field")
	public void i_enter_into_the_username_field(String userName) {

		loginPage.enterUserName(userName);
	}
	@When("I enter {string} into the password field")
	public void i_enter_into_the_password_field(String password) {
		loginPage.enterPassword(password);
	}
	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		loginPage.clickOnLoginButton();
	}
	@Then("I should be logged in to ActiTime application")
	public void i_should_be_logged_in_to_acti_time_application() {
		homePage.verifyLogo();
	}


	@When("I login as a {string}")
	public void iLoginAsA(String role) {
	loginPage.loginToApplication(role);

	}
}