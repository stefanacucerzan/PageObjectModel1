package com.tabitatour.tests;

import com.herokuapp.pages.CheckboxPage;
import com.herokuapp.tests.BaseTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static com.herokuapp.pages.CheckboxPage.CHECKBOX_URL;


    public class CheckboxPolicy extends BaseTest {
        @Test
        public void checkCheckbox() {
            driver = new ChromeDriver();
            driver.get(CHECKBOX_URL);
            CheckboxPage checkboxPage = new CheckboxPage(driver);
            CheckboxPage.click();
        }
    }}