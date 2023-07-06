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
import com.jivi.auto.employeepages.EmployeeSelfService;
import com.jivi.auto.employeepages.JiViewsEmployeeAdministration;
import com.jivi.auto.employeepages.LoginPage;

import com.jivi.auto.utilities.BaseTest;

///Deployment completed successfully For 1st Shift ShiftBand Between 2023-01-15 07:00 - 2023-01-15 19:00
public class EmployeeSelfServiceTest  extends BaseTest{

LoginPage login;
	
	MenuNavigation menuNavigation=new MenuNavigation();
	EmployeeSelfService employeeSelfService= new EmployeeSelfService();
	
	
	JiViewsEmployeeAdministration jiviewsHomePage;
	POMCommon pomCommon;
	WebElementKeys webAction = new WebElementKeys();
	FrameWindowHandler windowHandler = new FrameWindowHandler();
	
	
	public EmployeeSelfServiceTest() throws FileNotFoundException {
		super();
		
		// TODO Auto-generated constructor stub
	}
	
	
	public void setUp() throws Exception {
		//getDriver();
		login = new LoginPage();
		//excelObject = new excelUtilities();
		
		
		//login.loginJIVIEWS(prop.getProperty("username"), prop.getProperty("password"));
	

	}
	@Test (priority = 1)
	public void employeeSelfServiceEmployeeTest() throws Exception {
		
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		MenuNavigation menuNavigation=PageFactory.initElements(driver, MenuNavigation.class);
		EmployeeSelfService employeeSelfService=PageFactory.initElements(driver, EmployeeSelfService.class);
		
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
		jiviewsHomePage.Login(userId, loginpwd);
		//menuNavigation.waitforLoadingIcon();
		Thread.sleep(3000);
		menuNavigation.navigateToOLMSelfServiceEmployee();
		employeeSelfService.employeeSelfService();
	}
	
	@Test (priority = 2)
	public void employeeSelfServiceAdminTest() throws Exception {
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		MenuNavigation menuNavigation=PageFactory.initElements(driver, MenuNavigation.class);
		EmployeeSelfService employeeSelfService=PageFactory.initElements(driver, EmployeeSelfService.class);
		
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
		jiviewsHomePage.Login(userId, loginpwd);
		//menuNavigation.waitforLoadingIcon();
		Thread.sleep(3000);
		menuNavigation.navigateToESSAdmin();
		employeeSelfService.adminSelfService();
	}
	
	@Test (priority = 5)
	public void leaveBalanceAfterRejection() throws Exception {
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		MenuNavigation menuNavigation=PageFactory.initElements(driver, MenuNavigation.class);
		EmployeeSelfService employeeSelfService=PageFactory.initElements(driver, EmployeeSelfService.class);
		
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
		jiviewsHomePage.Login(userId, loginpwd);
		//menuNavigation.waitforLoadingIcon();
		Thread.sleep(3000);
		menuNavigation.navigateToOLMSelfServiceEmployee();
		employeeSelfService.leaveBalanceValidationAfterReject();
	//	employeeSelfService.leaveBalanceValidationAfterApplyLeave();
	}
	
	@Test (priority = 8)
	public void leaveBalanceAfterApprove() throws Exception {
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		MenuNavigation menuNavigation=PageFactory.initElements(driver, MenuNavigation.class);
		EmployeeSelfService employeeSelfService=PageFactory.initElements(driver, EmployeeSelfService.class);
		
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
		jiviewsHomePage.Login(userId, loginpwd);
		//menuNavigation.waitforLoadingIcon();
		Thread.sleep(3000);
		menuNavigation.navigateToOLMSelfServiceEmployee();
		employeeSelfService.leaveBalanceValidationAfterApprove();
	//	employeeSelfService.leaveBalanceValidationAfterApplyLeave();
	}
	
	
	@Test (priority = 3)
	public void employeeSelfServiceApplyLeave() throws Exception {
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		MenuNavigation menuNavigation=PageFactory.initElements(driver, MenuNavigation.class);
		EmployeeSelfService employeeSelfService=PageFactory.initElements(driver, EmployeeSelfService.class);
		
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
		jiviewsHomePage.Login(userId, loginpwd);
		//menuNavigation.waitforLoadingIcon();
		Thread.sleep(3000);
		menuNavigation.navigateToOLMSelfServiceEmployee();
		employeeSelfService.employeeSelfServiceApplyAnnualLeave();
	}
	
	
	@Test (priority = 6)
	public void employeeSelfServiceApplyLeaveSecondTime() throws Exception {
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		MenuNavigation menuNavigation=PageFactory.initElements(driver, MenuNavigation.class);
		EmployeeSelfService employeeSelfService=PageFactory.initElements(driver, EmployeeSelfService.class);
		
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
		jiviewsHomePage.Login(userId, loginpwd);
		//menuNavigation.waitforLoadingIcon();
		Thread.sleep(3000);
		menuNavigation.navigateToOLMSelfServiceEmployee();
		employeeSelfService.employeeSelfServiceApplyAnnualLeave();
	}
	
	@Test (priority = 4)
	public void employeeSelfServiceRejectLeave() throws Exception {
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		MenuNavigation menuNavigation=PageFactory.initElements(driver, MenuNavigation.class);
		EmployeeSelfService employeeSelfService=PageFactory.initElements(driver, EmployeeSelfService.class);
		
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
		jiviewsHomePage.Login(userId, loginpwd);
		//menuNavigation.waitforLoadingIcon();
		Thread.sleep(3000);
		employeeSelfService.employeeSelfServiceRejectLeave();
		
	}
	
	@Test (priority = 7)
	public void employeeSelfServiceApproveLeave() throws Exception {
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		MenuNavigation menuNavigation=PageFactory.initElements(driver, MenuNavigation.class);
		EmployeeSelfService employeeSelfService=PageFactory.initElements(driver, EmployeeSelfService.class);
		
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
		jiviewsHomePage.Login(userId, loginpwd);
		//menuNavigation.waitforLoadingIcon();
		Thread.sleep(3000);
		employeeSelfService.employeeSelfServiceApproveLeave();
		
	}
	
	@Test (priority = 9)
	public void employeeSelfServiceApplyTimeOff() throws Exception {
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		MenuNavigation menuNavigation=PageFactory.initElements(driver, MenuNavigation.class);
		EmployeeSelfService employeeSelfService=PageFactory.initElements(driver, EmployeeSelfService.class);
		
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
		jiviewsHomePage.Login(userId, loginpwd);
		//menuNavigation.waitforLoadingIcon();
		Thread.sleep(3000);
		menuNavigation.navigateToOLMSelfServiceEmployee();
		Thread.sleep(3000);
		employeeSelfService.employeeSelfServiceApplyTimeOff();
		Thread.sleep(3000);
		
	}
	
}
