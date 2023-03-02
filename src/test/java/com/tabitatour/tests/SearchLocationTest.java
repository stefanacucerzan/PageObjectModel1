package com.tabitatour.tests;

import com.tabitatour.pages.BasePage;
import com.tabitatour.pages.SearchLocation;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Set;

import static com.herokuapp.pages.LoginPage.LOGIN_URL;
import static com.tabitatour.pages.SearchLocation.SearchLocation_URL;

public class SearchLocationTest extends BaseTest {




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
        searchLocation.clickIntern();
        searchLocation.enterOrasDePlecare();
        searchLocation.enterOrasDeSosire();

        //    WebElement daySelector = driver.findElement(By.xpath("//*[@id=\"externalDepartureDate\"]"));
//            daySelector.click();


        WebElement pasageri = driver.findElement(By.xpath("//*[@id=\"internalPassengers\"]"));
        pasageri.sendKeys("1");

        searchLocation.clickCauta();
        searchLocation.clikAbonament();



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