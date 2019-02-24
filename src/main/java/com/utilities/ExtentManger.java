package com.utilities;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManger {

	private static ExtentHtmlReporter htmlReporter;
	private static ExtentReports extent;

	public static ExtentReports getInstance() {

		if (extent == null) {

			htmlReporter = new ExtentHtmlReporter(
					System.getProperty("user.dir") + "/src/test/resources/ExtentReport.html");

			htmlReporter.config().setDocumentTitle("LJ Automation Report");
			// Name of the report
			htmlReporter.config().setReportName("Larson Juhl regression automation Report");
			// Dark Theme
			htmlReporter.config().setTheme(Theme.DARK);

			extent.attachReporter(htmlReporter);
			extent.setSystemInfo("HostName", "Sandeep rawat");
		}

		return extent;
	}
}
