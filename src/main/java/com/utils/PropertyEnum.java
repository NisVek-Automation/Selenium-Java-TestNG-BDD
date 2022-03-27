package com.utils;

/**
 * Represent the enum for all the options in the property file.<br>
 * Find value of the variables in the /src/test/resource/configTest.properties file.
 * @author Nisha Vekariya
 * @version 1.0
 */
public enum PropertyEnum {
	
	//Rerun the failed testcases
	NUMBEROFRETRYTEST,
	RETRYFAILEDTESTCASES,
	
	//Extend report related
	DELETEOLDREPORTS,
	NUMBEROFDAYS,
	OVERRIDETESTREPORT,
	OPENTESTREPORTAUTOMATICALLY,
	
	//Execution related
	ENVIRONMENT,
	TESTERNAME,
	RUNMODE,
	URL,
	REMOTEURL,
	BROWSER
	
	
	
	
}
