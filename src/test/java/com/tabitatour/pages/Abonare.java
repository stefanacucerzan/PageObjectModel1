package com.tabitatour.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Abonare extends PaginaDeBaza {
    public Abonare(WebDriver driver) {
        super(driver);
    }
    public final static String ABONAMENT_URL = BASE_URL+"Ma abonez";
    @FindBy(id="emailNewsletter") private WebElement adresaDeEmail;
    public void enterAdresaDeEmail(String email){adresaDeEmail.sendKeys("stefanacucerzan@gmail.com");}

    @FindBy(xpath = "//*[@id=\"subscribeNews\"]") WebElement maAbonezButton;
    @FindBy (xpath = "//*[@id=\"startchangeBgNav\"]/div[2]/div/div/div[2]/h4") WebElement alertSuccess;
    public void maAbonez(){maAbonezButton.click();}
    public boolean checkIfEmailIsDisplayed(){return alertSuccess.isDisplayed();}
    public String MessageText(){
        return alertSuccess.getText();
    }

}
