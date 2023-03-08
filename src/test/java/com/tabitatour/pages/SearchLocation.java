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


    public void introduOrasDePlecare() {
        orasDePlecare.click();

        orasDePlecare.sendKeys("Cluj");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        orasDePlecare.sendKeys(Keys.ENTER);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        orasDePlecare.click();
        orasDePlecare.sendKeys(Keys.ARROW_DOWN);
        orasDePlecare.sendKeys(Keys.ENTER);
        orasDePlecare.sendKeys(Keys.TAB);
    }

    @FindBy(xpath = "//*[@id=\"externalArrivalPlace\"]")
    private WebElement localitateDeDestinatie;

    public void clickOrasSosire(){
        localitateDeDestinatie.click();
        localitateDeDestinatie.sendKeys(Keys.ENTER);
    }

    public void enterOrasDeSosire() {
        localitateDeDestinatie.click();
        localitateDeDestinatie.sendKeys("MADRID");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        localitateDeDestinatie.sendKeys(Keys.ARROW_DOWN);
        localitateDeDestinatie.sendKeys(Keys.ENTER);
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
        selectarePasageri.click();
//        selectarePasageri.sendKeys(Keys.TAB);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
    @FindBy(xpath="//*[@id=\"popover204782\"]/div[2]/div[2]/button[2]")
    private WebElement numarSelectarePasageri;


    public void numarPasageri() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
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

}


