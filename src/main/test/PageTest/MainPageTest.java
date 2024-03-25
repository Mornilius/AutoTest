package PageTest;

import Utils.DefaultUsingMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;

import static Page.MainPage.*;
import static Utils.DefaultUsingMethods.*;
import static Utils.MassageConstants.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class MainPageTest {

    @DataProvider(name = "checkSite")
    public static Object[] arrayXpath(){
        return new Object[]{
                logoLocator,
                catalogLocator,
                findProductLocator,
                inputAccountLocator,
                favoritesLocator,
                compareLocator,
                shoppingCartLocator,
                feedbackLocator,
                shopsLocator,
                deliveryLocator,
                configLocator,
                salesLocator,
                magazineLocator
        };
    }

    @BeforeClass
    public static void openSite() {
        DefaultUsingMethods.openSite();
    }

    @Test(dataProvider = "checkSite")
    public static void checkOpenSite(By xpath) {
        assertTrue(isDisplay(xpath));
    }

    @Test(dataProvider = "checkSite")
    public static void checkClickableElementOnTopBar(By xpath) {
        assertTrue(isEnable(xpath));
    }

    @Ignore
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