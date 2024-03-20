package ua.work.tests.account;

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

import static ua.work.pageObject.MainPage.HEADER_SING_UP_LOCATOR;
import static ua.work.pageObject.ModalSingUp.SINGUP_BTN_LOCATOR;
import static ua.work.pageObject.ModalSingUp.SINGUP_PASSWORD_LOCATOR;
import static ua.work.pageObject.ModalSingUp.SINGUP_USERNAME_LOCATOR;


public class CreateAccount {

    String baseUrl = "https://www.demoblaze.com/";
    WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void beforeTest() {
        driver.get(baseUrl);
    }

//    @AfterTest
//    public void afterTest(){
//        driver.close();
//    }

    @Test(priority = 1)
    public void singUp() throws InterruptedException {
        driver.findElement(By.xpath(HEADER_SING_UP_LOCATOR)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(SINGUP_USERNAME_LOCATOR)).sendKeys("userName1");
        driver.findElement(By.xpath(SINGUP_PASSWORD_LOCATOR)).sendKeys("passwordUser1");
        driver.findElement(By.xpath(SINGUP_BTN_LOCATOR)).click();
        Assert.assertTrue(true, "Sign up successful.");
//      Waiting for alert
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert(); // receive the notification object
        // receive the notification text
        String alertText = alert.getText();
        System.out.println("Alert text: " + alertText);
        alert.accept(); //click OK
    }

//    @Test(priority = 2)
//    public void existUser() throws InterruptedException {
//        driver.findElement(By.id("signin2")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.id("sign-username")).sendKeys("Hannvna hrs");
//        driver.findElement(By.id("sign-password")).sendKeys("Anna16_02");
//        driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
//        Assert.assertTrue(true, "This user already exist.");
//    }
}
