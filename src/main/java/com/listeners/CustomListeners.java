package com.listeners;

import java.io.IOException;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.base.Page;

public class CustomListeners extends Page implements ITestListener, ISuiteListener {

	public String messageBody;

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestFailure(ITestResult arg0) {

	}

	public void onTestSkipped(ITestResult arg0) {

	}

	public void onTestStart(ITestResult arg0) {

	}

	public void onTestSuccess(ITestResult arg0) {

	}

	public void onFinish(ISuite arg0) {

		/*
		 * MonitoringMail mail = new MonitoringMail();
		 * 
		 * try { messageBody = "http://" +
		 * InetAddress.getLocalHost().getHostAddress() +
		 * ":8080/job/LiveProject-PageObjectWithFactories/Extent_Report/"; }
		 * catch (UnknownHostException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 * try { mail.sendMail(TestConfig.server, TestConfig.from,
		 * TestConfig.to, TestConfig.subject, messageBody); } catch
		 * (AddressException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } catch (MessagingException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		rep.flush();
	}

	public void onStart(ISuite arg0) {
		// TODO Auto-generated method stub

	}
}
