package com.jivi.auto.business_utilities;

import java.io.FileNotFoundException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class reuableComponents  extends BaseTest {
	
	public reuableComponents() throws FileNotFoundException{
		super();
	}

	public void performWebElementTab(WebElement ele) {
		Actions oAct = new Actions(driver);
		oAct.sendKeys(ele, Keys.TAB).build().perform();
	}

}	
