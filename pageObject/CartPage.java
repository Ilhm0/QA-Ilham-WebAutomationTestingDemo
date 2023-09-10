package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    public static WebDriver webDriver;

    public CartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "(//button[text()='Remove'])[1]")
    private WebElement remove;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkout;

    public void clickRemoveButton() {
        remove.click();
    }

    public void clickCheckout(){
        checkout.click();
    }
}


