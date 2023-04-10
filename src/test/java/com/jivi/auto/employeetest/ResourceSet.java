package com.jivi.auto.employeetest;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.jivi.auto.employeepages.MenuNavigation;
import com.jivi.auto.employeepages.ResourceSetPage;
import com.jivi.auto.employeepages.Roaster;
import com.jivi.auto.employeepages.LoginPage;
//import com.jivi.auto.employeepages.LeaveAdminPage;
import com.jivi.auto.utilities.BaseTest;
//import com.auto.utilities.ReportHelper;
//import com.auto.utilities.excelUtilities;
import com.aventstack.extentreports.ExtentTest;

public class ResourceSet extends BaseTest {
	public ResourceSet() throws FileNotFoundException {
		super();
	}

	LoginPage login;
	//ReportHelper reportHelper;
	//excelUtilities excelObject;
	MenuNavigation menuNavigation;
	ResourceSetPage resourceSet;

	@BeforeClass
	public static void startTest() {

	}

	@BeforeTest
	public void setUp() throws Exception {
	//	getDriver();
		login = new LoginPage();
		//excelObject = new excelUtilities();
		menuNavigation = new MenuNavigation();
		resourceSet = new ResourceSetPage();
	}

	@Test
	public void updateResourceSet() throws InterruptedException, IOException {
	//	login.loginJIVIEWS(prop.getProperty("username"), prop.getProperty("password"));
		menuNavigation.waitforLoadingIcon();
		menuNavigation.navigateToResourceSet();
		resourceSet.addResourceSet();
		//String title = login.getLoginMesage();
		//Assert.assertEquals(title, excelObject.getData("ResourceSet", "verifyText"));
	}

//	@AfterMethod
//	public void tearDown() {
//		//driver.quit();
//	}

	@AfterTest
	public static void endTest() {
		//driver.quit();
		//report.flush();
		
	}
}
