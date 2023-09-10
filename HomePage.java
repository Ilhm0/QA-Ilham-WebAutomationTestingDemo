package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
    public static WebDriver webDriver;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
            webDriver = driver;
    }

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement filterProduct;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(xpath = "(//button[text()='Add to cart'])[1]")
    private WebElement addCartRedTshirt;

    @FindBy(xpath = "(//button[text()='Add to cart'])[2]")
    private WebElement addCartSauceLabsOnesie;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement shoppingCartButton;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkout;

    public void selectFilterProduct(String fltrProduct){
        Select filter = new Select(filterProduct);
        filter.selectByVisibleText(fltrProduct);
    }

    public void clickAddCartButtonRedTshirt(){
        addCartRedTshirt.click();
    }
    public void clickAddCartButtonSauceLabsOnesie(){
        addCartRedTshirt.click();
    }

    public void clickShoppingCartButton(){
        shoppingCartButton.click();
    }

    public boolean verifyCheckoutPage(){
        return checkout.isDisplayed();
    }

}
