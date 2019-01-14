package com.sysco.Assignment.tests;


//import com.sysco.Assignment.data.HomeData;
import com.sysco.Assignment.data.LoginData;
//import com.sysco.Assignment.functions.CheckOutCart;
//import com.sysco.Assignment.functions.ConfirmationPopUp;
import com.sysco.Assignment.functions.*;
import com.sysco.Assignment.utils.ExcelUtil;
import com.sysco.Assignment.utils.PageBase;
import com.sysco.Assignment.utils.TestBase;
import javafx.scene.layout.Priority;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class LoginTest extends TestBase {

    @BeforeClass
    public void init(ITestContext iTestContext) {
        iTestContext.setAttribute("feature", "Online Shopping -Checkout");
    }

    // @Test(priority = 0)


    @Test(priority = 0)
    public void LoginToApplication() throws Exception {

        //Launch the web page
        First.searchLoginLink();

        //Enter Login Details
        Login.loginAndNavigateToHomePage();


        //Navigate to home page
        Assert.assertTrue(Home.isDisplayedUserName());
    }

    @Test(priority = 1)
    public void SelectItem() throws Exception {


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

        //set Post Code, Telephone and click Continue Button
        CheckOut.setCheckOutDetails();


    }

    @Test(priority = 3)
    public void SelectCreditCardSection() {

        //Credit card section
        Payment.ClickCreditCardSection();

    }


}




