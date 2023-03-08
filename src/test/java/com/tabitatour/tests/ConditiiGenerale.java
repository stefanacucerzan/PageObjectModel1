package com.tabitatour.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ConditiiGenerale extends PaginaDeBazaTest{
    @org.testng.annotations.Test
    public void cauatConditiiGenerale (){
        driver = new ChromeDriver();
        driver.get("https://www.tabitatour.ro/");
        WebElement cookieButton = driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonAccept"));
        cookieButton.click();
        WebElement conditiiButton = driver.findElement(By.partialLinkText("Conditii Generale de Transport Colete"));
        conditiiButton.click();
        WebElement textMessage = driver.findElement(By.xpath("//*[@id=\"startchangeBgNav\"]/div[2]/div/div/div[2]/div/h1"));
        String infoConditii = textMessage.getText();
        waitFor(3000);
        System.out.println(infoConditii);
        Assert.assertTrue(infoConditii.contains("https://www.tabitatour.ro/pagina/conditii-transport"));
    }
    public static void waitFor(int ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


