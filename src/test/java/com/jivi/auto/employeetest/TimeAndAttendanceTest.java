package com.jivi.auto.employeetest;

import java.io.FileNotFoundException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.jivi.auto.employeepages.MenuNavigation;
import com.jivi.auto.employeepages.ResourceSetPage;
import com.jivi.auto.employeepages.Roaster;
import com.jivi.auto.employeepages.TimeAndAttendance;
import com.jivi.auto.employeepages.WorkLoadPlanning;
import com.jivi.auto.pageobjectutils.FrameWindowHandler;
import com.jivi.auto.pageobjectutils.POMCommon;
import com.jivi.auto.pageobjectutils.WebElementKeys;
import com.jivi.auto.employeepages.JiViewsEmployeeAdministration;
import com.jivi.auto.employeepages.LoginPage;

import com.jivi.auto.utilities.BaseTest;

///Deployment completed successfully For 1st Shift ShiftBand Between 2023-01-15 07:00 - 2023-01-15 19:00
public class TimeAndAttendanceTest  extends BaseTest{

LoginPage login;
	
	MenuNavigation menuNavigation=new MenuNavigation();
	TimeAndAttendance timeattendance= new TimeAndAttendance();
	
	
	JiViewsEmployeeAdministration jiviewsHomePage;
	POMCommon pomCommon;
	WebElementKeys webAction = new WebElementKeys();
	FrameWindowHandler windowHandler = new FrameWindowHandler();
	
	
	public TimeAndAttendanceTest() throws FileNotFoundException {
		super();
		
		// TODO Auto-generated constructor stub
	}
	
	
	public void setUp() throws Exception {
		//getDriver();
		login = new LoginPage();
		//excelObject = new excelUtilities();
		
		
		//login.loginJIVIEWS(prop.getProperty("username"), prop.getProperty("password"));
	

	}
	@Test
	public void attendaceRecon() throws Exception {
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		MenuNavigation menuNavigation=PageFactory.initElements(driver, MenuNavigation.class);
		TimeAndAttendance timeattendance=PageFactory.initElements(driver, TimeAndAttendance.class);
		
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
		jiviewsHomePage.Login(userId, loginpwd);
		//menuNavigation.waitforLoadingIcon();
		Thread.sleep(3000);
		menuNavigation.navigateToTimeAndAttendance();
		timeattendance.attendanceReconciliationNew();
		

	}
	
	
}
