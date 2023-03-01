package com.tabitatour.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Abonare extends BasePage{
    public Abonare(WebDriver driver) {
        super(driver);
    }

//    public void maAbonez(WebDriver driver) {
//        super(driver);
//    }
    public final static String ABONAMENT_URL = BASE_URL+"Ma abonez";
    @FindBy(id="emailNewsletter") private WebElement adresaDeEmail;
    public void enterAdresaDeEmail(String email){adresaDeEmail.sendKeys(email);}

    @FindBy(xpath = "//*[@id=\"subscribeNews\"]") WebElement maAbonezButton;
    public void maAbonez(){maAbonezButton.click();}

}
