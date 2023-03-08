package com.tabitatour.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Abonare extends PaginaDeBaza {
    public Abonare(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"CybotCookiebotDialogBodyLevelButtonAccept\"]") private WebElement okCookieButton;
    public void clickOkCookieButton(){
        okCookieButton.click();
        okCookieButton.sendKeys(Keys.TAB);
        okCookieButton.sendKeys(Keys.TAB);
    }
    public final static String ABONAMENT_URL=BASE_URL;

    @FindBy(xpath = "//*[@id=\"policyNewsletter\"]")
    public static WebElement clickCheckBoxPolicy;

        public void checkBox() {
            clickCheckBoxPolicy.click();
            clickCheckBoxPolicy.click();
            clickCheckBoxPolicy.sendKeys(Keys.TAB);
//            okCookieButton.sendKeys(Keys.TAB);
        }
//    @FindBy(xpath = "//*[@id=\"gb-widget-1700\"]/div/a/div/svg") public static WebElement closeCybotDialog;
//        public void cybotdialog(){
//            closeCybotDialog.clear();
//        }
    @FindBy(xpath="//*[@id=\"emailNewsletter\"]") private WebElement adresaDeEmail;
    public void enterAdresaDeEmail(){
        adresaDeEmail.click();
        adresaDeEmail.sendKeys("stefanacucerzan@gmail.com");
        adresaDeEmail.sendKeys(Keys.TAB);
    }

    @FindBy(xpath = "//*[@id=\"subscribeNews\"]") WebElement maAbonezButton;
    @FindBy (xpath = "//*[@id=\"startchangeBgNav\"]/div[2]/div/div/div[2]/h4") WebElement alertSuccess;
    public void maAbonez(){maAbonezButton.click();}
    public boolean checkIfEmailIsDisplayed(){return alertSuccess.isDisplayed();}
    public String MessageText(){
        return alertSuccess.getText();
    }


}
