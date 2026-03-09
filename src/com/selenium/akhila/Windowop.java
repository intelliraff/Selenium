package com.selenium.akhila;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;


public class Windowop {
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\exam2\\Downloads\\selenium-java-4.40.0\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://courses.rvrjc.ac.in/moodle/login/index.php");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		Thread.sleep(2000);
		
		Dimension d=new Dimension(500,500);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		
		Point p=new Point(250,250);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		
		driver.quit();
	}
}
