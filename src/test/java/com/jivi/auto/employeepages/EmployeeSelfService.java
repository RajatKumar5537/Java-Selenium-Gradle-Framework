package com.jivi.auto.employeepages;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;
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

public class EmployeeSelfService extends BaseTest {
	MenuNavigation menuNavigation;
	ReusableComponents reuse = new ReusableComponents();
	Faker faker = new Faker();

	WebElementKeys webAction = new WebElementKeys();
	DropDown dropdown = new DropDown();
	MouseHandler act=new MouseHandler(); 
	public String leaveApplied;

	public EmployeeSelfService() throws FileNotFoundException {
		PageFactory.initElements(driver, this);
		menuNavigation = new MenuNavigation();

	}

	
	@FindBy(id = "350")
	WebElement viewCalendar;
	
	@FindBy(id = "351")
	WebElement myLeaveProfile;
	
	@FindBy(id = "352")
	WebElement applyLeaveLeftNav;
	
	
	@FindBy(xpath = "//*[@id='emp-entitlement-profile-list']/tbody/tr/td[2]")
	WebElement leaveCode;
	
	@FindBy(xpath = "//*[@id='emp-entitlement-profile-list']/tbody/tr/td[3]")
	WebElement leaveEntitlement;
	
	@FindBy(xpath = "//*[@id=\"emp-entitlement-profile-list\"]/tbody/tr/td[7]")
	WebElement leaveTaken;
	
	@FindBy(xpath = "//*[@id='emp-entitlement-profile-list']/tbody/tr/td[8]")
	WebElement leaveBalance;
	
	@FindBy(xpath = "//*[@id='emp-entitlement-profile-list']/tbody/tr/td[9]")
	WebElement pendingLeave;
	
	@FindBy(xpath = "//*[@id='emp-entitlement-profile-list']/tbody/tr/td[10]")
	WebElement myRamcoBalance;
	
	@FindBy(id = "353")
	WebElement leaveRecords;

	
	@FindBy(id = "354")
	WebElement applyTimeOff;
	
	@FindBy(id = "dtTimeOffDate")
	WebElement dateTimeOffDate;
	
	@FindBy(id = "cmbTimeOffPeriod")
	WebElement timeOffPeriod;
	
	@FindBy(xpath = "//*[text()='1 Hour']")
	WebElement oneHour;
	
	@FindBy(xpath = "//*[text()='2 Hours']")
	WebElement twoHours;
	
	@FindBy(xpath = "//*[text()='3 Hours']")
	WebElement threeHours;
	
	@FindBy(xpath = "//*[text()='4 Hours']")
	WebElement fourHours;
	
	@FindBy(id = "txtTimeOffRemarks")
	WebElement timeOffRemarks;
	
	@FindBy(id = "btnAddAttachment")
	WebElement timeOffAttachment;
	
	@FindBy(id = "btnApplyTimeOff")
	WebElement saveTimeOff;
	
	@FindBy(id = "355")
	WebElement requestDayinLieu;
	
	@FindBy(id = "356")
	WebElement applyOnBehalf;

		
	@FindBy(xpath = "//*[@id='ManageAttendance-list']/tbody/tr[5]/td[1]")
	WebElement empFive;


	@FindBy(xpath = "//*[@id='ManageAttendance-list']/tbody/tr[6]/td[1]")
	WebElement empSix;

	@FindBy(xpath = "//*[@id='ManageAttendance-list']/tbody/tr[7]/td[1]")
	WebElement empSeven;
	
	@FindBy(xpath = "//*[@id='ManageAttendance-list']/tbody/tr[8]/td[1]")
	WebElement empEight;

	@FindBy(xpath = "//*[@id=\"ManageAttendance-list\"]/tbody/tr/td[14]")
	List<WebElement> exceptionStatus;
	

	@FindBy(xpath = "(//*[@class='btn btn-xs btn-outline-success icon-btn mx-1 paycodes'])[1]")
	WebElement empOneCosting;
	
	@FindBy(xpath = "(//*[@class='btn btn-xs btn-outline-success icon-btn mx-1 paycodes'])[2]")
	WebElement empTwoCosting;
	
	
	//Apply Leave
	@FindBy(xpath = "//select[@id='cmbExceptionType']/option")
	List<WebElement> leaveType;
	
	@FindBy(id = "dtLeaveStartDate")
	WebElement leaveFrom;

	@FindBy(id = "dtLeaveEndDate")
	WebElement leaveTo;
		
	@FindBy(id = "txtLeaveRemarks")
	WebElement leaveRemarks;
	
	@FindBy(xpath = "//*[text()='Next']")
	WebElement applyLeaveNextButton;
	
	@FindBy(xpath = "//*[@id='lblLeaveAppliedDays']")
	WebElement daysApplied;
	
	@FindBy(xpath = "//*[text()='Finish']")
	WebElement applyLeaveFinishButton;
	
	@FindBy(id = "lblSelectedOrgUnit")
	WebElement olmApprover;
	
	@FindBy(xpath = "//*[@id='dvGlobalOrganizationUnitTreeView']/ul/li[2]")
	WebElement olm;

	
	@FindBy(xpath = "//*[@id='dvGlobalOrganizationUnitTreeView']/ul/li[3]")
	WebElement olmApproverOLM;

	@FindBy(xpath = "//*[text()='Approver Kiosk']")
	WebElement approverKiosk;
	
	@FindBy(xpath = "//*[text()='Approve Time Off']")
	WebElement approveTimeOff;
	
	
	@FindBy(xpath = "//*[text()='Approve Days In Lieu']")
	WebElement approveDaysInLieu;
	
	
	@FindBy(xpath = "//*[text()='Approve Leave']")
	WebElement approveLeave;
	
	@FindBy(xpath = "(//input[@type='search'])[2]")
	WebElement searchEmpInPendingApprove;
	
	//@FindBy(xpath = "//*[@id='pending-leave-transactions-list']/tbody/tr/td[1]")
	//WebElement clickEmployeeInSearchResults;
	
	@FindBy(xpath = "//input[@id='chkSelectAll']")
	WebElement clickEmployeeInSearchResults;
	
	@FindBy(id = "btnApproveAllLeave")
	WebElement approveLeavebyApprover;
	
	@FindBy(id = "btnRejectAllLeave")
	WebElement rejectLeavebyApprover;
	
	@FindBy(id = "txtApproveRejectAllRemarks")
	WebElement approveRejectRemarks;
	
	@FindBy(xpath = "//button[text()='Yes']")
	WebElement approvebutton;
	
	
	@FindBy(id = "btnSaveRemarks")
	WebElement approveRejectRemarksSaveButton;
	
	public void employeeSelfService() throws Exception {

		viewCalendar.click();
		Thread.sleep(5000);
		myLeaveProfile.click();
		Thread.sleep(5000);
		applyLeaveLeftNav.click();
		Thread.sleep(5000);
		leaveRecords.click();
		Thread.sleep(5000);
		applyTimeOff.click();
		Thread.sleep(5000);
		requestDayinLieu.click();
		Thread.sleep(5000);
		applyOnBehalf.click();
		Thread.sleep(8000);
		
		
			}
	
	public void adminSelfService() throws Exception {

		viewCalendar.click();
		Thread.sleep(5000);
		myLeaveProfile.click();
		Thread.sleep(5000);
		applyLeaveLeftNav.click();
		Thread.sleep(5000);
		leaveRecords.click();
		Thread.sleep(5000);
		applyTimeOff.click();
		Thread.sleep(5000);
		requestDayinLieu.click();
		Thread.sleep(5000);
		applyOnBehalf.click();
		Thread.sleep(8000);
	}
	
	
	public void leaveBalanceValidationBeforeApply() throws Exception {
		myLeaveProfile.click();
		System.out.println("================================");
		System.out.println("Leave Table:: Before Apply Leave");
		System.out.println("Leave Code: "+leaveCode.getText());
		System.out.println("Leave Entitlement: "+leaveEntitlement.getText());
		System.out.println("Leave Taken: "+leaveTaken.getText());
		System.out.println("Leave Applied: "+leaveApplied);
		System.out.println("Leave Balance: "+leaveBalance.getText());
		System.out.println("Pending Leave: "+pendingLeave.getText());
		System.out.println("My Ramco Balance: "+myRamcoBalance.getText());
		System.out.println("================================");
		Thread.sleep(5000);
	}
	
	public void leaveBalanceValidationAfterReject() throws Exception {
		myLeaveProfile.click();
		System.out.println("================================");
		System.out.println("Leave Table:: After Reject Leave");
		System.out.println("Leave Code: "+leaveCode.getText());
		System.out.println("Leave Entitlement: "+leaveEntitlement.getText());
		System.out.println("Leave Taken: "+leaveTaken.getText());
		System.out.println("Leave Applied: "+leaveApplied);
		System.out.println("Leave Balance: "+leaveBalance.getText());
		System.out.println("Pending Leave: "+pendingLeave.getText());
		System.out.println("My Ramco Balance: "+myRamcoBalance.getText());
		System.out.println("================================");
		Thread.sleep(5000);
	}
	
	public void leaveBalanceValidationAfterApprove() throws Exception {
		myLeaveProfile.click();
		System.out.println("================================");
		System.out.println("Leave Table:: After Approve Leave");
		System.out.println("Leave Code: "+leaveCode.getText());
		System.out.println("Leave Entitlement: "+leaveEntitlement.getText());
		System.out.println("Leave Taken: "+leaveTaken.getText());
		System.out.println("Leave Applied: "+leaveApplied);
		System.out.println("Leave Balance: "+leaveBalance.getText());
		System.out.println("Pending Leave: "+pendingLeave.getText());
		System.out.println("My Ramco Balance: "+myRamcoBalance.getText());
		System.out.println("================================");
		Thread.sleep(5000);
	}
	
	
	public void leaveBalanceValidationAfterApplyLeave() throws Exception {
		myLeaveProfile.click();
		System.out.println("================================");
		System.out.println("Leave Table:: After Apply Leave");
		System.out.println("Leave Code: "+leaveCode.getText());
		System.out.println("Leave Entitlement: "+leaveEntitlement.getText());
		System.out.println("Leave Taken: "+leaveTaken.getText());
		System.out.println("Leave Applied: "+leaveApplied);
		System.out.println("Leave Balance: "+leaveBalance.getText());
		System.out.println("Pending Leave: "+pendingLeave.getText());
		System.out.println("My Ramco Balance: "+myRamcoBalance.getText());
		System.out.println("================================");
		Thread.sleep(5000);
	}
	
	public void employeeSelfServiceApplyAnnualLeave() throws Exception {
		leaveBalanceValidationBeforeApply();
		
		Thread.sleep(5000);
		applyLeaveLeftNav.click();
		Thread.sleep(5000);
		for(WebElement ltype:leaveType)
		{
			if(ltype.getText().equals("Annual Leave"))
			{
				ltype.click();
			}
		}
		Thread.sleep(1000);
		leaveFrom.clear();
		Thread.sleep(3000);
		webAction.setText(leaveFrom, "01-06-2023");
		Thread.sleep(1000);
		leaveFrom.sendKeys(Keys.TAB);
		leaveTo.clear();
		Thread.sleep(3000);
		webAction.setText(leaveTo, "01-06-2023");
		Thread.sleep(1000);
		leaveTo.sendKeys(Keys.TAB);
		webAction.scrollDown();
		webAction.setText(leaveRemarks, "Testing");
		Thread.sleep(3000);
		webAction.click(applyLeaveNextButton);
		Thread.sleep(1000);
		leaveApplied=daysApplied.getText();
		Thread.sleep(3000);
		webAction.scrollDown();
		webAction.click(applyLeaveNextButton);
		Thread.sleep(1000);
		webAction.scrollDown();
		webAction.clickUsingJavaScript(applyLeaveFinishButton);
		Thread.sleep(3000);
		webAction.clickUsingJavaScript(myLeaveProfile);
		
		leaveBalanceValidationAfterApplyLeave();
	}
	
public void employeeSelfServiceRejectLeave() throws Exception {
	Thread.sleep(500);
	webAction.clickUsingJavaScript(olmApprover);
	Thread.sleep(500);
	webAction.clickUsingJavaScript(olmApproverOLM);
	Thread.sleep(500);
	webAction.clickUsingJavaScript(approverKiosk);
	Thread.sleep(500);
	webAction.clickUsingJavaScript(approveLeave);
	Thread.sleep(500);
	webAction.setText(searchEmpInPendingApprove, "10176007");
	Thread.sleep(500);
	//webAction.clickUsingJavaScript(clickEmployeeInSearchResults);
	act.clickUsingActionsMethod(clickEmployeeInSearchResults);
	Thread.sleep(500);
	webAction.clickUsingJavaScript(rejectLeavebyApprover);
	Thread.sleep(500);
	webAction.setText(approveRejectRemarks, "Rejecting for Testing Purpose");
	Thread.sleep(500);
	webAction.clickUsingJavaScript(approveRejectRemarksSaveButton);
	Thread.sleep(800);
	webAction.clickUsingJavaScript(approvebutton);
	Thread.sleep(5000);
	
	}

public void employeeSelfServiceApproveLeave() throws Exception {
	Thread.sleep(500);
	webAction.clickUsingJavaScript(olmApprover);
	Thread.sleep(500);
	webAction.clickUsingJavaScript(olmApproverOLM);
	Thread.sleep(500);
	webAction.clickUsingJavaScript(approverKiosk);
	Thread.sleep(500);
	webAction.clickUsingJavaScript(approveLeave);
	Thread.sleep(500);
	webAction.setText(searchEmpInPendingApprove, "10176007");
	Thread.sleep(500);
	webAction.clickUsingJavaScript(clickEmployeeInSearchResults);
	Thread.sleep(500);
	webAction.clickUsingJavaScript(approveLeavebyApprover);
	Thread.sleep(500);
	webAction.setText(approveRejectRemarks, "Approving Leave for Testing Purpose");
	Thread.sleep(500);
	webAction.clickUsingJavaScript(approveRejectRemarksSaveButton);
	Thread.sleep(800);
	webAction.clickUsingJavaScript(approvebutton);
	Thread.sleep(5000);
	
	}

public void employeeSelfServiceApplyTimeOff() throws Exception {
	Thread.sleep(5000);
	applyTimeOff.click();
	Thread.sleep(500);
	dateTimeOffDate.clear();
	Thread.sleep(500);
	dateTimeOffDate.sendKeys("01-06-2023");
	dateTimeOffDate.sendKeys(Keys.TAB);
	Thread.sleep(5000);
	dropdown.selectByIndex(timeOffPeriod, 0);
	Thread.sleep(500);
	oneHour.click();
	Thread.sleep(500);
	timeOffRemarks.sendKeys("Testing TimeOff");
	
	String path =System.getProperty("user.dir")+ File.separator +"jiviewsDocument"+File.separator+"timeOffTestDocument.txt";
	timeOffAttachment.sendKeys(path);
	Thread.sleep(500);
	saveTimeOff.click();

	
}
	
}
