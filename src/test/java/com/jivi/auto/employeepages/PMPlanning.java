package com.jivi.auto.employeepages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.jivi.auto.utilities.BaseTest;
//import com.auto.utilities.BaseTest;
//import com.auto.utilities.excelUtilities;
//import com.auto.utilities.reuableComponents;

import com.jivi.auto.business_reusablecomponents.ReusableComponents;
import com.jivi.auto.pageobjectutils.DropDown;
import com.jivi.auto.pageobjectutils.MouseHandler;
import com.jivi.auto.pageobjectutils.WebElementKeys;
import com.github.javafaker.Faker;

public class PMPlanning extends BaseTest {
	MenuNavigation menuNavigation;
	ReusableComponents reuse = new ReusableComponents();
	Faker faker = new Faker();
	ReusableComponents resue = new ReusableComponents();

	WebElementKeys webAction = new WebElementKeys();
	DropDown dropdown = new DropDown();
	MouseHandler handler = new MouseHandler();

	public PMPlanning() throws FileNotFoundException {
		PageFactory.initElements(driver, this);
		menuNavigation = new MenuNavigation();

	}

	@FindBy(id = "btnSearchDailyPlanning")
	WebElement btnSearchDailyPlanning;
	@FindBys(@FindBy(xpath = "//div[contains(text(),'Vessel Schedule created successfully')]"))
	List<WebElement> txtVesselCreate;
	@FindBys(@FindBy(xpath = "//div[contains(text(),'Crane Schedule created successfully')]"))
	List<WebElement> txtCreateCraneSchedule;
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

	@FindBy(xpath = "//button[@id='btnSearchRTGPlanning']")
	WebElement btnSearchRTGPlanning;

	@FindBy(xpath = "//button[@id='btnSearchPMPlanning']")
	WebElement btnSearchPMPlanning;

	@FindBy(xpath = "(//div[contains(@class,'centered_timeheader_float')])[1]/div")
	WebElement dateHSSETable;

	@FindBy(xpath = "//*[@id='dpDailyPlanningEquipmentSummaryTimeLine']//div[contains(@class,'inner_text')]")
	WebElement equipmentName;

	@FindBy(xpath = "(//*[@id='dpDailyPlanningEquipmentSummaryTimeLine']//div[contains(@class,'centered_rowheader_inner')]//div/div)[2]")
	WebElement requiredEquipment;

	@FindBy(xpath = "(//*[@id='dpDailyPlanningEquipmentSummaryTimeLine']//div[contains(@class,'centered_rowheader_inner')]//div/div)[3]")
	WebElement availableEquipment;

	@FindBy(xpath = "//*[text()='Skill Summary']")
	WebElement skillSummary;

	@FindBy(xpath = "(//*[@id='dpDailyPlanningTaskSummary']//div[contains(@class,'centered_rowheader_inner_text')])[1]")
	WebElement skillCodeOne;

	@FindBy(xpath = "(//*[@id='dpDailyPlanningTaskSummary']//div[contains(@class,'centered_rowheader_inner')])[3]/div")
	WebElement requiredSkillCodeOne;

	@FindBy(xpath = "(//*[@id='dpDailyPlanningTaskSummary']//div[contains(@class,'centered_rowheader_inner')])[4]/div")
	WebElement availableSkillCodeOne;

	@FindBy(xpath = "(//*[@id='dpDailyPlanningTaskSummary']//div[contains(@class,'centered_rowheader_inner')])[5]/div")
	WebElement requiredManPowerSkillCodeOne;

	@FindBy(xpath = "(//*[@id='dpDailyPlanningTaskSummary']//div[contains(@class,'centered_rowheader_inner_text')])[2]")
	WebElement skillCodeTwo;

	@FindBy(xpath = "(//*[@id='dpDailyPlanningTaskSummary']//div[contains(@class,'centered_rowheader_inner')])[8]/div")
	WebElement requiredSkillCodeTwo;

	@FindBy(xpath = "(//*[@id='dpDailyPlanningTaskSummary']//div[contains(@class,'centered_rowheader_inner')])[9]/div")
	WebElement availableSkillCodeTwo;

	@FindBy(xpath = "(//*[@id='dpDailyPlanningTaskSummary']//div[contains(@class,'centered_rowheader_inner')])[10]/div")
	WebElement requiredManPowerSkillCodeTwo;

	@FindBy(xpath = "//button[@id='btnAddRTGPlanning']")
	WebElement addRTGPlanning;

	@FindBy(xpath = "//button[@id='btnAddPrimeMoverPlanning']")
	WebElement addPMPlanning;

	@FindBy(xpath = "//button[@id='btnAddPrimeMoverSkill']")
	WebElement resourceSetADD;

	@FindBy(xpath = "//table[@id='add-prime-mover-skills-table']/tbody/tr[1]/td[1]//select[@placeholder='Select Skill Code']")
	WebElement selectSkillRowOne;

	@FindBy(xpath = "//table[@id='add-prime-mover-skills-table']/tbody/tr[2]/td[1]//select[@placeholder='Select Skill Code']")
	WebElement selectSkillRowTwo;

	@FindBy(xpath = "//select[@placeholder='Select Skill Code']/option[1]")
	WebElement selectSkillCodeOptionOne;

	@FindBy(xpath = "//select[@placeholder='Select Skill Code']/option[2]")
	WebElement selectSkillCodeOptionTwo;

	@FindBy(xpath = "//button[@title='Move all']")
	WebElement moveAll;

	@FindBy(xpath = "//button[@id='btnSavePrimeMoverPlanning']")
	WebElement savePMPlanning;

	@FindBy(xpath = "//button[@id='btnPlanningSignOff']")
	WebElement buttonPlanningSignOff;

	///// TEST
	@FindBy(xpath = "//input[@id='dtPlanning']")
	WebElement dtPlanning;

	@FindBy(xpath = "//input[@id='dtOperation']")
	WebElement dtPlanningPMFinalBookingReport;

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

	@FindBy(xpath = "//select[@id='cmbShiftBand']")
	WebElement lstShiftBandSelection;

	@FindBy(xpath = "//select[@id='cmbActivityGenRule']")
	WebElement manningRatioSelection;

	@FindBy(xpath = "//select[@id='cmbAllocationRule']")
	WebElement alloationRuleSelection;

	@FindBy(xpath = "//*[@id='select2-cmbShiftBand-container']/span")
	WebElement lstShiftBandClear;

	@FindBy(xpath = "//*[@id='cmbShiftBand']/option")
	List<WebElement> lstShiftBandList;

	@FindBy(id = "btnSearchHSSEPlanning")
	WebElement btnSearchHSSEPlanning;

	@FindBy(id = "btnAddHSSEPlanning")
	WebElement addHSSEPlanning;

	@FindBy(id = "//*[@id='btnHSSESkillDel1']")
	WebElement skillDelete;

	int rowcount;
	String LocationNameinHSSE;
	String SkillCodeinHSSE;

	// @FindBy(xpath =
	// "//table[@id='add-hsse-skills-table']/tbody/tr["+rowcount+"]/td[4]")
	// WebElement skillDel;

	// WebElement skillDel
	// =driver.findElement(By.xpath("//table[@id='add-hsse-skills-table']/tbody/tr["+rowcount+"]/td[4]"));

	@FindBy(xpath = "//*[@id='cmbLocationName1']/option[1]")
	WebElement LocationNameinHSSEValue;

	@FindBy(xpath = "//*[@id='cmbHSSESkill1']/option[1]")
	WebElement SkillCodeinHSSEValue;

	@FindBy(xpath = "//button[@id='btnAddHSSEPlanning']")
	WebElement addHSSESkill;

	@FindBy(xpath = "//button[@id='btnAddHsseSkill']")
	WebElement addHSSESkillandLocation;

	@FindBy(xpath = "//select[contains(@id,'cmbLocationName')]")
	WebElement locationName;

	@FindBy(xpath = "//select[contains(@id,'cmbHSSESkill')]")
	WebElement skillCode;

	@FindBy(name = "requirement")
	WebElement requirement;

	@FindBy(xpath = "//button[@id='btnSaveHSSEPlanning']")
	WebElement saveHSSESkillPlanning;

	@FindBy(xpath = "//button[@id='btnPlanningSignOff']")
	WebElement planningSignOff;

	@FindBy(xpath = "//select[@id='cmbAllocationRule']")
	WebElement allocationRule;

	@FindBy(xpath = "//select[@id='cmbDRAllocationRule']")
	WebElement allocationRuleDateRangeDep;

	@FindBy(id = "btnPerformActivityGenerationTask")
	WebElement planningSignOffSaveButton;

	@FindBy(xpath = "//div[@class='toast-message']")
	WebElement negativeToastMessage;

	@FindBy(xpath = "//table[@id='add-hsse-skills-table']/tbody")
	WebElement TogetRows;

	@FindBy(xpath = "//table[@id='add-hsse-skills-table']/tbody/tr/td")
	WebElement tablerowtext;

	@FindBy(xpath = "//table[@id='final-Booking-Report-list']/tbody")
	WebElement finalBookingReportTable;

	@FindBy(xpath = "//table[@id='final-Booking-Report-list']/tbody/tr/td")
	WebElement finalBookingReportTableText;

	@FindBy(xpath = "//button[contains(@id,'btnHSSESkillDel')]")
	WebElement delSkill;

	@FindBy(xpath = "//button[text()='Yes']")
	WebElement delSkillYes;

	@FindBy(xpath = "//select[@id='cmbAllocationRule']")
	WebElement allocationRuleSelect;

	@FindBy(xpath = "//select[@id='cmbDeploymentShiftBand']")
	WebElement rtgFinalBookingDeploymentShiftBandSelect;

	@FindBy(xpath = "//select[@id='cmbBroadcastShiftBand']")
	WebElement rtgFinalBookingDeploymentBroadShiftBandSelect;

	@FindBy(xpath = "//select[@id='cmbDRDeploymentShiftBand']")
	WebElement rtgFinalBookingDRDeploymentShiftBandSelect;

	@FindBy(xpath = "//input[@placeholder='Select Shift Band']")
	WebElement rtgFinalBookingDRDeploymentShiftBandInput;

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

	
	@FindBy(xpath = "//*[@id='rank-A-list']/tbody/tr[1]/td[1]")
	WebElement unallocatedWorkEmployeeOne;
	
	@FindBy(xpath = "//button[@id='btnSuggestedEmployees']")
	WebElement buttonSuggestedEmployees;
	
	
	@FindBy(xpath = "//*[@id='recommended-resources-list']/tbody/tr[2]/td[1]")
	WebElement buttonSuggestedEmployeeOne;
	
	
	@FindBy(xpath = "//*[text()='OnCall List']")
	WebElement OnCallList;

	@FindBy(xpath = "//button[@data-original-title='Deployment']")
	WebElement deploymentButton;

	@FindBy(xpath = "//a[@id='btnDeploy']")
	WebElement buttonDeploy;

	@FindBy(xpath = "//button[@id='btnBeginDeploy']")
	WebElement deploymentButtonSave;

	@FindBy(xpath = "//button[@id='btnDRBeginDeploy']")
	WebElement deploymentDateRangeButtonSave;

	@FindBy(xpath = "//a[@id='btnDeployDateRange']")
	WebElement dateRangeDeployButton;

	@FindBy(xpath = "//a[@id='btnUnAllocate']")
	WebElement deAllocate;

	@FindBy(xpath = "//button[@id='btnBeginDeploy']")
	WebElement deAllocateSave;

	@FindBy(xpath = "//button[@id='btnDRBeginDeploy']")
	WebElement deAllocateDateRangeSave;

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

	@FindBy(xpath = "//button[@id='btnStartBroadcastDeployment']")
	WebElement buttonBroadcastDeploymentSave;

	@FindBy(xpath = "//button[@id='btnSearch']")
	WebElement btnSearchPMFinalbookingReport;

	@FindBy(xpath = "//*[@id='final-Booking-Report-list']/tbody/tr[1]/td[3]")
	WebElement standByEmpOne;

	@FindBy(xpath = "//button[@id='btnSuggestedEmployees']")
	WebElement suggestedEmp;

	@FindBy(xpath = "//button[@id='btnAddTask']")
	WebElement buttonAddTask;

	@FindBy(xpath = "//select[@name='dotaskskillname']")
	WebElement assignTaksSkill;

	@FindBy(xpath = "(//select[@placeholder='Select Equipment Name'])[1]")
	WebElement assignTaksEquipmentName;

	@FindBy(xpath = "(//select[@placeholder='Select Location'])[1]")
	WebElement assignTaksLocation;

	@FindBy(xpath = "//button[@id='btnSaveActivity']")
	WebElement buttonActivitySave;

	@FindBy(xpath = "//button[@data-original-title='Execution']")
	WebElement execution;

	@FindBy(xpath = "//a[@id='btnAddShift']")
	WebElement addShift;

	@FindBy(xpath = "//textarea[@id='txtAddShiftNotes']")
	WebElement addShiftTextArea;

	@FindBy(xpath = "(//*[@id=\"dvEmployeeSearchFilter\"]/div/label[1]/span[1]/span[2])[2]")
	WebElement addShiftOffDay;

	@FindBy(xpath = "(//*[@id=\"dvEmployeeSearchFilter\"]/div/label[2]/span[1]/span[2])[2]")
	WebElement addShiftFlexiShift;

	@FindBy(xpath = "(//*[@id=\"dvEmployeeSearchFilter\"]/div/label[3]/span[1]/span[2])[2]")
	WebElement addShiftOffFlexiShift;

	@FindBy(xpath = "//input[@id='650']")
	WebElement addShiftEmpOne;

	@FindBy(xpath = "//input[@id='702']")
	WebElement addShiftEmpTwo;

	@FindBy(xpath = "//input[@id='703']")
	WebElement addShiftEmpThree;

	@FindBy(xpath = "//input[@id='704']")
	WebElement addShiftEmpFour;

	@FindBy(xpath = "//button[@id='btnSaveNewShifts']")
	WebElement addShiftButtoonSave;

	@FindBy(xpath = "//input[@id='dtDeployDateRange']")
	WebElement startAndEndDate;

	@FindBy(xpath = "//button[text()='Apply']")
	WebElement dateApply;

	@FindBy(xpath = "//input[@name='bookingDate']")
	WebElement bookingDate;

	@FindBy(xpath = "//a[text()='Location']")
	WebElement location;

	@FindBy(xpath = "//button[@id='btnPrimeMoverSkillDel1']")
	WebElement resourceDELButtonOne;

	@FindBy(xpath = "//button[@id='btnPrimeMoverSkillDel2']")
	WebElement resourceDELButtonTwo;

	@FindBy(xpath = "//button[@id='btnPrimeMoverSkillDel3']")
	WebElement resourceDELButtonThree;

	@FindBy(xpath = "//button[@id='btnPrimeMoverSkillDel4']")
	WebElement resourceDELButtonFour;

	@FindBy(xpath = "//button[@id='btnPrimeMoverSkillDel5']")
	WebElement resourceDELButtonFive;

	@FindBy(xpath = "//button[@id='btnPrimeMoverSkillDel6']")
	WebElement resourceDELButtonSix;

	@FindBy(xpath = "//div[@class='toast-message']")
	WebElement validationToastMessage;

//	@FindBy(xpath = "(//*[@id=\"dpDailyPlanningTaskSummary\"]//div[@class='centered_rowheader_inner']//div)["+i+"]")
	// WebElement skillSummaryList;

	@FindBy(xpath = "//*[@id=\"dpDailyPlanningTaskSummary\"]//div[@class='centered_rowheader_inner']//div")
	List<WebElement> skillSummaryListsiz;

	@FindBy(xpath = "//div[@class='centered_timeheadergroup_inner centered_timeheader_cell_inner']")
	WebElement dateHSSETableFinalBR;

	@FindBy(xpath = "//*[@id='dpDailyPlanningEquipmentSummaryTimeLine']//div[contains(@class,'centered_rowheader_inner_text')]")
	List<WebElement> locationList;

	@FindBy(xpath = "//div[@id='dpDailyPlanningEquipmentSummaryTimeLine']//div[contains(@class,'centered_timeheadercol centered_timeheader_cell')]")
	List<WebElement> shiftTimings;

	@FindBy(xpath = "(//div[@role='region' and @aria-label='scheduler events'])[1]//div[1]//div")
	List<WebElement> locationRequirement;

	@FindBy(xpath = "//*[text()='Yes']")
	WebElement delResourceYes;

	public void locationAndSkillSummaryRTGPlannging() {

		// Date
		System.out.println("#################################");
		System.out.println("Date:" + dateHSSETable.getText());
		System.out.println("#################################");

		// Shift Timings
		// System.out.println("#################################");
		// List <WebElement>
		// shitList=driver.findElements(By.xpath("//div[@class='centered_timeheadercol
		// centered_timeheader_cell']"));
		int shiftTimingSize = shiftTimings.size();
		System.out.println("Shift Timing Size:" + shiftTimingSize);
		System.out.print("Shift Times: ");
		int colCount = 0;
		for (int i = 0; i < shiftTimingSize - 1; i++) {
			String shifttime = shiftTimings.get(i).getText();

			if (!shifttime.isEmpty()) {
				// System.out.println("Shift Timings:" + shiftTimings.get(i).getText());

				System.out.print(shifttime + "|");
				colCount++;
			}
		}
		System.out.println("\n#################################");

		// Location
		// List<WebElement> Loc = driver.findElements(By.xpath(
		// "//*[@id='dpDailyPlanningEquipmentSummaryTimeLine']//div[contains(@class,'centered_rowheader_inner_text')]"));
		System.out.println(colCount);
		int locationListSize = locationList.size();
		int size = skillSummaryListsiz.size();
		int j;
		for (int i = 0; i < locationListSize; i++) {

			System.out.print(locationList.get(i).getText() + " :");
			// System.out.println("Skill Summary List Size: "+size);
			for (j = 0; j < colCount; j++) {
				System.out.print(locationRequirement.get(j).getText() + ":");

			}
			j = j + colCount;
			System.out.println("\n");

		}
	}

	public void locationAndSkillSummaryRTGinalBookingReport() {

		// Date
		System.out.println("#################################");
		System.out.println("Date:" + dateHSSETableFinalBR.getText());
		System.out.println("#################################");

		// Shift Timings
		// System.out.println("#################################");
		// List <WebElement>
		// shitList=driver.findElements(By.xpath("//div[@class='centered_timeheadercol
		// centered_timeheader_cell']"));
		int shiftTimingSize = shiftTimings.size();
		System.out.println("Shift Timing Size:" + shiftTimingSize);
		System.out.print("Shift Times: ");
		int colCount = 0;
		for (int i = 0; i < shiftTimingSize - 1; i++) {
			String shifttime = shiftTimings.get(i).getText();

			if (!shifttime.isEmpty()) {
				// System.out.println("Shift Timings:" + shiftTimings.get(i).getText());

				System.out.print(shifttime + "|");
				colCount++;
			}
		}
		System.out.println("\n#################################");

		// Location
		// List<WebElement> Loc = driver.findElements(By.xpath(
		// "//*[@id='dpDailyPlanningEquipmentSummaryTimeLine']//div[contains(@class,'centered_rowheader_inner_text')]"));
		System.out.println(colCount);
		int locationListSize = locationList.size();
		int size = skillSummaryListsiz.size();
		int j;
		for (int i = 0; i < locationListSize; i++) {

			System.out.print(locationList.get(i).getText() + " :");

			for (j = 0; j < colCount; j++) {
				System.out.print(locationRequirement.get(j).getText() + ":");

			}
			j = j + colCount;
			System.out.println("\n");

		}

	}

	public void createPMPlanning() throws Exception {

		System.out.println("PM Planning");
		Date d = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		String date = formatter.format(d);
		String shiftBandNews = "Auto Band code 82220";
		Thread.sleep(2000);
		dtPlanning.clear();

		Thread.sleep(2000);
		dtPlanning.sendKeys("22-08-2023");
		dtPlanning.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		// if(reuse.isElementPresent(removeSelection))
		// {
		// webAction.clickUsingJavaScript(removeSelection);
		// Thread.sleep(500);
		// }

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
		webAction.clickUsingJavaScript(btnSearchPMPlanning);

		Thread.sleep(5000);
		// locationAndSkillSummaryHSSEPlannging();
		// Thread.sleep(50000);

		reportUtils.addInfo("Before PM Planning Status", methodName);
		reportUtils.addInfo("####Equipment Summary####", methodName);
		reportUtils.addInfo("Equipment Name     :"+equipmentName.getText(),methodName);
		reportUtils.addInfo("Required Equipment :"+requiredEquipment.getText(),methodName);
		reportUtils.addInfo("Available Equipment:" +availableEquipment.getText(),methodName);
		webAction.clickUsingJavaScript(skillSummary);
		Thread.sleep(4000);
		reportUtils.addInfo("####Skill Summary####", methodName);
		reportUtils.addInfo("Skill code        :"+skillCodeOne.getText(),methodName);
		reportUtils.addInfo("Required  Skill   :"+requiredSkillCodeOne.getText(),methodName);
		reportUtils.addInfo("Available Skill   :"+availableSkillCodeOne.getText(),methodName);
		reportUtils.addInfo("Required Manpower :"+requiredManPowerSkillCodeOne.getText(),methodName);
		
		reportUtils.addInfo("Skill Two         :"+skillCodeTwo.getText(),methodName);
		reportUtils.addInfo("Required  Skill   :"+requiredSkillCodeTwo.getText(),methodName);
		reportUtils.addInfo("Available Skill   :"+availableSkillCodeTwo.getText(),methodName);
		reportUtils.addInfo("Required Manpower :"+requiredManPowerSkillCodeTwo.getText(),methodName);
		

		webAction.waitUntilElementIsClickable(addPMPlanning);
		webAction.click(addPMPlanning);

		String manningRatio = "PM Rules";
		List<WebElement> manning = manningRatioSelection
				.findElements(By.xpath("//select[@id='cmbActivityGenRule']/option"));
		for (WebElement we : manning) {
			Thread.sleep(500);
			if (manningRatio.equals(we.getText()))
				we.click();
		}

		String allocationRules = "Prime Mover";
		List<WebElement> allocation = alloationRuleSelection
				.findElements(By.xpath("//select[@id='cmbAllocationRule']/option"));
		for (WebElement we : allocation) {
			Thread.sleep(500);
			if (allocationRules.equals(we.getText()))
				we.click();
		}

		webAction.click(savePMPlanning);
		reportUtils.addInfo("###################################", methodName);
		reportUtils.addInfo(validationToastMessage.getText(), methodName);
		// reportUtils.addInfo("###################################",methodName);

		if (resue.isElementPresent(resourceDELButtonOne)) {
			webAction.clickUsingJavaScript(resourceDELButtonOne);
			webAction.clickUsingJavaScript(delResourceYes);

		} else {
			System.out.println("No such element resourceDELButtonOne");
		}

		if (resue.isElementPresent(resourceDELButtonTwo)) {
			webAction.clickUsingJavaScript(resourceDELButtonTwo);
			webAction.clickUsingJavaScript(delResourceYes);

		} else {
			System.out.println("No such element resourceDELButtonTwo");
		}

		if (resue.isElementPresent(resourceDELButtonThree)) {
			webAction.clickUsingJavaScript(resourceDELButtonThree);
			webAction.clickUsingJavaScript(delResourceYes);

		} else {
			System.out.println("No such element resourceDELButtonThree");
		}

		webAction.waitUntilElementIsClickable(resourceSetADD);
		webAction.clickUsingJavaScript(resourceSetADD);

		String selectCasualWorker = "Casual Worker";
		List<WebElement> resourcesetSelOne = selectSkillRowOne
				.findElements(By.xpath("//table[@id='add-prime-mover-skills-table']/tbody/tr[1]/td[1]//select[@placeholder='Select Skill Code']/option"));
		for (WebElement we : resourcesetSelOne) {
			Thread.sleep(500);
			if (selectCasualWorker.equals(we.getText())) {
				we.click();
				break;
			}

		}

		webAction.clickUsingJavaScript(resourceSetADD);

		String selectCCTV = "CCTV";
		List<WebElement> resourcesetSelTwo = selectSkillRowTwo
				.findElements(By.xpath("//table[@id='add-prime-mover-skills-table']/tbody/tr[2]/td[1]//select[@placeholder='Select Skill Code']/option"));

		for (WebElement we : resourcesetSelTwo) {
			Thread.sleep(500);
			if (selectCCTV.equals(we.getText())) {
				we.click();
				break;
			}
		}

		//webAction.clickUsingJavaScript(selectSkillRowOne);
		//webAction.clickUsingJavaScript(selectSkillCodeOptionOne);

		Thread.sleep(2000);

		//webAction.clickUsingJavaScript(selectSkillRowTwo);
	//	webAction.clickUsingJavaScript(selectSkillCodeOptionTwo);

		webAction.clickUsingJavaScript(moveAll);

		Thread.sleep(2000);

		webAction.scrollUp();
		// Thread.sleep(1000);
		System.out.println("PM save button moved");
		// mouseHandler.clickUsingActionsMethod(savePMPlanning);
		webAction.clickUsingJavaScript(savePMPlanning);
		Thread.sleep(3000);
		/*
		 * if (resue.isElementPresent(savePMPlanning)) {
		 * webAction.clickUsingJavaScript(savePMPlanning);
		 * //webAction.clickUsingJavaScript(delResourceYes);
		 * 
		 * } else { System.out.println("No such element"); }
		 */

		reportUtils.addInfo("After PM Planning Status", methodName);
		reportUtils.addInfo("####Equipment Summary####", methodName);
		reportUtils.addInfo("Equipment Name     :"+equipmentName.getText(),methodName);
		reportUtils.addInfo("Required Equipment :"+requiredEquipment.getText(),methodName);
		reportUtils.addInfo("Available Equipment:" +availableEquipment.getText(),methodName);
		webAction.clickUsingJavaScript(skillSummary);
		Thread.sleep(4000);
		reportUtils.addInfo("####Skill Summary####", methodName);
		reportUtils.addInfo("Skill code        :"+skillCodeOne.getText(),methodName);
		reportUtils.addInfo("Required  Skill   :"+requiredSkillCodeOne.getText(),methodName);
		reportUtils.addInfo("Available Skill   :"+availableSkillCodeOne.getText(),methodName);
		reportUtils.addInfo("Required Manpower :"+requiredManPowerSkillCodeOne.getText(),methodName);
		
		reportUtils.addInfo("Skill Two         :"+skillCodeTwo.getText(),methodName);
		reportUtils.addInfo("Required  Skill   :"+requiredSkillCodeTwo.getText(),methodName);
		reportUtils.addInfo("Available Skill   :"+availableSkillCodeTwo.getText(),methodName);
		reportUtils.addInfo("Required Manpower :"+requiredManPowerSkillCodeTwo.getText(),methodName);		reportUtils.addInfo("###################################", methodName);
		Thread.sleep(30000);

	}

	public void viewDeployment() throws Exception {
		int rowcountsbe;
		int rowcountocl;
		int rowcountuaw;
		int rowcountnpse;

		Date d = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		String date = formatter.format(d);

		Thread.sleep(500);
		Thread.sleep(500);
		dtPlanningPMFinalBookingReport.clear();
		dtPlanningPMFinalBookingReport.sendKeys("22-08-2023");
		Thread.sleep(1000);

		// This Shift Band id already signed Off
		String shiftBandNews = "Auto Band code 82220";

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

		webAction.clickUsingJavaScript(btnSearchPMFinalbookingReport);
		Thread.sleep(2000);
		locationAndSkillSummaryRTGinalBookingReport();
		Thread.sleep(5000);
		webAction.clickUsingJavaScript(showStandbyEmployee);
		webAction.scrollDown300();
		// webAction.clickUsingJavaScript(showStandbyEmployee);
		webAction.clickUsingJavaScript(btnSearchPMFinalbookingReport);
		Thread.sleep(4000);

		List<WebElement> TotalRowsListsbe = finalBookingReportTable.findElements(By.tagName("tr"));
		rowcountsbe = TotalRowsListsbe.size();
		if (finalBookingReportTableText.getText().equalsIgnoreCase("No data available in table")) {
			System.out.println("\n");
			System.out.println("########################################################");
			System.out.println("No data available in Stand By Employees");
			System.out.println("########################################################");
			System.out.println("\n");
		} else {
			System.out.println("########################################################");
			System.out.println("Total number of Skills in the Stand By Employees: " + (rowcountsbe));
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
		webAction.clickUsingJavaScript(btnSearchPMFinalbookingReport);
		Thread.sleep(2000);

		List<WebElement> TotalRowsListnpse = finalBookingReportTable.findElements(By.tagName("tr"));
		rowcountnpse = TotalRowsListnpse.size();
		if (finalBookingReportTableText.getText().equalsIgnoreCase("No data available in table")) {
			System.out.println("########################################################");
			System.out.println("No data available in Non Primary Skill Deployed Employee");
			System.out.println("########################################################");
			System.out.println("\n");
		} else {
			System.out.println("########################################################");
			System.out.println("Total number of Skills in the Non Primary Skill Deployed Employee: " + (rowcountnpse));
			System.out.println("########################################################");
			System.out.println("\n");
		}
		webAction.clickUsingJavaScript(nonPrimarySkillDeployedEmployee);
		webAction.clickUsingJavaScript(unallocatedWork);
		webAction.scrollDown300();
		webAction.clickUsingJavaScript(btnSearchPMFinalbookingReport);
		Thread.sleep(2000);
		webAction.clickUsingJavaScript(unallocatedWorkEmployeeOne);
		Thread.sleep(500);
		webAction.clickUsingJavaScript(buttonSuggestedEmployees);
		Thread.sleep(500);
		webAction.clickUsingJavaScript(buttonSuggestedEmployeeOne);
		Thread.sleep(500);
		
		

		List<WebElement> TotalRowsListuaw = finalBookingReportTable.findElements(By.tagName("tr"));
		rowcountuaw = TotalRowsListuaw.size();
		if (finalBookingReportTableText.getText().equalsIgnoreCase("No data available in table")) {
			System.out.println("########################################################");
			System.out.println("No data available in Unallocated Work Employee");
			System.out.println("########################################################");
			System.out.println("\n");
		} else {
			System.out.println("########################################################");
			System.out.println("Total number of Skills in the Unallocated Work Employee: " + (rowcountuaw));
			System.out.println("########################################################");
			System.out.println("\n");
		}
		webAction.clickUsingJavaScript(unallocatedWork);
		webAction.clickUsingJavaScript(OnCallList);
		webAction.scrollDown300();
		webAction.clickUsingJavaScript(btnSearchPMFinalbookingReport);
		Thread.sleep(2000);
		List<WebElement> TotalRowsListocl = finalBookingReportTable.findElements(By.tagName("tr"));
		rowcountocl = TotalRowsListocl.size();

		if (finalBookingReportTableText.getText().equalsIgnoreCase("No data available in table")) {
			System.out.println("########################################################");
			System.out.println("No data available in On Call List Employees");
			System.out.println("########################################################");
			System.out.println("\n");
		} else {
			System.out.println("########################################################");
			System.out.println("Total number of Skills in the On Call List Employees: " + (rowcountocl));
			System.out.println("########################################################");
			System.out.println("\n");
		}

		Thread.sleep(2000);
	}

	public void assignStandbyEmployee() throws Exception {
		int rowcountsbe;
		int rowcountocl;
		int rowcountuaw;
		int rowcountnpse;

		Date d = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		String date = formatter.format(d);

		Thread.sleep(500);
		Thread.sleep(500);
		dtPlanningPMFinalBookingReport.clear();
		dtPlanningPMFinalBookingReport.sendKeys("22-08-2023");
		Thread.sleep(1000);

		// This Shift Band id already signed Off
		String shiftBandNews = "Auto Band code 82220";

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

		webAction.clickUsingJavaScript(btnSearchPMFinalbookingReport);
		Thread.sleep(2000);
		locationAndSkillSummaryRTGinalBookingReport();
		Thread.sleep(5000);
		webAction.clickUsingJavaScript(showStandbyEmployee);
		webAction.scrollDown300();
		// webAction.clickUsingJavaScript(showStandbyEmployee);
		webAction.clickUsingJavaScript(btnSearchPMFinalbookingReport);
		Thread.sleep(4000);

		webAction.clickUsingJavaScript(standByEmpOne);
		webAction.clickUsingJavaScript(buttonAddTask);
		Thread.sleep(500);
		dropdown.selectByIndex(assignTaksSkill, 0);
		Thread.sleep(500);
		dropdown.selectByIndex(assignTaksEquipmentName, 0);
		Thread.sleep(500);
		dropdown.selectByIndex(assignTaksLocation, 0);
		Thread.sleep(500);
		webAction.clickUsingJavaScript(buttonActivitySave);
		Thread.sleep(3000);

	}

	public void addShift() throws Exception {
		int rowcountsbe;
		int rowcountocl;
		int rowcountuaw;
		int rowcountnpse;

		Date d = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		String date = formatter.format(d);

		Thread.sleep(500);
		Thread.sleep(500);
		dtPlanningPMFinalBookingReport.clear();
		dtPlanningPMFinalBookingReport.sendKeys("22-08-2023");
		Thread.sleep(1000);

		// This Shift Band id already signed Off
		String shiftBandNews = "Auto Band code 82220";

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

		webAction.clickUsingJavaScript(btnSearchPMFinalbookingReport);
		Thread.sleep(2000);
		// locationAndSkillSummaryHSSEFinalBookingReport();
		// Thread.sleep(5000);
		webAction.clickUsingJavaScript(execution);
		webAction.clickUsingJavaScript(addShift);
		webAction.setText(addShiftTextArea, "Testing Purpose");
		webAction.clickUsingJavaScript(addShiftOffFlexiShift);
		webAction.clickUsingJavaScript(addShiftEmpOne);
		webAction.clickUsingJavaScript(addShiftEmpTwo);
		webAction.clickUsingJavaScript(addShiftButtoonSave);
		Thread.sleep(2000);

	}

	public void revokeSignOff() throws Exception {
		Date d = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		String date = formatter.format(d);

		Thread.sleep(500);
		// This Shift Band id already signed Off
		String shiftBandNews = "Auto Band code 82220";

		Thread.sleep(500);

		Thread.sleep(500);
		dtPlanningPMFinalBookingReport.clear();
		dtPlanningPMFinalBookingReport.sendKeys("22-08-2023");
		Thread.sleep(1000);

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

		String band = "Auto band Code 85139";
		List<WebElement> shiftband = rtgFinalBookingDeploymentShiftBandSelect
				.findElements(By.xpath("//select[@id='cmbDeploymentShiftBand']/option"));
		for (WebElement we : shiftband) {
			Thread.sleep(500);
			// we.sendKeys(Keys.ARROW_DOWN);
			if (band.equals(we.getText()))
				we.click();
			// Thread.sleep(500);
		}

		webAction.clickUsingJavaScript(buttonRevokePlanningSignOffSave);
		Thread.sleep(5000);

	}

	public void deployment() throws Exception {
		Date d = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		String date = formatter.format(d);

		Thread.sleep(500);
		// This Shift Band id already signed Off
		String shiftBandNews = "Auto Band code 85139";

		Thread.sleep(500);

		Thread.sleep(500);
		dtPlanningPMFinalBookingReport.clear();
		dtPlanningPMFinalBookingReport.sendKeys("22-08-2023");
		Thread.sleep(1000);

		webAction.setText(bookingDate, date);
		Thread.sleep(500);
		bookingDate.sendKeys(Keys.TAB);
		lstShiftBandClear.click();
		Thread.sleep(1000);
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
		lstShiftBand.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		webAction.clickUsingJavaScript(btnSearchInQCFinalBookingReport);

		webAction.clickUsingJavaScript(deploymentButton);
		Thread.sleep(500);

		webAction.clickUsingJavaScript(buttonDeploy);
		Thread.sleep(4000);

		String band = "Auto band Code 85139";
		List<WebElement> shiftband = rtgFinalBookingDeploymentShiftBandSelect
				.findElements(By.xpath("//select[@id='cmbDeploymentShiftBand']/option"));
		for (WebElement we : shiftband) {
			Thread.sleep(500);
			// we.sendKeys(Keys.ARROW_DOWN);
			if (band.equals(we.getText()))
				we.click();
			// Thread.sleep(500);
		}

		webAction.clickUsingJavaScript(allocationRule);

		// webAction.clickUsingJavaScript(lstManningRatio);

		String ratio = "Default Rule - Default Rule";
		List<WebElement> lstManningRatioSe = allocationRuleSelect
				.findElements(By.xpath("//select[@id='cmbAllocationRule']/option"));
		for (WebElement we : lstManningRatioSe) {
			Thread.sleep(500);
			// we.sendKeys(Keys.ARROW_DOWN);
			if (ratio.equals(we.getText()))
				we.click();
			// Thread.sleep(500);
		}

		// allocationRule.sendKeys(Keys.ARROW_DOWN);
		// allocationRule.sendKeys(Keys.ENTER);
		// Testing purpose
		// webAction.clickUsingJavaScript(buttonRevokePlanningSignOffCancel);
		webAction.clickUsingJavaScript(deploymentButtonSave);
		Thread.sleep(10000);

	}

	public void DateRangeDeployment() throws Exception {

		LocalDate today = LocalDate.now();
		LocalDate yesterday = today.minusDays(1);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String formattedDate = yesterday.format(formatter);
		System.out.println("Yesterday's date: " + formattedDate);

		LocalDate future = LocalDate.now();
		LocalDate ff = future.plusDays(12);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String FutureDate = ff.format(format);
		System.out.println("Yesterday's date: " + FutureDate);

		String dates = formattedDate + "-" + FutureDate;
		System.out.println("Date Fromat : " + dates);

		Date d = new Date();
		SimpleDateFormat formatters = new SimpleDateFormat("dd-MM-yyyy");
		String date = formatters.format(d);

		Thread.sleep(500);
		// This Shift Band id already signed Off
		String shiftBandNews = "Auto Band code 82220";

		Thread.sleep(500);

		Thread.sleep(500);
		dtPlanningPMFinalBookingReport.clear();
		dtPlanningPMFinalBookingReport.sendKeys(date);
		Thread.sleep(1000);

		Thread.sleep(500);

		List<WebElement> listShiftBand = lstShiftBandSelection
				.findElements(By.xpath("//select[@id='cmbShiftBand']/option"));
		for (WebElement we : listShiftBand) {
			Thread.sleep(500);

			if (shiftBandNews.equals(we.getText()))
				we.click();

		}
		webAction.clickUsingJavaScript(deploymentButton);
		Thread.sleep(500);
		webAction.clickUsingJavaScript(dateRangeDeployButton);

		Thread.sleep(1000);
		startAndEndDate.clear();
		Thread.sleep(1000);
		startAndEndDate.sendKeys(dates);
		startAndEndDate.sendKeys(Keys.TAB);
		// webAction.clickUsingJavaScript(dateApply);

		Thread.sleep(500);

		webAction.clickUsingJavaScript(rtgFinalBookingDRDeploymentShiftBandSelect);
		String bands = "Auto band Code 85139";
		rtgFinalBookingDRDeploymentShiftBandInput.sendKeys(bands);
		// rtgFinalBookingDRDeploymentShiftBandInput.sendKeys(Keys.ARROW_DOWN);
		rtgFinalBookingDRDeploymentShiftBandInput.sendKeys(Keys.ENTER);

		/*
		 * List<WebElement> shiftbands = rtgFinalBookingDRDeploymentShiftBandSelect
		 * .findElements(By.xpath("//select[@id='cmbDRDeploymentShiftBand']/option"));
		 * for (WebElement we : shiftbands) { Thread.sleep(500); //
		 * we.sendKeys(Keys.ARROW_DOWN); if (bands.equals(we.getText())) we.click(); //
		 * Thread.sleep(500); }
		 */

		webAction.clickUsingJavaScript(allocationRuleDateRangeDep);

		String ratio = "Default Rule - Default Rule";
		List<WebElement> lstManningRatioSe = allocationRuleDateRangeDep
				.findElements(By.xpath("//select[@id='cmbDRAllocationRule']/option"));
		for (WebElement we : lstManningRatioSe) {
			Thread.sleep(500);

			if (ratio.equals(we.getText()))
				we.click();

		}

		Thread.sleep(500);

		webAction.clickUsingJavaScript(deploymentDateRangeButtonSave);
		Thread.sleep(40000);
	}

	public void deAllocate() throws Exception {
		Date d = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		String date = formatter.format(d);

		Thread.sleep(500);
		// This Shift Band id already signed Off
		String shiftBandNews = "Auto Band code 82220";

		Thread.sleep(500);

		Thread.sleep(500);	
		dtPlanningPMFinalBookingReport.clear();
		dtPlanningPMFinalBookingReport.sendKeys("22-08-2023");
		Thread.sleep(1000);

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
		// Cancelling for Testing Purpose
		webAction.clickUsingJavaScript(deAllocateSave);
		Thread.sleep(10000);

	}

	public void DateRangeDeAllocate() throws Exception {

		LocalDate today = LocalDate.now();
		LocalDate yesterday = today.minusDays(1);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String formattedDate = yesterday.format(formatter);
		System.out.println("Yesterday's date: " + formattedDate);

		LocalDate future = LocalDate.now();
		LocalDate ff = future.plusDays(12);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String FutureDate = ff.format(format);
		System.out.println("Yesterday's date: " + FutureDate);

		String dates = formattedDate + "-" + FutureDate;
		System.out.println("Date Fromat : " + dates);

		Date d = new Date();
		SimpleDateFormat formatters = new SimpleDateFormat("dd-MM-yyyy");
		String date = formatters.format(d);

		Thread.sleep(500);
		// This Shift Band id already signed Off
		String shiftBandNews = "Auto Band code 82220";

		Thread.sleep(500);

		Thread.sleep(500);
		dtPlanningPMFinalBookingReport.clear();
		dtPlanningPMFinalBookingReport.sendKeys(date);
		Thread.sleep(1000);
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

		webAction.clickUsingJavaScript(deAllocateDateRange);
		Thread.sleep(500);

		Thread.sleep(1000);
		startAndEndDate.clear();
		Thread.sleep(1000);
		startAndEndDate.sendKeys(dates);
		startAndEndDate.sendKeys(Keys.TAB);
		// Thread.sleep(1000);
		// dateApply.click();
		Thread.sleep(500);

		// Cancelling for Testing Purpose
		webAction.clickUsingJavaScript(deAllocateDateRangeSave);
		Thread.sleep(30000);

	}

	public void broadCast() throws Exception {
		Date d = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		String date = formatter.format(d);

		Thread.sleep(500);
		// This Shift Band id already signed Off
		String shiftBandNews = "Auto Band code 82220";

		Thread.sleep(500);

		Thread.sleep(500);
		dtPlanningPMFinalBookingReport.clear();
		dtPlanningPMFinalBookingReport.sendKeys("22-08-2023");
		Thread.sleep(1000);

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

		webAction.clickUsingJavaScript(rtgFinalBookingDeploymentBroadShiftBandSelect);
		// rtgFinalBookingDeploymentBroadShiftBandSelect
		String band = "Auto band Code 85139";
		List<WebElement> shiftband = rtgFinalBookingDeploymentBroadShiftBandSelect
				.findElements(By.xpath("//select[@id='cmbBroadcastShiftBand']/option"));
		for (WebElement we : shiftband) {
			Thread.sleep(500);
			// we.sendKeys(Keys.ARROW_DOWN);
			if (band.equals(we.getText()))
				we.click();
			// Thread.sleep(500);
		}

		// Cancelling for Testing Purpose
		webAction.clickUsingJavaScript(buttonBroadcastDeploymentSave);
		Thread.sleep(40000);

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

}
