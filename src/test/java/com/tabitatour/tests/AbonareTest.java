package com.tabitatour.tests;

import com.tabitatour.pages.Abonare;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.tabitatour.pages.Abonare.ABONAMENT_URL;

public class AbonareTest extends PaginaDeBazaTest {
//    @Parameters({"emailp"})
    @Test
    public void AbonareTest (String email){
        driver = new ChromeDriver();
        driver.get(ABONAMENT_URL);
        Abonare abonare = new Abonare(driver);
        abonare.enterAdresaDeEmail(email);
        abonare.maAbonez();
        Assert.assertTrue(abonare.checkIfEmailIsDisplayed());
}}
