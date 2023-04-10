package com.jivi.auto.webelements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.jivi.auto.reusablecomponents.Browser;
import com.jivi.auto.reusablecomponents.Common;

public class Link extends Common {

	private WebElement btnObject;

	public void click(String locator) throws Exception {

		btnObject = getObject(locator);
		btnObject.click();
	}

	public void ClickLinkUsingJavascript(String locator) throws Exception {
		WebDriver driver = Browser.getInstance().getDriver();
		btnObject = getObject(locator);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", btnObject);
	}
}
