package com.reports;

import java.lang.invoke.MethodHandles;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class adds the log in report and log files. <br>
 * Creating screenshot and attaching to report in Base64Encoding.<br>
 * Class is final to avoid extend.
 * @author Nisha Vekariya
 * @version 1.0
 */

public final class Log {
	
	private Log() {}
	
    private static final Logger log =  LogManager.getLogger(MethodHandles.lookup().lookupClass());
    
    /**
	 * Report status as info with message in extent report and log file.
	 * @param message -> The message which needs to log.
	 */
	public static void info(String message) {
		//ExtentManager.getExtentTest().info(message);
		log.info(message);
	}
	
	/**
	 * Report status as info with message in extent report and log file.
	 * @param The message which needs to log.
	 * @param Attach the screenshot if true, otherwise no screenshot attachment.
	 */
	public static void info(String message, boolean isScreenShotRequired) {
		/*
		if(isScreenShotRequired && Objects.nonNull(DriverManager.getDriver())) {
			ExtentManager.getExtentTest().info(message,
					MediaEntityBuilder.createScreenCaptureFromBase64String(CommonFunctionsHelper.getBase64Image()).build());
		}else {
			ExtentManager.getExtentTest().info(message);
		}
		*/
		log.info(message);
	}

	/**
	 * Report status as fail with message in report and log file.<br>
	 * @param Message which need to log.
	 */
	public static void fail(String message) {
		/*
		if (Objects.isNull(DriverManager.getDriver())) {
			ExtentManager.getExtentTest().fail(message);
		}else {
			ExtentManager.getExtentTest().fail(message,
				MediaEntityBuilder.createScreenCaptureFromBase64String(CommonFunctionsHelper.getBase64Image()).build());
		}
		*/
		log.error(message);
	}
	
	/**
	 * Report status as fail with stack trace message in extent report and log file.
	 * @param message -> report the message in report file.
	 */
	public static void fail(Throwable message) {
		ExtentManager.getExtentTest().fail(message);
		log.error(message);
	}
	
	/**
	 * Report status as fail with message in report and log file.<br>
	 * Attach the failed case screenshot in extent report.
	 * @param Message which need to log.
	 * @param Attach the screenshot if true, otherwise no screenshot attachment.
	 */
	public static void fail(String message, boolean isScreenShotRequired) {
		/*
		if(isScreenShotRequired && Objects.nonNull(DriverManager.getDriver())) {
			ExtentManager.getExtentTest().fail(message,
					MediaEntityBuilder.createScreenCaptureFromBase64String(CommonFunctionsHelper.getBase64Image()).build());
		}else {
			ExtentManager.getExtentTest().fail(message);
		}
		*/
		log.error(message);
	}

	/**
	 * Report status as skip with message and screenshot in extent report.
	 * @param Message which need to log.
	 */
	public static void skip(String message) {
		/*
		if (Objects.isNull(DriverManager.getDriver())) {
			ExtentManager.getExtentTest().skip(message);
		}else {
			ExtentManager.getExtentTest().skip(message,
				MediaEntityBuilder.createScreenCaptureFromBase64String(CommonFunctionsHelper.getBase64Image()).build());
		}
		*/
		log.error(message);
	}
	
	/**
	 * Report status as skip with exception and screenshot in extent report.
	 * @param Exception which need to log.
	 */
	public static void skip(Throwable message) {
		//ExtentManager.getExtentTest().skip(message);
		log.error(message);
	}
	
	/**
	 * Report information message in log file only.
	 * @param Message which need to log.
	 */
	public static void logInfo(String message) {
		log.info(message);
	}
	
	/**
	 * Report information message in report only.
	 * @param Message which need to log.
	 */
	public static void reportInfo(String message) {
		ExtentManager.getExtentTest().info(message);
	}
}
