package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {

    private final WebDriver driver = Hooks.driver;
    LoginPage loginPage = new LoginPage(driver);

    @When("User input {string} as a userName {string} as a password")
    public void inputCredential(String usrName, String pswd){
        loginPage.setUserName(usrName);
        loginPage.setPassword(pswd);
        loginPage.clickButtonLogin();
    }

    @Given("User open the website sauce demo")
    public void verifyLoginPage(){
        Assert.assertTrue(loginPage.userNameDisplayed());
    }

    @Then("User already on home page")
    public void verifyHomeProduct(){
        Assert.assertTrue(loginPage.verifyLabelProduct());
    }

    @Then("User see error {string} on login page")
    public void verifyLabelErrorText(String errorText){
        Assert.assertEquals(loginPage.getLabelErrorText(),errorText);
    }
}
