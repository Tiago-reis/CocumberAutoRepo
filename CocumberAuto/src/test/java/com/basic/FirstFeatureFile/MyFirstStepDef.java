package com.basic.FirstFeatureFile;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.*;

//----------------------------------------
import static org.junit.Assert.*;
//----------------------------------------
// IE:
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

//----------------------------------------
// Firefox:
import java.util.logging.Level;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

//----------------------------------------
// Sancor:

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MyFirstStepDef {
		
	WebDriver driver;
	
	@Given("^User need to be on Facebook login page$")
	public void user_need_to_be_on_Facebook_login_page (){
		System.out.println("Opening Url");				
		//IE
			//System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
			//driver = new InternetExplorerDriver(); //IE
		
		// Firefox:
			//System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
			//WebDriver driver =  new FirefoxDriver();
		// CHROME:
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Meta\\Documents\\OneDrive\\Automação\\CocumberSetup\\chromedriver.exe"); //Chromedriver
			driver = new ChromeDriver(); // Chrome		
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");		
	}	
	
	@When("^User enters user first name$")
	public void user_enters_user_first_name (){
		
		try{			
			driver.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys("David");						
			
		}catch(Exception e){
			System.out.println("***ERRO: "+e.getMessage());
			}	
		}	
	
	@SuppressWarnings("deprecation")
	@Then("^User checks user first name is present$")
	public void user_checks_user_first_name_is_present(){
		String userNameActual = driver.findElement(By.xpath("//input[@id='u_0_m']")).getAttribute("value");
		Assert.assertEquals("David", userNameActual);				
		
	}

}
