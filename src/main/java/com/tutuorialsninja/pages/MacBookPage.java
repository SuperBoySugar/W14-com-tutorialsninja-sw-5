package com.tutuorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutuorialsninja.customlisteners.CustomListeners;
import com.tutuorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class MacBookPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[text()='MacBook']")
    WebElement textMacBook;

    @CacheLookup
    @FindBy(id = "button-cart")
    WebElement addToCartBtn;

    @CacheLookup
    @FindBy(xpath = "//div[text()='Success: You have added ']")
    WebElement successMessage;

    @CacheLookup
    @FindBy(xpath = "//a[text()='shopping cart']")
    WebElement shoppingCart;

    public void verifyTextMacBook(String expectedText) {
        Reporter.log("Verify Text MacBook: " + textMacBook.toString() + "<br>");
        verifyElements(textMacBook, expectedText, "Error");
        CustomListeners.test.log(Status.PASS, "Verify Text MacBook: " + expectedText);
    }

    public void clickOnAddToCartBtn() {
        Reporter.log("Click On Add To Cart: " + addToCartBtn.toString() + "<br>");
        clickOnElement(addToCartBtn);
        CustomListeners.test.log(Status.PASS, "Click On Add To Cart: " );

    }

    public void verifySuccessMessage(String expectedMessage) {
        Reporter.log("Verify Success Message: " +successMessage.toString() + "<br>");
        verifyElements(successMessage, expectedMessage, "error");
        CustomListeners.test.log(Status.PASS, "Verify Success Message: " + expectedMessage);
    }

    public void clickOnShoppingCart() {
        Reporter.log("Click On Shopping Cart: " + shoppingCart.toString() + "<br>");
        clickOnElement(shoppingCart);
        CustomListeners.test.log(Status.PASS, "Click On Shopping Cart: " + shoppingCart);
    }
}