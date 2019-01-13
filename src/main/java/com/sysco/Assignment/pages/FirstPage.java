package com.sysco.Assignment.pages;

import com.sysco.Assignment.utils.PageBase;
import org.openqa.selenium.By;

public class FirstPage extends PageBase {

    private static By txtLoginSearch = By.xpath("//a[text()=\"Login\"]");


    public void searchText(){

        if (txtLoginSearch.equals(null)){
            System.out.println("Login Button not exists");
        }
        else
            System.out.println("Login Button is exists");

        syscoLabUIOgm.click(txtLoginSearch);
    }


}
