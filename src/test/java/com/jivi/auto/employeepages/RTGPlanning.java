package com.jivi.auto.employeepages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
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

public class RTGPlanning extends BaseTest {
	MenuNavigation menuNavigation;
	//excelUtilities excelObject;
	ReusableComponents reuse=new ReusableComponents();
	Faker faker = new Faker();
	//ReusableComponents resusemain=new ReusableComponents();
	WebElementKeys webAction = new WebElementKeys();
	DropDown dropdown=new DropDown();

	public RTGPlanning() throws FileNotFoundException {
		PageFactory.initElements(driver, this);
		menuNavigation = new MenuNavigation();
		//excelObject = new excelUtilities();
		
	}

	@FindBy(id = "dtPlanning")
	WebElement dtPlanning;
	
	@FindBy(xpath = "(//div[@class='centered_matrix']/div/div[@class='centered_cell centered_cell_business'][1])[1]")
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

	public void createVesselSchedule() throws Exception {
		System.out.println("RTG Planning");
		Date date=new Date();
		SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd");
		String formateddate=dateformat.format(date);
		Thread.sleep(5000);
		//dtPlanning.clear();
		//Thread.sleep(500);
	//	dtPlanning.sendKeys(excelObject.getData("CreateVesselSchedule", "Date", "WorkLoadPlanning"));
	//	webAction.setText(dtPlanning, formateddate);
		//dtPlanning.sendKeys(formateddate);
		//reuse.performWebElementTab(formateddate);
		Thread.sleep(1500);

		try {
			reuse.waitforClickable(removeSelection);
			removeSelection.click();
		} catch (Exception E) {
			Thread.sleep(200);
		//	reuse.waitforClickable(lstShiftBand);
		//	lstShiftBand.click();
		}

		Thread.sleep(200);
	//	driver.findElement(By.xpath("//li[text()='Shift 22']")).click();
		btnSearchDailyPlanning.click();
		Thread.sleep(100);
	//	menuNavigation.waitforLoadingIcon();
		Thread.sleep(2000);
		reuse.performWebElementRightClick(berth);
		//Actions oAct = new Actions(driver);
		//oAct.moveToElement(berth).contextClick(berth).build().perform();
		//berth.click();
		Thread.sleep(2000);
		lnkCreate.click();
		menuNavigation.waitforLoadingIcon();
		Thread.sleep(500);
		lnkVessel.click();
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
		System.out.println("RTG Planning");
	}

	public void scheduleCranes() throws InterruptedException {
		System.out.println("RTG Planning");
		Thread.sleep(3000);
		btnYes.click();
		Thread.sleep(3000);
		menuNavigation.waitforLoadingIcon();
		Thread.sleep(2000);
		btnSaveCraneSchedule.click();
		menuNavigation.waitforLoadingIcon();
		Thread.sleep(200);
	}

	public void signOffPlanning() throws InterruptedException {
		System.out.println("RTG Planning");
		Thread.sleep(3000);
		//reuse.clickUsingJS(btnPlanningSignOff);
		//driver.findElement(By.xpath("//i[@class='fas fa-check-double']")).click();
		reuse.waitforClickable(btnPlanningSignOff);
		btnPlanningSignOff.click();
		menuNavigation.waitforLoadingIcon();
		Thread.sleep(500);
		menuNavigation.waitforLoadingIcon();
		btnPerformActivityGenerationTask.click();
		menuNavigation.waitforLoadingIcon();
		Thread.sleep(500);
		lstManningRatio.click();
		driver.findElement(By.xpath("//li[text()='Default Manning Ratio']")).click();
		Thread.sleep(1000);
		btnPerformActivityGenerationTask.click();
		menuNavigation.waitforLoadingIcon();
		Thread.sleep(2000);
	}

	public boolean verifyVesselCreation() throws InterruptedException {
		System.out.println("RTG Planning");
		boolean createVessel = true;
		Thread.sleep(100);
		if (txtVesselCreate.size() <= 0) {
			createVessel = false;
		}
		return createVessel;

	}

	public boolean verifyCraneScheduleCreation() throws InterruptedException {
		System.out.println("RTG Planning");
		Thread.sleep(100);
		boolean createCraneSchedule = true;
		if (txtCreateCraneSchedule.size() <= 0) {
			createCraneSchedule = false;
		}
		return createCraneSchedule;

	}

	public boolean verifyPlanningSignoff() throws IOException {
		System.out.println("RTG Planning");
		System.out.println(dvCurrentDateSignOffStatus.getText().trim());
		System.out.println("Shift has been Signed off");
		return dvCurrentDateSignOffStatus.getText().trim()
				.equals("[" + "Shift 22"+ "] has been Signed off");

	}
	
	public boolean verifyQCFinalBookingReport() throws IOException, InterruptedException {
		Thread.sleep(100);
		workForceExecution.click();
		qcFinalBookingReport.click();
		return false;

	}
}
