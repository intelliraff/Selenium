package com.selenium.akhila;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;


public class Navigation {
public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\exam2\\Downloads\\selenium-java-4.40.0\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://courses.rvrjc.ac.in/moodle/login/index.php");
		Thread.sleep(4000);
		
		driver.navigate().to("http://172.16.20.20/sis/index.php");
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(4000);
		
		driver.navigate().forward();
		Thread.sleep(4000);
		
		driver.navigate().refresh();
		Thread.sleep(4000);
		
		driver.quit();
		
}

}
