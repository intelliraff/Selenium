package com.selenium.akhila;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver", "C:\\Users\\exam2\\Downloads\\selenium-java-4.40.0\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("");

        WebElement dropdown = driver.findElement(By.id("myDropdown"));
        dropdown.click();

        WebElement option = driver.findElement(By.cssSelector("option[value='option1']"));
        option.click();

        Thread.sleep(3000);

        String selectedOptionText = option.getText();
        System.out.println("Selected Option: " + selectedOptionText);

        Thread.sleep(2000);

        driver.quit();
    }
}


