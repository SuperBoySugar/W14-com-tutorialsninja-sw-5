package com.tutuorialsninja.testsuite;

import com.tutuorialsninja.customlisteners.CustomListeners;
import com.tutuorialsninja.pages.ComponantsPage;
import com.tutuorialsninja.pages.DesktopPage;
import com.tutuorialsninja.pages.HomePage;
import com.tutuorialsninja.pages.LaptopsAndNotebooks;
import com.tutuorialsninja.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class TopMenuTest extends BaseTest {

    HomePage homePage;
    DesktopPage desktopPage;
    LaptopsAndNotebooks laptopsAndNotebooks;
    ComponantsPage componantsPage;

    @BeforeMethod(groups = {"sanity", "smoke", "regression"})
    public void inIt() {

        homePage = new HomePage();
        desktopPage = new DesktopPage();
        laptopsAndNotebooks = new LaptopsAndNotebooks();
        componantsPage = new ComponantsPage();
    }

    @Test (groups = {"sanity"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        // Mouse hover and click on desktop
        homePage.mouseHoverAndClickOnDesktop();
        // Click on Show all desktop
        homePage.selectMenu("Show AllDesktops");
        // Verify desktop title
        desktopPage.verifyDeskTopTitle("Desktops");
    }

    @Test (groups = {"smoke"})
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {

        // Mouse hover and Click on Laptop and notebooks
        homePage.mouseHoverAndClickOnLaptopsAndNotebooks();
        // Click on Show all laptop and notebook
        homePage.selectMenu("Show AllLaptops & Notebooks");
        // Verify Laptop and Notebooks
        laptopsAndNotebooks.verifyTextLaptosAndNotebooks("Laptops & Notebooks");
    }

    @Test (groups = {"regression"})
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        // Mouse hover on components
        homePage.mouseHoverOnComponantsAndClick();
        // Click on Show all components
        homePage.selectMenu("Show AllComponents");
        // Verify text Components
        componantsPage.verifyTextComponants("Components");
    }
}
