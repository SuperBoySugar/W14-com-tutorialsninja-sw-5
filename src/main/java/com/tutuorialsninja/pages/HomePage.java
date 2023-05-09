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

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//ul[@class='nav navbar-nav']//li//a")
    WebElement topMenuOption;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Desktops']")
    WebElement desktop;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Laptops & Notebooks']")
    WebElement laptopsAndNotebooks;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Components']")
    WebElement components;

    @CacheLookup
    @FindBy(xpath = "//footer//a[text()='My Account']")
    WebElement myAccount;


    public void mouseHoverAndClickOnDesktop() {
        Reporter.log("MouseHover And Click On Desktops: " + desktop.toString() + "<br>");
        mouseHoverToElementAndClick(desktop);
        CustomListeners.test.log(Status.PASS, "MouseHover And Click On Desktops " );
    }

    public void selectMenu(String menu) {
        List<WebElement> topMenuNames = driver.findElements(By.xpath("//ul[@class='nav navbar-nav']//li//a"));
        for (WebElement names : topMenuNames) {
            if (names.getText().equalsIgnoreCase(menu)) {
                names.click();
                break;
            }
        }
    }

    public void mouseHoverAndClickOnLaptopsAndNotebooks() {
        Reporter.log("MouseHover And Click On LaptopsAndNotebooks: " + laptopsAndNotebooks.toString() + "<br>");
        mouseHoverToElementAndClick(laptopsAndNotebooks);
        CustomListeners.test.log(Status.PASS, "MouseHover And Click On LaptopsAndNotebooks " );
    }


    public void mouseHoverOnComponantsAndClick(){
        Reporter.log("MouseHover On Componants and Click: " + components.toString() + "<br>");
        mouseHoverToElementAndClick(components);
        CustomListeners.test.log(Status.PASS, "MouseHover On Componants And Click " );
    }

    public void clickOnMyAccount() {
        Reporter.log("Click On My Account: " + myAccount.toString() + "<br>");
        clickOnElement(myAccount);
        CustomListeners.test.log(Status.PASS, "Click On My Account " );

    }

}
