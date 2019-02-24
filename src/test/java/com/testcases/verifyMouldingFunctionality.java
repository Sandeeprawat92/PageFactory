package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.Page;
import com.pages.actions.HomePage;

public class verifyMouldingFunctionality extends Page {

	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) {
		Page.initConfigration(browser);
	}

	@Test
	public void myTest() {
		HomePage home = new HomePage();
		home.gotoMouldings();
	}

	@AfterMethod
	public void tearDown() {
		if (Page.driver != null) {
			Page.quitBrowser();
		}
	}

}
