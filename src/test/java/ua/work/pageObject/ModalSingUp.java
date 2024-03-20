package ua.work.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ModalSingUp {
    private WebDriver driver;
    public static final String SINGUP_USERNAME_LOCATOR = "//*[@id=\"sign-username\"]";
    public static final String SINGUP_PASSWORD_LOCATOR = "//*[@id=\"sign-password\"]";
    public static final String SINGUP_CLOSE_BTN_LOCATOR = "//*[@id=\"signInModal\"]/div/div/div[3]/button[1]";
    public static final String SINGUP_BTN_LOCATOR = "//*[@id=\"signInModal\"]/div/div/div[3]/button[2]";
    public static final String SINGUP_CLOSE_UP_LOCATOR = "//*[@id=\"signInModal\"]/div/div/div[1]/button";

    private WebElement singName;
    private WebElement singPassword;
    private WebElement singClose;
    private WebElement singBtn;
    private WebElement singCross;

    public ModalSingUp(WebDriver driver) {
        this.driver = driver;
        singName = driver.findElement(By.xpath(SINGUP_USERNAME_LOCATOR));
        singPassword = driver.findElement(By.xpath(SINGUP_PASSWORD_LOCATOR));
        singClose = driver.findElement(By.xpath(SINGUP_CLOSE_BTN_LOCATOR));
        singBtn = driver.findElement(By.xpath(SINGUP_BTN_LOCATOR));
        singCross = driver.findElement(By.xpath(SINGUP_CLOSE_UP_LOCATOR));
    }
}