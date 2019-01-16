package com.sysco.Assignment.functions;

import com.sysco.Assignment.data.LoginData;
import com.sysco.Assignment.pages.HomePage;
import com.sysco.Assignment.pages.ItemPage;
import com.sysco.Assignment.utils.ExcelUtil;

public class Item {

    public static ItemPage itemPage = new ItemPage();
    public static HomePage homePage = new HomePage();
    public static LoginData loginData = ExcelUtil.getLoginData("Login");

    public static void seletctItem() {

        itemPage.clickOnItem();
        itemPage.clickOnSize();
        itemPage.clickBtnAddToCart();
     }

     public static boolean isDisplayedMessage(){

         String message = loginData.getMessage();

        String messageData =  itemPage.searchMessage();
         System.out.println("Message is "+messageData);

         String itemName = itemPage.searchItem();


         String[] messageName = message.split("\\,");
         String beforeComma = messageName[0];
         System.out.println("b "+ beforeComma);
         String afterComma = messageName[1];
         System.out.println("a "+ afterComma);

         String trueMessage = beforeComma + " " + itemName + " "+ afterComma;
         System.out.println("true message "+trueMessage);

         if (messageData.equals(trueMessage)){
             System.out.println("Correct message");
             return true;

         }
         else
             System.out.println("Not a correct message");
             return false;

     }

     public static boolean isDisplayedName (){
        homePage.clickCart();

        String searchItemName = itemPage.searchItem();
        String displyaedItem = itemPage.searchCartItem();
        System.out.println("diaplyaedItem "+ displyaedItem);

         if (searchItemName.equalsIgnoreCase(displyaedItem)){
             System.out.println("Item Name is correct");
             return true;
         }
         else
             System.out.println("Item name is not correct");
         return false;

     }


     public static void isDisplayedPrice(){
         String displayedPrice = itemPage.searchPrice();
         System.out.println("displayedPrice "+displayedPrice);

     }

    public static void NavigateToCheckOut() {
        itemPage.clickbtnCheckOut();
    }


}

