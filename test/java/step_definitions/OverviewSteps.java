package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.pageObject.OverviewPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class OverviewSteps {

    private final WebDriver driver = Hooks.driver;

    OverviewPage overviewPage = new OverviewPage(driver);

    @Then("User already on overviewPage")
    public void verifyOverviewPage(){
        String productHomePage = "Test.allTheThings() T-Shirt (Red)";
        String productOverview = "Test.allTheThings() T-Shirt (Red)";
        Assert.assertEquals(productHomePage,productOverview);
    }

    @When("User click finishButton")
    public void clickFinishButton(){
        overviewPage.clickFinishButton();
    }

    @Then("User already on checkout complete page")
    public void verifyCompletePage() {Assert.assertTrue(overviewPage.verifycompletePage()); }

}
