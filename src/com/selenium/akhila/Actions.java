package com.selenium.akhila;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\exam2\\\\Downloads\\\\selenium-java-4.40.0\\\\chromedriver.exe");
	 
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://swayam.gov.in/");

	        WebElement element = driver.findElement(By.xpath("/html/body/div[3]/section/div/form/div/input"));

	        Actions actions = new Actions(driver);

	        actions.moveToElement(element).perform();
	        Thread.sleep(2000);

	        actions.contextClick(element).perform();
	        Thread.sleep(2000);

	        actions.sendKeys("Blockchain");
	        Thread.sleep(2000);

	        WebElement element2 = driver.findElement(By.xpath("//section/div/form/div/span"));
	        actions.moveToElement(element2).click().perform();
	        Thread.sleep(8000);

	        WebElement element3 = driver.findElement(By.xpath("//div[2]/div/div[2]/div[2]/course-card-grouper/div[1]/course-cards/div/div/course-card"));
	        actions.moveToElement(element3).perform();


		
	}
	
}