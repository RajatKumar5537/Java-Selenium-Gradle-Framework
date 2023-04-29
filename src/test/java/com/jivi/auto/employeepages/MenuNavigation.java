package com.jivi.auto.employeepages;

import java.io.FileNotFoundException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.jivi.auto.utilities.BaseTest;
import com.jivi.auto.pageobjectutils.WebElementKeys;

public class MenuNavigation extends BaseTest {

	WebElementKeys webAction = new WebElementKeys();
	
	@FindBy(xpath="//*[@id=\"dvOrgUnitDropdown\"]/a/i")
	WebElement olm;
	
	@FindBy(xpath="//*[@id='dvGlobalOrganizationUnitTreeView']/ul/li[4]")
	WebElement olmLink;
	
	
	@FindBy(xpath="//*[text()=\"Demo\"]")
	WebElement demo;
	
	@FindBy(id = "dvOrgUnitDropdown")
	WebElement siteMap;

	@FindBy(id = "dvApplicationMenuItems")
	WebElement menuItems;

	@FindBy(xpath = "//span[text()='Operation Planning & Execution']")
	WebElement planningExecutionMenu;
	
	@FindBy(xpath = "//span[text()='Workforce Scheduling']")
	WebElement workforceScheduling;
	
	@FindBy(xpath = "//*[@id='lblSelectedParent']")
	WebElement systemSetup;

	@FindBy(xpath = "//div[text()='Employee Roster']")
	WebElement employeeRoster;
	
	@FindBy(xpath = "//*[text()='System Definitions']")
	WebElement systemDefinitionsMenu;
	
	@FindBy(id = "102")
	WebElement empAdministration;
	
	
	@FindBy(id= "347")
	WebElement rosterGroupAssnmt;
	
	@FindBy(id= "btnAddRosterGroup")
	WebElement rosterGroupAssnmtAdd;
	
	@FindBy(id= "txtRosterGroupname")
	WebElement rosterGroupName;
	
	@FindBy(id= "txtRosterGroupDesc")
	WebElement rosterGroupDesc;
	
	@FindBy(id= "txtRemarks")
	WebElement rosterGroupRemarks;
	
	@FindBy(id= "btnSaveRosterGroup")
	WebElement rosterGroupSave;
	
	
	
	@FindBy(xpath = "//div[text()='Resource Set Definition']")
	WebElement resourceSetMenu;

	@FindBy(xpath = "//div[text()='Leave Administration']")
	WebElement leaveAdmin;

	@FindBy(xpath = "//div[text()='Roster Setup']")
	WebElement roasterSetup;

	@FindBy(xpath = "//div[text()='Workload Planner']")
	WebElement workLoadPlanner;
	
	@FindBy(xpath = "//div[text()='Shift Band Definition']")
	WebElement shifitBandDefinition;
	
	@FindBy(xpath = "//div[text()='Roster Creation ']")
	WebElement rosterCreation;
	

	@FindBy(xpath = "//div[text()='Leave & Attendance Codes']")
	WebElement leaveAttendanceCode;

	@FindBy(id = "dvLoadingIcon")
	WebElement loadingIcon;

	@FindBy(xpath = "//div[text()='Schedule Creation Rules']")
	WebElement scheduleCreationRule;
	@FindBy(xpath = "//div[text()='Process Administration']")
	WebElement processAdministration;


	public MenuNavigation() throws FileNotFoundException {
		PageFactory.initElements(driver, this);

	}

	public void navigateToSite(String siteName) throws InterruptedException {
		siteMap.click();
		waitforLoadingIcon();
		driver.findElement(By.xpath("//li[text()='" + siteName + "']")).click();
		waitforLoadingIcon();

	}

	public void navigateToResourceSet() throws InterruptedException {
		menuItems.click();
		waitforLoadingIcon();
		planningExecutionMenu.click();
		waitforLoadingIcon();
		resourceSetMenu.click();

	}

	public void navigateToEmployeeRoaster() {
		menuItems.click();
		waitforLoadingIcon();
		workforceScheduling.click();
		waitforLoadingIcon();
		employeeRoster.click();
		waitforLoadingIcon();
	}
	public void navigateToLeaveAdmin() throws InterruptedException {
		menuItems.click();
		waitforLoadingIcon();
		systemDefinitionsMenu.click();
		waitforLoadingIcon();
		leaveAdmin.click();
		waitforLoadingIcon();
		Thread.sleep(200);
		leaveAttendanceCode.click();
	}

	public void navigateToRoasterSetup() throws Exception {
		
		Thread.sleep(2000);
		System.out.println("Landed navigateToRoasterSetup Method");
		webAction.clickUsingJavaScript(olm);
		webAction.click(olmLink);
		
		waitforLoadingIcon();
	//	menuItems.click();
		//waitforLoadingIcon();
		webAction.clickUsingJavaScript(systemSetup);
		//Thread.sleep(100);
		//webAction.waitUntilElementIsClickable(systemDefinitionsMenu);
		webAction.clickUsingJavaScript(systemDefinitionsMenu);
		//systemDefinitionsMenu.click();
		waitforLoadingIcon();
		roasterSetup.click();
		waitforLoadingIcon();
		Thread.sleep(200);
		shifitBandDefinition.click();
		waitforLoadingIcon();

	}
	
public void navigateToRoasterCreation() throws Exception {
		
		Thread.sleep(2000);
		System.out.println("Landed navigateToRoasterCreation Method");
		webAction.clickUsingJavaScript(olm);
		webAction.click(olmLink);
		
		waitforLoadingIcon();
	//	menuItems.click();
		//waitforLoadingIcon();
		webAction.clickUsingJavaScript(systemSetup);
		//Thread.sleep(100);
		//webAction.waitUntilElementIsClickable(systemDefinitionsMenu);
		webAction.clickUsingJavaScript(systemDefinitionsMenu);
		//systemDefinitionsMenu.click();
		waitforLoadingIcon();
		roasterSetup.click();
		waitforLoadingIcon();
		Thread.sleep(200);
		rosterCreation.click();
		waitforLoadingIcon();

	}
	
public void navigateToRoasterGroupAssignment() throws Exception {
		
		Thread.sleep(2000);
		System.out.println("Landed To Roaster Group Assignment Method");
		webAction.clickUsingJavaScript(olm);
		webAction.click(olmLink);
		
		waitforLoadingIcon();
	//	menuItems.click();
		//waitforLoadingIcon();
		webAction.clickUsingJavaScript(systemSetup);
		//Thread.sleep(100);
		//webAction.waitUntilElementIsClickable(systemDefinitionsMenu);
		webAction.clickUsingJavaScript(empAdministration);
		//systemDefinitionsMenu.clickwaitforLoadingIcon();
		webAction.clickUsingJavaScript(rosterGroupAssnmt);
		waitforLoadingIcon();

	}


	public void navigateToWorkLoadPLanning() throws Exception {
		webAction.clickUsingJavaScript(olm);
		webAction.click(olmLink);
		
		waitforLoadingIcon();
	//	menuItems.click();
		//waitforLoadingIcon();
		webAction.clickUsingJavaScript(systemSetup);
		Thread.sleep(2000);
		//menuItems.click();
		//waitforLoadingIcon();
		planningExecutionMenu.click();
		waitforLoadingIcon();
		workLoadPlanner.click();
		waitforLoadingIcon();
		Thread.sleep(10000);
		waitforLoadingIcon();

	}
	public void navigateToProcessAdministration() throws InterruptedException {
		menuItems.click();
		waitforLoadingIcon();
		systemSetup.click();
		waitforLoadingIcon();
		processAdministration.click();
		waitforLoadingIcon();

	}
	public void navigateToScheduleCreateionRule() throws Exception {
		
		Thread.sleep(2000);
		System.out.println("Landed navigateToScheduleCreateionRule Method");
		webAction.clickUsingJavaScript(olm);
		webAction.clickUsingJavaScript(olmLink);
		
		Thread.sleep(2000);
	//	menuItems.click();
		//waitforLoadingIcon();
		webAction.clickUsingJavaScript(systemSetup);
		//Thread.sleep(100);
		//webAction.waitUntilElementIsClickable(systemDefinitionsMenu);
		webAction.clickUsingJavaScript(systemDefinitionsMenu);
		waitforLoadingIcon();
		webAction.clickUsingJavaScript(roasterSetup);
		//roasterSetup.click();
		waitforLoadingIcon();
		webAction.clickUsingJavaScript(scheduleCreationRule);
		//scheduleCreationRule.click();
		waitforLoadingIcon();
	}

	public void waitforLoadingIcon() {
		try {
			//WebDriverWait wait = new WebDriverWait(driver, 30);
		    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dvLoadingIcon")));
		} catch (Exception e) {

		}
	}
}
