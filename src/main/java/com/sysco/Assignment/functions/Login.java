package com.sysco.Assignment.functions;

import com.sysco.Assignment.data.LoginData;
import com.sysco.Assignment.pages.LoginPage;
import com.sysco.Assignment.utils.ExcelUtil;


public class Login  {

    public static LoginPage loginPage = new LoginPage();
    public static LoginData loginData = ExcelUtil.getLoginData("Login");


    public static  void loginAndNavigateToHomePage(){
        String email = loginData.getEmail();
        String password = loginData.getPassword();

        loginPage.setEmailAddress(email);
        loginPage.setPassword(password);
        loginPage.clickBtnLogin();

    }

}
