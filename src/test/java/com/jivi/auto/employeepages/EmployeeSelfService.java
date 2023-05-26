package com.jivi.auto.employeepages;

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

public class EmployeeSelfService extends BaseTest {
	MenuNavigation menuNavigation;
	ReusableComponents reuse = new ReusableComponents();
	Faker faker = new Faker();

	WebElementKeys webAction = new WebElementKeys();
	DropDown dropdown = new DropDown();

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
	
	@FindBy(id = "353")
	WebElement leaveRecords;

	
	@FindBy(id = "354")
	WebElement applyTimeOff;
	
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
}
