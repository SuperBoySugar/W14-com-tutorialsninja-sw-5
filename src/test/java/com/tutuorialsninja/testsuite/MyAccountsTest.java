package com.tutuorialsninja.testsuite;

import com.tutuorialsninja.customlisteners.CustomListeners;
import com.tutuorialsninja.pages.*;
import com.tutuorialsninja.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class MyAccountsTest extends BaseTest {

    HomePage homePage;
    MyAccountPage myAccountPage;
    RegisterAccountPage registerAccountPage;

    @BeforeMethod(groups = {"sanity", "smoke", "regression"})
    public void inIt() {
        homePage = new HomePage();
        myAccountPage = new MyAccountPage();
        registerAccountPage = new RegisterAccountPage();
    }

    @Test(groups = {"sanity"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        // Click on My account link on footer
        homePage.clickOnMyAccount();
        // Click on Register link
        myAccountPage.myAccountOptionRegister("Register");
        // Verify Register title
        registerAccountPage.verifyTextRegisterAccount("Register Account");
    }

    @Test(groups = {"smoke"})
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        // Click on My account link on footer
        homePage.clickOnMyAccount();
        // Click on Login link
        myAccountPage.myAccountOptionRegister("Login");
        // Verify returning customer text
        myAccountPage.verifyReturningCustomerText("Returning Customer");
    }

    @Test(groups = {"regression"})
    public void verifyThatUserRegisterAccountSuccessfully() {
        // Click on My account link on footer
        homePage.clickOnMyAccount();
        // Click on Register link
        myAccountPage.myAccountOptionRegister("Register");
        // Enter First Name
        registerAccountPage.enterFirstName("Rishi");
        // Enter Last Name
        registerAccountPage.enterLastName("Patel");
        // Enter Email
        registerAccountPage.enterEmail(getRandomEmail());
        // Enter Telephone
        registerAccountPage.enterTelephone("0987654321");
        // Enter Password
        registerAccountPage.enterPassword("Password123");
        // Enter Confirm Password
        registerAccountPage.enterConfirmPassword("Password123");
        // Click on Policy Checkbox
        registerAccountPage.clickOnPrivacyPolicyCheckbox();
        // Click on Continue button
        registerAccountPage.clickContinueButtonOnRegisterPage();
        // Verify account created text
        registerAccountPage.verifyAccountCreatedSuccessfullyText("Your Account Has Been Created!");
        // Click on Continue button
        myAccountPage.clickOnContinueButton();
        // Click on My Account
        homePage.clickOnMyAccount();
        // Click on Logout
        myAccountPage.myAccountOptionRegister("Logout");
        // Verify Logout message
        myAccountPage.verifyLogoutMessage("Account Logout");
        // Click on Continue button
        myAccountPage.clickContinueBtnOnLogout();
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
        // Click on My account link
        homePage.clickOnMyAccount();
        // Click on Login link
        myAccountPage.myAccountOptionRegister("Login");
        // Enter email address
        myAccountPage.enterEmaiAddress("prime123@live.com");
        // Enter Password
        myAccountPage.enterPassword("Password987");
        // Click on Login button
        myAccountPage.clickOnLoginBtn();
        // Verify Account text
        myAccountPage.verifyMyAccountText("My Account");
        // Click on My account link
        homePage.clickOnMyAccount();
        // Click on Logout
        myAccountPage.myAccountOptionRegister("Logout");
        // Verify Logout message
        myAccountPage.verifyLogoutMessage("Account Logout");
        // Click Continue button
        myAccountPage.clickContinueBtnOnLogout();
    }
}
