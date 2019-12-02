package com.basic.sharedataSD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.*;

public class SharedClass {
	
	WebDriver driver;
	
	@Before
	public WebDriver setup (){
		if(driver==null){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Meta\\Documents\\OneDrive\\Automação\\CocumberSetup\\chromedriver.exe"); //Chromedriver
			driver = new ChromeDriver(); // Chrome
		}
		return driver;
		
	}
	
	@After
	public void tearDown(){
		driver.quit();
		driver = null;
	}

}
