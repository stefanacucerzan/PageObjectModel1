package com.tabitatour.tests;

import com.herokuapp.pages.DropdownPage;
import com.tabitatour.pages.SearchLocation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.herokuapp.pages.DropdownPage.DROPDOWN_URL;

public class SearchLocationTest extends PaginaDeBazaTest {

    @BeforeMethod

    protected void setUp() {

//       1. Deschide pagina https://www.tabitatour.ro/

            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.tabitatour.ro/");
            driver.manage().window().maximize();
        }

    public static void waitFor(int ms)  {
        try {
            driver.wait(ms);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //        @Parameters({"enterOrasDePlecare","orasDeSosire"});
    @Test()
    public void selectareLocatie  () {

        SearchLocation searchLocation = new SearchLocation(driver);
//       2.click button ok cookie
        searchLocation.clickOkCookieButton();

//        3. introducere oras de plecare


        searchLocation.enterOrasDePlecare();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        4. introducere oras de sosire

        searchLocation.enterOrasDeSosire();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        5. click Calendare
        searchLocation.selectareCalendar();


//        6.click data plecare
//        searchLocation.selecatreDataPlecare();

//      7. click pasageri

        searchLocation.pasageri();

//        8. click nr pasageri
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        searchLocation.numarPasageri();

//        9.  click cauta ruta
        searchLocation.clickCauta();
//        Assert.assertTrue(searchLocation.checkIfInformatiiRutaIsDisplayed());

    }
}