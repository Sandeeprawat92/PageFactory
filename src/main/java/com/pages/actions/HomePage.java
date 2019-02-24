package com.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.base.Page;
import com.pages.locaters.HomePageLocaters;

public class HomePage extends Page {

	/* wrapper over Locaters */
	public HomePageLocaters home;

	public HomePage() {

		// lazy load concept

		this.home = new HomePageLocaters();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 20);
		PageFactory.initElements(factory, this.home);
	}

	public void gotoMouldings() {
		home.mouldings.click();
	}

	public void gotoMatboards() {

	}

	public void gotoGlassandAcrylic() {

	}

	public void gotoEquipmentandSupplies() {

	}

}
