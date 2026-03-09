package com.selenium.akhila;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class Iframe {
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\exam2\\Downloads\\selenium-java-4.40.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("C:\\Users\\exam2\\eclipse-workspace\\akhila\\HTML\\iframe.html");
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		
		WebElement firstIframeele= driver.findElement(By.tagName("h1"));
		
		System.out.println("First Iframe content anamata: "+firstIframeele.getText());
		
		Thread.sleep(2000);
		
		/*
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		
		Thread.sleep(2000);
		*/
		
		driver.quit();
	}
}
