package com.sysco.Assignment.tests;


import com.sysco.Assignment.common.Constants;
import com.sysco.Assignment.functions.*;
import com.sysco.Assignment.utils.TestBase;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class LoginTest extends TestBase {

    @BeforeClass
    public void init(ITestContext iTestContext) {
        iTestContext.setAttribute("feature", "Online Shopping - Checkout");
    }

    @Test(priority = 0)
    public void LoginToApplication(){
        SoftAssert softAssert = new SoftAssert();
        //Login.loginAndNavigateToHomePage();

        //loginData = ExcelUtil.getLoginData("Login_1");
        First.searchLoginLink();
        softAssert.assertEquals(Login.loginWithBlankCredentialsAndGetEmailRequiredMsg(), Constants.EXPECTED_MSG_REQUIRED_FIELD,"Email is blanked...");

        //loginData = ExcelUtil.getLoginData("Login_2");
        First.searchLoginLink();
        softAssert.assertEquals(Login.loginWithBlankCredentialsAndGetPasswordRequiredMsg(), Constants.EXPECTED_MSG_REQUIRED_FIELD,  "Blank Password - An error");

        //loginData = ExcelUtil.getLoginData("Login_3");
        First.searchLoginLink();
        softAssert.assertEquals(Login.loginWithIncorrectPasswordAndGetErrorMsg(), Constants.EXPECTED_MSG_INCORRECT_LOGIN_CREDENTIALS,"Incorrect password - An error");

        //loginData = ExcelUtil.getLoginData("Login_4");
        First.searchLoginLink();
        softAssert.assertEquals(Login.loginWithIncorrectEmailAndGetErrorMsg(), Constants.EXPECTED_MSG_INCORRECT_LOGIN_CREDENTIALS,"Incorrect email - An error");

        //loginData = ExcelUtil.getLoginData("Login_5");
        First.searchLoginLink();
        softAssert.assertEquals(Login.loginWithIncorrectCredentialsAndGetErrorMsg(), Constants.EXPECTED_MSG_INCORRECT_LOGIN_CREDENTIALS, "Incorrect email and password - An error");

        //loginData = ExcelUtil.getLoginData("Login");
        First.searchLoginLink();
        softAssert.assertTrue(Login.loginAndNavigateToHomePage(), "Successful login - Navigate to Home");

        Assert.assertTrue(Home.isDisplayedUserName());

        //softAssert.assertAll();
    }

    @Test(priority = 1)
    public void SelectItem() {


        //Verify Cart Value is empty
        Home.isCartEmpty();

        //Click on women category and navigate to the women category Page
        Home.selectItemCategory();
        Home.selectSubItemCategory();

        //Select any Item
        Item.seletctItem();

        //Verify whether the message is displayed or not
        Item.isDisplayedMessage();

        //Verify whether the ordered Item displayed or not
        Item.isDisplayedName();

        //Verify whether the ordered Item displayed or not
        Item.isDisplayedPrice();

        //close Shopping cart Section
        Item.NavigateToCheckOut();

    }

    @Test(priority = 2)
    public void FillCheckoutDetails() {

        //Verify First name is displayed
        CheckOut.isDisplayedFirstName();

        //Verify Last name is displayed
        CheckOut.isDisplayedLastName();

        //set checkout details
        CheckOut.setCheckOutDetails();


    }

    @Test(priority = 3)
    public void SelectCreditCardSection() {

        //Select Credit card section
        Payment.ClickCreditCardSection();

    }


}




