package ua.work.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartWithProduct {
    private WebDriver driver;
    public static final String CART_PHOTO_LOCATOR = "//*[@id=\"tbodyid\"]/tr/td[1]";
    public static final String CART_NAME_LOCATOR = "//*[@id=\"tbodyid\"]/tr/td[2]";
    public static final String CART_PRICE_LOCATOR = "//*[@id=\"tbodyid\"]/tr/td[3]";
    public static final String CART_TOTAL_PRICE_LOCATOR = "//*[@id=\"page-wrapper\"]/div/div[2]/div";
    public static final String CART_DELETE_BUTTON_LOCATOR = "//*[@id=\"tbodyid\"]/tr/td[4]/a";
    public static final String CART_BUY_BUTTON_LOCATOR = "//*[@id=\"page-wrapper\"]/div/div[2]/button";

    private WebElement photoCart;
    private WebElement nameCart;
    private WebElement priceCart;
    private WebElement totalPrice;
    private WebElement deleteProduct;
    private WebElement buyCart;

    public CartWithProduct(WebDriver driver) {
        this.driver = driver;
        photoCart = driver.findElement(By.xpath(CART_PHOTO_LOCATOR));
        nameCart = driver.findElement(By.xpath(CART_NAME_LOCATOR));
        priceCart = driver.findElement(By.xpath(CART_PRICE_LOCATOR));
        totalPrice = driver.findElement(By.xpath(CART_TOTAL_PRICE_LOCATOR));
        deleteProduct = driver.findElement(By.xpath(CART_DELETE_BUTTON_LOCATOR));
        buyCart = driver.findElement(By.xpath(CART_BUY_BUTTON_LOCATOR));
    }

}
