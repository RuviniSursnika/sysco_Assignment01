package com.sysco.Assignment.pages;

import com.sysco.Assignment.utils.PageBase;
import com.syscolab.qe.core.ui.SyscoLabUI;
import com.syscolab.qe.core.ui.web.SyscoLabWUI;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;


public class LoginPage extends PageBase {

    private static By txtEmail = By.xpath("//input[@name=\"login[username]\"]");
    private static By txtPassword = By.id("pass");
    private static By btnLogin = By.id("send2");
    //


    public void setEmailAddress(String email) {
        System.out.println("Email Address is "+email);
        syscoLabUIOgm.sendKeys(txtEmail, email);
    }

    public void setPassword(String password) {
        syscoLabUIOgm.sendKeys(txtPassword, password);
        //syscoLabUIOgm.sleep(5);
    }

    public void clickBtnLogin(){
        syscoLabUIOgm.click(btnLogin);
    }



}
