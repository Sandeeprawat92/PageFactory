package com.pages.locaters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class HomePageLocaters {
	@FindBy(xpath = "//div[@id='categoryCollectionData']//div[1]//div[1]//a[2]//p[1]")
	public WebElement mouldings;

	@FindAll({ @FindBy(xpath = " //div[@id='categoryCollectionData']//div[2]//div[1]//a[2]//p[1]"),
			@FindBy(id = "123456"), @FindBy(className = "card-text") })
	public WebElement matboards;

	/*
	 * @FindBys({ @FindBy(className = "card-text"),
	 * 
	 * @FindBy(id = "1") }) public WebElement Test;
	 */

}