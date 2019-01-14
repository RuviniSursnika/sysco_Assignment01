package com.sysco.Assignment.pages;

import com.sysco.Assignment.utils.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class CheckOutPage extends PageBase {

    public static By txtFirstName = By.xpath("//input[@name=\"firstname\"][1]");
    public static By txtLastName = By.xpath("//input[@name=\"lastname\"][1]");
    public static By tf = By.cssSelector("F2EI7RJ");
    public static By txtPostCode = By.xpath("//input[@name=\"postcode\"][1]");
    public static By ddPostCode = By.xpath("//ul[@class=\"ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all\"]");
    public static By btnContinue = By.xpath("//div[@class=\"opc-submit-step\"]/button[@class=\"button -primary -expanded\"]");
    public static By txtTelephone = By.xpath("//input[@name=\"telephone\"][1]");
    public static By txtCompany = By.xpath("//input[@name=\"company\"][1]");
    public static By txtAddressLine = By.xpath("//input[@name=\"street[0]\"][1]");


     public static String setFirstName(){
         syscoLabUIOgm.waitTillElementLoaded(txtFirstName);
        String firstName = syscoLabUIOgm.getValue(txtFirstName).trim();
         //System.out.println("FN "+firstName);
        return firstName;
    }

    public static String setLastName(){
         syscoLabUIOgm.waitTillElementLoaded(txtLastName);
         String lastName = syscoLabUIOgm.getValue(txtLastName);
         return lastName;
    }

    public void setPostcode(String postCode){
        syscoLabUIOgm.sleep(5);
        //syscoLabUIOgm.scrollBottom();
        syscoLabUIOgm.scrollToElement(txtPostCode);
        syscoLabUIOgm.click(txtPostCode);
        syscoLabUIOgm.sendKeys(txtPostCode,postCode);
        syscoLabUIOgm.sleep(10);
        System.out.println("PstCode "+ postCode);
        syscoLabUIOgm.sleep(5);
    }

    public void selectPostCode(){
         List<WebElement> postCodeList = syscoLabUIOgm.findElements(ddPostCode);

        Random randPostCode = new Random();

        int randomPostCode = randPostCode.nextInt(postCodeList.size());
        postCodeList.get(randomPostCode).click();
        System.out.println("Post Code is "+randomPostCode);
    }

    public void setTelephone(String telephone){
        syscoLabUIOgm.waitTillElementLoaded(txtTelephone);
        syscoLabUIOgm.scrollToElement(txtTelephone);
        syscoLabUIOgm.click(txtTelephone);
        syscoLabUIOgm.sendKeys(txtTelephone, telephone);
        System.out.println("tp "+ telephone);
        syscoLabUIOgm.sleep(10);
    }

    public void setCompany(String company){
        syscoLabUIOgm.waitTillElementLoaded(txtCompany);
        syscoLabUIOgm.scrollToElement(txtCompany);
        syscoLabUIOgm.click(txtCompany);
        syscoLabUIOgm.sendKeys(txtCompany, company);
        System.out.println("Company "+ txtCompany);
        syscoLabUIOgm.sleep(10);
    }

    public void setAddressLine(String addressLine){
        syscoLabUIOgm.waitTillElementLoaded(txtAddressLine);
        syscoLabUIOgm.scrollToElement(txtAddressLine);
        syscoLabUIOgm.click(txtAddressLine);
        syscoLabUIOgm.sendKeys(txtAddressLine, addressLine);
        System.out.println("Address Line "+ txtAddressLine);
        syscoLabUIOgm.sleep(10);
    }

    public boolean clickBtnContinue(){
        //syscoLabUIOgm.sleep(10);
        syscoLabUIOgm.switchToWindow();
        syscoLabUIOgm.findVisibleElement(btnContinue);
        if (syscoLabUIOgm.findVisibleElement(btnContinue)!= null){
            System.out.println("button is present");
            syscoLabUIOgm.clickWithJavascript(btnContinue);
            syscoLabUIOgm.switchToDefaultTab();
            syscoLabUIOgm.sleep(10);
            System.out.println("done");
            return true;
        }
        else
        return false;
    }

    public void reloadPage(){

         syscoLabUIOgm.refreshBrowser();
         syscoLabUIOgm.sleep(10);
    }



}


