package com.app.automation.google.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BingTest {

    private static final String BINGURL = "http://bing.com";
    private WebDriver driver;

    @BeforeClass
    public void Setup(){
        // For WIndows machine ,please change the locations of your driver path
        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sunrays\\Downloads\\geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
    }

    @Test
    public void TestBingPage(){
        driver = new FirefoxDriver();
        driver.navigate().to(BINGURL);
    }
    @AfterClass
    public void Cleanup(){
        driver.close();
    }
}
