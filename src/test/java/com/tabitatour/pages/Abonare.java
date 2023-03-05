package com.tabitatour.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Abonare extends PaginaDeBaza {
    public Abonare(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"CybotCookiebotDialogBodyLevelButtonAccept\"]") private WebElement okCookieButton;
    public void clickOkCookieButton(){
        okCookieButton.click();
    }
    public final static String ABONARE_URL=BASE_URL;
    @FindBy(id="emailNewsletter") private WebElement adresaDeEmail;
    public void enterAdresaDeEmail(){
        adresaDeEmail.sendKeys("stefanacucerzan@gmail.com");
        adresaDeEmail.sendKeys(Keys.TAB);
    }

    @FindBy(xpath = "//*[@id=\"subscribeNews\"]/span") WebElement maAbonezButton;
    @FindBy (xpath = "//*[@id=\"startchangeBgNav\"]/div[2]/div/div/div[2]/h4") WebElement alertSuccess;
    public void maAbonez(){maAbonezButton.click();}
    public boolean checkIfEmailIsDisplayed(){return alertSuccess.isDisplayed();}
    public String MessageText(){
        return alertSuccess.getText();
    }

}
