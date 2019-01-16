package com.sysco.Assignment.functions;

import com.sysco.Assignment.data.LoginData;
import com.sysco.Assignment.pages.CheckOutPage;
import com.sysco.Assignment.utils.ExcelUtil;

public class CheckOut {


    public static CheckOutPage checkOutPage = new CheckOutPage();
    public static LoginData loginData = ExcelUtil.getLoginData("Login");


    public static boolean isDisplayedFirstName(){

        String firstNameW = LoginData.getFirstName();
        System.out.println("first Name is "+firstNameW);

        String firstNameD = checkOutPage.setFirstName();

        if (firstNameD.equalsIgnoreCase(firstNameW)){
            System.out.println("First Name is matched ");
            return true;
        }
        else {
            System.out.println("First Name is not matched");
            return false;
        }

    }

    public static boolean isDisplayedLastName(){
        String lastNameW = LoginData.getLastName();
        System.out.println("Last Name is "+lastNameW);

        String lastNameD = checkOutPage.setLastName();

        if (lastNameD.equalsIgnoreCase(lastNameW)){
            System.out.println("Last Name is matched ");
            return true;
        }
        else
            System.out.println("Last Name is not matched");
            return false;
    }


    public static void setCheckOutDetails(){
        String postCode = loginData.getPostCode();
        String telephoneNo = loginData.getTelephone();

        String company = loginData.getCompany();
        String address = LoginData.getAddress();

        checkOutPage.setPostcode(postCode);
        checkOutPage.selectPostCode();
        System.out.println("postCode is "+postCode);

        checkOutPage.setTelephone(telephoneNo);
        System.out.println("TelNo is "+ telephoneNo);

        checkOutPage.setCompany(company);
        checkOutPage.setAddressLine(address);

        checkOutPage.clickBtnContinue();

    }


}




