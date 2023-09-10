package step_definitions;

import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;
import org.example.pageObject.CheckoutInfoPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckoutInfoSteps {
    private final WebDriver driver = Hooks.driver;

    CheckoutInfoPage checkoutInfo = new CheckoutInfoPage(driver);

    @Then("User already on Checkout Information Page")
    public void verifyCheckoutInfoPage(){Assert.assertTrue(checkoutInfo.verifyContinueButton());}

    @When("User Input {string} as firstName, {string} as a lastName and {string} as postalCode")
    public void inputCredential(String firstN, String lastN, String postalC) throws InterruptedException{
        checkoutInfo.inputFirstName(firstN);
        checkoutInfo.inputLastName(lastN);
        checkoutInfo.inputPostalCode(postalC);
    }
    @And("User click Continue Button on Cart Information")
    public void clickContinueButton(){checkoutInfo.clickContinueButton();}

}
