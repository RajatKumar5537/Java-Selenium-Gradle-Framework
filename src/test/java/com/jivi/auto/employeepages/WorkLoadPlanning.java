package com.jivi.auto.employeepages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
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
import com.jivi.auto.pageobjectutils.WebElementKeys;
import com.github.javafaker.Faker;

public class WorkLoadPlanning extends BaseTest {
	MenuNavigation menuNavigation;
	//excelUtilities excelObject;
	ReusableComponents reuse=new ReusableComponents();
	Faker faker = new Faker();
	//ReusableComponents resusemain=new ReusableComponents();
	WebElementKeys webAction = new WebElementKeys();
	DropDown dropdown=new DropDown();

	public WorkLoadPlanning() throws FileNotFoundException {
		PageFactory.initElements(driver, this);
		menuNavigation = new MenuNavigation();
		//excelObject = new excelUtilities();
		
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
	
	@FindBy(id = "txtNumberOfCranes")
	WebElement txtNumberOfCranes;
	@FindBy(id = "select2-cmbPriority-container")
	WebElement lstPriority;
	
	@FindBy(xpath="//*[@id='select2-cmbPriority-results']/li[1]")
	WebElement prioritySelection;
	
	@FindBy(id = "select2-cmbResourceSet-container")
	WebElement lstResourceSet;
	@FindBy(id = "btnSaveVesselSchedule")
	WebElement btnSaveVesselSchedule;
	
	@FindBy(xpath = "//span[@class='select2-selection__choice__remove']")
	WebElement removeSelection;
	
	@FindBy(id = "cmbShiftBand")
	WebElement lstShiftBand;
	
	@FindBy(xpath = "//*[@id=\"dailyPlanningAccordion-1\"]/form/div/div[1]/div[2]/div/span[1]/span[1]/span/ul/li/input")
	WebElement lstShiftBandSelection;
	
	@FindBy(xpath = "//*[@id='cmbShiftBand']/option")
	List<WebElement> lstShiftBandList;
	
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
	
	@FindBy(id = "cmbShiftBand")
	WebElement cmbShiftBandInQCFinalBookingReport;

	@FindBy(xpath = "//select[@id='cmbShiftBand']/option")
	List<WebElement> cmbShiftBandInQCFinalBookingReportList;
	
	@FindBy(id = "btnSearch")
	WebElement btnSearchInQCFinalBookingReport;
	
	public void createVesselSchedule() throws Exception {
		Date date=new Date();
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-mm-yyyy");
		String formateddate=dateformat.format(date);
		//System.out.println(formateddate);
		//Thread.sleep(2000);
		//webAction.clearText(dtPlanning);
		//webAction.setText(dtPlanning, formateddate);
		Thread.sleep(2000);
		
			//reuse.waitforClickable(removeSelection);
			//removeSelection.click();
			webAction.clickUsingJavaScript(removeSelection);
			Thread.sleep(500);
		//	reuse.waitforClickable(lstShiftBand);
		//	lstShiftBand.click();
		
		//Thread.sleep(500);
		//System.out.println(shiftBandNew);
			String shiftBandNewone="Auto Band code 9572";
		//webAction.clickUsingJavaScript(lstShiftBand);
		//Thread.sleep(500);
	//	webAction.setValueUsingJavaScript(lstShiftBandSelection, "Auto Band code 88093");
		//lstShiftBand.sendKeys("Auto Band code 88093");
		//webAction.setText(lstShiftBand, "Auto Band code 88093");
		Thread.sleep(500);
		//lstShiftBandSelection.sendKeys(Keys.ARROW_DOWN);
		//lstShiftBandSelection.sendKeys(Keys.ENTER);
		
		List<WebElement> listShiftBand=lstShiftBandSelection.findElements(By.xpath("//*[@id='cmbShiftBand']/option"));
		for( WebElement we: listShiftBand) { 
		Thread.sleep(500);      
		//we.sendKeys(Keys.ARROW_DOWN);
		if(shiftBandNew.equals(we.getText()))
		we.click();
		//Thread.sleep(500);
		}
		
		Thread.sleep(500);
	//	driver.findElement(By.xpath("//li[text()='Shift 22']")).click();
		btnSearchDailyPlanning.click();
		Thread.sleep(1000);
	//	menuNavigation.waitforLoadingIcon();
		//Thread.sleep(2000);
		reuse.performWebElementRightClick(berth);
		//Actions oAct = new Actions(driver);
		//oAct.moveToElement(berth).contextClick(berth).build().perform();
		//berth.click();
		Thread.sleep(2000);
		lnkCreate.click();
		menuNavigation.waitforLoadingIcon();
		Thread.sleep(500);
		webAction.click(lnkVessel);
		//lnkVessel.click();
		menuNavigation.waitforLoadingIcon();
		String Num=faker.numerify("0###");
		
		txtVesselName.sendKeys("Test Automation "+Num);
		txtVesselVisitId.sendKeys("Visit ID "+Num);
		lstBerth.click();
		Thread.sleep(2000);
		berthSelect.click();
		//dropdown.selectByIndex(lstBerth, 0);
	//	driver.findElement(By.xpath("//*[@id='cmbBerth']/option[1]")).click();
		lstPriority.click();
		prioritySelection.click();
		txtNumberOfCranes.clear();
		txtNumberOfCranes.sendKeys("5");
		//lstPriority.click();
		//driver.findElement(By.xpath("//*[@id='select2-cmbPriority-results']/li[1]")).click();
		//lstResourceSet.click();
		//driver.findElement(By.xpath("//li[text()='RTG']")).click();
		menuNavigation.waitforLoadingIcon();
		btnSaveVesselSchedule.click();
		menuNavigation.waitforLoadingIcon();
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
		//reuse.clickUsingJS(btnPlanningSignOff);
		//driver.findElement(By.xpath("//i[@class='fas fa-check-double']")).click();
		reuse.waitforClickable(btnPlanningSignOff);
		//btnPlanningSignOff.click();
		webAction.clickUsingJavaScript(btnPlanningSignOff);
		menuNavigation.waitforLoadingIcon();
		Thread.sleep(500);
		menuNavigation.waitforLoadingIcon();
		webAction.clickUsingJavaScript(btnPerformActivityGenerationTask);
		
		//btnPerformActivityGenerationTask.click();
		//menuNavigation.waitforLoadingIcon();
		Thread.sleep(500);
		webAction.clickUsingJavaScript(lstManningRatio);
		
		String ratio="Default Ratio";
		List<WebElement> lstManningRatioSe=lstManningRatio.findElements(By.xpath("//select[@id='cmbActivityGenRule']/option"));
		for( WebElement we: lstManningRatioSe) { 
		Thread.sleep(500);      
		//we.sendKeys(Keys.ARROW_DOWN);
		if(ratio.equals(we.getText()))
		we.click();
		//Thread.sleep(500);
		}
		
		//lstManningRatio.click();
		//lstManningRatio.sendKeys(Keys.TAB);
		//driver.findElement(By.xpath("//li[text()='Default Manning Ratio']")).click();
		Thread.sleep(1000);
		webAction.clickUsingJavaScript(btnPerformActivityGenerationTask);
		//btnPerformActivityGenerationTask.click();
		//menuNavigation.waitforLoadingIcon();
		Thread.sleep(2000);
	}

	public boolean verifyVesselCreation() throws InterruptedException {
		boolean createVessel = true;
		Thread.sleep(100);
		if (txtVesselCreate.size() <= 0) {
			createVessel = false;
		}
		return createVessel;

	}

	public boolean verifyCraneScheduleCreation() throws InterruptedException {
		Thread.sleep(100);
		boolean createCraneSchedule = true;
		if (txtCreateCraneSchedule.size() <= 0) {
			createCraneSchedule = false;
		}
		return createCraneSchedule;

	}

	public boolean verifyPlanningSignoff() throws IOException {
		System.out.println(dvCurrentDateSignOffStatus.getText().trim());
		System.out.println("Shift has been Signed off");
		return dvCurrentDateSignOffStatus.getText().trim()
				.equals("[" + "Shift 22"+ "] has been Signed off");

	}
	
	public boolean verifyQCFinalBookingReport() throws Exception {
		Thread.sleep(100);
		webAction.click(workForceExecution);
		webAction.click(qcFinalBookingReport);
		webAction.click(cmbShiftBandInQCFinalBookingReport);
		
		//temp name for to view the functionality is working or not
		//Actual name for shiftBand: shiftBandNew (Global variable)
		String shiftBandNewone="Auto Band code 9572";
		
		List<WebElement> listShiftBand=cmbShiftBandInQCFinalBookingReport.findElements(By.xpath("//select[@id='cmbShiftBand']/option"));
		for( WebElement we: listShiftBand) { 
		Thread.sleep(500);      
		if(shiftBandNew.equals(we.getText()))
		we.click();
		}
		
		return false;

	}
}
