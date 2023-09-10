package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage {
    public static WebDriver webDriver;
    public OverviewPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(id = "finish")
    private WebElement finishButton;

    @FindBy(css = ".complete-text")
    private WebElement completePage;


    public void clickFinishButton(){finishButton.click();
    }

    public boolean verifycompletePage(){ return completePage.isDisplayed();}

}
