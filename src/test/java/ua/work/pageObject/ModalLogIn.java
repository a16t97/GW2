package ua.work.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ModalLogIn {
    private WebDriver driver;
    public static final String LOGIN_USERNAME_LOCATOR = "//*[@id=\"loginusername\"]";
    public static final String LOGIN_PASSWORD_LOCATOR = "//*[@id=\"loginpassword\"]";
    public static final String LOGIN_CLOSE_BTN_LOCATOR = "//*[@id=\"logInModal\"]/div/div/div[3]/button[1]";
    public static final String LOGIN_BTN_LOCATOR = "//*[@id=\"logInModal\"]/div/div/div[3]/button[2]";
    public static final String LOGIN_CLOSE_UP_LOCATOR = "//*[@id=\"logInModal\"]/div/div/div[1]/button";

    private WebElement logName;
    private WebElement logPassword;
    private WebElement logClose;
    private WebElement logBtn;
    private WebElement cross;

    public ModalLogIn(WebDriver driver) {
        this.driver = driver;
        logName = driver.findElement(By.xpath(LOGIN_USERNAME_LOCATOR));
        logPassword = driver.findElement(By.xpath(LOGIN_PASSWORD_LOCATOR));
        logClose = driver.findElement(By.xpath(LOGIN_CLOSE_BTN_LOCATOR));
        logBtn = driver.findElement(By.xpath(LOGIN_BTN_LOCATOR));
        cross = driver.findElement(By.xpath(LOGIN_CLOSE_UP_LOCATOR));
    }
    }
