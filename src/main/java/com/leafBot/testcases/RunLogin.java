package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

import cucumber.api.CucumberOptions;

@CucumberOptions(features="src/main/java/features" , glue = "com.leafBot.pages" , monochrome = true)
public class RunLogin extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setValues() {
		testCaseName = "Login and LoginOut";
		testDescription = "Login testCase using DemoSalesManager UserName and LogOut";
		nodes = "Leads";
		authors = "Hari";
		category = "Smoke";
		
	}


}
