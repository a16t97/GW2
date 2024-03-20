package ua.work.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private WebDriver driver;
    public static final String LOGO_LOCATOR = "//*[@id=\"nava\"]/img";
    public static final String HEADER_HOME_LOCATOR = "//*[@id=\"navbarExample\"]/ul/li[1]";
    public static final String HEADER_CONTACT_LOCATOR = "//*[@id=\"navbarExample\"]/ul/li[2]";
    public static final String HEADER_ABOUT_LOCATOR = "//*[@id=\"navbarExample\"]/ul/li[3]";
    public static final String HEADER_CART_LOCATOR = "//*[@id=\"navbarExample\"]/ul/li[4]";
    public static final String HEADER_LOGIN_LOCATOR = "//*[@id=\"navbarExample\"]/ul/li[5]";
    public static final String HEADER_SING_UP_LOCATOR = "//*[@id=\"navbarExample\"]/ul/li[8]";
    public static final String BANNER_LOCATOR = "//*[@id=\"carouselExampleIndicators\"]/div/div[1]";
    public static final String BANNER_NEXT_BTN_LOCATOR = "//*[@id=\"carouselExampleIndicators\"]/div/div[1]";
    public static final String BANNER_PREVIOUS_BTN_LOCATOR = "//*[@id=\"carouselExampleIndicators\"]/a[1]/span[1]";
    public static final String CATEGORY_MENU_LOCATOR = "//*[@id=\"contcont\"]/div/div[1]/div";
    public static final String FOOTER_INFO_LOCATOR = "//*[@id=\"fotcont\"]/div[1]";
    public static final String FOOTER_ADDRESS_LOCATOR = "//*[@id=\"fotcont\"]/div[2]/div/div/p[1]";
    public static final String FOOTER_PHONE_LOCATOR = "//*[@id=\"fotcont\"]/div[2]/div/div/p[2]";
    public static final String FOOTER_EMAIL_LOCATOR = "//*[@id=\"fotcont\"]/div[2]/div/div/p[3]";
    public static final String FIRST_PRODUCT_CARD_LOCATOR = "//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a";

    private WebElement logo;
    private WebElement headerHome;
    private WebElement headerContact;
    private WebElement headerAbout;
    private WebElement headerCart;
    private WebElement logIn;
    private WebElement singUp;
    private WebElement banner;
    private WebElement btnNext;
    private WebElement btnPrev;
    private WebElement category;
    private WebElement info;
    private WebElement address;
    private WebElement phone;
    private WebElement email;
    private WebElement productCard;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        logo = driver.findElement(By.xpath(LOGO_LOCATOR));
        headerHome = driver.findElement(By.xpath(HEADER_HOME_LOCATOR));
        headerContact = driver.findElement(By.xpath(HEADER_CONTACT_LOCATOR));
        headerAbout = driver.findElement(By.xpath(HEADER_ABOUT_LOCATOR));
        headerCart = driver.findElement(By.xpath(HEADER_CART_LOCATOR));
        logIn = driver.findElement(By.xpath(HEADER_LOGIN_LOCATOR));
        singUp = driver.findElement(By.xpath(HEADER_SING_UP_LOCATOR));
        banner = driver.findElement(By.xpath(BANNER_LOCATOR));
        btnNext = driver.findElement(By.xpath(BANNER_NEXT_BTN_LOCATOR));
        btnPrev = driver.findElement(By.xpath(BANNER_PREVIOUS_BTN_LOCATOR));
        category = driver.findElement(By.xpath(CATEGORY_MENU_LOCATOR));
        info = driver.findElement(By.xpath(FOOTER_INFO_LOCATOR));
        address = driver.findElement(By.xpath(FOOTER_ADDRESS_LOCATOR));
        phone = driver.findElement(By.xpath(FOOTER_PHONE_LOCATOR));
        email = driver.findElement(By.xpath(FOOTER_EMAIL_LOCATOR));
        productCard = driver.findElement(By.xpath(FIRST_PRODUCT_CARD_LOCATOR));
    }

}