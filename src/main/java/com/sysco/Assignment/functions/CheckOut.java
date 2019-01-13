package com.sysco.Assignment.functions;

import com.sysco.Assignment.data.LoginData;
import com.sysco.Assignment.pages.CheckOutPage;
import com.sysco.Assignment.utils.ExcelUtil;

public class CheckOut {


    public static CheckOutPage checkOutPage = new CheckOutPage();
    public static LoginData loginData = ExcelUtil.getLoginData("Login");


    public static void setValidPostCode(){
        String postCode = loginData.getPostCode();

        checkOutPage.setPostcode(postCode);


    }


}



    /*
    public static boolean isDisplayedFirstNameAndLastName(){

        String firstNameW = LoginData.getFirstName();
        String lastNameW = LoginData.getLastName();

        String firstNameD = checkOutPage.setFirstName();
        String lastNameD = checkOutPage.setLastName();

        if (firstNameD.equalsIgnoreCase(firstNameW)){
            System.out.println("First Name is "+firstNameD);
            return true;
        }
//        else {
//            return false;
//        }

        if (lastNameD.equalsIgnoreCase(lastNameW)){
            System.out.println("Last Name is "+lastNameD);
            return true;
        }
        else
            return false;
    }

    */


