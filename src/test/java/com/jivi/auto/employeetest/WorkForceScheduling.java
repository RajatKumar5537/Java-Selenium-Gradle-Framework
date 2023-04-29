package com.jivi.auto.employeetest;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.jivi.auto.employeepages.LoginPage;
import com.jivi.auto.employeepages.MenuNavigation;
import com.jivi.auto.employeepages.WorkForceSchedulingPage;
import com.jivi.auto.utilities.BaseTest;

public class WorkForceScheduling extends BaseTest {

	public WorkForceScheduling() throws FileNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}
	LoginPage login;
	
	MenuNavigation menuNavigation;
	WorkForceSchedulingPage workforceScheduler;
	@BeforeTest
	public void setUp() throws Exception {
	//	getDriver();
		login = new LoginPage();
	//	excelObject = new excelUtilities();
		menuNavigation = new MenuNavigation();
		workforceScheduler = new WorkForceSchedulingPage();
	//	login.loginJIVIEWS(prop.getProperty("username"), prop.getProperty("password"));
		menuNavigation.waitforLoadingIcon();
		menuNavigation.navigateToSite("OLM");
		menuNavigation.waitforLoadingIcon();
		menuNavigation.navigateToEmployeeRoaster();

	}
	@Test
	public void createExmployeeShift() throws InterruptedException, IOException {
		workforceScheduler.serachandCreateExmployeeShift();
		Assert.assertTrue(workforceScheduler.verifyShiftbandCreate(), "Create Employee Shift");
	}
	@Test
	public void deleteExmployeeShift() throws InterruptedException, IOException {
		workforceScheduler.deleteExmployeeShift();
		Assert.assertTrue(workforceScheduler.verifyShiftbandDelete(), "Delete Employee Shift");
	}

}
