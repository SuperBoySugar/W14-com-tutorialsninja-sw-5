package com.tutuorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutuorialsninja.customlisteners.CustomListeners;
import com.tutuorialsninja.utility.Utility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping Cart')]")
    WebElement textShoppingCart;

    @CacheLookup
    @FindBy(css = "form .text-left a[href^='https']")
    WebElement textHplp3065;

    @CacheLookup
    @FindBy(css = "form tr:nth-child(1) > td:nth-child(2) > small:nth-child(3)")
    WebElement deliveryDate;

    @CacheLookup
    @FindBy(css = "form tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(3)")
    WebElement model;

    @CacheLookup
    @FindBy(css = "tbody tr td:nth-child(6)")
    WebElement total;

    @CacheLookup
    @FindBy(css = "form .text-left a[href^='https']")
    WebElement macBook;

    @CacheLookup
    @FindBy(css = "input[name*='quantity']")
    WebElement changeQuantity;

    @CacheLookup
    @FindBy(css = "button[type='submit']")
    WebElement updateBtn;

    @CacheLookup
    @FindBy(xpath = "//div[contains (text(), 'Success: You have modified')]")
    WebElement updateMessage;

    @CacheLookup
    @FindBy(css = "tbody tr td:nth-child(6)")
    WebElement totalUpdate;

    @CacheLookup
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement checkoutBtn;


    public void verifyTextShoppingCart(String expectedMessage) {
        Reporter.log("Verify Text Shopping cart: " + textShoppingCart.toString() + "<br>");
        verifyElements(textShoppingCart, expectedMessage, "Error");
        CustomListeners.test.log(Status.PASS, "Verify Text Shopping Cart: " + expectedMessage);
    }

    public void verifyTextHpLp3065(String expectedText) {
        Reporter.log("Verify Text HPLP3065: " + textHplp3065.toString() + "<br>");
        verifyElements(textHplp3065, expectedText, "Error");
        CustomListeners.test.log(Status.PASS, "Verify Text HPLP3065: " + expectedText);
    }

    public void verifyDeliverDate(String expectedText) {
        Reporter.log("Verify Delivery Date: " + deliveryDate.toString() + "<br>");
        verifyElements(deliveryDate, expectedText, "error");
        CustomListeners.test.log(Status.PASS, "Verify Delivery Date: " + expectedText);
    }

    public void verifyModel(String expectedMessage) {
        Reporter.log("Verify Model: " + model.toString() + "<br>");
        verifyElements(model, expectedMessage, "error");
        CustomListeners.test.log(Status.PASS, "Verify Model: " + expectedMessage);
    }

    public void verifytotal(String expectedMessage) {
        Reporter.log("Verify Total: " + total.toString() + "<br>");
        verifyElements(total, expectedMessage, "error");
        CustomListeners.test.log(Status.PASS, "Verify Total: " + expectedMessage);
    }

    public void verifyProductMacBook(String expectedText) {
        Reporter.log("Verify Product MacBook: " + macBook.toString() + "<br>");
        verifyElements(macBook, expectedText, "error");
        CustomListeners.test.log(Status.PASS, "Verify Product MacBook: " + expectedText);
    }

    public void changeQuantity(String qty) {
        Reporter.log("Change Quantity: " + changeQuantity.toString() + "<br>");
        sendKeysToElement(changeQuantity, Keys.BACK_SPACE + qty);
        CustomListeners.test.log(Status.PASS, "Change Quantity: " + qty);
    }

    public void clickOnUpdateBtn() {
        Reporter.log("Click On UpdateBtn: " + updateBtn.toString() + "<br>");
        clickOnElement(updateBtn);
    }

    public void verifyUpdateMessage(String expectedMessage) {
        Reporter.log("Verify Update Message: " + updateMessage.toString() + "<br>");
        verifyElements(updateMessage, expectedMessage, "Error message");
        CustomListeners.test.log(Status.PASS, "Verify Update Message: " + expectedMessage);
    }

    public void verifyTotalUpdate(String expectedTotal) {
        Reporter.log("Verify Total Update: " + total.toString() + "<br>");
        verifyElements(total, expectedTotal, "Error in Total");
        CustomListeners.test.log(Status.PASS, "Verify Total Update: " + expectedTotal);
    }

    public void clickOnCheckoutBtn() {
        Reporter.log("Click On CheckoutBtn: " + checkoutBtn.toString() + "<br>");
        clickOnElement(checkoutBtn);
        CustomListeners.test.log(Status.PASS, "Click On CheckOutBtn: " );
    }
}
