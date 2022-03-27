package com.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.driver.DriverManager;
import com.reports.Log;
import com.utils.SeleniumHelper;

/** 
 * Represents Login page - Page Object model.
 * This class contains all necessary WebElements and related functionality for the Login page.
 * @author Nisha Vekariya
 * @version 1.0
*/
public class LoginPage extends BasePage{
	
	//----------------------- Objects ------------------------
	@FindBy (id="user-name") WebElement txtUserName;
	@FindBy(id="password") WebElement txtUserPsw;
	@FindBy(id="login-button") WebElement btnLogin;
	
	
	//----------------------- Methods ------------------------
	
	/**
	 * This constructer method set the driver and PageFactory
	 */
	public LoginPage(){
		PageFactory.initElements(DriverManager.getDriver(), this);
	}
	
	/**
	 * This method enters the userName.
	 * @param searchElement -> String which wanted to search from the Home page.
	 */
	public void enterUserName(String userName){
		SeleniumHelper.enterText(txtUserName, userName);
		Log.logInfo("Enter the UserName on Login page : " + userName);
	}
	
	/**
	 * This method enters the login password.
	 * @param searchElement -> String which wanted to search from the Home page.
	 */
	public void enterUserPassword(String userPsw){
		SeleniumHelper.enterText(txtUserPsw, userPsw);
		Log.logInfo("Enter the password on Login page : " + userPsw);
	}
	
	/**
	 * This method perform click operation on login button.
	 * @param searchElement -> String which wanted to search from the Home page.
	 */
	public void clickLoginButton(){
		SeleniumHelper.clickElement(btnLogin);
		Log.logInfo("Login button is clicked.");
	}
	
	/**
	 * This method perform the login process 
	 * @param searchElement -> String which wanted to search from the Home page.
	 */
	public void loginProcess(String userName, String userPsw){
		SeleniumHelper.clearText(txtUserName);
		SeleniumHelper.enterText(txtUserName, userName);
		SeleniumHelper.clearText(txtUserPsw);
		SeleniumHelper.enterText(txtUserPsw, userPsw);
		SeleniumHelper.clickElement(btnLogin);
	}
}
