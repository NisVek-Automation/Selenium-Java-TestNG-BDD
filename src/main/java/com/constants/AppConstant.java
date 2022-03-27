package com.constants;

/**
 * This class contains application specific constant values which are required only for Application testing.
 * <br>
 * Class is final to avoid extend.
 * <br><br>
 * @author Nisha Vekariya
 * @version 1.0
 */
public class AppConstant {

	public static final String APP_PACKAGE = "com.jobget";
	public static final String APP_ACTIVITY = "com.jobget.activities.NewLandingActivity";
	public static final String APP_NAME = "JobGet";
	
	public static final String APP_URL = "http://127.0.0.1:4723/wd/hub";
	public static final String APPIUMSERVER_IP = "127.0.0.1";
	public static final int APPIUMSERVER_PORT = 4723;
	
	//--------------- Employer signup/signin Error/Success/Title Messages ------------------//
	public static final String SIGNUP_NEXTPAGE_TITLE = "I am looking to...";
	public static final String CONTINUE_NEXTPAGE_TITLE = "Continue as a...";
	public static final String EMP_SIGNUP_TITLE = "Sign Up as an Employer";
	public static final String EMP_COMPANYINFO_SECTION_MSG = "You will be able to update this information later.";
	public static final String EMP_MOBILENUMBER_SECTION_TITLE_MSG = "Number is used for verification purposes only and will not be made public.";
	public static final String EMP_4DIGIT_VERIFICATION_TITLE_MSG = "We have sent a 4-digit verification code to your phone number";
	public static final String ERR_EMP_FIRSTNAME_LENGTH = "First name must be at least 2 characters long";
	public static final String ERR_EMP_FIRSTNAME_BLANK = "Please enter first name";
	public static final String ERR_EMP_LASTNAME_BLANK = "Please enter last name";
	public static final String ERR_EMP_EMAIL_BLANK = "Please enter email an address";
	public static final String ERR_EMP_EMAIL_INVALID = "Please enter a valid email address";
	public static final String ERR_EMP_PSW_BLANK = "Please enter password";
	public static final String ERR_EMP_PSW_LENGTH = "Password must be atleast 6 characters";
	public static final String ERR_INVALID_EMAIL_PASSWORD = "Invalid email or password.";
	public static final String EMP_MOBILEPHONE_SUCCESS_MSG ="You have successfully";
	public static final String EMP_SIGNUP_CONGRATULATION_MSG ="CONGRATULATIONS!";
	public static final String LOGIN_PAGE_TITLE ="Login";
	
	//-------------- Employee Job Posting --------------------------//
	public static final String EMP_JOBPOSTING_HEADER_TITLE ="My Job Postings";
	
	//-------------- Employee My Profile --------------------------//
	public static final String EMP_MYPROFILE_HEADER_TITLE ="My Profile";
	public static final String LOGOUT_CONFIRMATION_MSG ="Are you sure you want to Logout?";
	
	//-------------- Login errors --------------------------//
	public static final String LOGIN_BLANK_EMAIL ="Please enter email an address";
	
}
