package com.jivi.auto.employeepages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.jivi.auto.utilities.BaseTest;
//import com.auto.utilities.BaseTest;
//import com.auto.utilities.excelUtilities;
//import com.auto.utilities.reuableComponents;

import junit.framework.Assert;

import com.jivi.auto.business_reusablecomponents.ReusableComponents;
import com.jivi.auto.pageobjectutils.DropDown;
import com.jivi.auto.pageobjectutils.MouseHandler;
import com.jivi.auto.pageobjectutils.POMCommon;
import com.jivi.auto.pageobjectutils.WebElementKeys;
import com.github.dockerjava.api.model.Driver;
import com.github.javafaker.Faker;

public class HSSEPlanning extends BaseTest {
	MenuNavigation menuNavigation;
	// excelUtilities excelObject;
	ReusableComponents reuse = new ReusableComponents();
	Faker faker = new Faker();
	// ReusableComponents resusemain=new ReusableComponents();
	WebElementKeys webAction = new WebElementKeys();
	DropDown dropdown = new DropDown();
	MouseHandler handler = new MouseHandler();
	POMCommon common = new POMCommon();

	public HSSEPlanning() throws FileNotFoundException {
		PageFactory.initElements(driver, this);
		menuNavigation = new MenuNavigation();
		// excelObject = new excelUtilities();

	}

	@FindBy(id = "dtPlanning")
	WebElement dtPlanning;

	@FindBy(xpath = "(//div[@class='centered_matrix']/div/div[@class='centered_cell centered_cell_business'][2])[1]")
	WebElement berth;

	@FindBy(xpath = "//*[text()='Create']")
	WebElement lnkCreate;

	@FindBy(xpath = "//*[text()='Vessel']")
	WebElement lnkVessel;

	@FindBy(id = "txtVesselName")
	WebElement txtVesselName;
	@FindBy(id = "txtVesselVisitId")
	WebElement txtVesselVisitId;
	@FindBy(id = "select2-cmbBerth-container")
	WebElement lstBerth;

	@FindBy(xpath = "//*[@id='select2-cmbBerth-results']/li[1]")
	WebElement berthSelect;

	@FindBy(id = "cmbBerth")
	WebElement vesselBirth;

	@FindBy(xpath = "//select[@id='cmbBerth']/option")
	List<WebElement> vesselBirthList;

	@FindBy(id = "txtNumberOfCranes")
	WebElement txtNumberOfCranes;
	@FindBy(id = "select2-cmbPriority-container")
	WebElement lstPriority;

	@FindBy(id = "cmbPriority")
	WebElement lstPriorityList;

	@FindBy(xpath = "//*[@id='select2-cmbPriority-results']/li[1]")
	WebElement prioritySelection;

	@FindBy(id = "select2-cmbResourceSet-container")
	WebElement lstResourceSet;
	@FindBy(id = "btnSaveVesselSchedule")
	WebElement btnSaveVesselSchedule;

	@FindBy(xpath = "//span[@class='select2-selection__choice__remove']")
	WebElement removeSelection;

	@FindBy(id = "cmbShiftBand")
	WebElement lstShiftBand;

	@FindBy(xpath = "(//input[@type='search'])[1]")
	WebElement lstShiftBandSelection;

	@FindBy(xpath = "//*[@id='cmbShiftBand']/option")
	List<WebElement> lstShiftBandList;

	@FindBy(id = "btnSearchHSSEPlanning")
	WebElement btnSearchHSSEPlanning;

	@FindBy(id = "btnAddHSSEPlanning")
	WebElement addHSSEPlanning;

	@FindBy(id = "//*[@id='btnHSSESkillDel1']")
	WebElement skillDelete;
	
	int rowcount;
	
	
	
	
	//@FindBy(xpath = "//table[@id='add-hsse-skills-table']/tbody/tr["+rowcount+"]/td[4]")
	//WebElement skillDel;
	
	//WebElement skillDel =driver.findElement(By.xpath("//table[@id='add-hsse-skills-table']/tbody/tr["+rowcount+"]/td[4]"));
	
	
	@FindBy(xpath = "//button[@id='btnAddHSSEPlanning']")
	WebElement addHSSESkill;

	@FindBy(xpath = "//select[contains(@id,'cmbLocationName')]")
	WebElement locationName;

	@FindBy(xpath = "//select[contains(@id,'cmbHSSESkill')]")
	WebElement skillCode;

	@FindBy(name = "requirement")
	WebElement requirement;

	@FindBy(id = "btnSaveHSSEPlanning")
	WebElement saveHSSESkillPlanning;
	
	@FindBy(id = "btnPlanningSignOff")
	WebElement planningSignOff;
	
	@FindBy(xpath = "//select[@id='cmbAllocationRule']")
	WebElement allocationRule;
	
	@FindBy(id = "btnPerformActivityGenerationTask")
	WebElement planningSignOffSaveButton;
	
	
	@FindBy(xpath = "//div[@class='toast-message']")
	WebElement negativeToastMessage;
	
	@FindBy(xpath = "//table[@id='add-hsse-skills-table']/tbody")
	WebElement TogetRows ;
	
	@FindBy(xpath = "//table[@id='add-hsse-skills-table']/tbody/tr/td")
	WebElement tablerowtext ;
	
	@FindBy(xpath = "//table[@id='final-Booking-Report-list']/tbody")
	WebElement finalBookingReportTable;
	
	@FindBy(xpath = "//table[@id='final-Booking-Report-list']/tbody/tr/td")
	WebElement finalBookingReportTableText;
	
	@FindBy(xpath = "//button[contains(@id,'btnHSSESkillDel')]")
	WebElement delSkill ;
	
	@FindBy(xpath = "//button[text()='Yes']")
	WebElement delSkillYes ;
	

	@FindBy(xpath = "//button[text()='Yes']")
	WebElement btnYes;
	@FindBy(id = "btnSaveCraneSchedule")
	WebElement btnSaveCraneSchedule;
	@FindBy(id = "btnPlanningSignOff")
	WebElement btnPlanningSignOff;
	@FindBy(id = "btnPerformActivityGenerationTask")
	WebElement btnPerformActivityGenerationTask;
	@FindBy(id = "select2-cmbActivityGenRule-container")
	WebElement lstManningRatio;

	@FindBy(id = "dvCurrentDateSignOffStatus")
	WebElement dvCurrentDateSignOffStatus;

	@FindBy(xpath = "//*[@id='217']/a/div")
	WebElement workForceExecution;

	@FindBy(xpath = "//*[@id='432']/a/div")
	WebElement qcFinalBookingReport;

	@FindBy(id = "cmbShiftBand")
	WebElement cmbShiftBandInQCFinalBookingReport;

	@FindBy(xpath = "//select[@id='cmbShiftBand']/option")
	List<WebElement> cmbShiftBandInQCFinalBookingReportList;

	@FindBy(id = "btnSearch")
	WebElement btnSearchInQCFinalBookingReport;

	@FindBy(xpath = "(//*[@class='centered_rowheader_inner']/div)[15]")
	WebElement craneRequired;

	@FindBy(xpath = "(//*[@class='centered_rowheader_inner']/div)[16]")
	WebElement craneAvailable;

	@FindBy(xpath = "(//*[@class='centered_rowheader_inner']/div)[22]")
	WebElement vesselCraneAvailable;

	@FindBy(xpath = "//*[text()='Skill Summary']")
	WebElement skillSummary;

	@FindBy(xpath = "(//*[@class='centered_rowheader_inner'])[56]")
	WebElement craneDriverRequired;
	
	@FindBy(xpath = "//button[@data-original-title='Deployment']")
	WebElement hSSEDeployment;
	
	@FindBy(xpath = "(//*[text()='Show Standby Employees'])[2]")
	WebElement showStandbyEmployee;
	
	@FindBy(xpath = "//*[text()='Non Primary Skill Deployed Employee']")
	WebElement nonPrimarySkillDeployedEmployee;
	
	@FindBy(xpath = "//*[text()='Unallocated Work']")
	WebElement unallocatedWork;
	
	@FindBy(xpath = "//*[text()='OnCall List']")
	WebElement OnCallList;
	
	
	@FindBy(xpath = "//button[@data-original-title='Deployment']")
	WebElement deploymentButton;
	
	@FindBy(xpath = "//a[@id='btnDeploy']")
	WebElement buttonDeploy;
	
	@FindBy(xpath = "//button[@id='btnBeginDeploy']")
	WebElement deploymentButtonSave;
	
	@FindBy(xpath = "//a[@id='btnDeploy']")
	WebElement dateRangeDeployButton;
	
	@FindBy(xpath = "//a[@id='btnUnAllocate']")
	WebElement deAllocate;

	@FindBy(xpath = "//a[@id='btnBeginDeploy']")
	WebElement deAllocateSave;
	
	@FindBy(xpath = "(//button[@data-original-title='Cancel'])[1]")
	WebElement deAllocateCancel;
	
	
	@FindBy(xpath = "//a[@id='btnUnAllocateDateRange']")
	WebElement deAllocateDateRange;
	
	@FindBy(xpath = "//a[@id='btnRevokePlanningSignOff']")
	WebElement buttonRevokePlanningSignOff;
	
		
	@FindBy(xpath = "//button[@id='btnPerformActivityGenerationTask']")
	WebElement buttonRevokePlanningSignOffSave;
	
	@FindBy(xpath = "(//button[@data-original-title='Cancel'])[1]")
	WebElement buttonRevokePlanningSignOffCancel;
	
	@FindBy(xpath = "//a[@id='btnBroadcastDeployment']")
	WebElement buttonBroadcastDeployment;
	
	@FindBy(xpath = "(//*[@id='broadcast-deployment-modal']//button[1])[2]")
	WebElement buttonBroadcastDeploymentCancel;
	
	@FindBy(id = "btnSearch")
	WebElement btnSearchHsseFinalbookingReport;

	public void createHSSEPlan() throws Exception {
		Date date = new Date();
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-mm-yyyy");
		String formateddate = dateformat.format(date);

		// webAction.clickUsingJavaScript(removeSelection);
		Thread.sleep(500);
		String shiftBandNews = "Auto Band code 85139";

		Thread.sleep(500);

		List<WebElement> listShiftBand = lstShiftBandSelection
				.findElements(By.xpath("//select[@id='cmbShiftBand']/option"));
		for (WebElement we : listShiftBand) {
			Thread.sleep(500);
			// we.sendKeys(Keys.ARROW_DOWN);
			// if(shiftBandNew.equals(we.getText()))
			if (shiftBandNews.equals(we.getText()))
				we.click();
			// Thread.sleep(500);
		}

		Thread.sleep(2000);
		webAction.clickUsingJavaScript(btnSearchHSSEPlanning);
		
		Thread.sleep(5000);

		webAction.waitUntilElementIsClickable(addHSSEPlanning);
		webAction.clickUsingJavaScript(addHSSEPlanning);
		Thread.sleep(2000);
		
		List<WebElement>TotalRowsList = TogetRows.findElements(By.tagName("tr"));
		rowcount=TotalRowsList.size();
		if(tablerowtext.getText().equalsIgnoreCase("No data available in table"))
		{
			System.out.println("########################################################");
			System.out.println("No data available in Resource Set");
			System.out.println("########################################################");
		}
		else
		{
		System.out.println("########################################################");
		System.out.println("Total number of Skills in the Resource Set: "+ (rowcount));
		System.out.println("########################################################");
		 webAction.clickUsingJavaScript(delSkill);
		 webAction.clickUsingJavaScript(delSkillYes);
		}
				 
		
		 Thread.sleep(1000);
		webAction.clickUsingJavaScript(saveHSSESkillPlanning);
		Thread.sleep(3000);
		webAction.clickUsingJavaScript(addHSSESkill);
		Thread.sleep(1000);
		dropdown.selectByIndex(locationName, 0);
		dropdown.selectByIndex(skillCode, 0);
		requirement.clear();
		requirement.sendKeys("2");

		Thread.sleep(1000);
		webAction.clickUsingJavaScript(saveHSSESkillPlanning);
		Thread.sleep(3000);
		webAction.clickUsingJavaScript(planningSignOff);
		Thread.sleep(1000);
		
		String ratio="Default Ratio";
		List<WebElement> lstManningRatioSe=lstManningRatio.findElements(By.xpath("//select[@id='cmbActivityGenRule']/option"));
		for( WebElement we: lstManningRatioSe) { 
		Thread.sleep(500);      
		//we.sendKeys(Keys.ARROW_DOWN);
		if(ratio.equals(we.getText()))
		we.click();
		//Thread.sleep(500);
		}
		Thread.sleep(1000);
		
		dropdown.selectByIndex(allocationRule, 0);
		
		webAction.clickUsingJavaScript(planningSignOffSaveButton);
		Thread.sleep(1000);
		
	
		

	}
	
	public void createHSSEPlanAlreadyDeployedShift() throws Exception {
		Date date = new Date();
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-mm-yyyy");
		String formateddate = dateformat.format(date);

		
		Thread.sleep(500);
		//This Shift Band id already signed Off
		String shiftBandNews = "Auto Band code 85139";

		Thread.sleep(500);

		List<WebElement> listShiftBand = lstShiftBandSelection
				.findElements(By.xpath("//select[@id='cmbShiftBand']/option"));
		for (WebElement we : listShiftBand) {
			Thread.sleep(500);
			// we.sendKeys(Keys.ARROW_DOWN);
			// if(shiftBandNew.equals(we.getText()))
			if (shiftBandNews.equals(we.getText()))
				we.click();
			// Thread.sleep(500);
		}

		Thread.sleep(2000);
		webAction.clickUsingJavaScript(btnSearchHSSEPlanning);
		
		Thread.sleep(5000);

		webAction.waitUntilElementIsClickable(addHSSEPlanning);
		webAction.clickUsingJavaScript(addHSSEPlanning);
		Thread.sleep(2000);
		
		List<WebElement>TotalRowsList = TogetRows.findElements(By.tagName("tr"));
		rowcount=TotalRowsList.size();
		System.out.println("########################################################");
		System.out.println("Total number of Skills in the Resource Set: "+ rowcount);
		System.out.println("########################################################");
		
		 if(rowcount>0)
		 { 
			 webAction.clickUsingJavaScript(delSkill);
		  }
		 
		 webAction.clickUsingJavaScript(delSkillYes);
		 Thread.sleep(1000);
		webAction.clickUsingJavaScript(saveHSSESkillPlanning);
		Thread.sleep(3000);
		webAction.clickUsingJavaScript(addHSSESkill);
		Thread.sleep(1000);
		dropdown.selectByIndex(locationName, 0);
		dropdown.selectByIndex(skillCode, 0);
		requirement.clear();
		requirement.sendKeys("2");

		Thread.sleep(1000);
		webAction.clickUsingJavaScript(saveHSSESkillPlanning);
		Thread.sleep(3000);
		
		String message=negativeToastMessage.getText();
		System.out.println(message);
		Assert.assertTrue(message,message.contains("The shift has been deployed by"));
		

	}

	
	public void viewDeployment() throws Exception {
		int rowcountsbe;
		int rowcountocl;
		int rowcountuaw;
		int rowcountnpse;
		
		Date date = new Date();
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-mm-yyyy");
		String formateddate = dateformat.format(date);

		
		Thread.sleep(500);
		//This Shift Band id already signed Off
		String shiftBandNews = "Auto Band code 85319";

		Thread.sleep(500);

		List<WebElement> listShiftBand = lstShiftBandSelection
				.findElements(By.xpath("//select[@id='cmbShiftBand']/option"));
		for (WebElement we : listShiftBand) {
			Thread.sleep(500);
			// we.sendKeys(Keys.ARROW_DOWN);
			// if(shiftBandNew.equals(we.getText()))
			if (shiftBandNews.equals(we.getText()))
				we.click();
			// Thread.sleep(500);
		}

		webAction.clickUsingJavaScript(btnSearchHsseFinalbookingReport);
		Thread.sleep(2000);
		webAction.clickUsingJavaScript(showStandbyEmployee);
		webAction.scrollDown300();
		//webAction.clickUsingJavaScript(showStandbyEmployee);
		webAction.clickUsingJavaScript(btnSearchHsseFinalbookingReport);
		Thread.sleep(4000);
		
		List<WebElement> TotalRowsListsbe = finalBookingReportTable.findElements(By.tagName("tr"));
		rowcountsbe=TotalRowsListsbe.size();
		if(finalBookingReportTableText.getText().equalsIgnoreCase("No data available in table"))
		{	System.out.println("\n");
			System.out.println("########################################################");
			System.out.println("No data available in Stand By Employees");
			System.out.println("########################################################");
			System.out.println("\n");
		}
		else
		{
		System.out.println("########################################################");
		System.out.println("Total number of Skills in the Stand By Employees: "+ (rowcountsbe));
		System.out.println("########################################################");
		System.out.println("\n");
		}
				 
		
		
		/*
		 * if(rowcount>1) { webAction.clickUsingJavaScript(delSkill);
		 * webAction.clickUsingJavaScript(delSkillYes); }
		 */			  
				  
		handler.clickUsingActionsMethod(showStandbyEmployee);
		webAction.clickUsingJavaScript(nonPrimarySkillDeployedEmployee);
		webAction.scrollDown300();
		webAction.clickUsingJavaScript(btnSearchHsseFinalbookingReport);
		Thread.sleep(2000);
		
		List<WebElement> TotalRowsListnpse = finalBookingReportTable.findElements(By.tagName("tr"));
		rowcountnpse=TotalRowsListnpse.size();
		if(finalBookingReportTableText.getText().equalsIgnoreCase("No data available in table"))
		{
			System.out.println("########################################################");
			System.out.println("No data available in Non Primary Skill Deployed Employee");
			System.out.println("########################################################");
			System.out.println("\n");
		}
		else
		{
		System.out.println("########################################################");
		System.out.println("Total number of Skills in the Non Primary Skill Deployed Employee: "+ (rowcountnpse));
		System.out.println("########################################################");
		System.out.println("\n");
		}
		webAction.clickUsingJavaScript(nonPrimarySkillDeployedEmployee);
		webAction.clickUsingJavaScript(unallocatedWork);
		webAction.scrollDown300();
		webAction.clickUsingJavaScript(btnSearchHsseFinalbookingReport);
		Thread.sleep(2000);
		
		List<WebElement>TotalRowsListuaw = finalBookingReportTable.findElements(By.tagName("tr"));
		rowcountuaw=TotalRowsListuaw.size();
		if(finalBookingReportTableText.getText().equalsIgnoreCase("No data available in table"))
		{
			System.out.println("########################################################");
			System.out.println("No data available in Unallocated Work Employee");
			System.out.println("########################################################");
			System.out.println("\n");
		}
		else
		{
		System.out.println("########################################################");
		System.out.println("Total number of Skills in the Unallocated Work Employee: "+ (rowcountuaw));
		System.out.println("########################################################");
		System.out.println("\n");
		}
		webAction.clickUsingJavaScript(unallocatedWork);
		webAction.clickUsingJavaScript(OnCallList);
		webAction.scrollDown300();
		webAction.clickUsingJavaScript(btnSearchHsseFinalbookingReport);
		Thread.sleep(2000);
		List<WebElement> TotalRowsListocl = finalBookingReportTable.findElements(By.tagName("tr"));
		rowcountocl=TotalRowsListocl.size();
		
		if(finalBookingReportTableText.getText().equalsIgnoreCase("No data available in table"))
		{
			System.out.println("########################################################");
			System.out.println("No data available in On Call List Employees");
			System.out.println("########################################################");
			System.out.println("\n");
		}
		else
		{
		System.out.println("########################################################");
		System.out.println("Total number of Skills in the On Call List Employees: "+ (rowcountocl));
		System.out.println("########################################################");
		System.out.println("\n");
		}
		
	
		Thread.sleep(2000);
	}
	
	public void revokeSignOff() throws Exception {
		Date date = new Date();
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-mm-yyyy");
		String formateddate = dateformat.format(date);

		
		Thread.sleep(500);
		//This Shift Band id already signed Off
		String shiftBandNews = "Auto Band code 85139";

		Thread.sleep(500);

		List<WebElement> listShiftBand = lstShiftBandSelection
				.findElements(By.xpath("//select[@id='cmbShiftBand']/option"));
		for (WebElement we : listShiftBand) {
			Thread.sleep(500);
			// we.sendKeys(Keys.ARROW_DOWN);
			// if(shiftBandNew.equals(we.getText()))
			if (shiftBandNews.equals(we.getText()))
				we.click();
			// Thread.sleep(500);
		}
		webAction.clickUsingJavaScript(deploymentButton);
		Thread.sleep(500);

		webAction.clickUsingJavaScript(buttonRevokePlanningSignOff);
		webAction.clickUsingJavaScript(buttonRevokePlanningSignOffSave);
		Thread.sleep(500);

	}
	
	
	public void deployment() throws Exception {
		Date date = new Date();
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-mm-yyyy");
		String formateddate = dateformat.format(date);

		
		Thread.sleep(500);
		//This Shift Band id already signed Off
		String shiftBandNews = "Auto Band code 85139";

		Thread.sleep(500);

		List<WebElement> listShiftBand = lstShiftBandSelection
				.findElements(By.xpath("//select[@id='cmbShiftBand']/option"));
		for (WebElement we : listShiftBand) {
			Thread.sleep(500);
			// we.sendKeys(Keys.ARROW_DOWN);
			// if(shiftBandNew.equals(we.getText()))
			if (shiftBandNews.equals(we.getText()))
				we.click();
			// Thread.sleep(500);
		}
		webAction.clickUsingJavaScript(deploymentButton);
		Thread.sleep(500);

		webAction.clickUsingJavaScript(buttonDeploy);
		//Testing purpose
		webAction.clickUsingJavaScript(buttonRevokePlanningSignOffCancel);
		Thread.sleep(500);

	}
	
	
	public void deAllocate() throws Exception {
		Date date = new Date();
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-mm-yyyy");
		String formateddate = dateformat.format(date);

		
		Thread.sleep(500);
		//This Shift Band id already signed Off
		String shiftBandNews = "Auto Band code 85139";

		Thread.sleep(500);

		List<WebElement> listShiftBand = lstShiftBandSelection
				.findElements(By.xpath("//select[@id='cmbShiftBand']/option"));
		for (WebElement we : listShiftBand) {
			Thread.sleep(500);
			// we.sendKeys(Keys.ARROW_DOWN);
			// if(shiftBandNew.equals(we.getText()))
			if (shiftBandNews.equals(we.getText()))
				we.click();
			// Thread.sleep(500);
		}
		webAction.clickUsingJavaScript(deploymentButton);
		Thread.sleep(500);

		webAction.clickUsingJavaScript(deAllocate);
		Thread.sleep(500);
		//Cancelling for Testing Purpose
		webAction.clickUsingJavaScript(deAllocateCancel);
		Thread.sleep(3000);

	}
	
	
	public void broadCast() throws Exception {
		Date date = new Date();
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-mm-yyyy");
		String formateddate = dateformat.format(date);

		
		Thread.sleep(500);
		//This Shift Band id already signed Off
		String shiftBandNews = "Auto Band code 85139";

		Thread.sleep(500);

		List<WebElement> listShiftBand = lstShiftBandSelection
				.findElements(By.xpath("//select[@id='cmbShiftBand']/option"));
		for (WebElement we : listShiftBand) {
			Thread.sleep(500);
			// we.sendKeys(Keys.ARROW_DOWN);
			// if(shiftBandNew.equals(we.getText()))
			if (shiftBandNews.equals(we.getText()))
				we.click();
			// Thread.sleep(500);
		}
		webAction.clickUsingJavaScript(deploymentButton);
		Thread.sleep(500);

		webAction.clickUsingJavaScript(buttonBroadcastDeployment);
		Thread.sleep(500);
		//Cancelling for Testing Purpose
		webAction.clickUsingJavaScript(buttonBroadcastDeploymentCancel);
		Thread.sleep(3000);

	}
	
	public void scheduleCranes() throws InterruptedException {
		Thread.sleep(3000);
		btnYes.click();
		Thread.sleep(3000);
		menuNavigation.waitforLoadingIcon();
		Thread.sleep(2000);
		btnSaveCraneSchedule.click();
		menuNavigation.waitforLoadingIcon();
		Thread.sleep(200);
	}

	public void signOffPlanning() throws Exception {
		Thread.sleep(3000);
		// reuse.clickUsingJS(btnPlanningSignOff);
		// driver.findElement(By.xpath("//i[@class='fas fa-check-double']")).click();
		reuse.waitforClickable(btnPlanningSignOff);
		// btnPlanningSignOff.click();
		webAction.clickUsingJavaScript(btnPlanningSignOff);
		menuNavigation.waitforLoadingIcon();
		Thread.sleep(500);
		menuNavigation.waitforLoadingIcon();
		webAction.clickUsingJavaScript(btnPerformActivityGenerationTask);

		// btnPerformActivityGenerationTask.click();
		// menuNavigation.waitforLoadingIcon();
		Thread.sleep(500);
		webAction.clickUsingJavaScript(lstManningRatio);

		String ratio = "Default Ratio";
		List<WebElement> lstManningRatioSe = lstManningRatio
				.findElements(By.xpath("//select[@id='cmbActivityGenRule']/option"));
		for (WebElement we : lstManningRatioSe) {
			Thread.sleep(500);
			// we.sendKeys(Keys.ARROW_DOWN);
			if (ratio.equals(we.getText()))
				we.click();
			// Thread.sleep(500);
		}

		// lstManningRatio.click();
		// lstManningRatio.sendKeys(Keys.TAB);
		// driver.findElement(By.xpath("//li[text()='Default Manning Ratio']")).click();
		Thread.sleep(1000);
		webAction.clickUsingJavaScript(btnPerformActivityGenerationTask);
		// btnPerformActivityGenerationTask.click();
		// menuNavigation.waitforLoadingIcon();
		Thread.sleep(20000);
	}

	public void validateEquipmentSummary() throws Exception {
		System.out.println("Cranne Required: " + craneRequired.getText());
		if (craneRequired.getText().equalsIgnoreCase("5")) {
			System.out.println("Crane required is matching in the EquipmentSummary");
		} else {
			System.out.println("Crane required is NOT matching in the EquipmentSummary");
		}
	}

	public void validateSkillSummary() throws Exception {
		Thread.sleep(10000);
		webAction.scrollDownLittle();
		webAction.waitUntilElementIsClickable(skillSummary);
		webAction.click(skillSummary);
		Thread.sleep(1000);
		System.out.println("Cranne Driver Required: " + craneDriverRequired.getText());
		if (craneDriverRequired.getText().equalsIgnoreCase("5")) {
			System.out.println("Crane Driver required is matching in the SkillSummary");
		} else {
			System.out.println("Crane Driver required is NOT matching in the SkillSummary");
		}
		Thread.sleep(1000);
	}

	public boolean verifyPlanningSignoff() throws IOException {
		System.out.println(dvCurrentDateSignOffStatus.getText().trim());
		System.out.println("Shift has been Signed off");

		return dvCurrentDateSignOffStatus.getText().trim().contains("has been Signed off");

		// .equals("[" + "Shift 22"+ "] has been Signed off");

	}

	public boolean verifyQCFinalBookingReport() throws Exception {
		Thread.sleep(100);
		webAction.click(workForceExecution);
		webAction.click(qcFinalBookingReport);
		webAction.click(cmbShiftBandInQCFinalBookingReport);

		// temp name for to view the functionality is working or not
		// Actual name for shiftBand: shiftBandNew (Global variable)
		String shiftBandNewone = "Auto Band code 9572";

		List<WebElement> listShiftBand = cmbShiftBandInQCFinalBookingReport
				.findElements(By.xpath("//select[@id='cmbShiftBand']/option"));
		for (WebElement we : listShiftBand) {
			Thread.sleep(500);
			if (shiftBandNew.equals(we.getText()))
				we.click();
		}

		return false;

	}
}
