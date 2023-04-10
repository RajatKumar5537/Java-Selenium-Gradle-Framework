package com.jivi.auto.employeepages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jivi.auto.utilities.BaseTest;

public class ResourceSetPage extends BaseTest {
	MenuNavigation menuNavigation;

	public ResourceSetPage() throws FileNotFoundException {
		PageFactory.initElements(driver, this);
		menuNavigation = new MenuNavigation();
	}

	@FindBy(id = "btnAddResource")
	WebElement btnAddResource;
	@FindBy(id = "txtResourceSetName")
	WebElement resourceSetName;
	@FindBy(id = "txtResourceSetDescription")
	WebElement resourceSetDescription;
	@FindBy(id = "btnAddResourceSkill")
	WebElement addResourceSkill;
	@FindBy(id = "select2-cmbResourceSetLocation1-container")
	WebElement resourceSetLocation;
	@FindBy(id = "txtResourceSetRequirement1")
	WebElement resourceSetRequirement;

	@FindBy(id = "select2-cmbResourceSetType1-container")
	WebElement resourceType;

	@FindBy(xpath = "//li[text()='Skill']")
	WebElement skillType;

	@FindBy(id = "select2-cmbResourceSetSkill1-container")
	WebElement resourceSkillCode;
	@FindBy(xpath = "//li[text()='ETT']")
	WebElement skillCode;

	@FindBy(id = "btnSaveResourceSet")
	WebElement btnSaveResourceSet;

	public void addResourceSet() throws InterruptedException {
		menuNavigation.waitforLoadingIcon();
		btnAddResource.click();
		Thread.sleep(200);
		resourceSetName.sendKeys("Automation");
		resourceSetDescription.sendKeys("Automation Description");
		addResourceSkill.click();
		resourceType.click();
		skillType.click();
		resourceSkillCode.click();
		skillCode.click();
		resourceSetRequirement.clear();
		resourceSetRequirement.sendKeys("2");
		resourceSetLocation.click();
	}
}
