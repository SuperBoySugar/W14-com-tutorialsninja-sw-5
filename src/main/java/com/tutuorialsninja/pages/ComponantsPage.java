package com.tutuorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutuorialsninja.customlisteners.CustomListeners;
import com.tutuorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;


public class ComponantsPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//h2[text()='Components']")
    WebElement componants;

    public void verifyTextComponants(String expectedText) {
        Reporter.log("Verify Text Componants: " + componants.toString() + "<br>");
        verifyElements(componants, expectedText, "Error");
        CustomListeners.test.log(Status.PASS, "Verify Text Componants: " + expectedText);
    }
}
