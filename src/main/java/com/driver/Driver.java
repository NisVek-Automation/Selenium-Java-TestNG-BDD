package com.driver;

import org.openqa.selenium.WebDriver;
import com.utils.Log;
import com.utils.PropertyEnum;
import com.utils.PropertyHelper;

/** 
 * This class used for selecting browser type and open the URL activities.
 * @author Nisha Vekariya
 * @version 1.0
*/
public class Driver {
	
	/**
	 * Initialize the driver based on selected browser and open the url operation.
	 */
	public static void initialize() {
		if (DriverManager.getDriver() == null){
				new Driver();
		}
		Log.logInfo("Driver is initialized Successfully.");
	}
	
	/**
	 * Initialize the driver and open the url operation.
	 */
	private Driver() {
		selectDriverType();
		DriverManager.getDriver().manage().deleteAllCookies();
		DriverManager.getDriver().manage().window().maximize();
		Log.logInfo("Browser is opened and maximize successfully.");
	}
	
	public static String getUrl() {
		if(PropertyHelper.get(PropertyEnum.RUNMODE).equalsIgnoreCase("remote")) {
			return PropertyHelper.get(PropertyEnum.REMOTEURL).toString();
		}else {
			return PropertyHelper.get(PropertyEnum.URL).toString();
		}
	}

	/**
	 * Select the driver based on selected browser.
	 * @param browser -> browser name using that can create the driver.
	 */
	private void selectDriverType() {
		String browser = PropertyHelper.get(PropertyEnum.BROWSER).toString();
		WebDriver driver = null;
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeBrowser().createDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeBrowser().createDriver();
		}
		DriverManager.setWebDriver(driver);
		Log.logInfo("Driver is initialized with browser : " + browser);
	}

	/**
	 * Quit and close the driver and browser.
	 */
	public static void quit() {
		if (DriverManager.getDriver() != null) {
			DriverManager.getDriver().close();
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
		Log.logInfo("Browser is closed successfully.");
	}

}
