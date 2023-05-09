package com.tutuorialsninja.testsuite;

import com.tutuorialsninja.customlisteners.CustomListeners;
import com.tutuorialsninja.pages.*;
import com.tutuorialsninja.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LaptopsAndNotebooksTest extends BaseTest {

    HomePage homePage;
    LaptopsAndNotebooks laptopsAndNotebooks;
    MacBookPage macBookPage;
    ShoppingCartPage shoppingCartPage;
    CheckoutPage checkoutPage;

    @BeforeMethod (groups = {"sanity", "smoke", "regression"})
    public void inIt() {
        homePage = new HomePage();
        laptopsAndNotebooks = new LaptopsAndNotebooks();
        macBookPage = new MacBookPage();
        shoppingCartPage = new ShoppingCartPage();
        checkoutPage = new CheckoutPage();
    }

    @Test (groups = {"sanity"})
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {

        // Mouse hover and click on Laptop and Notehbooks
        homePage.mouseHoverAndClickOnLaptopsAndNotebooks();
        // Click on Show all Desktop and notebooks
        homePage.selectMenu("Show AllLaptops & Notebooks");
        // select sorting option
        laptopsAndNotebooks.selectHighToLowFromSortByDropDown("Price (High > Low)");
    }

    @Test (groups = {"smoke", "regression"})
    public void verifyThatUserPlaceOrderSuccessfully() throws InterruptedException {

        // Mouse hover and click on Laptop and Notehbooks
        homePage.mouseHoverAndClickOnLaptopsAndNotebooks();
        // Click on Show all Desktop and notebooks
        homePage.selectMenu("Show AllLaptops & Notebooks");
        // select sorting option
        laptopsAndNotebooks.selectHighToLowFromSortByDropDown("Price (High > Low)");
//        // Verify products are sorted by High to Low
//        laptopsAndNotebooks.validateProductPricesAreSortedByHighToLow();
        // Selecting MacBook
        laptopsAndNotebooks.selectMacBook();
        // Verify Text MacBook
        macBookPage.verifyTextMacBook("MacBook");
        // Click on Add to Cart Button
        macBookPage.clickOnAddToCartBtn();
        // Verify Success message
        macBookPage.verifySuccessMessage("Success: You have added MacBook to your shopping cart!\n" +
                "×");
        // Clicking on Shopping cart button
        macBookPage.clickOnShoppingCart();
        // Verify Text message shopping cart
       shoppingCartPage.verifyTextShoppingCart("Shopping Cart  (0.00kg)");
        // Verify product MacBook
        shoppingCartPage.verifyProductMacBook("MacBook");
        // Change quantity
        shoppingCartPage.changeQuantity("2");
        // Click on Update cart button
        shoppingCartPage.clickOnUpdateBtn();
        // Verify update Message
        shoppingCartPage.verifyUpdateMessage("Success: You have modified your shopping cart!\n" +
                "×");
        // Verify Total
        shoppingCartPage.verifyTotalUpdate("$1,204.00");
        // Clicking on Checkout button
        shoppingCartPage.clickOnCheckoutBtn();
        checkoutPage.verifyCheckoutText("Checkout");
        // Click on Guest Checkout
        checkoutPage.clickOnGuestCheckout();
        // Click on Continue button
        checkoutPage.clickOnContinueBtn();
        // Enter First Name
        checkoutPage.inputFirstNameField("Henry");
        // Enter Last Name
        checkoutPage.inputLastNameField("Smith");
        // Enter Email
        checkoutPage.inputEmailField("abc@gmail.com");
        // Enter Telephone
        checkoutPage.inputTelephoneField("0987654321");
        // Enter Address Line1
        checkoutPage.inputAddressField("10 Downling Street");
        // Enter City
        checkoutPage.inputCity("London");
        // Enter Postal Code
        checkoutPage.inputPostCode("SW1 1AA");
        // Select Country
        checkoutPage.selectCountry("United Kingdom");
        // Select Region
        checkoutPage.selectRegion("Bristol");
        // Click on Continue button
        checkoutPage.clickOnContinueTab();
        // Enter Comment
        checkoutPage.inputComment("Order Placed");
        // Click on checkbox
        checkoutPage.clickOnCheckBox();
        // Click on Continue button
        checkoutPage.clickOnTextContinue();
        // Verify payment warning message
        checkoutPage.verifyPaymentWarning("Warning: No Payment options are available. Please contact us for assistance!");

    }
}