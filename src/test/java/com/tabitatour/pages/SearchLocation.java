package com.tabitatour.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;

public class SearchLocation extends BasePage{
    public final static String SearchLocation_URL = BASE_URL+"searchlocations";
    private WebDriver driver;
    public SearchLocation(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"CybotCookiebotDialogBodyLevelButtonAccept\"]") private WebElement okCookieButton;
    public void OkCookieButton(){
        okCookieButton.click();
    }
    @FindBy(id = "intern-tab") private WebElement intern;
    Select select = new Select(intern);
    @FindBy(xpath="//*[@id=\"internalDeparturePlace\"]") private WebElement orasDePlecare;
    public  void  OrasDePlecare(){
        orasDePlecare.click();
    }

    @FindBy(xpath="//*[@id=\"dropdown\"]/option[3]") private WebElement orasDeSosire;
    public void OrasDeSosire(){
        orasDeSosire.click();
    }
    @FindBy(xpath = "//*[@id=\"searchTrips\"]") private WebElement cauta;
    public void Cauta (){

        cauta.click();
    }
//    @FindBy(xpath = "//*[@id=\"policyNewsletter\"]") private WebElement checkbox;
    @FindBy(xpath = "//*[@id=\"subscribeNews\"]") private WebElement maAbonez;
    public void clickAcceptCookies(){
        okCookieButton.click();
    }

}
