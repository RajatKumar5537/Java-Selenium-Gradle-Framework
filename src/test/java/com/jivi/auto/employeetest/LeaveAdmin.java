package com.jivi.auto.employeetest;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.jivi.auto.employeepages.MenuNavigation;
import com.jivi.auto.employeepages.ResourceSetPage;
import com.jivi.auto.employeepages.Roaster;
import com.jivi.auto.employeepages.WorkLoadPlanning;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.service.ExtentTestManager;
import com.jivi.auto.employeepages.LeaveAdminPage;
import com.jivi.auto.employeepages.LoginPage;

import com.jivi.auto.utilities.BaseTest;

public class LeaveAdmin extends BaseTest {

	public LeaveAdmin() throws FileNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}
	LoginPage login;

	MenuNavigation menuNavigation;
	ResourceSetPage resourceSet;
	LeaveAdminPage leaveadmin;
	@BeforeTest
	public void setUp() throws Exception {
		//getDriver();
		login = new LoginPage();
	//	excelObject = new excelUtilities();
		menuNavigation = new MenuNavigation();
		resourceSet = new ResourceSetPage();
		leaveadmin = new LeaveAdminPage();
		//login.loginJIVIEWS(prop.getProperty("username"), prop.getProperty("password"));
		menuNavigation.waitforLoadingIcon();
		menuNavigation.navigateToLeaveAdmin();
	}
	@Test ( enabled = false)
	public void createLeaveExceptionCodes() throws InterruptedException, IOException {
		leaveadmin.createLeaveAttendanceCodes();
		Assert.assertTrue(leaveadmin.verifyLeaveAttendanceCodesCreation(), "Create Leave Exception Codes");
		ExtentTestManager.getTest().log(Status.PASS, "ShiftBand Created Sucessfully");
	}
	@Test ( enabled = false)
	public void updateLeaveExceptionCodes() throws InterruptedException, IOException {
		leaveadmin.editLeaveAttendanceCodes();
		Assert.assertTrue(leaveadmin.verifyLeaveAttendanceCodesUpdate(), "Update Leave Exception Codes");
		ExtentTestManager.getTest().log(Status.PASS, "ShiftBand Updated Sucessfully");
	}
	@Test 
	public void deleteLeaveExceptionCodes() throws InterruptedException, IOException {
		leaveadmin.deleteLeaveAttendanceCodes();
		Assert.assertTrue(leaveadmin.verifyLeaveAttendanceCodesDeletion(), "Delete Leave Exception Codes");
		ExtentTestManager.getTest().log(Status.PASS, "ShiftBand Updated Sucessfully");
	}
}
