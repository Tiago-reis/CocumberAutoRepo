package com.basic.multSD;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.*;

public class GoogleStepDef {
	
	WebDriver driver = null;
	
	@Given("^User need to be on Google page$")
	public void User_need_to_be_on_google_page (){
						
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Meta\\Documents\\OneDrive\\Automação\\CocumberSetup\\chromedriver.exe"); //Chromedriver
			driver = new ChromeDriver(); // Chrome		
			driver.manage().window().maximize();
			driver.get("https://www.google.co.in/");
			//System.out.println(count+"º Passagem");
			//System.out.println("Executou o metodo: user_need_to_be_on_Facebook_login_page");
	}	
	
	@When("^User enters search string$")
	public void user_enters_search_string() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Selenium");
		
	}
	
}
