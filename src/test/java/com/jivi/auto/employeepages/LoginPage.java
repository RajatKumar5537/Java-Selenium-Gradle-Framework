package com.jivi.auto.employeepages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.jivi.auto.utilities.BaseTest;

public class LoginPage extends BaseTest{
	@FindBy(id="txtUserName")
	WebElement username;
	@FindBy(id="txtPassword")
	WebElement password;
	@FindBy(id="btnSignIn")
	WebElement login;
	@FindBy(id="screenHeader")
	WebElement loginmsg;
	
	@FindBy(id="dvOrgUnitDropdown")
	WebElement siteMap;
	
	@FindBy(xpath="//li[text()='Demo']")
	WebElement demo;
	
    WebDriverWait wait = new WebDriverWait(driver, 30);
    MenuNavigation menuNavigation;

	public LoginPage() throws FileNotFoundException {
		PageFactory.initElements(driver, this);
		menuNavigation = new MenuNavigation();

	}
	
	public void loginJIVIEWS(String userName, String passwrod) throws InterruptedException {


		username.sendKeys(userName);
		password.sendKeys(passwrod);
		wait.until(ExpectedConditions.elementToBeClickable(login));
		menuNavigation.waitforLoadingIcon();
		login.click();
		menuNavigation.waitforLoadingIcon();
		siteMap.click();
		menuNavigation.waitforLoadingIcon();
		Thread.sleep(200);
		demo.click();
		menuNavigation.waitforLoadingIcon();
	}
	public String getLoginMesage() {
		return loginmsg.getText();
		
	}

}
