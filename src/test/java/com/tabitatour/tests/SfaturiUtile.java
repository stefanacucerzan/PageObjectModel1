package com.tabitatour.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SfaturiUtile extends PaginaDeBazaTest{
    @org.testng.annotations.Test
    public void cautAgentii (){
        driver = new ChromeDriver();
        driver.get("https://www.tabitatour.ro/");
        WebElement cookieButton = driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonAccept"));
        cookieButton.click();
        WebElement sfaturi = driver.findElement(By.partialLinkText("Sfaturi utile"));
        sfaturi.click();

        WebElement selectareSfaturiUtile = driver.findElement(By.xpath("//*[@id=\"rows\"]/div[15]/div[3]/a/span"));
        String info = selectareSfaturiUtile.getText();
        waitFor(3000);
        System.out.println(info);
        Assert.assertTrue(info.contains("https://www.tabitatour.ro/pagina/sfaturi"));
    }
    public static void waitFor(int ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

