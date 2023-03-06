package com.tabitatour.tests;

import com.herokuapp.pages.DropdownPage;
import com.tabitatour.pages.SearchLocation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.herokuapp.pages.DropdownPage.DROPDOWN_URL;

public class SearchLocationTest extends PaginaDeBazaTest {

    @BeforeMethod
        //1. deschidem pagina
    protected void setUp() {

//       1. Deschide pagina https://www.tabitatour.ro/

            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();

            driver.get("https://www.tabitatour.ro/");
            driver.manage().window().maximize();
        }

//        @Parameters({"enterOrasDePlecare","orasDeSosire"});
    @Test()
        public void selectareLocatie  () {

       SearchLocation searchLocation = new SearchLocation(driver);
//       2.click button ok cookie
        searchLocation.clickOkCookieButton();

//        3. introducere oras de plecare


        searchLocation.enterOrasDePlecare();


//        4. introducere oras de sosire
        searchLocation.enterOrasDeSosire();

//        5. click Calendare
        searchLocation.selectareCalendar();


//        6.click data plecare
//        searchLocation.selecatreDataPlecare();

//      7. click pasageri
        searchLocation.pasageri();

//        8. click nr pasageri
        searchLocation.numarPasageri();

//        9.  click cauta ruta
        searchLocation.clickCauta();


        }
    }