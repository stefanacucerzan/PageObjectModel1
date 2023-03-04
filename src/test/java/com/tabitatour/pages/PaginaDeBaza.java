package com.tabitatour.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PaginaDeBaza {
    protected WebDriver driver;
    final static String BASE_URL = "https://www.tabitatour.ro/";

    public PaginaDeBaza(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}