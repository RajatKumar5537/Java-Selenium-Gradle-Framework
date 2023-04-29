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

public class LeaveAdminPage extends BaseTest{

	MenuNavigation menuNavigation;
	//excelUtilities excelObject;
	ReusableComponents reuse;
	
	@FindBy(id = "btnAddExceptionCodes")
	WebElement btnAddExceptionCodes;
	
	@FindBy(id = "txtExcpetionCodeName")
	WebElement txtExcpetionCodeName;
	
	@FindBy(id = "txtExceptionCodeDesc")
	WebElement txtExceptionCodeDesc;
	
	@FindBy(id = "select2-cmbExceptionTypeId-container")
	WebElement lstExceptionType;
	
	@FindBy(id = "txtColorCode")
	WebElement txtColorCode;
	@FindBy(id = "txtShiftLength")
	WebElement txtShiftLength;
	@FindBy(xpath = "//span[text()='Paid ?']")
	WebElement chkIsPaid;
	@FindBy(xpath = "//span[text()='Show In ESS?']")
	WebElement chkShowInEss;
	@FindBy(xpath = "//span[text()='Is Active?']")
	WebElement chkIsActive;
	@FindBy(id = "btnSaveExceptionCodes")
	WebElement btnSaveExceptionCodes;
	
	@FindBy(xpath = "//input[@placeholder='Search records']")
	WebElement textSearchColumns;
	
	@FindBy(xpath = "//button[@data-original-title='Edit']")
	WebElement btnEditLeaveCode;
	@FindBys(@FindBy(xpath = "//div[text()='Exception Codes created successfully']"))
	List<WebElement> txtLeaveExceptionCodeCreate;
	@FindBys(@FindBy(xpath = "//div[text()='Exception Codes updated successfully']"))
	List<WebElement> txtLeaveExceptionCodeEdit;
	@FindBys(@FindBy(xpath = "//div[text()='Selected Exception Codes deleted successfully.']"))
	List<WebElement> txtLeaveExceptionCodeDelete;
	@FindBy(xpath = "//td[@class=' select-checkbox']")
	WebElement chkSelectExceptionCode;
	@FindBy(id = "btnDeleteExceptionCodes")
	WebElement btnDeleteExceptionCodes;
	@FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
	WebElement btnDeleteConfirmation;
	public LeaveAdminPage() throws FileNotFoundException {
		PageFactory.initElements(driver, this);
		menuNavigation = new MenuNavigation();
	//	excelObject = new excelUtilities();
		reuse = new ReusableComponents();
	}
	public void createLeaveAttendanceCodes() throws IOException, InterruptedException {
		Thread.sleep(400);
		btnAddExceptionCodes.click();
	//	txtExcpetionCodeName.sendKeys(excelObject.getData("CreateExceptionCodes", "Exception Code", "LeaveAdmin"));
		//txtExceptionCodeDesc.sendKeys(excelObject.getData("CreateExceptionCodes", "Description", "LeaveAdmin"));
		Thread.sleep(200);
		lstExceptionType.click();
		//driver.findElement(By.xpath("//li[text()='" + excelObject.getData("CreateExceptionCodes", "Exception Type", "LeaveAdmin") + "']"))
		//.click();
		txtColorCode.clear();
		//txtColorCode.sendKeys(excelObject.getData("CreateExceptionCodes", "Color", "LeaveAdmin") );
		reuse.performWebElementTab(txtColorCode);
		txtShiftLength.clear();
		//txtShiftLength.sendKeys(excelObject.getData("CreateExceptionCodes", "Shift Length", "LeaveAdmin"));
		reuse.performWebElementTab(txtShiftLength);
		//if (!excelObject.getData("CreateExceptionCodes", "Paid ?", "LeaveAdmin").equals("Yes")) {
			Thread.sleep(100);
			chkIsPaid.click();
	//	}
	//	if (!excelObject.getData("CreateExceptionCodes", "Show In ESS?", "LeaveAdmin").equals("Yes")) {
			Thread.sleep(100);
			chkShowInEss.click();
		//}
		//if (!excelObject.getData("CreateExceptionCodes", "Is Active?", "LeaveAdmin").equals("Yes")) {
			Thread.sleep(100);
			chkIsActive.click();
		}
		//btnSaveExceptionCodes.click();
		//Thread.sleep(100);
	//}

	public void editLeaveAttendanceCodes() throws IOException, InterruptedException {
	//	textSearchColumns.sendKeys(excelObject.getData("EditExceptionCodes", "Exception Code","LeaveAdmin"));
		menuNavigation.waitforLoadingIcon();
		Thread.sleep(1000);
		btnEditLeaveCode.click();
		Thread.sleep(1000);
		txtExceptionCodeDesc.clear();
		//txtExceptionCodeDesc.sendKeys(excelObject.getData("EditExceptionCodes", "Description","LeaveAdmin"));
		btnSaveExceptionCodes.click();
		Thread.sleep(200);
	}
	public void deleteLeaveAttendanceCodes() throws IOException, InterruptedException {
	//	textSearchColumns.sendKeys(excelObject.getData("EditShiftBand", "ShiftBand Name","InputData"));
		menuNavigation.waitforLoadingIcon();
		Thread.sleep(1000);
		chkSelectExceptionCode.click();
		btnDeleteExceptionCodes.click();
		btnDeleteConfirmation.click();
		Thread.sleep(100);
	}
	public boolean verifyLeaveAttendanceCodesCreation() {
		boolean createExceptionCode = true;
		if (txtLeaveExceptionCodeCreate.size()<=0) {
			createExceptionCode = false;
		}
		return createExceptionCode;
		
	}
	public boolean verifyLeaveAttendanceCodesUpdate() {
		boolean editExceptionCode= true;
		if (txtLeaveExceptionCodeEdit.size()<=0) {
			editExceptionCode = false;
		}
		return editExceptionCode;
		
	}
	public boolean verifyLeaveAttendanceCodesDeletion() {
		boolean deleteExceptionCode = true;
		if (txtLeaveExceptionCodeDelete.size()<=0) {
			deleteExceptionCode = false;
		}
		return deleteExceptionCode;
		
	}
}
