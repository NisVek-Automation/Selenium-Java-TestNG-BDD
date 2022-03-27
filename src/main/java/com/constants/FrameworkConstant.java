package com.constants;

import java.io.File;
import java.time.Duration;
import java.util.Random;

import com.utils.CommonFunctionsHelper;

/** 
 * Represents Project specific constant values.
 * @author Nisha Vekariya
 * @author https://github.com/NisVek-Automation
 * @version 1.0
*/
public class FrameworkConstant {

	// Project root directory
	public static final String projectPath = System.getProperty("user.dir");
	public static final String screenShotPath = projectPath + File.separator + "screenShots" + File.separator;
	public static final String propertyFileName = "config.properties";
	public static final String propertyFilePath = projectPath + File.separator + "src/main/java/nisha/resources/" + propertyFileName;

	// DriverFactory URL
	public static final String url = "https://www.saucedemo.com/";
	

	// Wait timing
	public static final Duration waitTime = Duration.ofMillis(10000);
	
	// Project root directory
			public static final String PROJECT_PATH = System.getProperty("user.dir");
			public static final String RESOURCE_PATH = PROJECT_PATH + File.separator + "src" + File.separator + "main"
					+ File.separator + "java/com/resources" + File.separator;
			
			// Property file
			public static final String PROPERTY_FILE_PATH = RESOURCE_PATH + "config.properties";

			// ExcelSheet file path - Data Handling
			public static final String DATASHEET_FILE_PATH = RESOURCE_PATH + "TestData.xlsx";

			// Wait timing
			public static final long APPIUMSERVER_TIMEOUT = 1000;
			public static final int EXPLICIT_MAXWAIT = 10;
			public static final int EXPLICIT_MINWAIT = 2;
			public static final long AVD_LAUNCH_TIMEOUT = 5000;
			
			// Screenshot paths
			public static final String SCREENSHOT_DIR = PROJECT_PATH + File.separator + "screenShots" + File.separator;
			public static final String testCaseScreenShotPath(String testCaseName) { 
				return SCREENSHOT_DIR + testCaseName  + File.separator + CommonFunctionsHelper.getCurrentDateTime()+ new Random().nextInt(20) + ".png";
			}
		
			// Extent reporting
			public static final String REPORT_DIR = PROJECT_PATH + File.separator + "report" + File.separator;
			public static final String REPORT_PATH = REPORT_DIR + "Extent-TestReport.html";
			public static final String REPORT_CONFIG_PATH = RESOURCE_PATH + "extentreport.xml";
			public static final String NEW_REPORT_PATH = REPORT_DIR + "Extent-TestReport-" + CommonFunctionsHelper.getCurrentDateTime() + ".html";
			
			public static final String REPORT_TITLE = "Test Report";
			public static final String REPORT_NAME = "QA Test Report";
			public static final String DATE_TIME_FORMAT = "dd/MM/yyyy HH:mm:ss";
			
			// Appium server log path
			public static final String APPIUMSERVER_LOG_PATH = PROJECT_PATH + File.separator + "logs" + File.separator + "appiumServer.log";
			
			public static final String YES = "yes";
			public static final String NO = "no";
			
}
