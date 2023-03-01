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
import org.testng.annotations.Test;

import java.util.Set;

public class SearchLocationTest extends BaseTest {


//    //public SearchLocationTest(WebDriver driver) {
//        super(driver);
//    }
//    @BeforeTest
//    public class getAllCookies {
//        public static void main(String[] args) {
//            WebDriver driver = new ChromeDriver();
//            try {
//                driver.get("https://www.tabitatour.ro/");
//                // Add few cookies
//                driver.manage().addCookie(new Cookie("test1", "cookie1"));
//
//                // Get All available cookies
//                Set<Cookie> cookies = driver.manage().getCookies();
//                System.out.println(cookies);
//            } finally {
//                driver.quit();
//            }
//        }
//    }
//
    @BeforeMethod
        //1. deschidem pagina
    protected void setUp() {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.tabitatour.ro/");
            driver.manage().window().maximize();
        }


    @Test()
        public void selectareLocatie  () {

        SearchLocation searchLocation = new SearchLocation(driver);
        searchLocation.clickAcceptCookies();


            WebElement orasDePlecare = driver.findElement(By.xpath("//*[@id=\"externalDeparturePlace\"]"));
            orasDePlecare.sendKeys("Cluj");

            WebElement orasDeSosire = driver.findElement(By.xpath("//*[@id=\"externalArrivalPlace\"]"));
            orasDeSosire.sendKeys("Beclean");

//          WebElement dataDePlecare = driver.findElement(By.xpath("//*[@id=\"externalDepartureDate\"]"));
//          dataDePlecare.click();



//            WebElement daySelector = driver.findElement(By.xpath("//*[@id=\"externalDepartureDate\"]"));
//            daySelector.click();
        WebElement pasageri = driver.findElement(By.xpath("//*[@id=\"internalPassengers\"]"));
        pasageri.sendKeys("1");

        WebElement cauta = driver.findElement(By.xpath("//*[@id=\"searchTrips\"]"));
        cauta.click();

        }
    }