package com.tutuorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutuorialsninja.customlisteners.CustomListeners;
import com.tutuorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class MyAccountPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//h2[text()='Returning Customer']")
    WebElement returningCustText;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Continue']")
    WebElement accountContinueBtn;

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Account Logout']")
    WebElement logoutMessage;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Continue']")
    WebElement continueBtnLogout;

    @CacheLookup
    @FindBy(id = "input-email")
    WebElement email;

    @CacheLookup
    @FindBy(id = "input-password")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Login']")
    WebElement loginBtn;

    @CacheLookup
    @FindBy(xpath = "//h2[text()='My Account']")
    WebElement myAccountText;


    public void myAccountOptionRegister(String menu) {
        List<WebElement> topMenuNames = driver.findElements(By.xpath("//div[@class='list-group']//a"));
        for (WebElement names : topMenuNames) {
            if (names.getText().equalsIgnoreCase(menu)) {
                names.click();
                break;
            }
            CustomListeners.test.log(Status.PASS, "Click On My Account: " + menu);

        }
    }

    public void verifyReturningCustomerText(String expectedText) {
        Reporter.log("Verify Text Returning customer: " + returningCustText.toString() + "<br>");
        verifyElements(returningCustText, expectedText, "Error, Text/Message not displayed as expected!");
        CustomListeners.test.log(Status.PASS, "Verify Text Returning Customer: " + expectedText);
    }

    public void clickOnContinueButton() {
        Reporter.log("Click On Continue Button: " + accountContinueBtn.toString() + "<br>");
        clickOnElement(accountContinueBtn);
        CustomListeners.test.log(Status.PASS, "Click On Button: " );
    }

    public void verifyLogoutMessage(String expectedMessage) {
        Reporter.log("Verify Logout Message: " +logoutMessage.toString() + "<br>");
        verifyElements(logoutMessage, expectedMessage, "Error, Text/Message not displayed as expected!");
        CustomListeners.test.log(Status.PASS, "Verify Logout Message: " + expectedMessage);
    }

    public void clickContinueBtnOnLogout() {
        Reporter.log("Click On Continue Btn Logout: " + continueBtnLogout.toString() + "<br>");
        clickOnElement(continueBtnLogout);
        CustomListeners.test.log(Status.PASS, "Click On ContinueBtn Logout: " );
    }

    public void enterEmaiAddress(String email1) {
        Reporter.log("Enter Email Address: " + email.toString() + "<br>");
        sendTextToElement(email, email1);
        CustomListeners.test.log(Status.PASS, "Enter Email Address: " + email1);
    }

    public void enterPassword(String pass) {
        Reporter.log("Enter Password: " + password.toString() + "<br>");
        sendTextToElement(password, pass);
        CustomListeners.test.log(Status.PASS, "Enter Password: " + pass);
    }

    public void clickOnLoginBtn() {
        Reporter.log("Click On LoginBtn: " + loginBtn.toString() + "<br>");
        clickOnElement(loginBtn);
        CustomListeners.test.log(Status.PASS, "Click On LoginBtn: " );
    }

    public void verifyMyAccountText(String expectedTitle) {
        Reporter.log("Verify My Account Text: " + myAccountText.toString() + "<br>");
        verifyElements(myAccountText, expectedTitle, "Error, Text/Message not displayed as expected!");
        CustomListeners.test.log(Status.PASS, "Verify My Account Text: " + expectedTitle);
    }


}
