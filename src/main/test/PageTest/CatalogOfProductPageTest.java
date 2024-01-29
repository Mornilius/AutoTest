package PageTest;

import Utils.DefaultUsingMethods;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static Page.CatalogOfProductPage.beautyAndHealthLocator;
import static Page.CatalogOfProductPage.catalogTitleLocator;
import static Page.CatalogOfProductPage.constructionAndRenovationLocator;
import static Page.CatalogOfProductPage.findProductLocator;
import static Page.CatalogOfProductPage.gamingLocator;
import static Page.CatalogOfProductPage.giftLocator;
import static Page.CatalogOfProductPage.homeAppliancesLocator;
import static Page.CatalogOfProductPage.homeAutoLocator;
import static Page.CatalogOfProductPage.laptopsAndPcLocator;
import static Page.CatalogOfProductPage.officeEquipmentsAndFurnitureLocator;
import static Page.CatalogOfProductPage.officeSuppliesLocator;
import static Page.CatalogOfProductPage.salesProductsLocator;
import static Page.CatalogOfProductPage.serviceLocator;
import static Page.CatalogOfProductPage.smartphoneAndGadgetsLocator;
import static Page.CatalogOfProductPage.smartphoneAndGuardSystemLocator;
import static Page.CatalogOfProductPage.tvAudioVideoPhotoLocator;
import static Page.MainPage.catalogLocator;
import static Utils.DefaultUsingMethods.JSClick;
import static Utils.DefaultUsingMethods.browserQuit;
import static Utils.DefaultUsingMethods.explicitWait;
import static Utils.DefaultUsingMethods.isDisplay;
import static Utils.MassageConstants.NOT_ENABLE_MASSAGE;
import static org.testng.Assert.assertTrue;

public class CatalogOfProductPageTest {

    @BeforeClass
    public static void openSite() {
        DefaultUsingMethods.openSite();
    }

    @Test
    public static void checkCatalogOfProduct() {
        JSClick(catalogLocator);
        explicitWait(catalogLocator);
        explicitWait(catalogTitleLocator);
        assertTrue(isDisplay(catalogTitleLocator),NOT_ENABLE_MASSAGE + "CATALOG_TITLE_LOCATOR");
        assertTrue(isDisplay(findProductLocator),NOT_ENABLE_MASSAGE + "FIND_PRODUCT_LOCATOR");
        assertTrue(isDisplay(smartphoneAndGadgetsLocator),NOT_ENABLE_MASSAGE + "SMARTPHONE_AND_GADGETS_LOCATOR");
        assertTrue(isDisplay(laptopsAndPcLocator),NOT_ENABLE_MASSAGE + "LAPTOPS_AND_PC_LOCATOR");
        assertTrue(isDisplay(tvAudioVideoPhotoLocator),NOT_ENABLE_MASSAGE + "TV_AUDIO_VIDEO_PHOTO_LOCATOR");
        assertTrue(isDisplay(gamingLocator),NOT_ENABLE_MASSAGE + "GAMING_LOCATOR");
        assertTrue(isDisplay(homeAppliancesLocator),NOT_ENABLE_MASSAGE + "HOME_APPLIANCES_LOCATOR");
        assertTrue(isDisplay(beautyAndHealthLocator),NOT_ENABLE_MASSAGE + "BEAUTY_AND_HEALTH_LOCATOR");
        assertTrue(isDisplay(smartphoneAndGuardSystemLocator),NOT_ENABLE_MASSAGE + "SMARTHOME_AND_GUARD_SYSTEM_LOCATOR");
        assertTrue(isDisplay(officeEquipmentsAndFurnitureLocator),NOT_ENABLE_MASSAGE + "OFFICE_EQUIPMENTS_AND_FURNITURE_LOCATOR");
        assertTrue(isDisplay(officeSuppliesLocator),NOT_ENABLE_MASSAGE + "OFFICE_SUPPLIES_LOCATOR");
        assertTrue(isDisplay(constructionAndRenovationLocator),NOT_ENABLE_MASSAGE + "CONSTRUCTION_AND_RENOVATION_LOCATOR");
        assertTrue(isDisplay(homeAutoLocator),NOT_ENABLE_MASSAGE + "HOME_AUTO_LOCATOR");
        assertTrue(isDisplay(salesProductsLocator),NOT_ENABLE_MASSAGE + "SALES_PRODUCTS_LOCATOR");
        assertTrue(isDisplay(giftLocator),NOT_ENABLE_MASSAGE + "GIFT_LOCATOR");
        assertTrue(isDisplay(serviceLocator),NOT_ENABLE_MASSAGE + "SERVICE_LOCATOR");
        assertTrue(isDisplay(catalogLocator),NOT_ENABLE_MASSAGE + "CATALOG_TITLE_LOCATOR");
    }

    @AfterTest
    public static void quitBrowser() {
        browserQuit();
    }
}