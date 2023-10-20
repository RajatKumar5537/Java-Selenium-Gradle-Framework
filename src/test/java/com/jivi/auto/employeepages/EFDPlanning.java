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

//import io.opentelemetry.exporter.logging.SystemOutLogExporter;

import com.jivi.auto.business_reusablecomponents.ReusableComponents;
import com.jivi.auto.pageobjectutils.DropDown;
import com.jivi.auto.pageobjectutils.MouseHandler;
import com.jivi.auto.pageobjectutils.WebElementKeys;
import com.github.javafaker.Faker;

public class EFDPlanning extends BaseTest {
	MenuNavigation menuNavigation;
	ReusableComponents reuse = new ReusableComponents();
	Faker faker = new Faker();
	ReusableComponents resue = new ReusableComponents();

	WebElementKeys webAction = new WebElementKeys();
	DropDown dropdown = new DropDown();
	MouseHandler handler = new MouseHandler();

	public EFDPlanning() throws FileNotFoundException {
		PageFactory.initElements(driver, this);
		menuNavigation = new MenuNavigation();

	}
	
	
	
	@FindBy(xpath = "//input[@id='dtPlanning']")
	WebElement dtPlanning;
	
	@FindBy(xpath = "//select[@name='planning-shiftband']")
	WebElement selectShiftBandInput;

	@FindBy(id = "btnEFDPlanningSearch")
	WebElement btnSearchEFDPlanning;
	
	@FindBy(xpath = "//button[@id='btnAddEFDPlanning']")
	WebElement btnAddEFDPlanning;
	
	@FindBy(xpath = "//input[@id='txtWONumber']")
	WebElement woNumber;
	
	@FindBy(xpath = "//select[@id='cmbWOType']")
	WebElement woType;
	
	@FindBy(xpath = "//input[@id='txtEquipmentNumber']")
	WebElement equipmentNumberOrLocation;
	
	@FindBy(xpath = "//textarea[@id='txtDescription']")
	WebElement textAreaDescrption;
	
	@FindBy(xpath = "//button[@id='btnSaveEFDPlanning']")
	WebElement saveButtonEFDPlanning;
	
	@FindBy(xpath = "//button[@id='btnAddWorkOrderDetail']")
	WebElement resourceSetAdd;
	
	@FindBy(xpath = "//select[@id='cmbEFDSkill1']")
	WebElement selectSkill;
	
	@FindBy(xpath = "//button[@id='btnEFDPlanningSignOff']")
	WebElement efdPlanningSignOff;
	
	@FindBy(xpath = "//select[@id='cmbActivityGenRule']")
	WebElement manningRatio;
	
	@FindBy(xpath = "//select[@id='cmbAllocationRule']")
	WebElement allocationRule;
	

	@FindBy(xpath = "//button[@id='btnPerformActivityGenerationTask']")
	WebElement efdPlanningSignOffSave;
	
	public String workOrderNum=faker.numerify("WO######");

	public void createEFDPlanning() throws Exception {

		System.out.println("EFD Planning");
		Date d = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		String date = formatter.format(d);
		String shiftBandNews = "Auto Band code 82220";
		Thread.sleep(2000);
		dtPlanning.clear();

		Thread.sleep(2000);
		dtPlanning.sendKeys("02-08-2023");
		dtPlanning.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		

			
		Thread.sleep(500);
		List<WebElement> listShiftBand = selectShiftBandInput
				.findElements(By.xpath("//select[@name='planning-shiftband']/option"));
		for (WebElement we : listShiftBand) {
			Thread.sleep(500);
		
			if (shiftBandNews.equals(we.getText()))
				we.click();
		
		}
		
		
		webAction.clickUsingJavaScript(btnSearchEFDPlanning);
		
		webAction.clickUsingJavaScript(btnAddEFDPlanning);
		webAction.setText(woNumber, workOrderNum);
		dropdown.selectByIndex(woType, 0);
		webAction.setText(equipmentNumberOrLocation, "Testing Purpose");
		webAction.setText(textAreaDescrption, "Testing Purpose");
		webAction.clickUsingJavaScript(resourceSetAdd);
		dropdown.selectByIndex(selectSkill, 0);
		webAction.clickUsingJavaScript(saveButtonEFDPlanning);
		Thread.sleep(5000);
		webAction.clickUsingJavaScript(efdPlanningSignOff);
		Thread.sleep(5000);
		dropdown.selectByIndex(manningRatio, 1);
		Thread.sleep(500);
		dropdown.selectByIndex(allocationRule, 0);
		Thread.sleep(500);
		webAction.clickUsingJavaScript(efdPlanningSignOffSave);
	}

	

}
