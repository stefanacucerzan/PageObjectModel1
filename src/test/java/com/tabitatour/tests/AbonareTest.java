package com.tabitatour.tests;

import com.tabitatour.pages.Abonare;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.tabitatour.pages.Abonare.*;


public class AbonareTest extends PaginaDeBazaTest {
//    @Parameters({"emailp"})
    @Test()
    public void AbonareTest (){
        driver = new ChromeDriver();
        driver.get(ABONAMENT_URL);
        Abonare abonare = new Abonare(driver);
        abonare.clickOkCookieButton();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        abonare.cybotdialog();
        abonare.checkBox();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        abonare.enterAdresaDeEmail();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        abonare.maAbonez();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(abonare.checkIfEmailIsDisplayed());

}}
