package com.tutuorialsninja.testsuite;

import com.tutuorialsninja.customlisteners.CustomListeners;
import com.tutuorialsninja.pages.DesktopPage;
import com.tutuorialsninja.pages.HomePage;
import com.tutuorialsninja.pages.HpLp3065Page;
import com.tutuorialsninja.pages.ShoppingCartPage;
import com.tutuorialsninja.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class DesktopTest extends BaseTest {


    HomePage homePage;
    DesktopPage desktopPage;
    HpLp3065Page hpLp3065Page;
    ShoppingCartPage shoppingCartPage;

    @BeforeMethod(groups = {"sanity", "smoke", "regression"})
    public void inIt() {

        homePage = new HomePage();
        desktopPage = new DesktopPage();
        hpLp3065Page = new HpLp3065Page();
        shoppingCartPage = new ShoppingCartPage();

    }

    @Test(groups = {"sanity"})
    public void verifyProductArrangeInAlphaBaticalOrder() {
        // Mouse hover click on Desktop
        homePage.mouseHoverAndClickOnDesktop();
        // Click on Show all desktop
        homePage.selectMenu("Show AllDesktops");
        // Selecting Sort by filter 'Name (Z - A)'
        desktopPage.selectZToAFromSortByDropdown("Name (Z - A)");
        // // Verifying products are sorted in descending order
        desktopPage.verifyProductArrangeInDescendingOrder();
    }

    @Test (groups = {"smoke"})
    public void verifyProductAddedToShoppingCartSuccessFully() {

        // Mouse hover click on Desktop
        homePage.mouseHoverAndClickOnDesktop();
        // Click on Show all desktop
        homePage.selectMenu("Show AllDesktops");
        // Select Sort by filter 'Name (A - Z)'
        desktopPage.selectAToZFromSortByDropDown("Name (A - Z)");
        // Selecting product
        desktopPage.selectProductHPLP3065();
        // Verifying text
        hpLp3065Page.verifyTextHpLp3065("HP LP3065");
        // Selecting Deivery date
        hpLp3065Page.clickOnDeliveryDate();
        // Input quantity
        hpLp3065Page.inputQuantity("1");
        // Click on Add to Cart button
        hpLp3065Page.clickOnAddToCartBtn();
        // Verify text message
        hpLp3065Page.verifyTextMessage("Success: You have added HP LP3065 to your shopping cart!\n" +
                "×");
        // Click on Shopping Cart button
        hpLp3065Page.clickOnShoppingCart();
        // Verifying text shopping Cart
        shoppingCartPage.verifyTextShoppingCart("Shopping Cart  (1.00kg)");
        // Verify text HPLP3065
        shoppingCartPage.verifyTextHpLp3065("HP LP3065");
        // Verify delivery date
        shoppingCartPage.verifyDeliverDate("Delivery Date:2022-11-30");
        // Verify product model
        shoppingCartPage.verifyModel("Product 21");
        // Verify Cart total
        shoppingCartPage.verifytotal("$122.00");

    }
}
