package com.reports;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import com.aventstack.extentreports.AnalysisStrategy;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.constants.AppConstant;
import com.constants.FrameworkConstant;
import com.utils.PropertyEnum;
import com.utils.PropertyHelper;

/**
 * Preparing and setting up Extent report instances.
 * 
 * <br>
 * Class is final to avoid extend.
 * @author Nisha Vekariya
 * @version 1.0
 *
 */
public final class ExtentReport {

	/** Private constructor to avoid external instantiation */
	private ExtentReport() {
	}

	private static ExtentReports extentReports;
	private static String reportFilePath = "";

	/** Setting up the test report information. */
	public static void initReports() {
		if (Objects.isNull(extentReports)) {
			// Setting the view order for the tabs in report
			ExtentSparkReporter spark = new ExtentSparkReporter(getReportPath());

			extentReports = new ExtentReports();
			spark.config().setTheme(Theme.DARK);
			spark.config().setDocumentTitle(FrameworkConstant.REPORT_TITLE);
			spark.config().setReportName(FrameworkConstant.REPORT_NAME);
			spark.config().setEncoding(String.valueOf(StandardCharsets.UTF_8));
			spark.config().setTimeStampFormat(FrameworkConstant.DATE_TIME_FORMAT);

			// Setting up information
			try {
				extentReports.setSystemInfo("Name", PropertyHelper.get(PropertyEnum.TESTERNAME));
				extentReports.setSystemInfo("Environment", PropertyHelper.get(PropertyEnum.ENVIRONMENT));
				extentReports.setSystemInfo("App", AppConstant.APP_NAME);
				extentReports.setSystemInfo("App Package", AppConstant.APP_PACKAGE);
				extentReports.setSystemInfo("App Activity", AppConstant.APP_ACTIVITY);
				extentReports.setAnalysisStrategy(AnalysisStrategy.TEST);
				extentReports.attachReporter(spark);
				Log.logInfo("Extent report is initialized successfully.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Setting up the ExtentTest instance.
	 * @param testCaseName current test case name.
	 */
	public static void createTests(String testCaseName) {
		ExtentTest extentTest = null;
		try {
			extentTest = extentReports.createTest(testCaseName);
		} catch (Exception e) {
			Log.logInfo("Extent report create test problem.");
			e.printStackTrace();
		}
		ExtentManager.setExtentTest(extentTest);
	}
	
	/** Removing the ExtentReport instance. */
	public static void flushReport() {
		if (Objects.nonNull(extentReports)) {
			extentReports.flush();
			ExtentManager.unload();
			Log.logInfo("Extent report flushed successfully.");
		}
	}
	
	/**
	 * Get the report path.
	 * @return Path of the execution report.
	 */
	public static String getReportPath() {
		if (reportFilePath.isEmpty()) {
			if (PropertyHelper.get(PropertyEnum.OVERRIDETESTREPORT).equalsIgnoreCase(FrameworkConstant.YES)) {
				reportFilePath = FrameworkConstant.REPORT_PATH;
			} else {
				reportFilePath = FrameworkConstant.NEW_REPORT_PATH;
			}
		}
		return reportFilePath;
	}
	
}
