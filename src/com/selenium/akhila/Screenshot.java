package com.selenium.akhila;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

    public void sshot() throws InterruptedException, IOException {

    	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\exam2\\\\Downloads\\\\selenium-java-4.40.0\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        TakesScreenshot tk = (TakesScreenshot)driver;
        File source = tk.getScreenshotAs(OutputType.FILE);
        File des = new File("D:\\STUDY\\BTECH\\AT\\LAB1\\Screenshots\\Screen.png");
        FileHandler.copy(source, des);

        System.out.println("Screenshot is captured");
        Thread.sleep(5000);
        driver.quit();

    }

}

