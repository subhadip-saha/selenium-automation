package com.demo.text;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// Configuring the system properties of chrome driver
		System.setProperty("webdriver.chrome.driver","F:\\SeleniumWS\\ChromeDriver\\chromedriver.exe");
		
		//Initializing the browser driver
		WebDriver driver = new ChromeDriver();

		//after opening chrome, wait some time to make stable and then write google.com
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	//this code helps in synchronization
		//Navigating through a particular website
		//driver.get("https://www.google.com/");				any one would work
		driver.navigate().to("https://www.google.com/");	
		
/*		try {
		Thread.sleep(300);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
*/		
		//locate the textbox with name q and put it in a reference.This code is useful when we want to use this searchbox 
		//for multiple times searching.
		WebElement searchbox = driver.findElement(By.name("q"));		
		searchbox.sendKeys("selenium tutorial");
		
		//I want to get the search suggestions count and their values.
		//if we do not write this below code, size we get 0 it means it cannot capture the suggestion list because after
		//typing something, some few msec later the suggestion list appears, so we need to give some time to the browser
		//so, we have to make the process sleep for few msec after typing anything. for that, one way is Thread.sleep(300)
		//or write below code.
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	//this code helps in synchronization
		
		List<WebElement> lst = driver.findElements(By.cssSelector("ul.G43f7e li span"));	//<ul jsname="bw4e9b" class="G43f7e" role="listbox">
		System.out.println("size: " + lst.size());
		lst.forEach(elem->{System.out.println("text: " + elem.getText());}); 
	
		System.out.println("Selenium Webdriver Script in Chrome");
		//driver.close();
	}

}
