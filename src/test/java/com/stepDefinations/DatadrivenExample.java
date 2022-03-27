package com.stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import com.driver.Driver;
import com.driver.DriverManager;
import com.pageObject.LoginPage;
import com.pageObject.ProductPage;


/** 
 * Represents DataDriven functionality using example.
 * This class collects login credentials from the feature file and
 * perform the datadriven testing.
 * @author Nisha Vekariya
 * @version 1.0
*/
public class DatadrivenExample {
	public LoginPage login = new LoginPage();
	public ProductPage proPage = new ProductPage();
	
	@Given("application url for login")
	public void application_url_for_login() {
		DriverManager.getDriver().get(Driver.getUrl());
	}
	
	@When("user enters {string} and {string}")
	public void user_enters_and(String userName, String userPsw) {
		login.enterUserName(userName);
		login.enterUserPassword(userPsw);
	    System.out.println("UserName : " + userName + " and User Password : " + userPsw);
	}

	@Then("submit the login form, Home page should be opened")
	public void submit_the_login_form_Home_page_should_be_opened() {
		login.clickLoginButton();
		proPage.isHomePageLogo();
	}
	
	@After("@SignIn-DataDriven")
    public void afterScenario(){
		//Logout from page
		proPage.logoutFromApp();
    }

}
