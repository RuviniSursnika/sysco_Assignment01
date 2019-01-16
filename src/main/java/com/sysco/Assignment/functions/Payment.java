package com.sysco.Assignment.functions;

import com.sysco.Assignment.pages.CheckOutPage;
import com.sysco.Assignment.pages.PaymentPage;

import java.util.Date;

public class Payment {

    public static PaymentPage paymentPage = new PaymentPage();


    public static void ClickCreditCardSection(){
        paymentPage.clickBtnCreditCard();

    }


}
