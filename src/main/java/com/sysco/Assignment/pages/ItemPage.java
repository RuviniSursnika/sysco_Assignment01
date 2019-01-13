package com.sysco.Assignment.pages;

import com.sysco.Assignment.utils.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class ItemPage extends PageBase {

    private static By lblItem = By.xpath("//span[@class=\"base\"]");
    private static By lnkItem = By.xpath("//ul[@class=\"products list items product-items sli_container grid \"]");
    private static By lnkSize = By.xpath("//div[@class=\"swatch-row -active\"]/div[@class=\"swatch-option text\"]");
    private static By btnAddToCart = By.xpath("//button[@title=\"Add to Cart\"]");
    private static By lblMessage = By.xpath("//div[@data-ui-id=\"message-success\"]/div");
    private static By lnkShoppingCartItem = By.xpath("//a[@class=\"alink -plain\"]");
    private static By lblPrice = By.xpath("//span[@class=\"minicart-price\"]/span[@class=\"price\"]");
    private static By btnCheckOut = By.xpath("//button[@title=\"Proceed To Checkout\"]");


    public void clickOnItem(){

        //syscoLabUIOgm.sleep(5);

        List<WebElement> itemList = syscoLabUIOgm.findElements(lnkItem);
        //System.out.println("Size List "+ sizeList.toString());

        Random randItem = new Random();
        //System.out.println("Size "+ rand);

        //syscoLabUIOgm.findElement(lnkItem).click();

        int randomItem = randItem.nextInt(itemList.size());
        System.out.println("a "+randItem.toString());

        itemList.get(randomItem).click();
        System.out.println("randomItem "+ randomItem);

//        syscoLabUIOgm.sleep(5);
//        syscoLabUIOgm.scrollUp();
//        syscoLabUIOgm.click(lnkItem);

    }

    public void clickOnSize(){

       List<WebElement> sizeList = syscoLabUIOgm.findElements(lnkSize);
       //System.out.println("Size List "+ sizeList.toString());

        Random rand = new Random();
        //System.out.println("Size "+ rand);

        //syscoLabUIOgm.findElement(lnkSize).click();

        int randomValue = rand.nextInt(sizeList.size());
        sizeList.get(randomValue).click();
        System.out.println("randomValue "+ randomValue);

    }

    public void clickBtnAddToCart(){
        syscoLabUIOgm.sleep(2);
        syscoLabUIOgm.click(btnAddToCart);
    }

    public String searchMessage(){
        syscoLabUIOgm.sleep(10);
        String message= syscoLabUIOgm.getText(lblMessage);
        return message;
    }

    public String searchItem(){
        syscoLabUIOgm.sleep(2);
        String actualItemName = syscoLabUIOgm.getText(lblItem);
        return actualItemName;
    }

    public String searchCartItem(){
        syscoLabUIOgm.sleep(5);
        String shoppingCartItem = syscoLabUIOgm.getText(lnkShoppingCartItem);
        return shoppingCartItem;
    }

    public String searchPrice(){
        syscoLabUIOgm.sleep(2);
        String actualPrice = syscoLabUIOgm.getText(lblPrice);
        return actualPrice;
    }

    public void clickbtnCheckOut(){
        syscoLabUIOgm.sleep(5);
        syscoLabUIOgm.click(btnCheckOut);
    }
}
