package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.example.pageObject.HomePage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class HomeSteps {
    private WebDriver driver = Hooks.driver;

    HomePage homePage = new HomePage(driver);


    @When("User filter list product by {string}")
    public void selectFilterProduct(String filterProduct) throws InterruptedException {
        homePage.selectFilterProduct(filterProduct);

    }

    @And("User click add to cart T-shirt Red and Sauce Labs Onesie")
    public void clickAddToChart()throws InterruptedException{
        homePage.clickAddCartButtonRedTshirt();
        homePage.clickAddCartButtonSauceLabsOnesie();

    }

    @Then("User click shopping cart button")
    public void clickCart()throws InterruptedException{
        homePage.clickShoppingCartButton();
    }

    @And("User already on shopping cart")
    public void verifycheckOutPage(){Assert.assertTrue(homePage.verifyCheckoutPage());}









}
