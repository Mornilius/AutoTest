package PageTest;

import Utils.DefaultUsingMethods;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static Page.CatalogOfProductPage.*;
import static Page.MainPage.catalogLocator;
import static Utils.DefaultUsingMethods.*;
import static org.testng.Assert.assertTrue;

public class CatalogOfProductPageTest {

    @DataProvider(name = "checkCatalogOfProduct")
    public static Object[] arrayXpath() {
        return new Object[]{
                catalogTitleLocator,
                findProductLocator,
                smartphoneAndGadgetsLocator,
                laptopsAndPcLocator,
                tvAudioVideoPhotoLocator,
                gamingLocator,
                homeAppliancesLocator,
                beautyAndHealthLocator,
                smartphoneAndGuardSystemLocator,
                officeEquipmentsAndFurnitureLocator,
                officeSuppliesLocator,
                constructionAndRenovationLocator,
                homeAutoLocator,
                salesProductsLocator,
                giftLocator,
                serviceLocator,
                catalogLocator,
        };
    }

    @BeforeClass
    public static void openSite() {
        DefaultUsingMethods.openSite();
    }

    @Test(dataProvider = "checkCatalogOfProduct")
    public static void checkCatalogOfProduct(By xpath) {
        JSClick(catalogLocator);
        explicitWait(catalogLocator);
        explicitWait(catalogTitleLocator);
        assertTrue(isDisplay(xpath));
    }

    @AfterTest
    public static void quitBrowser() {
        browserQuit();
    }
}