package com.pageObject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.driver.DriverManager;
import com.utils.SeleniumHelper;

/** 
 * Represents a super class, which contains common elements and functionality in the application.
 * @author Nisha Vekariya
 * @version 1.0
*/
public class BasePage {
	
	//----------------------- Objects ------------------------
	@FindBy (className="app_logo") WebElement homePageLogo;
	
	
	//----------------------- Methods ------------------------
	protected BasePage(){
		PageFactory.initElements(DriverManager.getDriver(), this);
	}
	
	/**
	 * This method verify the logo on product page.
	 */
	public boolean isHomePageLogo(){
		return SeleniumHelper.isElementDisplayed(homePageLogo);
	}
}
