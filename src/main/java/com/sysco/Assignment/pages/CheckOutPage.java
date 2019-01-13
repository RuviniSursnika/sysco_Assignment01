package com.sysco.Assignment.pages;

import com.sysco.Assignment.utils.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.sysco.Assignment.data.LoginData.firstName;

public class CheckOutPage extends PageBase {

    public static By txtFirstName = By.xpath("//span[text()=\"First Name\"]/following::div[@class=\"control\"]/input[@id=\"F2EI7RJ\"]");
    public static By txtLastName = By.xpath("//span[text()=\"First Name\"]/following::div[@class=\"control\"]/input[@id=\"VYYWTBM\"]");
    public static By tf = By.cssSelector("F2EI7RJ");
    public static By txtPostCode = By.xpath("//div[@class=\"control\"]/span[@class=\"ui-helper-hidden-accessible\"]/following::input[@name=\"postcode\"][1]");


    public void setPostcode(String postCode){
        syscoLabUIOgm.sleep(5);
        //syscoLabUIOgm.scrollBottom();
        syscoLabUIOgm.scrollToElement(txtPostCode);
        syscoLabUIOgm.click(txtPostCode);
       syscoLabUIOgm.sendKeys(txtPostCode,postCode);
        System.out.println("PstCode "+ postCode);
        syscoLabUIOgm.sleep(5);
    }


}

/*

    public static String setFirstName(){

        ////option[@disabled="disabled"]

        List<WebElement> disabledList = syscoLabUIOgm.findElements(tf);
        syscoLabUIOgm.switchToFrame((By) disabledList);
       // String firstName = syscoLabUIOgm.getText(disabledList);
        System.out.println("FirstNameData "+ disabledList);
        return firstName;

    }

    public static String setLastName(){
        String lastName = syscoLabUIOgm.getText(txtLastName);
        System.out.println("LastName "+ lastName);
        return lastName;
    }

    */


