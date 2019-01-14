package com.sysco.Assignment.pages;

import com.sysco.Assignment.utils.PageBase;
import org.openqa.selenium.By;

public class PaymentPage extends PageBase {
    public static By btnCreditCard = By.xpath("//strong[text()=\"Credit Card\"]");

    public void clickBtnCreditCard(){
        syscoLabUIOgm.waitTillElementLoaded(btnCreditCard);
        syscoLabUIOgm.click(btnCreditCard);
    }
}
