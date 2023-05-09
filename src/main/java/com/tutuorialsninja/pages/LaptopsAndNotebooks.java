package com.tutuorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutuorialsninja.customlisteners.CustomListeners;
import com.tutuorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;


public class LaptopsAndNotebooks extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h2[text()='Laptops & Notebooks']")
    WebElement laptopsAndNotebooks;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortByHighToLow;

    @CacheLookup
    @FindBy(xpath = "//a[text()='MacBook']")
    WebElement macBook;

    public void verifyTextLaptosAndNotebooks(String expectedText) {
        Reporter.log("Verify Text Laptops And Notebooks: " + laptopsAndNotebooks.toString() + "<br>");
        verifyElements(laptopsAndNotebooks, expectedText, "Error");
        CustomListeners.test.log(Status.PASS, "Verify Text Laptops And Notebooks: " + expectedText);

    }

    public void selectHighToLowFromSortByDropDown(String filter) {
        Reporter.log("Select High To Low: " + sortByHighToLow.toString() + "<br>");
        selectByVisibleTextFromDropDown(sortByHighToLow, filter);
        CustomListeners.test.log(Status.PASS, "Select High To Low: " + filter);
    }

//    public void validateProductPricesAreSortedByHighToLow() {
//        verifyProductsAreSortedByHighToLow();
//    }

    public void selectMacBook() {
        Reporter.log("Select MacBook: " + macBook.toString() + "<br>");
        clickOnElement(macBook);
        CustomListeners.test.log(Status.PASS, "Click On MacBook: ");
    }


}



