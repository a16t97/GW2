package ua.work.pageObject;

import org.openqa.selenium.WebDriver;

public class ModalCart {
    private WebDriver driver;
    public static final String CHECKOUT_NAME_LOCATOR = "//*[@id=\"name\"]";
    public static final String CHECKOUT_COUNTRY_LOCATOR = "//*[@id=\"country\"]";
    public static final String CHECKOUT_CITY_LOCATOR = "//*[@id=\"city\"]";
    public static final String CHECKOUT_CARD_LOCATOR = "//*[@id=\"card\"]";
    public static final String CHECKOUT_MONTH_LOCATOR = "//*[@id=\"month\"]";
    public static final String CHECKOUT_YEAR_LOCATOR = "//*[@id=\"year\"]";
    public static final String CHECKOUT_PURCHASE_LOCATOR = "//*[@id=\"orderModal\"]/div/div/div[3]/button[2]";
    public static final String CHECKOUT_CLOSE = "//*[@id=\"orderModal\"]/div/div/div[3]/button[1]";
}
