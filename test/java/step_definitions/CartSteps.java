package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.example.pageObject.CartPage;
import org.example.pageObject.HomePage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CartSteps {
    private WebDriver driver = Hooks.driver;

    CartPage cartPage = new CartPage(driver);

    @When("User click Sauce Labs Onesie Remove Button")
    public void clickRemoveButton() throws InterruptedException{
        cartPage.clickRemoveButton();
        
    }

    @And("User click Checkout Button")
    public void clickCheckoutButton() throws InterruptedException{
        cartPage.clickCheckout();
        
    }
}
