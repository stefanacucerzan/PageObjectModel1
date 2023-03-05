package com.tabitatour.tests;

import com.tabitatour.pages.Abonare;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.tabitatour.pages.Abonare.*;


public class AbonareTest extends PaginaDeBazaTest {
//    @Parameters({"emailp"})
    @Test
    public void AbonareTest (){
        driver = new ChromeDriver();
        driver.get(ABONARE_URL);
        Abonare abonare = new Abonare(driver);
        abonare.clickOkCookieButton();
        abonare.enterAdresaDeEmail();
        abonare.maAbonez();
        Assert.assertTrue(abonare.checkIfEmailIsDisplayed());
}}
