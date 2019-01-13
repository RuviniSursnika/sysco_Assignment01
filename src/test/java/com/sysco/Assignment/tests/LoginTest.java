package com.sysco.Assignment.tests;


//import com.sysco.Assignment.data.HomeData;
import com.sysco.Assignment.data.LoginData;
//import com.sysco.Assignment.functions.CheckOutCart;
//import com.sysco.Assignment.functions.ConfirmationPopUp;
import com.sysco.Assignment.functions.*;
import com.sysco.Assignment.utils.ExcelUtil;
import com.sysco.Assignment.utils.PageBase;
import com.sysco.Assignment.utils.TestBase;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LoginTest extends TestBase {

    @BeforeClass
    public void init(ITestContext iTestContext) {
        iTestContext.setAttribute("feature", "Login - ValidLogin");
    }

   // @Test(priority = 0)


    @Test(priority = 1)
    public void testLogin() throws Exception {


        //Launch the web page
        First.searchLoginLink();

        //Enter Login Details
        Login.loginAndNavigateToHomePage();


        //Navigate to home page
         Assert.assertTrue(Home.isDisplayedUserName());

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

        //Enter first name and last name in checkout page
        //CheckOut.isDisplayedFirstNameAndLastName();

        //set Post Code
       // CheckOut.setValidPostCode();


    }
}