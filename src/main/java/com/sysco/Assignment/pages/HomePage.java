package com.sysco.Assignment.pages;

import com.sysco.Assignment.data.LoginData;
import com.sysco.Assignment.utils.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends PageBase {


    private static By lblUserName = By.xpath("//span[@class=\"name\"]/span");
    private static By lnkCartValue = By.xpath("//span[@class=\"value\"]");
    private static By btnOK = By.xpath("//span[text()=\"OK\"]/..");
    private static By lblCartEmpty = By.xpath("//span[text()=\"You have no items in your shopping cart.\"]");
    private static By lblRemove = By.xpath("//*[@title='Remove item']");
    private static By imgCart = By.xpath("//span[@class=\"showcart-trigger header-sidebar-link -cart\"]/child::*[2]/child::*[1]");
    private static By btnShoppingCartClose = By.xpath("//div[@class=\"close\"]/child::*[1]");
    private static By lnkItemCategory = By.xpath("//*[@class=\" menu-wrapper -horizontal  -expanded\"]/child::*/a");
    private static By lnkSubCategory = By.id("mi-3-1-3-9");


    public String searchLoggedUser() {
        String user = syscoLabUIOgm.getText(lblUserName);
        System.out.println("Displayed user is " + user);
        return user;
    }

    public boolean searchEmptyCart() {
        syscoLabUIOgm.sleep(5);
        return syscoLabUIOgm.isDisplayed(lblCartEmpty);
    }

    public void clickCart() {
        syscoLabUIOgm.sleep(5);
        syscoLabUIOgm.click(imgCart);
    }

    public String searchCartValue() {
        String cartValue = syscoLabUIOgm.getText(lnkCartValue);
        return cartValue;
    }

    public void clickRemoveIcon() {

        List<WebElement> element = syscoLabUIOgm.findElements(lblRemove);

        syscoLabUIOgm.switchToWindow();
        syscoLabUIOgm.sleep(2);


        for (int i = 0; i < element.size(); i++) {
            syscoLabUIOgm.sleep(5);
            syscoLabUIOgm.click(lblRemove);
            syscoLabUIOgm.sleep(5);
            syscoLabUIOgm.click(btnOK);
        }

    }

    public void clickBtnShoppingCartClose() {
        syscoLabUIOgm.sleep(5);
        syscoLabUIOgm.clickOnVisibleElement(btnShoppingCartClose);
    }


    public String  getItemCategory() {
        syscoLabUIOgm.sleep(5);
        String cat = syscoLabUIOgm.getText(lnkItemCategory);

        return cat;

    }

    public void clickItem(){
        syscoLabUIOgm.click(lnkItemCategory);
    }

    public String getSubCategory(){
        syscoLabUIOgm.sleep(5);
        String subCat = syscoLabUIOgm.getText(lnkSubCategory);
        return  subCat;
    }

    public void clickSubCategory(){
        syscoLabUIOgm.click(lnkSubCategory);
    }
}


