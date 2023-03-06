package com.tabitatour.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v109.css.model.Value;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;

public class SearchLocation extends PaginaDeBaza {


    private WebDriver driver;


    @FindBy(xpath = "//*[@id=\"externalDeparturePlace\"]")
    private WebElement firstOption;
    @FindBy(xpath = "//*[@id=\"dropdown\"]/option[3]")
    private WebElement secondOption;



    public SearchLocation(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"CybotCookiebotDialogBodyLevelButtonAccept\"]")
    private WebElement okCookieButton;

    public void clickOkCookieButton() {
        okCookieButton.click();
    }


    @FindBy(xpath = "//*[@id=\"externalDeparturePlace\"]")

    public WebElement orasDePlecare;


    public void enterOrasDePlecare() {

        orasDePlecare.sendKeys("Cluj Napoca");
    }

    @FindBy(xpath = "//*[@id=\"externalArrivalPlace\"]")
    private WebElement localitateDeDestinatie;

    public void enterOrasDeSosire() {
        localitateDeDestinatie.click();
        localitateDeDestinatie.sendKeys("MADRID");
        localitateDeDestinatie.sendKeys(Keys.TAB);
    }

    @FindBy(xpath = "//*[@id=\"externalDepartureDate\"]")
    private WebElement calendarSelector;

    public void selectareCalendar() {
        calendarSelector.click();
        calendarSelector.sendKeys(Keys.TAB);


    }

    @FindBy(id = "externalPassengers")
    private WebElement selectarePasageri;



    public void  pasageri() {


        selectarePasageri.click();


    }
        @FindBy(xpath="//*[@id=\"popover188675\"]/div[2]/div[2]/button[2]")
        private WebElement numarSelectarePasageri;

        public void numarPasageri() {
            numarSelectarePasageri.click();
            numarSelectarePasageri.sendKeys(Keys.TAB);
        }

        @FindBy(id = "searchTrips") private WebElement cauta;

        public void clickCauta () {
            cauta.click();
        }}


