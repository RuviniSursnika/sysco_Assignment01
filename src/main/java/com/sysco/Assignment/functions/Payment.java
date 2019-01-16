package com.sysco.Assignment.functions;


import com.sysco.Assignment.pages.PaymentPage;

public class Payment {

    public static PaymentPage paymentPage = new PaymentPage();


    public static void ClickCreditCardSection(){
        paymentPage.clickBtnCreditCard();

    }


}
