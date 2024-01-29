package Page;

import org.openqa.selenium.By;

public class MainPage {

    public static final String USER_PANEL = "//div[contains(@class,'css-1cs774w e10bp8150')]//*[normalize-space(text())='%s']";

    public static final By logoLocator = By.xpath("//div[contains(@class,'fresnel-container fresnel-greaterThanOrEqual-tabletL ')]//div[contains(@data-meta-name,'Logo')]");
    public static final By catalogLocator = By.xpath("//a[contains(@data-meta-name,'DesktopHeaderFixed__catalog-menu')]//*[text()='Каталог товаров']");
    public static final By findProductLocator = By.xpath("//div[contains(@data-meta-name,'HeaderBottom__search')]//input[contains(@type,'search')]");
    public static final By inputAccountLocator = By.xpath(String.format(USER_PANEL, "Войти"));
    public static final By favoritesLocator = By.xpath(String.format(USER_PANEL, "Избранное"));
    public static final By compareLocator = By.xpath(String.format(USER_PANEL, "Сравнение"));
    public static final By shoppingCartLocator = By.xpath(String.format(USER_PANEL, "Корзина"));
    public static final By feedbackLocator = By.xpath("//span[text()='Обратная связь']");
    public static final By shopsLocator = By.xpath("//span[text()='Магазины']");
    public static final By deliveryLocator = By.xpath("//span[text()='Доставка']");
    public static final By configLocator = By.xpath("//span[text()='Конфигуратор']");
    public static final By salesLocator = By.xpath("//span[text()='Акции']");
    public static final By magazineLocator = By.xpath("//span[text()='Журнал']");
    public static final By searchResultLocator = By.xpath("//div[contains(@class, 'app-catalog-dyg8ga ev21ige0')]");
    public static final By addButtonLocator = By.xpath("//button[contains(@data-meta-name, 'Snippet__cart-button')]");
    public static final By productDescriptionLocator = By.xpath("//*[contains(text(),'Смартфон Apple iPhone 13 128Gb,  A2633,  темная ночь')]");
    public static final By checkPointAfterSearchLocator = By.xpath("//div[contains(@data-meta-name,'ProductListLayout')]");
    public static final By snippetProductVerticalLayoutLocator = By.xpath("(//div[contains(@data-meta-name, 'SnippetProductVerticalLayout')])");
}
