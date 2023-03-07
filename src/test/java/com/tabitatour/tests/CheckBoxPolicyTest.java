package com.tabitatour.tests;

import com.tabitatour.pages.CheckBoxPolicy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CheckBoxPolicyTest extends PaginaDeBazaTest {

    @Test()
        public void checkBox() {
            driver = new ChromeDriver();
            driver.get(CheckBoxPolicy.CHECKBOX_URL);

        CheckBoxPolicy checkBoxPolicy = new CheckBoxPolicy(driver);
        checkBoxPolicy.clickOnCheckboxPolicy();
        Assert.assertTrue(checkBoxPolicy.checkIfCheckboxesAreChecked());
        }
}