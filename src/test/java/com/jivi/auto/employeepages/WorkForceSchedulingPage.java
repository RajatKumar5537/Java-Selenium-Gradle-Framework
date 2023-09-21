package com.jivi.auto.employeepages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.jivi.auto.utilities.BaseTest;
//import com.auto.utilities.BaseTest;
//import com.auto.utilities.excelUtilities;
//import com.auto.utilities.reuableComponents;

import com.jivi.auto.business_reusablecomponents.ReusableComponents;
//import com.github.dockerjava.api.command.InspectExecResponse.Container;

public class WorkForceSchedulingPage extends BaseTest {
	MenuNavigation menuNavigation;
//	excelUtilities excelObject;
	ReusableComponents reuse;

	public WorkForceSchedulingPage() throws FileNotFoundException {
		PageFactory.initElements(driver, this);
		menuNavigation = new MenuNavigation();
	//	excelObject = new excelUtilities();
		reuse = new ReusableComponents();
	}

	@FindBy(xpath = "(//input[@placeholder=' Select Roster Group'])[1]")
	WebElement lstRoasterGroup;
	@FindBy(xpath = "//span[@class='select2-selection__choice__remove']")
	WebElement removeSelection;
	@FindBy(id = "btnSearchEmployeeRoster")
	WebElement btnSearchEmployeeRoster;
	@FindBy(xpath = "(//div[text()='Off'])[1]")
	WebElement employeeShift;
	@FindBy(id = "select2-cmbShiftBand-container")
	WebElement lstBandCode;
	@FindBy(id = "txtShiftNotes")
	WebElement txtShiftNotes;
	@FindBys(@FindBy(xpath = "//div[contains(text(),'Shift created successfully')]"))
	List<WebElement> txtCreateShift;
	@FindBys(@FindBy(xpath = "//div[contains(text(),'Shift deleted successfully')]"))
	List<WebElement> txtDeleteShift;
	
	@FindBy(id = "btnSelectShiftBand")
	WebElement btnSelectShiftBand;
	@FindBy(id = "dtStartAndEnd")
	WebElement dtStartAndEnd;
	@FindBy(xpath = "//span[text()='Delete']")
	WebElement delete;
	@FindBy(xpath = "//button[text()='Yes']")
	WebElement btnYes;

	public void serachandCreateExmployeeShift() throws InterruptedException, IOException {
		try {
			reuse.waitforClickable(removeSelection);
			removeSelection.click();
		} catch (Exception E) {
			Thread.sleep(200);
			// reuse.waitforClickable(lstRoasterGroup);
			lstRoasterGroup.click();
		}
	//	driver.findElement(By.xpath("//li[text()='"
	//			+ excelObject.getData("CreateEmployeeShift", "RoasterGroup", "WorkforceScheduling") + "']")).click();
		dtStartAndEnd.clear();
		//dtStartAndEnd
	//			.sendKeys(excelObject.getData("CreateEmployeeShift", "Start - End Date(s)", "WorkforceScheduling"));
		//btnSearchEmployeeRoster.click();
		menuNavigation.waitforLoadingIcon();
		Thread.sleep(2000);
		employeeShift.click();
		Thread.sleep(100);
		lstBandCode.click();
		//driver.findElement(By.xpath("//li[text()='"
//				+ excelObject.getData("CreateEmployeeShift", "Band Code", "WorkforceScheduling") + "']")).click();
	//	txtShiftNotes.sendKeys(excelObject.getData("CreateEmployeeShift", "Notes", "WorkforceScheduling"));
		btnSelectShiftBand.click();
		menuNavigation.waitforLoadingIcon();
		Thread.sleep(100);
	}

	public void deleteExmployeeShift() throws IOException, InterruptedException {

		//reuse.performWebElementRightClick(driver.findElement(By.xpath("//div[text()='"
			//	+ excelObject.getData("CreateEmployeeShift", "Band Code", "WorkforceScheduling") + "']")));
		Thread.sleep(200);
		reuse.performMoveToElement(btnSearchEmployeeRoster);
		delete.click();
		btnYes.click();
		menuNavigation.waitforLoadingIcon();
		Thread.sleep(100);
	}

	public boolean verifyShiftbandCreate() throws InterruptedException {
		boolean craeteShiftBand = true;
		if (txtCreateShift.size() <= 0) {
			craeteShiftBand = false;
		}
		Thread.sleep(1000);

		return craeteShiftBand;

	}
	public boolean verifyShiftbandDelete() throws InterruptedException {
		boolean deleteShiftBand = true;
		if (txtDeleteShift.size() <= 0) {
			deleteShiftBand = false;
		}
		Thread.sleep(1000);
		return deleteShiftBand;

	}


}
