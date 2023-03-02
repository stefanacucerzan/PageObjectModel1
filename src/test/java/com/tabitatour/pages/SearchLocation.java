package com.tabitatour.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchLocation extends BasePage{
    public final static String SearchLocation_URL = BASE_URL+"searchlocations";
    private WebDriver driver;
    public SearchLocation(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"CybotCookiebotDialogBodyLevelButtonAccept\"]") private WebElement okCookieButton;
    public void clickOkCookieButton(){
        okCookieButton.click();
    }
    @FindBy(id = "intern-tab") private WebElement intern;
    public void clickIntern(){intern.click();}

    @FindBy(xpath="//*[@id=\"internalDeparturePlace\"]") public WebElement orasDePlecare;
    public void  enterOrasDePlecare(){
        orasDePlecare.sendKeys("Cluj Napoca");
    }

    @FindBy(xpath="//*[@id=\"dropdown\"]/option[3]") private WebElement orasDeSosire;
    public void enterOrasDeSosire(){

        orasDeSosire.sendKeys("bistrita nasaud");
    }
    @FindBy(xpath = "//*[@id=\"searchTrips\"]") private WebElement cauta;

    public void clickCauta (){

        cauta.click();
    }
//    @FindBy(xpath = "//*[@id=\"policyNewsletter\"]") private WebElement checkbox;
    @FindBy(xpath = "//*[@id=\"subscribeNews\"]") private WebElement maAbonez;

    public void clikAbonament() {

        maAbonez.click();
    }



//    public void clickAcceptCookies(){
//        okCookieButton.click();
//    }

}
