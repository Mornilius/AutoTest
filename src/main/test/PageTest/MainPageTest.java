package PageTest;

import Utils.DefaultUsingMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static Page.MainPage.addButtonLocator;
import static Page.MainPage.catalogLocator;
import static Page.MainPage.checkPointAfterSearchLocator;
import static Page.MainPage.compareLocator;
import static Page.MainPage.configLocator;
import static Page.MainPage.deliveryLocator;
import static Page.MainPage.favoritesLocator;
import static Page.MainPage.feedbackLocator;
import static Page.MainPage.findProductLocator;
import static Page.MainPage.inputAccountLocator;
import static Page.MainPage.logoLocator;
import static Page.MainPage.magazineLocator;
import static Page.MainPage.productDescriptionLocator;
import static Page.MainPage.salesLocator;
import static Page.MainPage.shoppingCartLocator;
import static Page.MainPage.shopsLocator;
import static Page.MainPage.snippetProductVerticalLayoutLocator;
import static Utils.DefaultUsingMethods.JSClick;
import static Utils.DefaultUsingMethods.browserQuit;
import static Utils.DefaultUsingMethods.convertList;
import static Utils.DefaultUsingMethods.explicitWait;
import static Utils.DefaultUsingMethods.getResponseCode;
import static Utils.DefaultUsingMethods.isDisplay;
import static Utils.DefaultUsingMethods.isEnable;
import static Utils.DefaultUsingMethods.sendKeys;
import static Utils.MassageConstants.FAIL_CODE_MASSAGE;
import static Utils.MassageConstants.NOT_ENABLE_MASSAGE;
import static Utils.MassageConstants.NOT_VISIBLE_MASSAGE;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class MainPageTest {

    @BeforeClass
    public static void openSite() {
        DefaultUsingMethods.openSite();
    }

    @Test
    public static void checkOpenSite() {
        //TODO: в строке 55 дублирование статус кода, чекнуть интерфейс HttpsStatus
        assertEquals(getResponseCode(), 200, String.format(FAIL_CODE_MASSAGE, 200));
        assertTrue(isDisplay(logoLocator),NOT_ENABLE_MASSAGE + "LOGO_LOCATOR");
        assertTrue(isDisplay(catalogLocator),NOT_ENABLE_MASSAGE+ "CATALOG_LOCATOR");
        assertTrue(isDisplay(findProductLocator),NOT_ENABLE_MASSAGE+ "FIND_PRODUCT_LOCATOR");
        assertTrue(isDisplay(inputAccountLocator),NOT_ENABLE_MASSAGE+ "INPUT_ACCOUNT_LOCATOR");
        assertTrue(isDisplay(favoritesLocator),NOT_ENABLE_MASSAGE+ "FAVORITES_LOCATOR");
        assertTrue(isDisplay(compareLocator),NOT_ENABLE_MASSAGE+ "COMPARE_LOCATOR");
        assertTrue(isDisplay(shoppingCartLocator),NOT_ENABLE_MASSAGE+ "SHOPPING_CART_LOCATOR");
        assertTrue(isDisplay(feedbackLocator),NOT_ENABLE_MASSAGE+ "FEEDBACK_LOCATOR");
        assertTrue(isDisplay(shopsLocator),NOT_ENABLE_MASSAGE+ "SHOPS_LOCATOR");
        assertTrue(isDisplay(deliveryLocator),NOT_ENABLE_MASSAGE+ "DELIVERY_LOCATOR");
        assertTrue(isDisplay(configLocator),NOT_ENABLE_MASSAGE+ "CONFIG_LOCATOR");
        assertTrue(isDisplay(salesLocator),NOT_ENABLE_MASSAGE+ "SALES_LOCATOR");
        assertTrue(isDisplay(magazineLocator),NOT_ENABLE_MASSAGE + "MAGAZINE_LOCATOR");
    }

    @Test
    public static void checkClickableElementOnTopBar() {
        assertTrue(isEnable(logoLocator), NOT_ENABLE_MASSAGE + "LOGO_LOCATOR");
        assertTrue(isEnable(catalogLocator), NOT_ENABLE_MASSAGE + "CATALOG_LOCATOR");
        assertTrue(isEnable(findProductLocator), NOT_ENABLE_MASSAGE + "FIND_PRODUCT_LOCATOR");
        assertTrue(isEnable(inputAccountLocator), NOT_ENABLE_MASSAGE + "INPUT_ACCOUNT_LOCATOR");
        assertTrue(isEnable(favoritesLocator), NOT_ENABLE_MASSAGE + "FAVORITES_LOCATOR");
        assertTrue(isEnable(compareLocator), NOT_ENABLE_MASSAGE + "COMPARE_LOCATOR");
        assertTrue(isEnable(shoppingCartLocator), NOT_ENABLE_MASSAGE + "SHOPPING_CART_LOCATOR");
        assertTrue(isEnable(feedbackLocator), NOT_ENABLE_MASSAGE + "FEEDBACK_LOCATOR");
        assertTrue(isEnable(shopsLocator), NOT_ENABLE_MASSAGE + "SHOPS_LOCATOR");
        assertTrue(isEnable(deliveryLocator), NOT_ENABLE_MASSAGE + "DELIVERY_LOCATOR");
        assertTrue(isEnable(configLocator), NOT_ENABLE_MASSAGE + "CONFIG_LOCATOR");
        assertTrue(isEnable(salesLocator), NOT_ENABLE_MASSAGE + "SALES_LOCATOR");
        assertTrue(isEnable(magazineLocator), NOT_ENABLE_MASSAGE + "MAGAZINE_LOCATOR");
    }

    @Test
    public static void findAndAddToShoppingCart() {
        DefaultUsingMethods.findAndAddToShoppingCart(
                findProductLocator,
                "iphone 13",
                checkPointAfterSearchLocator,
                addButtonLocator,
                snippetProductVerticalLayoutLocator);

        assertTrue(isDisplay(productDescriptionLocator), NOT_VISIBLE_MASSAGE);
    }

    @Ignore
    public static void testMethod() {
        List<WebElement> WEBELEMENTS_STRING =new ArrayList<>();
        List<WebElement> WEB_ELEMENTS_STRING =new ArrayList<>();
        List<String> ELEMENTS_STRING =new ArrayList<>();
        sendKeys(findProductLocator, "iphone 13", By.xpath("//div[contains(@data-meta-name,'ProductVerticalSnippet')]"));
        convertList(By.xpath("//button[contains(@data-meta-name, 'Snippet__cart-button')]/ancestor::div[@data-meta-product-id='1901131']"), WEBELEMENTS_STRING, ELEMENTS_STRING);
        JSClick(addButtonLocator);
        explicitWait(By.xpath("//div[contains(@data-meta-name, 'UpsaleBasketLayout')]"));
        convertList(By.xpath("//div[contains(@data-meta-name, 'UpsaleBasketProductDetails')]"), WEB_ELEMENTS_STRING, ELEMENTS_STRING);
    }

    @AfterTest
    public static void exitBrowser() {
        browserQuit();
    }
}