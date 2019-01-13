package com.sysco.Assignment.functions;


import com.sysco.Assignment.data.LoginData;
import com.sysco.Assignment.pages.HomePage;
import com.sysco.Assignment.utils.ExcelUtil;

import static com.sysco.Assignment.data.LoginData.category;

public class Home {

    public static HomePage homePage = new HomePage();
    public static LoginData loginData = ExcelUtil.getLoginData("Login");


    public static boolean isDisplayedUserName() {
        String userName = loginData.getUsername();
        System.out.println("Actual User should be " + userName);
        String actualUsername = homePage.searchLoggedUser();

        if (userName.equals(actualUsername)) {
            System.out.println("User Logged with Correct user");
            return true;
        } else {
            System.out.println("User Logged with invalid User");
            return false;
        }
    }

    public static void isCartEmpty() {
        System.out.println("isCartEmpty");

        //homePage.clickOnCartIcon();

        homePage.clickCart();

        boolean emptyValue = homePage.searchEmptyCart();
        System.out.println(emptyValue);


        if (emptyValue == true) {

            System.out.println("There is no any items in the cart");
            homePage.clickBtnShoppingCartClose();
        } else {

            String cartValue = homePage.searchCartValue();
            System.out.println("cv " + cartValue);


            int cv = Integer.parseInt(cartValue);
            System.out.println("CV " + cv);
            System.out.println("There are items in the cart " + cartValue);
            homePage.clickRemoveIcon();

            System.out.println("Now there is no any items in the cart");

        }
        homePage.clickBtnShoppingCartClose();
    }

    public static boolean selectItemCategory(){
        String category = LoginData.getCategory();
        System.out.println("Actual cat "+ category);

        String visibleCat = homePage.getItemCategory();
        System.out.println("Visible cat "+visibleCat);

        if (category.equalsIgnoreCase(visibleCat)){
            homePage.clickItem();
            System.out.println("Given Category is matched");
            return true;
        }

        else
            System.out.println("Category is matched");
            return false;

    }

    public static boolean selectSubItemCategory(){
        String subCategory = LoginData.getSubCategory();
        System.out.println("Actual Subcat "+ subCategory);

        String visibleSubCat = homePage.getSubCategory();
        System.out.println("Viisble SubCat "+ visibleSubCat);

        if (subCategory.equalsIgnoreCase(visibleSubCat)) {
            homePage.clickSubCategory();
            System.out.println("Sub Category is matched");
            return true;
        }
            else
            System.out.println("Sub Category is mismatched");
            return false;

        }
    }
