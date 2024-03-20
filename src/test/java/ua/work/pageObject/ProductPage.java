package ua.work.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
    private WebDriver driver;
    public static final String PHOTO_LOCATOR = "//*[@id=\"imgp\"]/div";
    public static final String NAME_LOCATOR = "//*[@id=\"tbodyid\"]/h2";
    public static final String PRICE_LOCATOR = "//*[@id=\"tbodyid\"]/h3";
    public static final String DESCRIPTION_LOCATOR = "//*[@id=\"tbodyid\"]/div[1]";
    public static final String BUY_BUTTON_LOCATOR = "//*[@id=\"tbodyid\"]/div[2]/div";

    private WebElement photo;
    private WebElement name;
    private WebElement price;
    private WebElement description;
    private WebElement buyButton;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        photo = driver.findElement(By.xpath(PHOTO_LOCATOR));
        name = driver.findElement(By.xpath(NAME_LOCATOR));
        price = driver.findElement(By.xpath(PRICE_LOCATOR));
        description = driver.findElement(By.xpath(DESCRIPTION_LOCATOR));
        buyButton = driver.findElement(By.xpath(BUY_BUTTON_LOCATOR));
    }
}
