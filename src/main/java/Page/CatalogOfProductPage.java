package Page;

import org.openqa.selenium.By;

public class CatalogOfProductPage {

    public static final String CATEGORY_MENU = "//div[contains(@data-meta-name,'CatalogMenuDesktopLayout__menu')]//*[normalize-space(text())='%s']";

    public static final By catalogTitleLocator = By.xpath("//div[contains(@data-meta-name,'CatalogMenuDesktopLayout__title')]");
    public static final By findProductLocator = By.xpath("//div[@data-meta-name='CatalogMenuDesktopLayout__search']//input[@placeholder='Поиск по товарам']");
    public static final By closeButtonLocator = By.xpath("//div[contains(@data-meta-name,'CatalogMenuDesktopLayout__close')]");
    public static final By smartphoneAndGadgetsLocator = By.xpath(String.format(CATEGORY_MENU,"Смартфоны и планшеты"));
    public static final By laptopsAndPcLocator = By.xpath(String.format(CATEGORY_MENU,"Ноутбуки и компьютеры"));
    public static final By tvAudioVideoPhotoLocator = By.xpath(String.format(CATEGORY_MENU,"Телевизоры, аудио-видео техника"));
    public static final By gamingLocator = By.xpath(String.format(CATEGORY_MENU,"Товары для геймеров"));
    public static final By homeAppliancesLocator = By.xpath(String.format(CATEGORY_MENU,"Бытовая техника"));
    public static final By beautyAndHealthLocator = By.xpath(String.format(CATEGORY_MENU,"Красота и здоровье"));
    public static final By smartphoneAndGuardSystemLocator = By.xpath(String.format(CATEGORY_MENU,"Умный дом и системы безопасности"));
    public static final By officeEquipmentsAndFurnitureLocator = By.xpath(String.format(CATEGORY_MENU,"Офисная техника и мебель"));
    public static final By officeSuppliesLocator = By.xpath(String.format(CATEGORY_MENU,"Канцтовары"));
    public static final By constructionAndRenovationLocator = By.xpath(String.format(CATEGORY_MENU,"Строительство и ремонт"));
    public static final By homeAutoLocator = By.xpath(String.format(CATEGORY_MENU,"Дом, дача и авто"));
    public static final By salesProductsLocator = By.xpath(String.format(CATEGORY_MENU,"Уцененные товары"));
    public static final By giftLocator = By.xpath(String.format(CATEGORY_MENU,"Подарочные сертификаты"));
    public static final By serviceLocator = By.xpath(String.format(CATEGORY_MENU,"Сервисы и услуги"));
}
