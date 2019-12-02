package com.basic.sharedataSD;
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


public class ShareDataStepDef1 {
		
	//int count =0;
	WebDriver driver;
	
	public ShareDataStepDef1 (SharedClass share){
		driver = share.setup();
		
	}
	
	@Then("^User checks user \"([^\"]*)\" first name is present$")
	public void user_checks_user_first_name_is_present(String userName) throws InterruptedException{
		String userNameActual = driver.findElement(By.xpath("//input[@id='u_0_m']")).getAttribute("value");
		Assert.assertEquals(userName, userNameActual);
		System.out.println("Executou o metodo: user_checks_user_first_name_is_present");
		Thread.sleep(1000);		
	}
	
	@And("User Enters user \"([^\"]*)\" surname")							
	public void user_enters_user_surname(String surName) throws InterruptedException{
		
		try	{	
			driver.findElement(By.xpath("//*[@id='u_0_o']")).sendKeys(surName);
			System.out.println("Executou o metodo: user_enters_user_surname");
			Thread.sleep(1000);	
		}catch(Exception e){
			System.out.println("***ERRO : "+e.getMessage());
		}

	}
	
	@When("User Mobile field should be blank")
	public void user_mobile_field_should_be_blank() throws InterruptedException {
		
		try{
			String mobileActual = driver.findElement(By.xpath("//*[@id='u_0_r']")).getAttribute("value");
			Assert.assertEquals("", mobileActual);
			System.out.println("Executou o metodo: user_mobile_field_should_be_blank");
			Thread.sleep(1000);	
		}catch (Exception e){
			System.out.println("***Erro: "+e.getMessage());
		}
		
	}
	

}
