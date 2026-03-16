package com.selenium.akhila;

public class AssAnn {

}
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class annoass {
    WebDriver driver;
    String baseUrl = "https://www.selenium.dev/";

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite - Setting up environment variables");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite - Cleaning up after all tests");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class - Initializing resources");
        System.setProperty("webdriver.edge.driver", "D:\\STUDY\\BTECH\\AT\\edgedriver_win64\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get(baseUrl);
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class - Cleaning up resources");
        driver.quit();
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test - Setting up test-specific resources");
    }
