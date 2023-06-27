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

public class TimeAndAttendance extends BaseTest {
	MenuNavigation menuNavigation;
	ReusableComponents reuse = new ReusableComponents();
	Faker faker = new Faker();

	WebElementKeys webAction = new WebElementKeys();
	DropDown dropdown = new DropDown();

	public TimeAndAttendance() throws FileNotFoundException {
		PageFactory.initElements(driver, this);
		menuNavigation = new MenuNavigation();

	}

	@FindBy(id = "cmbShiftBandId")
	WebElement shiftBandAttenRecon;

	@FindBy(xpath = "//select[@id='cmbShiftBandId']/option")
	List<WebElement> shiftBandAttenReconList;

	@FindBy(xpath = "//*[@id='dtStartAndEnd']")
	WebElement startEndDates;

	@FindBy(xpath = "(//span[text()='×'])[2]")
	WebElement shiftBandRemoveMark;

	@FindBy(xpath = "//button[@id='btnSearchManageAttendance']/span")
	WebElement searchInAttenReocn;

	@FindBy(id = "dtStartAndEnd")
	WebElement startDateEndDate;

	@FindBy(id = "btnPresent")
	WebElement buttonPresent;

	@FindBy(id = "btnAbsent")
	WebElement buttonAbsent;

	@FindBy(id = "btnReconsile")
	WebElement buttonReconsile;

	@FindBy(xpath = "//button[text()='Yes']")
	WebElement buttonReconsileYes;
	
	@FindBy(xpath = "//button[text()='Yes']")
	WebElement buttonPresentYes;

	@FindBy(xpath = "//button[text()='Apply']")
	WebElement dateApply;

	@FindBy(xpath = "//button[text()='Clear']")
	WebElement dateClear;

	@FindBy(xpath = "//*[@id='ManageAttendance-list']/tbody/tr[1]/td[1]")
	WebElement empOne;

	@FindBy(xpath = "//*[@id='ManageAttendance-list']/tbody/tr[2]/td[1]")
	WebElement empTwo;

	@FindBy(xpath = "//*[@id='ManageAttendance-list']/tbody/tr[3]/td[1]")
	WebElement empThree;

	@FindBy(xpath = "//*[@id='ManageAttendance-list']/tbody/tr[4]/td[1]")
	WebElement empFour;

	@FindBy(xpath = "//*[@id='ManageAttendance-list']/tbody/tr[5]/td[1]")
	WebElement empFive;


	@FindBy(xpath = "//*[@id='ManageAttendance-list']/tbody/tr[6]/td[1]")
	WebElement empSix;

	@FindBy(xpath = "//*[@id='ManageAttendance-list']/tbody/tr[7]/td[1]")
	WebElement empSeven;
	
	@FindBy(xpath = "//*[@id='ManageAttendance-list']/tbody/tr[8]/td[1]")
	WebElement empEight;

	@FindBy(xpath = "//*[@id='ManageAttendance-list']/tbody/tr/td[14]")
	List<WebElement> exceptionStatus;
	
	@FindBy(xpath = "//*[@id='ManageAttendance-list']/tbody/tr["+"i"+"/td[10]")
	List<WebElement> empListActualHours;
	
	@FindBy(xpath = "//*[@id='ManageAttendance-list']/tbody/tr["+"i"+"/td[1]")
	List<WebElement> empList;

	@FindBy(xpath = "(//*[@class='btn btn-xs btn-outline-success icon-btn mx-1 paycodes'])[1]")
	WebElement empOneCosting;
	
	@FindBy(xpath = "(//*[@class='btn btn-xs btn-outline-success icon-btn mx-1 paycodes'])[2]")
	WebElement empTwoCosting;
	
	public void attendanceReconciliation() throws Exception {

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

		/*
		 * SimpleDateFormat dateformat=new SimpleDateFormat("dd-mm-yyyy"); String
		 * formateddates=dateformat.format(date);
		 * 
		 * cal.add(Calendar.DATE, -1); Date yesterdaysDate=cal.getTime(); String
		 * formateddate=dateformat.format(yesterdaysDate);
		 * System.out.println(formateddate); cal.add(Calendar.DATE, +13); Date
		 * futureDate=cal.getTime(); String futureDates=dateformat.format(futureDate);
		 * String dates=formateddate+"-"+futureDates; System.out.println(dates);
		 */

		Thread.sleep(1000);
		startDateEndDate.clear();
		Thread.sleep(1000);
		startDateEndDate.sendKeys(dates);
		//Thread.sleep(1000);
		//dateApply.click();
		Thread.sleep(500);
		startDateEndDate.sendKeys(Keys.TAB);
		Thread.sleep(500);
		webAction.clickUsingJavaScript(searchInAttenReocn);
		//searchInAttenReocn.click();
		//webAction.clickUsingJavaScript(searchInAttenReocn);
		 
		Thread.sleep(2000);
	//	webAction.scrollIntoeEement(empOne);
		webAction.scrollDown300();

		webAction.waitUntilElementIsClickable(empOne);
		mouseHandler.clickUsingActionsMethod(empOne);
		//webAction.clickUsingJavaScript(empOne);
		
		Thread.sleep(1000); 
		webAction.scrollUp();
		Thread.sleep(500);
		
		webAction.clickUsingJavaScript(buttonAbsent);
		webAction.clickUsingJavaScript(buttonPresentYes);
		//buttonPresentYes.click();
		Thread.sleep(6000); 
		
		
		webAction.scrollDown();
		Thread.sleep(1000);
		webAction.waitUntilElementIsClickable(empOne);
		mouseHandler.clickUsingActionsMethod(empOne);
		//empOne.click();
		Thread.sleep(1000); 
		webAction.scrollUp();
		Thread.sleep(500);
		webAction.clickUsingJavaScript(buttonPresent);
		webAction.clickUsingJavaScript(buttonPresentYes);
		Thread.sleep(1000);
		//buttonPresentYes.click();
		Thread.sleep(6000); 
		
		webAction.scrollDown300();
		Thread.sleep(500);
		
		
		String val="00:00";
		
		for(int i=1;i>=10;i++)
		{
			
		
		List<WebElement> actualHours=driver.findElements(By.xpath("//*[@id='ManageAttendance-list']/tbody/tr["+"i"+"/td[10]"));
			for( WebElement listRecon: actualHours) { 
			Thread.sleep(500);      
			//we.sendKeys(Keys.ARROW_DOWN);
			if(val.equals(listRecon.getText()))
			{
				System.out.println(val);
				System.out.println(listRecon);
				driver.findElement(By.xpath("//*[@id='ManageAttendance-list']/tbody/tr["+"i"+"/td[1]")).click();
			}
			
			}
		
		}
		//empEight.click();
		//webAction.clickUsingJavaScript(empFour);
		//empFour.click();
		webAction.scrollDown300();
		Thread.sleep(1000);
		mouseHandler.clickUsingActionsMethod(empTwo);
		
		Thread.sleep(1000);
		webAction.scrollUp();
		Thread.sleep(500);
		webAction.clickUsingJavaScript(buttonReconsile);
		Thread.sleep(1000);
		webAction.clickUsingJavaScript(buttonPresentYes);
		//buttonPresentYes.click();
		Thread.sleep(6000); 
		
		webAction.scrollDown200();
		Thread.sleep(500);
		webAction.waitUntilElementIsClickable(empThree);
		mouseHandler.clickUsingActionsMethod(empThree);
		
		Thread.sleep(1000);
		webAction.scrollUp();
		Thread.sleep(500); 
		webAction.clickUsingJavaScript(buttonPresent);
		Thread.sleep(500);
		webAction.clickUsingJavaScript(buttonPresentYes);
		Thread.sleep(6000);
		
		/*
		 * webAction.clickUsingJavaScript(empOne);
		 * 
		 * Thread.sleep(4000); webAction.clickUsingJavaScript(buttonAbsent);
		 * 
		 * Thread.sleep(4000); webAction.clickUsingJavaScript(empTwo);
		 * webAction.clickUsingJavaScript(buttonReconsile); Thread.sleep(1000);
		 * webAction.clickUsingJavaScript(buttonReconsileYes);
		 */
		 
		// String shiftBandExpected="Auto Band Code Banking 9546";
		/*
		 * List<WebElement> status = driver.findElements(By.xpath(
		 * "//*[@id='ManageAttendance-list']/tbody/tr/td[14]")); for (WebElement we :
		 * status) { Thread.sleep(500);
		 * 
		 * if (we.getText().isEmpty()) {
		 * 
		 * webAction.getAttributeValue(ele, "td"); } }
		 */
	}
	
	
	public void attendanceReconciliationNew() throws Exception {

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

		

		Thread.sleep(1000);
		startDateEndDate.clear();
		Thread.sleep(1000);
		startDateEndDate.sendKeys(dates);
		//Thread.sleep(1000);
		//dateApply.click();
		Thread.sleep(500);
		startDateEndDate.sendKeys(Keys.TAB);
		Thread.sleep(500);
		webAction.clickUsingJavaScript(searchInAttenReocn);
		//searchInAttenReocn.click();
		//webAction.clickUsingJavaScript(searchInAttenReocn);
		 
		Thread.sleep(2000);
	//	webAction.scrollIntoeEement(empOne);
		webAction.scrollDown300();

		
		
		String val="00:00";
		
		for(int i=0;i>=10;i++)
		{
			
		
		List<WebElement> empId=driver.findElements(By.xpath("//*[@id='ManageAttendance-list']/tbody/tr["+"i"+"]/td[2]"));
			for( WebElement emp: empId) { 
			Thread.sleep(500);   
			System.out.println(emp.getText());
			Thread.sleep(100);  
			//we.sendKeys(Keys.ARROW_DOWN);
		
			
			}
			
		
		}
		Thread.sleep(5000);
		
	}
}
