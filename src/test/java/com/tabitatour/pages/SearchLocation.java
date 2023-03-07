package com.tabitatour.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v109.css.model.Value;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import javax.xml.xpath.XPath;
import java.security.PublicKey;

public class SearchLocation extends PaginaDeBaza {


    private WebDriver driver;

    public SearchLocation(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"CybotCookiebotDialogBodyLevelButtonAccept\"]")
    private WebElement okCookieButton;

    public void clickOkCookieButton() {

        okCookieButton.click();}
    @FindBy(xpath = "//*[@id=\"externalDeparturePlace\"]") public WebElement orasDePlecare;

    public void enterOrasDePlecare() {

        orasDePlecare.sendKeys("Cluj Napoca");
        orasDePlecare.sendKeys(Keys.ARROW_DOWN);
//        orasDePlecare.click();
//        orasDePlecare.sendKeys(Keys.TAB);
        orasDePlecare.sendKeys(Keys.ENTER);}




    @FindBy(xpath = "//*[@id=\"externalArrivalPlace\"]")
    private WebElement localitateDeDestinatie;

    public void enterOrasDeSosire() {

        localitateDeDestinatie.sendKeys("MADRID");
        localitateDeDestinatie.sendKeys(Keys.ARROW_DOWN);
//        localitateDeDestinatie.click();
        localitateDeDestinatie.sendKeys(Keys.ENTER);
//        localitateDeDestinatie.sendKeys(Keys.TAB);
    }

    @FindBy(xpath = "//*[@id=\"externalDepartureDate\"]")
    private WebElement calendarSelector;

    public void selectareCalendar() {
        calendarSelector.click();
        calendarSelector.sendKeys(Keys.TAB);}

    @FindBy(id = "externalPassengers")
    private WebElement selectarePasageri;

    public void  pasageri() {
        selectarePasageri.click();
//        selectarePasageri.click();


    }
    @FindBy(xpath="//*[@class=\"popover-button\"][2]")
    private WebElement numarSelectarePasageri;

    public void numarPasageri() {
        numarSelectarePasageri.click();
        numarSelectarePasageri.click();
        numarSelectarePasageri.sendKeys(Keys.TAB);
    }

    @FindBy(id = "searchTrips") private WebElement cauta;

    public void clickCauta () {
        cauta.click();
    }
    @FindBy (xpath = "//*[@id=\"triggerResults\"]/div/div[2]/span") WebElement alertText;
    public boolean checkIfInformatiiRutaIsDisplayed(){return alertText.isDisplayed();}
    public String MessageText(){
        return alertText.getText();
    }
}

