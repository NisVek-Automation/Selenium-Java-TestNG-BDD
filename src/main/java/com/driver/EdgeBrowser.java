package com.driver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Represents a Edge Browser related activities, such as
 * 1. Create the Edge driver
 * 2. Set the project related settings for edge driver
 * @author Nisha Vekariya
 * @version 1.0
*/
public class EdgeBrowser extends BaseBrowser{
	
	/**
	 * This method helps to setup the Edge driver for Testing.
	 * @return driver -> It returns the Edge type WebDriver.
	 */
	@Override
	public WebDriver createDriver(){
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		return driver;
	}
}