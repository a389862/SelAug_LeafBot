package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class NewLoginPage extends ProjectSpecificMethods{
	
	public NewLoginPage(RemoteWebDriver driver, ExtentTest node, ExtentTest test){
		this.driver = driver;
		this.node = node;
		this.test = test;
		PageFactory.initElements(driver,this);
	}
	
	public NewLoginPage enterUsername(String data) {
		//comment for new version
		type(locateElement("username"), data);
		
		return this;

	}
	
	public NewLoginPage enterPassword(String data) {
		type(locateElement("xpath", "//input[@id='password']"), data);
		
		return this;

	}
	
	public HomePage clickLogin() {
		
		click(locateElement("class", "decorativeSubmit"));
		
		return new HomePage(driver, node, test);

	}
	
	

}
