package com.jivi.auto.employeetest;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.jivi.auto.employeepages.MenuNavigation;
import com.jivi.auto.employeepages.ResourceSetPage;
import com.jivi.auto.employeepages.Roaster;
import com.jivi.auto.pageobjectutils.WebElementKeys;
import com.jivi.auto.employeepages.LoginPage;
import com.jivi.auto.employeepages.JiViewsEmployeeAdministration;
//import com.jivi.auto.employeepages.LeaveAdminPage;
//import com.auto.utilities.BaseTest;
import com.jivi.auto.utilities.BaseTest;
//import com.auto.utilities.ExtentTestManager;
//import com.auto.utilities.ReportHelper;
//import com.auto.utilities.excelUtilities;
import com.aventstack.extentreports.Status;

public class RoaserSetup extends BaseTest{

	/*
	 * public RoaserSetup() throws FileNotFoundException { super();
	 * 
	 * }
	 */
	//MenuNavigation menuNavigation=new MenuNavigation();
	//Roaster roaster=new Roaster();
	LoginPage login;
	//ReportHelper reportHelper;
	//excelUtilities excelObject;
	
	JiViewsEmployeeAdministration jiviewsHomePage;
	WebElementKeys webAction = new WebElementKeys();
	
	@FindBy(id = "dvApplicationMenuItems")
	WebElement menuItems;

	@FindBy(xpath = "//span[text()='System Definitions']")
	WebElement systemDefinitionsMenu;
	
	@FindBy(xpath = "//div[text()='Roster Setup']")
	WebElement roasterSetup;
	
	
		
	@FindBy(xpath = "//div[text()='Shift Band Definition']")
	WebElement shifitBandDefinition;

	
	public RoaserSetup()   {
	//	getDriver();
	//	login = new LoginPage();
		//excelObject = new excelUtilities();
		try {
			MenuNavigation menuNavigation = new MenuNavigation();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Roaster roaster = new Roaster();

	}
	
	public void navigateToRoasterSetup() throws Exception {

		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		Roaster roaster=PageFactory.initElements(driver, Roaster.class);
		MenuNavigation menuNavigation=PageFactory.initElements(driver, MenuNavigation.class);
		
		menuItems.click();
		menuNavigation.waitforLoadingIcon();
		systemDefinitionsMenu.click();
		menuNavigation.waitforLoadingIcon();
		roasterSetup.click();
		menuNavigation.waitforLoadingIcon();
		Thread.sleep(200);
		shifitBandDefinition.click();
		menuNavigation.waitforLoadingIcon();

	}
	
	@Test 
	public void createShiftBandDefinition() throws Exception {
		System.out.println("testing roaster");
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		Roaster roaster=PageFactory.initElements(driver, Roaster.class);
		MenuNavigation menuNavigation=PageFactory.initElements(driver, MenuNavigation.class);
	
		
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
	
		jiviewsHomePage.Login(userId, loginpwd);
		webAction.waitForPageLoad(2000);
			
	//	menuNavigation.waitforLoadingIcon();
		
		menuNavigation.navigateToRoasterSetup();
	//	menuNavigation.navigateToRoasterSetup();
	//	String shiftBndNm=dataTable.get("EmpId");
	//	System.out.println(shiftBndNm);
		roaster.createShiftBand();
		Assert.assertTrue(roaster.verifyShiftbandCreation(), "ShiftBand Creation");
		
		//ExtentTestManager.getTest().log(Status.PASS, "ShiftBand Created Sucessfully");
	}
	
	
	@Test 
	public void rosterGroupAssignmentAddingSelectedEmp() throws Exception {
		System.out.println("Roster Group: emp admin-->Roster Group Assignment");
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		Roaster roaster=PageFactory.initElements(driver, Roaster.class);
		MenuNavigation menuNavigation=PageFactory.initElements(driver, MenuNavigation.class);
	
		
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
	
		jiviewsHomePage.Login(userId, loginpwd);
		webAction.waitForPageLoad(2000);
			
	//	menuNavigation.waitforLoadingIcon();
		
		menuNavigation.navigateToRoasterGroupAssignment();
	//	menuNavigation.navigateToRoasterSetup();
	//	String shiftBndNm=dataTable.get("EmpId");
	//	System.out.println(shiftBndNm);
		roaster.createRosterGroupAssignmentAddingSelectedEmp();
		//System.out.println(roaster.verifyRosterGroupCreation());
		Assert.assertTrue(roaster.verifyRosterGroupCreation(), "Roster Group Created Successfully.");
		
		//ExtentTestManager.getTest().log(Status.PASS, "ShiftBand Created Sucessfully");
	}
	
	@Test 
	public void rosterGroupAssignmentAddingAllEmp() throws Exception {
		System.out.println("Roster Group: emp admin-->Roster Group Assignment");
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		Roaster roaster=PageFactory.initElements(driver, Roaster.class);
		MenuNavigation menuNavigation=PageFactory.initElements(driver, MenuNavigation.class);
	
		
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
	
		jiviewsHomePage.Login(userId, loginpwd);
		webAction.waitForPageLoad(2000);
			
	//	menuNavigation.waitforLoadingIcon();
		
		menuNavigation.navigateToRoasterGroupAssignment();
	//	menuNavigation.navigateToRoasterSetup();
	//	String shiftBndNm=dataTable.get("EmpId");
	//	System.out.println(shiftBndNm);
		roaster.createRosterGroupAssignmentAddingAllEmp();
		//System.out.println(roaster.verifyRosterGroupCreation());
		Assert.assertTrue(roaster.verifyRosterGroupCreation(), "Roster Group Created Successfully.");
		
		//return rosterGroupAssignmentAddingAllEmp();
		
		
		//ExtentTestManager.getTest().log(Status.PASS, "ShiftBand Created Sucessfully");
	}
	
	@Test 
	public void rosterGroupAssignmentRemoveSelectedEmp() throws Exception {
		System.out.println("Roster Group: emp admin-->Roster Group Assignment");
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		Roaster roaster=PageFactory.initElements(driver, Roaster.class);
		MenuNavigation menuNavigation=PageFactory.initElements(driver, MenuNavigation.class);
	
		
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
	
		jiviewsHomePage.Login(userId, loginpwd);
		webAction.waitForPageLoad(2000);
			
	//	menuNavigation.waitforLoadingIcon();
		
		menuNavigation.navigateToRoasterGroupAssignment();
	//	menuNavigation.navigateToRoasterSetup();
	//	String shiftBndNm=dataTable.get("EmpId");
	//	System.out.println(shiftBndNm);
		roaster.createRosterGroupAssignmentRemoveSelected();
		//System.out.println(roaster.verifyRosterGroupCreation());
		Assert.assertTrue(roaster.verifyRosterGroupCreation(), "Roster Group Created Successfully.");
		
		//ExtentTestManager.getTest().log(Status.PASS, "ShiftBand Created Sucessfully");
	}
	
	@Test 
	public void rosterGroupAssignmentRemoveAllEmp() throws Exception {
		System.out.println("Roster Group: emp admin-->Roster Group Assignment");
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		Roaster roaster=PageFactory.initElements(driver, Roaster.class);
		MenuNavigation menuNavigation=PageFactory.initElements(driver, MenuNavigation.class);
	
		
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
	
		jiviewsHomePage.Login(userId, loginpwd);
		webAction.waitForPageLoad(2000);
			
	//	menuNavigation.waitforLoadingIcon();
		
		menuNavigation.navigateToRoasterGroupAssignment();
	//	menuNavigation.navigateToRoasterSetup();
	//	String shiftBndNm=dataTable.get("EmpId");
	//	System.out.println(shiftBndNm);
		roaster.createRosterGroupAssignmentRemoveAll();
		//System.out.println(roaster.verifyRosterGroupCreation());
		Assert.assertTrue(roaster.verifyRosterGroupCreation(), "Roster Group Created Successfully.");
		
		//ExtentTestManager.getTest().log(Status.PASS, "ShiftBand Created Sucessfully");
	}
	
	
	@Test 
	public void rosterCreation() throws Exception {
		System.out.println("Testing Roaster Creation");
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		Roaster roaster=PageFactory.initElements(driver, Roaster.class);
		MenuNavigation menuNavigation=PageFactory.initElements(driver, MenuNavigation.class);
	
		
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
	
		jiviewsHomePage.Login(userId, loginpwd);
		webAction.waitForPageLoad(2000);
			
	//	menuNavigation.waitforLoadingIcon();
		
		menuNavigation.navigateToRoasterCreation();
	//	menuNavigation.navigateToRoasterSetup();
	//	String shiftBndNm=dataTable.get("EmpId");
	//	System.out.println(shiftBndNm);
		roaster.rosterCreation();
		//Assert.assertTrue(roaster.verifyShiftbandCreation(), "ShiftBand Creation");
		
		//ExtentTestManager.getTest().log(Status.PASS, "ShiftBand Created Sucessfully");
	}
	
	
	@Test
	public void editShiftBandDefinition() throws Exception {
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		MenuNavigation menuNavigation=PageFactory.initElements(driver, MenuNavigation.class);
		
		Roaster roaster=PageFactory.initElements(driver, Roaster.class);
		
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
	
		jiviewsHomePage.Login(userId, loginpwd);
		webAction.waitForPageLoad(2000);
		menuNavigation.navigateToRoasterSetup();
		roaster.editShiftBand();
		System.out.println(roaster.verifyShiftbandEdit());
		Assert.assertTrue(roaster.verifyShiftbandEdit(), "ShiftBand Update");
		//ExtentTestManager.getTest().log(Status.PASS, "ShiftBand Updated Sucessfully");
	}
	
	@Test 
	public void deleteShiftBandDefinition() throws Exception {
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		Roaster roaster=PageFactory.initElements(driver, Roaster.class);
		
		MenuNavigation menuNavigation=PageFactory.initElements(driver, MenuNavigation.class);
		
		
		
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
	
		jiviewsHomePage.Login(userId, loginpwd);
		webAction.waitForPageLoad(2000);
		menuNavigation.navigateToRoasterSetup();
		
		roaster.deleteShiftBand();
		Assert.assertTrue(roaster.verifyShiftbandDelete(), "ShiftBand Delete");
		//ExtentTestManager.getTest().log(Status.PASS, "ShiftBand Deleted Sucessfully");
	}
	
	@Test 
	public void reActivatedeletedShiftBandDefinition() throws Exception {
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		Roaster roaster=PageFactory.initElements(driver, Roaster.class);
		
		MenuNavigation menuNavigation=PageFactory.initElements(driver, MenuNavigation.class);
		
		
		
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
	
		jiviewsHomePage.Login(userId, loginpwd);
		//webAction.waitForPageLoad(2000);
		Thread.sleep(2000);
		menuNavigation.navigateToRoasterSetup();
		
		roaster.editShiftBand();
		System.out.println(roaster.verifyShiftbandEdit());
		Assert.assertTrue(roaster.verifyShiftbandEdit(), "ShiftBand Update");
		//Assert.assertTrue(roaster.verifyShiftbandActivate(), "ShiftBand Update");
		//ExtentTestManager.getTest().log(Status.PASS, "ShiftBand Deleted Sucessfully");
	}
	
	
	@Test
	public void scheduleCreationRules() throws Exception {
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		MenuNavigation menuNavigation=PageFactory.initElements(driver, MenuNavigation.class);
		Roaster roaster=PageFactory.initElements(driver, Roaster.class);
		
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
	
		jiviewsHomePage.Login(userId, loginpwd);
		webAction.waitForPageLoad(2000);
		
		menuNavigation.navigateToScheduleCreateionRule();
		roaster.scheduleCreationRule();
	}
	@AfterTest
	public static void endTest() {
		//driver.quit();
		//report.flush();
		
	}
}
