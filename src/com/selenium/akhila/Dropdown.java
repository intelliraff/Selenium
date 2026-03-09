package com.selenium.akhila;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver", "C:\\Users\\exam2\\Downloads\\selenium-java-4.40.0\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("C:\\Users\\exam2\\eclipse-workspace\\akhila\\HTML\\hehe.html");

        WebElement dropdown = driver.findElement(By.id("drop"));
        dropdown.click();

        WebElement option = driver.findElement(By.cssSelector("option[value='Option 3']"));
        option.click();

        Thread.sleep(3000);

        String selectedOptionText = option.getText();
        System.out.println("Selected Option: " + selectedOptionText);

        Thread.sleep(6000);

        driver.quit();
    }
}


