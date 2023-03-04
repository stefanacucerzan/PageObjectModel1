package com.tabitatour.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;

public class SearchLocation extends PaginaDeBaza {
//    public final static String SearchLocation_URL = BASE_URL+"searchlocations";

    private WebDriver driver;
    public SearchLocation(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"CybotCookiebotDialogBodyLevelButtonAccept\"]") private WebElement okCookieButton;
    public void clickOkCookieButton(){
        okCookieButton.click();
    }


    @FindBy(xpath="//*[@id=\"externalDeparturePlace\"]") public WebElement orasDePlecare;
    public void  enterOrasDePlecare(){
        orasDePlecare.sendKeys("Cluj Napoca");
    }

    @FindBy(xpath="//*[@id=\"externalArrivalPlace\"]") private WebElement localitateDeDestinatie;
    public void enterOrasDeSosire(){

        localitateDeDestinatie.sendKeys("MADRID-AUTOGARA, SP");
    }

    @FindBy(xpath = "//*[@id=\"externalDepartureDate\"]") private WebElement calendarSelector;
    public void selectareCalendar(){
        calendarSelector.click();

    }
    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[4]/a") private WebElement selectareZi;

    public void selecatreDataPlecare() {

        selectareZi.click();

    }
    @FindBy(id = "externalPassengers") private WebElement selectarePasageri;
    public void pasageri() {
        selectarePasageri.click();

//        @FindBy(xpath = "//*[@id=\"popover33483\"]/div[2]/div[2]/button[2]") WebElement nrPasageri;
//        nrPasageri.click();
//        public void selectareNrPasageri () {
//            nrPasageri.click();
//        }

//    @FindBy(id = "searchTrips") private WebElement cauta;
//
//    public void clickCauta(){
//        cauta.click();
//    }
    }


}
