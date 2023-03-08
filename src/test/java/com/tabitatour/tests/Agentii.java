package com.tabitatour.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Agentii extends PaginaDeBazaTest{
    @org.testng.annotations.Test
    public void cautAgentii (){
        driver = new ChromeDriver();
        driver.get("https://www.tabitatour.ro/");
        WebElement cookieButton = driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonAccept"));
        cookieButton.click();
        WebElement agentii = driver.findElement(By.partialLinkText("Agentii"));
        agentii.click();
        WebElement agentiiSearch = driver.findElement(By.id("agency-search"));
        agentiiSearch.click();
        agentiiSearch.sendKeys("Cluj");
        agentiiSearch.sendKeys(Keys.ENTER);
        WebElement searchableAgency = driver.findElement(By.xpath("//*[@id=\"rows\"]/div[15]/div[3]/a/span"));
        String agentieGasita = searchableAgency.getText();
        waitFor(3000);
        System.out.println(agentieGasita);
        Assert.assertTrue(agentieGasita.contains("cluj@tabitatour.ro"));
    }
    public static void waitFor(int ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

