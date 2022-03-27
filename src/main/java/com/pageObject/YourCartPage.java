package com.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.driver.DriverManager;

/** 
 * Represents Product page - YourCartPage.<br>
 * This class contains all necessary WebElements and related functionality.
 * @author Nisha Vekariya
 * @version 1.0
*/
public class YourCartPage extends BasePage{
	
	//---------- Objects-------------------
	@FindBy (xpath="//span[@class='title']") WebElement homePageTitle;
	
	//------------Methods------------------
	
	/**
	 * This constructer method set the driver and PageFactory.
	 * @param driver -> WebDriver object
	 */
	YourCartPage(){
		PageFactory.initElements(DriverManager.getDriver(), this);
	}
	
	
}
