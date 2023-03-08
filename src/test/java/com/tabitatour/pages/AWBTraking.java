package com.tabitatour.pages;

import com.tabitatour.tests.PaginaDeBazaTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class AWBTraking extends PaginaDeBaza {
    public AWBTraking(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"CybotCookiebotDialogBodyLevelButtonAccept\"]") private WebElement okCookieButton;
    public void clickOkCookieButton(){
        okCookieButton.click();
    }
    public final static String AWB_URL=BASE_URL;
    @FindBy(xpath = "//*[@id=\"codAwbInternational\"]") private WebElement awbButton;
    public void enterAwb(){
        awbButton.sendKeys("awb1233");
        awbButton.click();

    }
    @FindBy(xpath = "//*[@id=\"awb-search-international\"]/span") private  WebElement cautaColetButton;
    public void clikCautaColet(){
        cautaColetButton.click();
        cautaColetButton.sendKeys(Keys.ENTER);
    }
    @FindBy(xpath = "//*[@id=\"awb-search-international\"]/span") private WebElement messageSuccess;
    public boolean checkIfAwbIsDisplayed(){return messageSuccess.isDisplayed();}
    public String MessageText(){
        return messageSuccess.getText();
    }
}
