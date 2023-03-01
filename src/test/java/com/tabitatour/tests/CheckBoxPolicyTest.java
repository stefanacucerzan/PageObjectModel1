package com.tabitatour.tests;

import com.herokuapp.pages.CheckboxPage;
import com.herokuapp.tests.BaseTest;
import com.tabitatour.pages.CheckBoxPolicy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;

import static com.herokuapp.pages.CheckboxPage.CHECKBOX_URL;



public class CheckBoxPolicyTest extends BaseTest {
        @Test
        public void checkBox() {
            driver = new ChromeDriver();
            driver.get(CHECKBOX_URL);
            //Checkbox checkbox = new Checkbox();
            //CheckBoxPolicy checkBox = null;
            CheckBoxPolicy checkBoxPolicy = new CheckBoxPolicy(driver);
            checkBoxPolicy.clickOnCheckboxPolicy();
        }
}