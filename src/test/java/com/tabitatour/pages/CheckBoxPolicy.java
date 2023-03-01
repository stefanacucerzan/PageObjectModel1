package com.tabitatour.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class CheckBoxPolicy extends BasePage{
    public final static String CHECKBOX_URL = BASE_URL+"checkboxe";

    public CheckBoxPolicy(WebDriver driver) {
    super(driver);
}
    @FindBy(xpath = "//*[@id=\"policyNewsletter\"]")
    public static WebElement checkBoxPolicy;

    public void clickOnCheckboxPolicy() {
        checkBoxPolicy.click();
    }

    public void checkBox() {
        checkBoxPolicy.click();
    }
}
