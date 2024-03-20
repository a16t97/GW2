package ua.work.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {

    @Given("Користувач відкриває сторінку товару")
    public void navigateToProductPage() {
        // Реалізація навігації на сторінку товару
    }

    @When("Користувач натискає кнопку \"Add to cart\"")
    public void clickAddToCartButton() {
        // Реалізація натискання кнопки "Add to cart"
    }

    @Then("Товар додається до кошика")
    public void verifyProductAddedToCart() {
        // Реалізація перевірки, що товар доданий до кошика
    }

}
