package PageTest;

import Utils.DefaultUsingMethods;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static Page.CatalogMenuPhoneAndGadgetsPage.PRODUCT_LIST_PHONE_CHAPTER;
import static Page.CatalogMenuPhoneAndGadgetsPage.phoneContainerLocator;
import static Page.CatalogOfProductPage.catalogTitleLocator;
import static Page.MainPage.catalogLocator;
import static Utils.DefaultUsingMethods.browserQuit;
import static Utils.DefaultUsingMethods.getConvertedListOfProducts;
import static Utils.MassageConstants.FAIL_EQUALS_MASSAGE;
import static org.testng.Assert.assertEquals;

public class CatalogMenuPhoneAndGadgetsPageTest {

    @BeforeClass
    public static void openSite() {
        DefaultUsingMethods.openSite();
    }

    @Test
    public static void checkElemetsIsDisplay() {
        assertEquals(getConvertedListOfProducts(catalogLocator,catalogTitleLocator,phoneContainerLocator).toString(), PRODUCT_LIST_PHONE_CHAPTER.toString().toLowerCase(), FAIL_EQUALS_MASSAGE);
    }

    @AfterTest
    public static void exitBrowser() {
        browserQuit();
    }
}