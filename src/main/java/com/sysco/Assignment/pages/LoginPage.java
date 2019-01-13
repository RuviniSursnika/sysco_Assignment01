package com.sysco.Assignment.pages;

import com.sysco.Assignment.utils.PageBase;
import org.openqa.selenium.By;


public class LoginPage extends PageBase {

    private static By txtEmail = By.xpath("//input[@name=\"login[username]\"]");
    private static By txtPassword = By.id("pass");
    private static By btnLogin = By.id("send2");


    public void setEmailAddress(String email) {
        System.out.println("Email Address is "+email);
        syscoLabUIOgm.sendKeys(txtEmail, email);
    }

    public void setPassword(String password) {
        syscoLabUIOgm.sendKeys(txtPassword, password);
    }

    public void clickBtnLogin(){
        syscoLabUIOgm.click(btnLogin);
    }

}
