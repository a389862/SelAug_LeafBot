package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.pages.NewLoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC008_LoginLogOut extends ProjectSpecificMethods{	

	@BeforeTest
	public void setValues() {
		testCaseName = "Login and LoginOut";
		testDescription = "Login testCase using DemoSalesManager UserName and LogOut";
		nodes = "Leads";
		authors = "Hari";
		category = "Smoke";
		
	}

	@Test
	public void createLeaf() {
		new NewLoginPage(driver, node, test)
		.enterUsername("Demosalesmanager")
		.enterPassword("crmsfa")
		.clickLogin();
		
	}


}





