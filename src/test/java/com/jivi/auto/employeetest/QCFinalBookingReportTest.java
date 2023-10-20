package com.jivi.auto.employeetest;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
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
import com.jivi.auto.employeepages.HSSEPlanning;
import com.jivi.auto.employeepages.JiViewsEmployeeAdministration;
import com.jivi.auto.employeepages.LoginPage;

import com.jivi.auto.utilities.BaseTest;

///Deployment completed successfully For 1st Shift ShiftBand Between 2023-01-15 07:00 - 2023-01-15 19:00
public class QCFinalBookingReportTest extends BaseTest {

	LoginPage login;

	MenuNavigation menuNavigation = new MenuNavigation();
	HSSEPlanning hsse = new HSSEPlanning();

	JiViewsEmployeeAdministration jiviewsHomePage;
	POMCommon pomCommon;
	WebElementKeys webAction = new WebElementKeys();
	FrameWindowHandler windowHandler = new FrameWindowHandler();

	public QCFinalBookingReportTest() throws FileNotFoundException {
		super();

		// TODO Auto-generated constructor stub
	}

	public void setUp() throws Exception {
		// getDriver();
		login = new LoginPage();

	}

	@Test
	public void createHSSEPlanning() throws Exception {
		System.out.println("\n");
		System.out.println("Create HSSEPlanning");
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage = PageFactory.initElements(driver,
		JiViewsEmployeeAdministration.class);
		MenuNavigation menuNavigation = PageFactory.initElements(driver, MenuNavigation.class);
		HSSEPlanning hsse = PageFactory.initElements(driver, HSSEPlanning.class);
		String userId = dataTable.get("UserId");
		String loginpwd = dataTable.get("pwd");
		jiviewsHomePage.Login(userId, loginpwd);
		Thread.sleep(3000);
		menuNavigation.navigateToHSSEPLanning();
		hsse.createHSSEPlan();
	}

	@Test
	public void createHSSEPlanningAlreadyDeployedShift() throws Exception {
		System.out.println("\n");
		System.out.println("Create HSSEPlanning");
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage = PageFactory.initElements(driver,
		JiViewsEmployeeAdministration.class);
		MenuNavigation menuNavigation = PageFactory.initElements(driver, MenuNavigation.class);
		HSSEPlanning hsse = PageFactory.initElements(driver, HSSEPlanning.class);
		String userId = dataTable.get("UserId");
		String loginpwd = dataTable.get("pwd");
		jiviewsHomePage.Login(userId, loginpwd);
		Thread.sleep(3000);
		menuNavigation.navigateToHSSEPLanning();
		hsse.createHSSEPlanAlreadyDeployedShift();
	}

	@Test
	public void VerifyHSSEFinalBookingReport() throws Exception {
		System.out.println("\n");
		System.out.println("Verify HSSE Final Booking Report");
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage = PageFactory.initElements(driver,
		JiViewsEmployeeAdministration.class);
		MenuNavigation menuNavigation = PageFactory.initElements(driver, MenuNavigation.class);
		HSSEPlanning hsse = PageFactory.initElements(driver, HSSEPlanning.class);
		String userId = dataTable.get("UserId");
		String loginpwd = dataTable.get("pwd");
		jiviewsHomePage.Login(userId, loginpwd);
		Thread.sleep(3000);
		menuNavigation.navigateToHSSEFinalBookingReport();
		hsse.viewDeployment();
	}
	
	@Test
	public void VerifyHSSEFinalBookingAssingStandByEmployee() throws Exception {
		System.out.println("\n");
		System.out.println("Verify HSSE Final Booking Report");
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage = PageFactory.initElements(driver,
		JiViewsEmployeeAdministration.class);
		MenuNavigation menuNavigation = PageFactory.initElements(driver, MenuNavigation.class);
		HSSEPlanning hsse = PageFactory.initElements(driver, HSSEPlanning.class);
		String userId = dataTable.get("UserId");
		String loginpwd = dataTable.get("pwd");
		jiviewsHomePage.Login(userId, loginpwd);
		Thread.sleep(3000);
		menuNavigation.navigateToHSSEFinalBookingReport();
		hsse.assignStandbyEmployee();
	}
	
	@Test
	public void VerifyHSSEFinalBookingAddshift() throws Exception {
		System.out.println("\n");
		System.out.println("Verify HSSE Final Booking Report");
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage = PageFactory.initElements(driver,
		JiViewsEmployeeAdministration.class);
		MenuNavigation menuNavigation = PageFactory.initElements(driver, MenuNavigation.class);
		HSSEPlanning hsse = PageFactory.initElements(driver, HSSEPlanning.class);
		String userId = dataTable.get("UserId");
		String loginpwd = dataTable.get("pwd");
		jiviewsHomePage.Login(userId, loginpwd);
		Thread.sleep(3000);
		menuNavigation.navigateToHSSEFinalBookingReport();
		hsse.addShift();
	}
	

	@Test
	public void VerifyDeployment() throws Exception {
		System.out.println("\n");
		System.out.println("Verify HSSE Deployment");
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage = PageFactory.initElements(driver,
				JiViewsEmployeeAdministration.class);
		MenuNavigation menuNavigation = PageFactory.initElements(driver, MenuNavigation.class);
		HSSEPlanning hsse = PageFactory.initElements(driver, HSSEPlanning.class);

		String userId = dataTable.get("UserId");
		String loginpwd = dataTable.get("pwd");
		jiviewsHomePage.Login(userId, loginpwd);
		Thread.sleep(3000);
		menuNavigation.navigateToHSSEFinalBookingReport();
		hsse.deployment();
	}

	@Test
	public void VerifyDateRangeDeployment() throws Exception {
		System.out.println("\n");
		System.out.println("Verify HSSE Date Range Deployment");
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage = PageFactory.initElements(driver,
				JiViewsEmployeeAdministration.class);
		MenuNavigation menuNavigation = PageFactory.initElements(driver, MenuNavigation.class);
		HSSEPlanning hsse = PageFactory.initElements(driver, HSSEPlanning.class);

		String userId = dataTable.get("UserId");
		String loginpwd = dataTable.get("pwd");
		jiviewsHomePage.Login(userId, loginpwd);
		Thread.sleep(3000);
		menuNavigation.navigateToHSSEFinalBookingReport();
		hsse.DateRangeDeployment();
		
	}

	@Test
	public void VerifyDeAllocate() throws Exception {
		System.out.println("\n");
		System.out.println("Verify HSSE DeAllocate");
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage = PageFactory.initElements(driver,
		JiViewsEmployeeAdministration.class);
		MenuNavigation menuNavigation = PageFactory.initElements(driver, MenuNavigation.class);
		HSSEPlanning hsse = PageFactory.initElements(driver, HSSEPlanning.class);
		String userId = dataTable.get("UserId");
		String loginpwd = dataTable.get("pwd");
		jiviewsHomePage.Login(userId, loginpwd);
		Thread.sleep(3000);
		menuNavigation.navigateToHSSEFinalBookingReport();
		hsse.deAllocate();
	}

	@Test
	public void VerifyDateRangeDeAllocate() throws Exception {
		System.out.println("\n");
		System.out.println("Verify HSSE Date Range DeAllocate");
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage = PageFactory.initElements(driver,
		JiViewsEmployeeAdministration.class);
		MenuNavigation menuNavigation = PageFactory.initElements(driver, MenuNavigation.class);
		HSSEPlanning hsse = PageFactory.initElements(driver, HSSEPlanning.class);
		String userId = dataTable.get("UserId");
		String loginpwd = dataTable.get("pwd");
		jiviewsHomePage.Login(userId, loginpwd);
		Thread.sleep(3000);
		menuNavigation.navigateToHSSEFinalBookingReport();
		hsse.DateRangeDeAllocate();

	}

	@Test
	public void VerifyRevokeSignOff() throws Exception {
		System.out.println("\n");
		System.out.println("Verify HSSE Revoke SignOff");
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage = PageFactory.initElements(driver,
		JiViewsEmployeeAdministration.class);
		MenuNavigation menuNavigation = PageFactory.initElements(driver, MenuNavigation.class);
		HSSEPlanning hsse = PageFactory.initElements(driver, HSSEPlanning.class);
		String userId = dataTable.get("UserId");
		String loginpwd = dataTable.get("pwd");
		jiviewsHomePage.Login(userId, loginpwd);
		Thread.sleep(3000);
		menuNavigation.navigateToHSSEFinalBookingReport();
		hsse.revokeSignOff();
	}

	@Test
	public void VerifyBroadcast() throws Exception {
		System.out.println("Verify HSSE BroadCast");
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage = PageFactory.initElements(driver,
		JiViewsEmployeeAdministration.class);
		MenuNavigation menuNavigation = PageFactory.initElements(driver, MenuNavigation.class);
		HSSEPlanning hsse = PageFactory.initElements(driver, HSSEPlanning.class);
		String userId = dataTable.get("UserId");
		String loginpwd = dataTable.get("pwd");
		jiviewsHomePage.Login(userId, loginpwd);
		Thread.sleep(3000);
		menuNavigation.navigateToHSSEFinalBookingReport();
		hsse.broadCast();
	}

}
