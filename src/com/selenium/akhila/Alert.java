package com.selenium.akhila;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\exam2\\\\Downloads\\\\selenium-java-4.40.0\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("C:\\Users\\exam2\\eclipse-workspace\\akhila\\HTML\\alert.html");
		
		Thread.sleep(1000);
		
		WebElement submit=driver.findElement(By.id("alertbutt"));
		
		submit.sendKeys(Keys.ENTER);
		
		Thread.sleep(7000);
		
		driver.quit();
	}

}
