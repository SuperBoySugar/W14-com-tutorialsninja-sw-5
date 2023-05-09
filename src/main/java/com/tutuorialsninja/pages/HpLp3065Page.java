package com.tutuorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutuorialsninja.customlisteners.CustomListeners;
import com.tutuorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class HpLp3065Page extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[text()='HP LP3065']")
    WebElement textHPLP3065;

    @CacheLookup
    @FindBy(xpath = "//div[@class='input-group date']//button[@type='button']")
    WebElement deliveryDate;

    @CacheLookup
    @FindBy(id = "input-quantity")
    WebElement quantity;

    @CacheLookup
    @FindBy(xpath = "//button[text()='Add to Cart']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//div[text()='Success: You have added ']")
    WebElement textMessage;

    @CacheLookup
    @FindBy(xpath = "//a[text()='shopping cart']")
    WebElement shoppingCart;

    public void verifyTextHpLp3065(String expectedText) {
        Reporter.log("Verify Text HPLP3065: " + textHPLP3065.toString() + "<br>");
        verifyElements(textHPLP3065, expectedText, "error");
        CustomListeners.test.log(Status.PASS, "Verify Text HPLP3065: " + expectedText );

    }

    public void clickOnDeliveryDate() {
        String year = "2022";
        String month = "November";
        String date = "30";
        pmClickOnElement(By.xpath("//div[@class='input-group date']//button[@type='button']"));
        while (true) {
            String monthYear = driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='picker-switch']")).getText();
            System.out.println(monthYear); // Apr 2023
            String[] a = monthYear.split(" ");
            String mon = a[0];
            String yer = a[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                pmClickOnElement(By.xpath("//div[@class='datepicker-days']//th[@class='next'][contains(text(),'›')]"));
            }
        }
        // Select the date
        List<WebElement> allDates = driver.findElements(By.xpath("//tbody//tr//td[@class='day']"));
        for (WebElement dt : allDates) {
            if (dt.getText().equalsIgnoreCase(date)) {
                dt.click();
                break;
            }
        }
        CustomListeners.test.log(Status.PASS, "Click On Delivery Date: " );
    }

    public void inputQuantity(String qty) {
        Reporter.log("Input Quantity: " + quantity.toString() + "<br>");
        sendTextToElement(quantity, Keys.BACK_SPACE + qty);
        CustomListeners.test.log(Status.PASS, "Input Quantity: " + qty );
    }
    public void clickOnAddToCartBtn(){
        Reporter.log("Click On Add To Cart Button: " + addToCart.toString() + "<br>");
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS, "Click On Add To Cart Button: " );
    }
    public void verifyTextMessage(String expectedText){
        Reporter.log("Verify Text Message: " + textMessage.toString() + "<br>");
        verifyElements(textMessage, expectedText, "error");
        CustomListeners.test.log(Status.PASS, "Click On Text Message: " );
    }
    public void clickOnShoppingCart(){
        Reporter.log("Click On Shopping Cart: " + shoppingCart.toString() + "<br>");
        clickOnElement(shoppingCart);
        CustomListeners.test.log(Status.PASS, "Click On Shopping Cart: " );
    }
}
