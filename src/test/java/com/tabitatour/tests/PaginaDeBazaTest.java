package com.tabitatour.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public  class PaginaDeBazaTest {
    protected static WebDriver driver;
    @BeforeMethod
    protected void setUp(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
    }


//    @AfterMethod
//    protected void tearDown(){
//        driver.manage().deleteAllCookies();
//        driver.close();}

}
