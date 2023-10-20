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
import com.jivi.auto.employeepages.EFDPlanning;
import com.jivi.auto.employeepages.HSSEPlanning;
import com.jivi.auto.employeepages.JiViewsEmployeeAdministration;
import com.jivi.auto.employeepages.LashingDeployment;
import com.jivi.auto.employeepages.LoginPage;

import com.jivi.auto.utilities.BaseTest;

///Deployment completed successfully For 1st Shift ShiftBand Between 2023-01-15 07:00 - 2023-01-15 19:00
public class EFDPlanningTest extends BaseTest {

	LoginPage login;

	MenuNavigation menuNavigation = new MenuNavigation();
	WorkLoadPlanning workLoad = new WorkLoadPlanning();
	RTGPlanning rtgplanning = new RTGPlanning();
	PMPlanning rmPlanning = new PMPlanning();
	LashingDeployment lashingdeployment = new LashingDeployment();
	EFDPlanning efdPlanning = new EFDPlanning();

	JiViewsEmployeeAdministration jiviewsHomePage;
	POMCommon pomCommon;
	WebElementKeys webAction = new WebElementKeys();
	FrameWindowHandler windowHandler = new FrameWindowHandler();

	public EFDPlanningTest() throws FileNotFoundException {
		super();

		// TODO Auto-generated constructor stub
	}

	public void setUp() throws Exception {
		// getDriver();
		login = new LoginPage();

	}

	@Test
	public void VerifyCreateEFDPlanning() throws Exception {
		System.out.println("EFD Planning");
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage = PageFactory.initElements(driver,
				JiViewsEmployeeAdministration.class);
		MenuNavigation menuNavigation = PageFactory.initElements(driver, MenuNavigation.class);
		EFDPlanning efdPlanning = PageFactory.initElements(driver, EFDPlanning.class);

		String userId = dataTable.get("UserId");
		String loginpwd = dataTable.get("pwd");
		jiviewsHomePage.Login(userId, loginpwd);

		Thread.sleep(3000);
		menuNavigation.navigateToEFDPlanning();
		efdPlanning.createEFDPlanning();

	}



}
