package com.jivi.auto.employeetest;

import java.io.FileNotFoundException;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.jivi.auto.employeepages.MenuNavigation;
import com.jivi.auto.employeepages.PMPlanning;
import com.jivi.auto.employeepages.RTGPlanning;
import com.jivi.auto.employeepages.ResourceSetPage;
import com.jivi.auto.employeepages.Roaster;
import com.jivi.auto.employeepages.StackersPlanning;
import com.jivi.auto.employeepages.WorkLoadPlanning;
import com.jivi.auto.pageobjectutils.FrameWindowHandler;
import com.jivi.auto.pageobjectutils.POMCommon;
import com.jivi.auto.pageobjectutils.WebElementKeys;
import com.jivi.auto.employeepages.HSSEPlanning;
import com.jivi.auto.employeepages.JiViewsEmployeeAdministration;
import com.jivi.auto.employeepages.LoginPage;

import com.jivi.auto.utilities.BaseTest;

///Deployment completed successfully For 1st Shift ShiftBand Between 2023-01-15 07:00 - 2023-01-15 19:00
public class StackersPlanner extends BaseTest {

	LoginPage login;

	MenuNavigation menuNavigation = new MenuNavigation();
	WorkLoadPlanning workLoad = new WorkLoadPlanning();
	RTGPlanning rtgplanning = new RTGPlanning();
	PMPlanning rmPlanning = new PMPlanning();
	StackersPlanning stackerPlanning = new StackersPlanning();
	

	JiViewsEmployeeAdministration jiviewsHomePage;
	POMCommon pomCommon;
	WebElementKeys webAction = new WebElementKeys();
	FrameWindowHandler windowHandler = new FrameWindowHandler();

	public StackersPlanner() throws FileNotFoundException {
		super();

		// TODO Auto-generated constructor stub
	}

	public void setUp() throws Exception {
		// getDriver();
		login = new LoginPage();

	}

	@Test
	public void VerifyCreateStackersPlanning() throws Exception {
		System.out.println("Executing Sackers Planning");
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage = PageFactory.initElements(driver,
				JiViewsEmployeeAdministration.class);
		MenuNavigation menuNavigation = PageFactory.initElements(driver, MenuNavigation.class);
		WorkLoadPlanning workLoad = PageFactory.initElements(driver, WorkLoadPlanning.class);
		RTGPlanning rtgplanning = PageFactory.initElements(driver, RTGPlanning.class);
		PMPlanning rmPlanning = PageFactory.initElements(driver, PMPlanning.class);
		StackersPlanning stackerPlanning = PageFactory.initElements(driver, StackersPlanning.class);

		String userId = dataTable.get("UserId");
		String loginpwd = dataTable.get("pwd");
		jiviewsHomePage.Login(userId, loginpwd);

		Thread.sleep(3000);
		menuNavigation.navigateToStackersPLanning();
		stackerPlanning.createStackersPlanning();

		
	}

	@Test
	public void VerifyCreateStackersPlanningwithSingOff() throws Exception {
		System.out.println("Executing Sackers Planning");
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage = PageFactory.initElements(driver,
				JiViewsEmployeeAdministration.class);
		MenuNavigation menuNavigation = PageFactory.initElements(driver, MenuNavigation.class);
		WorkLoadPlanning workLoad = PageFactory.initElements(driver, WorkLoadPlanning.class);
		RTGPlanning rtgplanning = PageFactory.initElements(driver, RTGPlanning.class);
		PMPlanning rmPlanning = PageFactory.initElements(driver, PMPlanning.class);
		StackersPlanning stackerPlanning = PageFactory.initElements(driver, StackersPlanning.class);

		String userId = dataTable.get("UserId");
		String loginpwd = dataTable.get("pwd");
		jiviewsHomePage.Login(userId, loginpwd);

		Thread.sleep(3000);
		menuNavigation.navigateToStackersPLanning();
		stackerPlanning.createStackersPlanning();


}

	@Test
	public void VerifyStackersPlanningFinalBookingReport() throws Exception {
		System.out.println("Executing PM Final Booking Report");
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage = PageFactory.initElements(driver,
				JiViewsEmployeeAdministration.class);
		MenuNavigation menuNavigation = PageFactory.initElements(driver, MenuNavigation.class);
		WorkLoadPlanning workLoad = PageFactory.initElements(driver, WorkLoadPlanning.class);
		RTGPlanning rtgplanning = PageFactory.initElements(driver, RTGPlanning.class);
		PMPlanning rmPlanning = PageFactory.initElements(driver, PMPlanning.class);
		StackersPlanning stackerPlanning = PageFactory.initElements(driver, StackersPlanning.class);

		String userId = dataTable.get("UserId");
		String loginpwd = dataTable.get("pwd");
		jiviewsHomePage.Login(userId, loginpwd);

		Thread.sleep(3000);
		menuNavigation.navigateToStackersFinalBookingReport();
		stackerPlanning.viewDeployment();

		// Assert.assertTrue(workLoad.verifyVesselCreation(), "Create Vessel");
	}

	@Test
	public void VerifyStackersPlanningFinalBookingStandByEmployee() throws Exception {
		System.out.println("Executing RTG Planning");
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage = PageFactory.initElements(driver,
				JiViewsEmployeeAdministration.class);
		MenuNavigation menuNavigation = PageFactory.initElements(driver, MenuNavigation.class);
		WorkLoadPlanning workLoad = PageFactory.initElements(driver, WorkLoadPlanning.class);
		RTGPlanning rtgplanning = PageFactory.initElements(driver, RTGPlanning.class);
		StackersPlanning stackerPlanning = PageFactory.initElements(driver, StackersPlanning.class);

		String userId = dataTable.get("UserId");
		String loginpwd = dataTable.get("pwd");
		jiviewsHomePage.Login(userId, loginpwd);

		Thread.sleep(3000);
		menuNavigation.navigateToStackersFinalBookingReport();
		stackerPlanning.assignStandbyEmployee();

		// Assert.assertTrue(workLoad.verifyVesselCreation(), "Create Vessel");
	}

	@Test
	public void VerifyDeployment() throws Exception {
		System.out.println("\n");
		System.out.println("Verify RTG Deployment");
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage = PageFactory.initElements(driver,
				JiViewsEmployeeAdministration.class);
		MenuNavigation menuNavigation = PageFactory.initElements(driver, MenuNavigation.class);
		RTGPlanning rtgplanning = PageFactory.initElements(driver, RTGPlanning.class);
		StackersPlanning stackerPlanning = PageFactory.initElements(driver, StackersPlanning.class);

		String userId = dataTable.get("UserId");
		String loginpwd = dataTable.get("pwd");
		jiviewsHomePage.Login(userId, loginpwd);
		Thread.sleep(3000);
		menuNavigation.navigateToStackersFinalBookingReport();
		stackerPlanning.deployment();

	}

	@Test
	public void VerifyDateRangeDeployment() throws Exception {
		System.out.println("\n");
		System.out.println("Verify HSSE Date Range Deployment");
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage = PageFactory.initElements(driver,
				JiViewsEmployeeAdministration.class);
		MenuNavigation menuNavigation = PageFactory.initElements(driver, MenuNavigation.class);
		RTGPlanning rtgplanning = PageFactory.initElements(driver, RTGPlanning.class);
		StackersPlanning stackerPlanning = PageFactory.initElements(driver, StackersPlanning.class);

		String userId = dataTable.get("UserId");
		String loginpwd = dataTable.get("pwd");
		jiviewsHomePage.Login(userId, loginpwd);
		Thread.sleep(3000);
		menuNavigation.navigateToStackersFinalBookingReport();
		stackerPlanning.DateRangeDeployment();

	}

	@Test
	public void VerifyRevokeSignOff() throws Exception {
		System.out.println("\n");
		System.out.println("Verify HSSE Revoke SignOff");
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage = PageFactory.initElements(driver,
				JiViewsEmployeeAdministration.class);
		MenuNavigation menuNavigation = PageFactory.initElements(driver, MenuNavigation.class);
		RTGPlanning rtgplanning = PageFactory.initElements(driver, RTGPlanning.class);
		StackersPlanning stackerPlanning = PageFactory.initElements(driver, StackersPlanning.class);

		String userId = dataTable.get("UserId");
		String loginpwd = dataTable.get("pwd");
		jiviewsHomePage.Login(userId, loginpwd);
		Thread.sleep(3000);
		menuNavigation.navigateToStackersFinalBookingReport();
		stackerPlanning.revokeSignOff();
	}

	@Test
	public void VerifyBroadcast() throws Exception {
		System.out.println("Verify HSSE BroadCast");
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage = PageFactory.initElements(driver,
				JiViewsEmployeeAdministration.class);
		MenuNavigation menuNavigation = PageFactory.initElements(driver, MenuNavigation.class);
		RTGPlanning rtgplanning = PageFactory.initElements(driver, RTGPlanning.class);
		StackersPlanning stackerPlanning = PageFactory.initElements(driver, StackersPlanning.class);

		String userId = dataTable.get("UserId");
		String loginpwd = dataTable.get("pwd");
		jiviewsHomePage.Login(userId, loginpwd);
		Thread.sleep(3000);
		menuNavigation.navigateToStackersFinalBookingReport();
		stackerPlanning.broadCast();
	}

	@Test
	public void VerifyRTGPlanningFinalBookingAddshift() throws Exception {
		System.out.println("Executing RTG Planning");
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage = PageFactory.initElements(driver,
				JiViewsEmployeeAdministration.class);
		MenuNavigation menuNavigation = PageFactory.initElements(driver, MenuNavigation.class);
		WorkLoadPlanning workLoad = PageFactory.initElements(driver, WorkLoadPlanning.class);
		RTGPlanning rtgplanning = PageFactory.initElements(driver, RTGPlanning.class);
		StackersPlanning stackerPlanning = PageFactory.initElements(driver, StackersPlanning.class);

		String userId = dataTable.get("UserId");
		String loginpwd = dataTable.get("pwd");
		jiviewsHomePage.Login(userId, loginpwd);

		Thread.sleep(3000);
		menuNavigation.navigateToStackersFinalBookingReport();
		stackerPlanning.addShift();

	}

}
