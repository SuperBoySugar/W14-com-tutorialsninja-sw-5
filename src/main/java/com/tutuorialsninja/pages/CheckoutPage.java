package com.tutuorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutuorialsninja.customlisteners.CustomListeners;
import com.tutuorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;


public class CheckoutPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Checkout']")
    WebElement checkoutText;

    @CacheLookup
    @FindBy(xpath = "//h2[text()='New Customer']")
    WebElement newCustomer;

    @CacheLookup
    @FindBy(xpath = "//label[text()='Guest Checkout']")
    WebElement guestCheckout;

    @CacheLookup
    @FindBy(css = "#button-account")
    WebElement continueBtn;

    @CacheLookup
    @FindBy(id = "input-payment-firstname")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "input-payment-lastname")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(id = "input-payment-email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "input-payment-telephone")
    WebElement telephone;

    @CacheLookup
    @FindBy(id = "input-payment-address-1")
    WebElement addressField;

    @CacheLookup
    @FindBy(id = "input-payment-city")
    WebElement cityField;

    @CacheLookup
    @FindBy(id = "input-payment-postcode")
    WebElement postCodeField;

    @CacheLookup
    @FindBy(id = "input-payment-country")
    WebElement country;

    @CacheLookup
    @FindBy(id = "input-payment-zone")
    WebElement region;

    @CacheLookup
    @FindBy(id = "button-guest")
    WebElement continueTab;

    @CacheLookup
    @FindBy(xpath = "//textarea[@name='comment']")
    WebElement comment;

    @CacheLookup
    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement checkBox;

    @CacheLookup
    @FindBy(id = "button-payment-method")
    WebElement textContinue;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-warning alert-dismissible']")
    WebElement paymentWarning;

    @CacheLookup
    @FindBy(xpath = "//span[text()='My Account']")
    WebElement myAccount;

    public void verifyCheckoutText(String expectedText) {
        Reporter.log("Verify Checkout Text: " + checkoutText.toString() + "<br>");
        verifyElements(checkoutText, expectedText, "Error Text not displayed as expected");
        CustomListeners.test.log(Status.PASS, "Verify Checkout Text: " + expectedText);
    }

    public void verifyNewCustomerText(String expectedText) {
        Reporter.log("Verify New Customer: " + newCustomer.toString() + "<br>");
        verifyElements(newCustomer, expectedText, "Error, Text/Message not displayed as expected!");
        CustomListeners.test.log(Status.PASS, "Verify New Customer: " + expectedText);
    }

    public void clickOnGuestCheckout() {
        Reporter.log("Click On Guest Checkout: " + guestCheckout.toString() + "<br>");
        clickOnElement(guestCheckout);
        CustomListeners.test.log(Status.PASS, "Click On Guest Checkout ");
    }

    public void clickOnContinueBtn() {
        Reporter.log("Click On Continue Button: " + continueBtn.toString() + "<br>");
        clickOnElement(continueBtn);
        CustomListeners.test.log(Status.PASS, "Click On Continue Button ");
    }

    public void inputFirstNameField(String firstName) {
        Reporter.log("Input FirstName: " + firstNameField.toString() + "<br>");
        sendTextToElement(firstNameField, firstName);
        CustomListeners.test.log(Status.PASS, "Input FirstName: " + firstName);
    }

    public void inputLastNameField(String lastName) {
        Reporter.log("Input LastName: " + lastNameField.toString() + "<br>");
        sendTextToElement(lastNameField, lastName);
        CustomListeners.test.log(Status.PASS, "Input LastName: " + lastName);
    }

    public void inputEmailField(String email) {
        Reporter.log("Input Email: " + emailField.toString() + "<br>");
        sendTextToElement(emailField, email);
        CustomListeners.test.log(Status.PASS, "Input Email: " + email);
    }

    public void inputTelephoneField(String telNumber) {
        Reporter.log("Input Telephone: " + telephone.toString() + "<br>");
        sendTextToElement(telephone, telNumber);
        CustomListeners.test.log(Status.PASS, "Input Telephone: " + telNumber);
    }

    public void inputAddressField(String address) {
        Reporter.log("Input Address: " + addressField.toString() + "<br>");
        sendTextToElement(addressField, address);
        CustomListeners.test.log(Status.PASS, "Input Address: " + address);
    }

    public void inputCity(String city) {
        Reporter.log("Input City: " + cityField.toString() + "<br>");
        sendTextToElement(cityField, city);
        CustomListeners.test.log(Status.PASS, "Input City: " + city);
    }

    public void inputPostCode(String postCode) {
        Reporter.log("Input PostCode: " + postCodeField.toString() + "<br>");
        sendTextToElement(postCodeField, postCode);
        CustomListeners.test.log(Status.PASS, "Input PostCode: " + postCode);
    }

    public void selectCountry(String country1) {
        Reporter.log("Select Country: " + country.toString() + "<br>");
        selectByVisibleTextFromDropDown(country, country1);
        CustomListeners.test.log(Status.PASS, "Select Country: " + country1);
    }

    public void selectRegion(String region1) {
        Reporter.log("Select Region: " + region.toString() + "<br>");
        selectByVisibleTextFromDropDown(region, region1);
        CustomListeners.test.log(Status.PASS, "Select Region: " + region1);
    }

    public void clickOnContinueTab() {
        Reporter.log("Click On Continue Tab: " + continueTab.toString() + "<br>");
        clickOnElement(continueTab);
        CustomListeners.test.log(Status.PASS, "Click On Continue Tab: ");
    }

    public void inputComment(String comment1) throws InterruptedException {
        Reporter.log("Input Comment: " + comment.toString() + "<br>");
        Thread.sleep(1000);
        sendTextToElement(comment, comment1);
        CustomListeners.test.log(Status.PASS, "Input Comment: " + comment1);
    }

    public void clickOnCheckBox() {
        Reporter.log("Clikc On CheckBox: " + checkBox.toString() + "<br>");
        clickOnElement(checkBox);
        CustomListeners.test.log(Status.PASS, "Click On CheckBox ");
    }

    public void clickOnTextContinue() {
        Reporter.log("Click On Text Continue: " + textContinue.toString() + "<br>");
        clickOnElement(textContinue);
        CustomListeners.test.log(Status.PASS, "Click On Text Continue ");
    }

    public void verifyPaymentWarning(String expectedWarning) {
        Reporter.log("Verify Payment Warning: " + paymentWarning.toString() + "<br>");
        verifyElements(paymentWarning, expectedWarning, "Error, Text/Message not displayed as expected!");
        CustomListeners.test.log(Status.PASS, "Verify Payment Warning: " + expectedWarning);
    }

    public void clickOnMyAccount() {
        Reporter.log("Click On My Account: " + myAccount.toString() + "<br>");
        clickOnElement(myAccount);
        CustomListeners.test.log(Status.PASS, "Click On My Account ");
    }

}
