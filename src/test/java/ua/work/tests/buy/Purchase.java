package ua.work.tests.buy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static ua.work.pageObject.CartWithProduct.CART_BUY_BUTTON_LOCATOR;
import static ua.work.pageObject.MainPage.FIRST_PRODUCT_CARD_LOCATOR;
import static ua.work.pageObject.MainPage.HEADER_CART_LOCATOR;
import static ua.work.pageObject.MainPage.HEADER_LOGIN_LOCATOR;
import static ua.work.pageObject.ModalCart.CHECKOUT_CARD_LOCATOR;
import static ua.work.pageObject.ModalCart.CHECKOUT_CITY_LOCATOR;
import static ua.work.pageObject.ModalCart.CHECKOUT_COUNTRY_LOCATOR;
import static ua.work.pageObject.ModalCart.CHECKOUT_MONTH_LOCATOR;
import static ua.work.pageObject.ModalCart.CHECKOUT_NAME_LOCATOR;
import static ua.work.pageObject.ModalCart.CHECKOUT_PURCHASE_LOCATOR;
import static ua.work.pageObject.ModalCart.CHECKOUT_YEAR_LOCATOR;
import static ua.work.pageObject.ModalLogIn.LOGIN_BTN_LOCATOR;
import static ua.work.pageObject.ModalLogIn.LOGIN_PASSWORD_LOCATOR;
import static ua.work.pageObject.ModalLogIn.LOGIN_USERNAME_LOCATOR;
import static ua.work.pageObject.ProductPage.BUY_BUTTON_LOCATOR;

public class Purchase {
    String baseUrl = "https://www.demoblaze.com/";
    WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void beforeTest() {
        driver.get(baseUrl);
    }

    @AfterTest
    public void afterTest(){
        driver.close();
    }

    @Test
    public void purchase() throws InterruptedException {
        driver.findElement(By.xpath(HEADER_LOGIN_LOCATOR)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LOGIN_USERNAME_LOCATOR)).sendKeys("anna tarasenko");
        driver.findElement(By.xpath(LOGIN_PASSWORD_LOCATOR)).sendKeys("123456789");
        driver.findElement(By.xpath(LOGIN_BTN_LOCATOR)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(FIRST_PRODUCT_CARD_LOCATOR)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(BUY_BUTTON_LOCATOR)).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(50));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert(); // receive the notification object
        // receive the notification text
        String alertText = alert.getText();
        System.out.println("Alert text: " + alertText);
        alert.accept(); //click OK
        Thread.sleep(1000);
        driver.findElement(By.xpath(HEADER_CART_LOCATOR)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(CART_BUY_BUTTON_LOCATOR)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(CHECKOUT_NAME_LOCATOR)).sendKeys("Anna");
        driver.findElement(By.xpath(CHECKOUT_COUNTRY_LOCATOR)).sendKeys("Ukraine");
        driver.findElement(By.xpath(CHECKOUT_CITY_LOCATOR)).sendKeys("Kyiv");
        driver.findElement(By.xpath(CHECKOUT_CARD_LOCATOR)).sendKeys("123456789456123");
        driver.findElement(By.xpath(CHECKOUT_MONTH_LOCATOR)).sendKeys("July");
        driver.findElement(By.xpath(CHECKOUT_YEAR_LOCATOR)).sendKeys("2029");
        driver.findElement(By.xpath(CHECKOUT_PURCHASE_LOCATOR)).click();
        Assert.assertTrue(true, "Thank you for your purchase!");

    }
}