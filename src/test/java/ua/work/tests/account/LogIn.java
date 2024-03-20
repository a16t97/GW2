package ua.work.tests.account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static ua.work.pageObject.MainPage.HEADER_LOGIN_LOCATOR;
import static ua.work.pageObject.ModalLogIn.LOGIN_BTN_LOCATOR;
import static ua.work.pageObject.ModalLogIn.LOGIN_PASSWORD_LOCATOR;
import static ua.work.pageObject.ModalLogIn.LOGIN_USERNAME_LOCATOR;

public class LogIn {
    String baseUrl = "https://www.demoblaze.com/";
    WebDriver driver = new ChromeDriver();
    String UserName = "anna tarasenko";
    String Password = "123456789";

    @BeforeTest
    public void beforeTest() {
        driver.get(baseUrl);
    }

    @AfterTest
    public void afterTest(){
        driver.close();
    }

    @Test
    public void logIn() throws InterruptedException {
        driver.findElement(By.xpath(HEADER_LOGIN_LOCATOR)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LOGIN_USERNAME_LOCATOR)).sendKeys(UserName);
        driver.findElement(By.xpath(LOGIN_PASSWORD_LOCATOR)).sendKeys(Password);
        driver.findElement(By.xpath(LOGIN_BTN_LOCATOR)).click();

    }
}