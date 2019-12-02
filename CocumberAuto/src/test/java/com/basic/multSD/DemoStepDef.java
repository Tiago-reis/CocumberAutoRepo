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

public class DemoStepDef {
	
	WebDriver driver = null;
	
	@Given("^User need to be on demo site page$")
	public void user_need_to_be_on_demo_site_page (){
						
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Meta\\Documents\\OneDrive\\Automação\\CocumberSetup\\chromedriver.exe"); //Chromedriver
			driver = new ChromeDriver(); // Chrome		
			driver.manage().window().maximize();
			driver.get("http://demo.automationtesting.in/Register.html");
			//System.out.println(count+"º Passagem");
			//System.out.println("Executou o metodo: user_need_to_be_on_Facebook_login_page");
	}	
	
	@When("^User enters first name$")
	public void user_enters_first_nameg() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input")).sendKeys("Tom");
		
	}
	
	@When("^User enters last name$")
	public void user_enters_last_name() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[2]/input")).sendKeys("Jerry");
		
	}
	
}
