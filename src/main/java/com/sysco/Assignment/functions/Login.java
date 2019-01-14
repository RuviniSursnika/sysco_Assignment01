package com.sysco.Assignment.functions;

import com.sysco.Assignment.data.LoginData;
import com.sysco.Assignment.pages.LoginPage;
import com.sysco.Assignment.utils.ExcelUtil;


public class Login  {

    public static LoginPage loginPage = new LoginPage();
    public static LoginData loginData;

    public static  boolean loginAndNavigateToHomePage(){
        LoginData loginData = ExcelUtil.getLoginData("Login");
        String email = loginData.getEmail();
        String password = loginData.getPassword();

        loginPage.setEmailAddress(email);
        loginPage.setPassword(password);
        loginPage.clickBtnLogin();

        return true;
    }

    public static boolean loginWithBlankCredentialsAndGetEmailRequiredMsg() {
        LoginData loginData = ExcelUtil.getLoginData("Login_1");
        String email = loginData.getEmail();
        String password = loginData.getPassword();

        loginPage.setEmailAddress(email);
        loginPage.setPassword(password);
        loginPage.clickBtnLogin();

        return true;
    }
    public static boolean loginWithBlankCredentialsAndGetPasswordRequiredMsg(){
        LoginData loginData = ExcelUtil.getLoginData("Login_2");
        String email = loginData.getEmail();
        String password = loginData.getPassword();

        loginPage.setEmailAddress(email);
        loginPage.setPassword(password);
        loginPage.clickBtnLogin();

        return true;
    }

    public static boolean loginWithIncorrectPasswordAndGetErrorMsg(){
        LoginData loginData = ExcelUtil.getLoginData("Login_3");
        String email = loginData.getEmail();
        String password = loginData.getPassword();

        loginPage.setEmailAddress(email);
        loginPage.setPassword(password);
        loginPage.clickBtnLogin();

        return true;
    }

    public static boolean loginWithIncorrectEmailAndGetErrorMsg(){
        LoginData loginData = ExcelUtil.getLoginData("Login_4");
        String email = loginData.getEmail();
        String password = loginData.getPassword();

        loginPage.setEmailAddress(email);
        loginPage.setPassword(password);
        loginPage.clickBtnLogin();

        return true;
    }

    public static boolean loginWithIncorrectCredentialsAndGetErrorMsg(){
        LoginData loginData = ExcelUtil.getLoginData("Login_5");
        String email = loginData.getEmail();
        String password = loginData.getPassword();

        loginPage.setEmailAddress(email);
        loginPage.setPassword(password);
        loginPage.clickBtnLogin();

        return true;
    }


}
