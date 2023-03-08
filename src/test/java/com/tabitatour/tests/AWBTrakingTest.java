package com.tabitatour.tests;

import com.tabitatour.pages.AWBTraking;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.tabitatour.pages.AWBTraking.AWB_URL;

public class AWBTrakingTest extends PaginaDeBazaTest{
    @Test()
    public void AWBTarking(){
        driver=new ChromeDriver();
        driver.get(AWB_URL);
        AWBTraking awbTraking = new AWBTraking(driver);
        awbTraking.clickOkCookieButton();
        awbTraking.enterAwb();
        awbTraking.clikCautaColet();

 Assert.assertTrue(awbTraking.checkIfAwbIsDisplayed());
}}
