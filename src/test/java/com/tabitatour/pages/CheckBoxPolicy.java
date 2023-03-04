package com.tabitatour.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class CheckBoxPolicy extends PaginaDeBaza {
    public final static String CHECK_URL = BASE_URL+"checkboxe";

    public CheckBoxPolicy(WebDriver driver) {
    super(driver);
}
    @FindBy(xpath = "//*[@id=\"policyNewsletter\"]")
    public static WebElement checkBoxPolicy;

    public void clickOnCheckboxPolicy() {
        checkBoxPolicy.click();
    }
    public boolean checkIfCheckboxesAreChecked(){
        return checkBoxPolicy.isSelected();
    }

//    public void checkBox() {
//        checkBoxPolicy.click();
//    }
}
