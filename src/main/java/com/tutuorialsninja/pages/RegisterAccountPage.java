package com.tutuorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutuorialsninja.customlisteners.CustomListeners;
import com.tutuorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterAccountPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Register Account']")
    WebElement registerAccount;

    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement firstName;

    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement lastName;

    @CacheLookup
    @FindBy(id = "input-email")
    WebElement email;

    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement telephone;

    @CacheLookup
    @FindBy(id = "input-password")
    WebElement password;

    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement confimPass;

    @CacheLookup
    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement pPCheckbox;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement regContinueBtn;

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
    WebElement successMessage;

    public void verifyTextRegisterAccount(String expectedText) {
        Reporter.log("Verify Text Register Account: " + registerAccount.toString() + "<br>");
        verifyElements(registerAccount, expectedText, "Error, Text/Message not displayed as expected!");
        CustomListeners.test.log(Status.PASS, "Verify Text Register Account: " + expectedText);
    }

    public void enterFirstName(String name) {
        Reporter.log("Enter First Name: " + firstName.toString() + "<br>");
        sendTextToElement(firstName, name);
        CustomListeners.test.log(Status.PASS, "Enter FirstName: " + name);
    }

    public void enterLastName(String lName) {
        Reporter.log("Enter Last Name: " + lastName.toString() + "<br>");
        sendTextToElement(lastName, lName);
        CustomListeners.test.log(Status.PASS, "Enter LastName: " + lName);
    }

    public void enterEmail(String email1) {
        Reporter.log("Enter Email: " + email.toString() + "<br>");
        sendTextToElement(email, email1);
        CustomListeners.test.log(Status.PASS, "Enter Email: " + email1);
    }

    public void enterTelephone(String phone) {
        Reporter.log("Enter Telephone: " + telephone.toString() + "<br>");
        sendTextToElement(telephone, phone);
        CustomListeners.test.log(Status.PASS, "EnterTelephone: " + phone);
    }

    public void enterPassword(String pass) {
        Reporter.log("Enter Password: " + password.toString() + "<br>");
        sendTextToElement(password, pass);
        CustomListeners.test.log(Status.PASS, "Enter Password: " + pass);
    }

    public void enterConfirmPassword(String confPass) {
        Reporter.log("Enter Confirm Password: " + confimPass.toString() + "<br>");
        sendTextToElement(confimPass, confPass);
        CustomListeners.test.log(Status.PASS, "Enter Confirm Password: " + confPass);
    }

    public void clickOnPrivacyPolicyCheckbox() {
        Reporter.log("Click On ppCheck: " + pPCheckbox.toString() + "<br>");
        clickOnElement(pPCheckbox);
        CustomListeners.test.log(Status.PASS, "Click On Privacy Policy Checkbox: " );
    }

    public void clickContinueButtonOnRegisterPage() {
        Reporter.log("Click On ContinueButton Register Page: " + regContinueBtn.toString() + "<br>");
        clickOnElement(regContinueBtn);
        CustomListeners.test.log(Status.PASS, "Click On ContinueBtn On Register Page: " );
    }

    public void verifyAccountCreatedSuccessfullyText(String expectedMessage) {
        Reporter.log("Verify Account Created Successfully: " + successMessage.toString() + "<br>");
        verifyElements(successMessage, expectedMessage, "Error, Text/Message not displayed as expected!");
        CustomListeners.test.log(Status.PASS, "Verify Text Account Created Successfully: " + expectedMessage);
    }
}
