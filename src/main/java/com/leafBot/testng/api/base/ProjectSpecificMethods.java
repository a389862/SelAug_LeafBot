package com.leafBot.testng.api.base;

import java.io.IOException;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.leafBot.selenium.api.base.SeleniumBase;

import utils.DataLibrary;


public class ProjectSpecificMethods extends SeleniumBase {

	public String dataSheetName;		

	@DataProvider(name = "fetchData")
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(dataSheetName);
	}	

	@Parameters({"browser"})
	@BeforeMethod
	public void beforeMethod(String data) {
		driver = startApp(data, "http://leaftaps.com/opentaps/control/main");
		node = test.createNode(testCaseName);
	}

	@AfterMethod
	public void afterMethod() {
		close();
	}













}
