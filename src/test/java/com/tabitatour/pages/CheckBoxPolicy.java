package com.tabitatour.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class CheckBoxPolicy extends PaginaDeBaza {
    public final static String CHECKPOLICY_URL = BASE_URL;

    public CheckBoxPolicy(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "policyNewsletter")
    public static WebElement checkBoxPolicy;

    public void clickOnCheckboxPolicy() {
        checkBoxPolicy.click();
    }
    public boolean checkIfCheckboxesAreChecked(){
        return checkBoxPolicy.isSelected();
    }


}
