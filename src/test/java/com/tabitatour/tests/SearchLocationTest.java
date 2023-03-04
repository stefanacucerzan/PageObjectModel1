package com.tabitatour.tests;

import com.tabitatour.pages.SearchLocation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchLocationTest extends PaginaDeBazaTest {

    @BeforeMethod
        //1. deschidem pagina
    protected void setUp() {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.tabitatour.ro/");
            driver.manage().window().maximize();
        }

//        @Parameters({"enterOrasDePlecare","orasDeSosire"});
    @Test()
        public void selectareLocatie  () {

       SearchLocation searchLocation = new SearchLocation(driver);
        searchLocation.clickOkCookieButton();
        searchLocation.enterOrasDePlecare();
        searchLocation.enterOrasDeSosire();
        searchLocation.selectareCalendar();
        searchLocation.selecatreDataPlecare();
        searchLocation.pasageri();




//        WebElement dataDePlecareInput = driver.findElement(By.xpath("//*[@id=\"externalDepartureDate\"]"));
//        dataDePlecareInput.click();
//
//        WebElement daySelector = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[4]/a"));
//        daySelector.click();
//
//
//        WebElement pasageri = driver.findElement(By.xpath("//*[@id=\"internalPassengers\"]"));
//        pasageri.sendKeys("1");
//


////          WebElement orasDePlecare = driver.findElement(By.xpath("//*[@id=\"internalDeparturePlace\"]"));
////          orasDePlecare.sendKeys("Cluj");
//
//            WebElement orasDeSosire = driver.findElement(By.xpath("//*[@id=\"externalArrivalPlace\"]"));
//            orasDeSosire.sendKeys("Beclean");
//
////          WebElement dataDePlecare = driver.findElement(By.xpath("//*[@id=\"externalDepartureDate\"]"));
////          dataDePlecare.click();





//             WebElement cauta = driver.findElement(By.xpath("//*[@id=\"searchTrips\"]"));
//             cauta.click();
//
        }
    }