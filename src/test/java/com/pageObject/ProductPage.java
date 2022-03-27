package com.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.driver.DriverManager;
import com.utils.Log;
import com.utils.SeleniumHelper;

/** 
 * Represents Product page - Page Object model.<br>
 * This class contains all necessary WebElements and related functionality.
 * @author Nisha Vekariya
 * @version 1.0
*/
public class ProductPage extends BasePage{
	
	//----------------------- Objects ------------------------
	@FindBy (xpath="//span[@class='title']") WebElement homePageTitle;
	@FindBy (className="shopping_cart_link") WebElement linkShoppingCart;
	@FindBy (id="add-to-cart-sauce-labs-backpack") WebElement btnAddToCartProductBackpack;
	@FindBy (id="react-burger-menu-btn") WebElement btnMenu;
	@FindBy (id="logout_sidebar_link") WebElement linkLogOut;
	
	//----------------------- Methods ------------------------
	
	/**
	 * This constructor method set the driver and PageFactory.
	 */
	public ProductPage(){
		PageFactory.initElements(DriverManager.getDriver(), this);
	}
	
	/**
	 * This method click on AddToCart button on product page.
	 */
	public void clickOnAddToCart(){
		SeleniumHelper.clickElement(btnAddToCartProductBackpack);
		Log.info("Click Add to cart button for backpack on product page.");
	}
	
	/**
	 * This method click on shopping cart on product page.
	 */
	public void clickOnShoppingCart(){
		SeleniumHelper.clickElement(linkShoppingCart);
		Log.info("Clicked shopping cart link on product page.");
	}
	
	/**
	 * This method perform the logout operation on product page.
	 */
	public void logoutFromApp(){
		SeleniumHelper.clickElement(btnMenu);
		SeleniumHelper.clickElement(linkLogOut);
		Log.info("Logout from the application successfully.");
	}
}
