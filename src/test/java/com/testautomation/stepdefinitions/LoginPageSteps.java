package com.testautomation.stepdefinitions;

import com.testautomation.factory.DriverFactory;
import com.testautomation.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	private LoginPage login = new LoginPage(DriverFactory.getDriver());
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
	    
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String string) {
	    
	}

	@Then("forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() {
	    
	}

	@When("user enters username {string}")
	public void user_enters_username(String string) {
	    
	}

	@When("user enters password {string}")
	public void user_enters_password(String string) {
	    
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
	    
	}

	@Then("user gets the title of the home page")
	public void user_gets_the_title_of_the_home_page() {
	    
	}

}
