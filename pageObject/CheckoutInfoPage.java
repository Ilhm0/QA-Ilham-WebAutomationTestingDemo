package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutInfoPage {
    public static WebDriver webDriver;

    public CheckoutInfoPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueButton;

    @FindBy(css = "#first-name")
    private WebElement firstNameField;

    @FindBy(id = "last-name")
    private WebElement lastNameField;

    @FindBy(name = "postalCode")
    private WebElement postalField;


    public boolean verifyContinueButton(){return continueButton.isDisplayed();}

    public void inputFirstName(String firsrNme){firstNameField.sendKeys(firsrNme);}

    public void inputLastName(String lastNme){lastNameField.sendKeys(lastNme);}

    public void inputPostalCode(String postalCde){postalField.sendKeys(postalCde);}

    public void clickContinueButton(){continueButton.click();
    }






}
