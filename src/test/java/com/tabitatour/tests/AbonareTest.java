package com.tabitatour.tests;

import com.herokuapp.pages.LoginPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static com.herokuapp.pages.LoginPage.LOGIN_URL;

public class AbonareTest extends BaseTest{
    @Parameters({"email"})
    @Test
    public void AbonareTest (String email){
        driver = new ChromeDriver();
        driver.get(ABONARE_URL);
        MaAbonez maAbonez = new MaAbonez(driver);
        maAbonez.enterAdresaDeEmail(email);
        maAbonez.clickMaAbonezButton();
}}
