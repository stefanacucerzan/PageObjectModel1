package com.tabitatour.tests;

import com.herokuapp.pages.CheckboxPage;
import com.herokuapp.tests.BaseTest;
import com.tabitatour.pages.CheckBoxPolicy;
import com.tabitatour.pages.PaginaDeBaza;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;

import static com.herokuapp.pages.CheckboxPage.CHECKBOX_URL;

import static com.tabitatour.pages.CheckBoxPolicy.CHECKPOLICY_URL;


public class CheckBoxPolicyTest extends PaginaDeBazaTest {

    @Test
        public void checkBox() {
            driver = new ChromeDriver();
            driver.get(CHECKPOLICY_URL);

        CheckBoxPolicy checkBoxPolicy = new CheckBoxPolicy(driver);
        checkBoxPolicy.clickOnCheckboxPolicy();
        Assert.assertTrue(checkBoxPolicy.checkIfCheckboxesAreChecked());
        }
}