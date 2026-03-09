package com.selenium.akhila;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;


public class Driverops {
	
public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\exam2\\Downloads\\selenium-java-4.40.0\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://courses.rvrjc.ac.in/moodle/login/index.php");
		
		Thread.sleep(1000);
		
		WebElement x=driver.findElement(By.name("username"));
		
		x.sendKeys("y23cs004");
		
		WebElement y=driver.findElement(By.name("password"));
		
		y.sendKeys("y23ca");
		
		WebElement submit=driver.findElement(By.id("loginbtn"));
		
		submit.sendKeys(Keys.ENTER);
		
		System.out.println("Title: "+driver.getTitle());
		
		System.out.println("Current url: "+driver.getCurrentUrl());
		
		Thread.sleep(4000);
		driver.quit();
		
		
		
}

}
