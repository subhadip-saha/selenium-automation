package com.demo.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Configuring the system properties of chrome driver
		System.setProperty("webdriver.chrome.driver","F:\\SeleniumWS\\ChromeDriver\\chromedriver.exe");
		
		//Initializing the browser driver
		WebDriver driver = new ChromeDriver();

		//Navigating through a particular website
		//driver.get("https://www.google.com/");				any one would work
		driver.navigate().to("https://www.google.com/");
		
		//for one time search , this code is useful 
		driver.findElement(By.name("q")).sendKeys("selenium tutorial");	//directly
	
		//locate the textbox with name q and put it in a reference.This code is useful when we want to use this searchbox 
		//for multiple times searching.
		WebElement searchbox = driver.findElement(By.name("q"));		
		searchbox.sendKeys(" for beginners");
		
		System.out.println("Selenium Webdriver Script in Chrome");
		//driver.close();
	}

}
