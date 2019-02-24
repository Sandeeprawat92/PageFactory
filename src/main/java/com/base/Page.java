package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.utilities.ExtentManger;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Page {

	/*
	 * Webdriver driver ExcelReader Webdriver Waits Reports
	 */

	public static WebDriver driver;
	public ExtentReports rep = ExtentManger.getInstance();
	public static ExtentTest test;

	// public static String browser;

	public static void initConfigration(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get(Constants.testsiteurl);
		driver.manage().window().maximize();
		/*
		 * driver.manage().timeouts().implicitlyWait(Constants.implicitWait,
		 * TimeUnit.SECONDS);
		 */

	}

	public static void quitBrowser() {
		driver.quit();
	}

}
