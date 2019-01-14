package com.sysco.Assignment.common;

public class Constants {
    public static final String TEST_ENV = System.getProperty("test.env", "QA");
    public static final String TEST_RELEASE = System.getProperty("test.release", "RuviniS_Java_Based_Web_UI_Automation");
    public static final String TEST_PROJECT = System.getProperty("test.project", "Java Based Web UI Automation");
    public static final boolean UPDATE_DASHBOARD = Boolean.parseBoolean(System.getProperty("update.dashboard", "true"));
    public static final boolean RUN_LOCALLY = Boolean.parseBoolean(System.getProperty("run.locally", "true"));
    public static final String APP_URL = System.getProperty("app.url", "https://www.theathletesfoot.com.au/ ");
    public static final String APP_OS = System.getProperty("app.os", "WIN10");
    public static final String APP_BROWSER = System.getProperty("app.browser", "chrome");
    public static final String BASE_URL = System.getProperty("base.url", "https://www.theathletesfoot.com.au/");
    public static final String EXPECTED_MSG_REQUIRED_FIELD = System.getProperty("This is a required field.");
    public static final String EXPECTED_MSG_INCORRECT_LOGIN_CREDENTIALS = System.getProperty("You did not sign in correctly or your account is temporarily disabled.");

}