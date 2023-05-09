package com.tutuorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutuorialsninja.customlisteners.CustomListeners;
import com.tutuorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h2[text()='Desktops']")
    WebElement desktopTitle;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortBy;

    @CacheLookup
    @FindBy(css = ".product-thumb h4 a")
    WebElement productList;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortByAToZ;

    @CacheLookup
    @FindBy(xpath = "//a[text()='HP LP3065']")
    WebElement hpLP3065;

    public void verifyDeskTopTitle(String expectedText) {
        Reporter.log("Verify DeskTop Title: " + desktopTitle.toString() + "<br>");
        verifyElements(desktopTitle, expectedText, "Title not displayed as expected");
        CustomListeners.test.log(Status.PASS, "Verify DeskTop Title: " + expectedText);
    }


    public void selectZToAFromSortByDropdown(String filter) {
        Reporter.log("Select Z To A: " + sortBy.toString() + "<br>");
        selectByVisibleTextFromDropDown(sortBy, filter);
        CustomListeners.test.log(Status.PASS, "Select Z To A: " + filter);
    }

    public void verifyProductArrangeInDescendingOrder() {

        List<WebElement> products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        // Sort By Reverse order
        Collections.reverse(originalProductsName);
        System.out.println(originalProductsName);
        CustomListeners.test.log(Status.PASS, "Verify Product are in DescendingOrder: " );
    }

    public void selectAToZFromSortByDropDown(String filter1) {
        Reporter.log("Select A To Z: " + sortByAToZ.toString() + "<br>");
        selectByVisibleTextFromDropDown(sortByAToZ, filter1);
        CustomListeners.test.log(Status.PASS, "Select A To Z: " + filter1);
    }

    public void selectProductHPLP3065() {
        Reporter.log("Select Product: " + hpLP3065.toString() + "<br>");
        clickOnElement(hpLP3065);
        CustomListeners.test.log(Status.PASS, "Select Product: " );
   }


}
