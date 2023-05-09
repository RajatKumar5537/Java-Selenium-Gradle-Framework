package com.jivi.auto.employeepages;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jivi.auto.business_reusablecomponents.ReusableComponents;
import com.jivi.auto.pageobjectutils.DropDown;
import com.jivi.auto.pageobjectutils.WebElementKeys;
import com.jivi.auto.reusablecomponents.FrameHandler;
import com.jivi.auto.utilities.BaseTest;

import junit.framework.Assert;;



public class JiViewsEmployeeAdministration extends BaseTest{
	private WebDriver driver;
	
	FrameHandler mousehandler = new FrameHandler();
	WebElementKeys webAction = new WebElementKeys();
	DropDown dropdown=new DropDown();
	ReusableComponents resuable=new ReusableComponents();
	
	@FindBy(id="txtUserName")
	WebElement userName;

	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnSignIn")
	WebElement signIn;
	
	
	@FindBy(xpath="//*[text()='Roles']")
	WebElement rolesLefNav;
	
	@FindBy(id="btnAddNew")
	WebElement buttonAddNew;
	

	
	@FindBy(xpath="//*[text()='Employment Basis updated successfully']")
	WebElement assert_EmpAdd;
	
	@FindBy(xpath = "//*[@id='lblSelectedParent']")
	WebElement systemSetup;

	@FindBy(xpath="//*[text()='System Definitions']")
	WebElement systemDefLink;
	
	@FindBy(xpath="//*[text()='Employment Category']")
	WebElement empCategory;
	
	@FindBy(xpath="//*[@id='template-roster-list_filter']/label/input")
	WebElement clicksearchboxTest;
	
	@FindBy(xpath="//*[@id='dvOrgUnitDropdown']/a/i")
	WebElement olm;
	
	@FindBy(xpath="//*[@id='dvGlobalOrganizationUnitTreeView']/ul/li[4]")
	WebElement olmLink;
	
	
	@FindBy(xpath="//*[text()='Skills']")
	WebElement skillLefNav;
	
	
	@FindBy(xpath="//*[text()=\"Demo\"]")
	WebElement demo;
	
	@FindBy(id="btnAddNew")
	WebElement empCategoryAdd;
	
	@FindBy(id="txtEmpBCode")
	WebElement empCode;
	
	@FindBy(id="txtEmpBDesc")
	WebElement empDesc;
	
	@FindBy(id="txtBSeq")
	WebElement empSeq;
	
	@FindBy(id="btnSaveEmpBasisDeatils")
	WebElement SaveButton;
	

	@FindBy(id="btnAddSkill")
	WebElement buttonoAddSkill;
	
	@FindBy(id="cmbPrimarySkillId")
	WebElement skillCode;
	
	@FindBy(id="txtSkillCode")
	WebElement skillCode_CreaeteSkill;
	
	@FindBy(id="txtSkillCodeDescription")
	WebElement skillCodeDescription;
	
	@FindBy(id="txtSequence")
	WebElement sequence;
	

	@FindBy(id="txtFixedRanking")
	WebElement fixedRanking;
	

	@FindBy(id="btnSaveSkill")
	WebElement saveSkill;
	
	@FindBy(xpath="//div[text()='Roles']")
	WebElement rolesLeftNav;
	

	@FindBy(id="btnAddNew")
	WebElement addRoles;
	
	@FindBy(id="txtRoleName")
	WebElement roleName;
	
	@FindBy(id="txtRoleDescription")
	WebElement roleDescription;
	
//	@FindBy(xpath="//Select[@id=\"cmbPrimarySkillId\"]")
	//WebElement SkillCode;
	

	@FindBy(id="btnSaveRolesDetails")
	WebElement saveRole;
	
	
	@FindBy(xpath="//div[text()='Role Groups']")
	WebElement roleGroupLeftNav;
	
	@FindBy(id="txtRoleGroupName")
	WebElement roleGroupName;
	
	@FindBy(xpath="//button[@title='Move all']")
	WebElement moveAll;
	
	@FindBy(id="btnSaveRoleGroupDtls")
	WebElement saveRoleGroup;
	
	//Employee Profile
	
	@FindBy(xpath="//*[text()='Employee Administration']")
	WebElement employeeAdmin;
	
	@FindBy(id="346")
	WebElement empProfile;
	
	@FindBy(id="btnAddEmployee")
	WebElement empAddEmp;
	
	@FindBy(id="txtEmployeeNumber")
	WebElement employeeNumber;
	
	@FindBy(id="txtBadgeNumber")
	WebElement badgeNumber;
	
	@FindBy(id="txtFirstName")
	WebElement firstName;
	
	@FindBy(id="txtLastName")
	WebElement lastName;
	
	@FindBy(id="dtBirthDate")
	WebElement birthDate;
	
	@FindBy(id="cmbEmploymentBasis")
	WebElement employmentBasis;
	
	@FindBy(id="cmbGender")
	WebElement gender;
	
	@FindBy(id="cmbMaritalStatus")
	WebElement maritalStatus;
	
	@FindBy(id="cmbTitle")
	WebElement title;
	
	@FindBy(id="txtAddressLine1")
	WebElement addressLine1;
	
	@FindBy(id="txtAddressLine2")
	WebElement addressLine2;
	
	@FindBy(id="txtPostCode")
	WebElement postCode;
	
	@FindBy(id="txtCity")
	WebElement cityName;
	
	@FindBy(id="txtState")
	WebElement state;
	
	@FindBy(id="cmbCountry")
	WebElement countryName;
	
	@FindBy(id="txtEmailAddress")
	WebElement emailAddress;
	
	@FindBy(id="cmbPosition")
	WebElement position;
	
	@FindBy(id="cmbScheduleRule")
	WebElement scheduleRule;
	
	@FindBy(xpath="//*[@id='cmbPayGroup']")
	WebElement payGroup;
	
	@FindBy(xpath="//*[@id='btnSaveEmployee']")
	WebElement saveEmployees;
	

	//Employee Search
	@FindBy(xpath="//*[@id=\"emp-list_filter\"]//input")
	WebElement searchEmp;
	
	@FindBy(xpath="//table[@id='emp-list']/tbody/tr[1]/td[2]")
	WebElement empIdSearchResult;
	
	@FindBy(xpath="//table[@id='emp-list']/tbody/tr[1]/td[3]")
	WebElement empIdSearchResultName;
	
	//*[@class='toast-message']
	
	@FindBy(xpath="//*[@class='toast-message']")
	WebElement successToast_Message;
	
	//Employee Edit
	
	@FindBy(xpath="(//button[@type='button'])[5]")
	WebElement empProfileEdit;
	
	//Employee Duplicate
	@FindBy(xpath="(//button[@type='button'])[6]")
	WebElement empProfileEditDuplicate;
	
	//Contacts Sub Menu
	
	@FindBy(xpath="//*[text()='Contacts']")
	WebElement contactsSubMenu;
	
	@FindBy(id="btnAddNewContact")
	WebElement contactsAdd;
	
	@FindBy(id="txtContactName")
	WebElement contactName;
	
	@FindBy(id="cmbRelationship")
	WebElement contactRelationship;
	
	@FindBy(id="btnSaveContact")
	WebElement saveContactButton;
	
	@FindBy(xpath="(//*[@type='button'])[5]")
	WebElement cancelContactButton;
	
	//Excluded Skills Sub Menu
	
		@FindBy(xpath="//*[text()='Excluded Skills']")
		WebElement excludedSkillsSubMenu;
		
		@FindBy(id="btnAddNewExcludedSkills")
		WebElement addNewExcludedSkills;
		
		@FindBy(id="cmbExcludedSkill")
		WebElement excludedSkillDesc;
		
		@FindBy(id="dtExcludedSkillStartDate")
		WebElement excludedSkillStartDate;
		
		@FindBy(id="dtExcludedSkillEndDate")
		WebElement excludedSkillEndDate;
		
		@FindBy(id="btnSaveExcludedSkill")
		WebElement saveExcludedSkill;
		
		@FindBy(xpath="//*[@id=\"modals-employee-excluded-skills\"]/div/div/div[3]/button[1]")
		WebElement cancelExcludedSkill;
	
		//Roles Sub Menu
		
			@FindBy(xpath="//*[text()='Roles']")
			WebElement rolesSubMenu;
			
			@FindBy(id="cmbPrimaryRole")
			WebElement primaryRole;
			
			@FindBy(xpath="//button[@title='Move all']")
			WebElement moveAllEmpProfile;
			
			@FindBy(xpath="//button[@title='Remove all']")
			WebElement removeAllEmpProfile;
			
			@FindBy(xpath="//table[@id='employee-skill-competency-list']/tbody/tr[1]/td[7]")
			WebElement skillCodeEdit;
			
			@FindBy(xpath="//*[@id=\"-1\"]")
			WebElement skillCodeEditCancel;

			@FindBy(id="btnSaveSkillCompetencyDetails")
			WebElement saveSkillCompetencyDetails;
			
			
			//Security Sub Menu
			
			@FindBy(xpath="//*[text()='Security']")
			WebElement securitySubMenu;
			
			@FindBy(xpath="//*[@id='btnAddEmployeeOU']")
			WebElement addEmployeeOU;
			
			@FindBy(id="cmbSharedOrgUnit")
			WebElement orgUnitName;
			
			@FindBy(id="btnSaveEmployeeOU")
			WebElement saveEmployeeOU;
			
			//	ESS Sub Menu
			
			@FindBy(xpath="//*[text()='ESS']")
			WebElement ESSSubMenu;
			
			@FindBy(id="btnAddLeaveProfile")
			WebElement AddLeaveProfile;
			
			@FindBy(id="cmbEmpLeaveProfileName")
			WebElement empLeaveProfileName;
			
			@FindBy(id="btnSaveLeaveProfile")
			WebElement saveLeaveProfile;
			
			//add workflow route
			@FindBy(id="btnAddEmpWorkflowRoute")
			WebElement addEmpWorkflowRoute;
			
			@FindBy(id="cmbWorkFlowModuleName")
			WebElement workFlowModuleName;
		
			
			@FindBy(id="cmbWorkflowRouteName")
			WebElement workflowRouteName;
		
			
			@FindBy(id="btnSaveEmpWorkflowRoute")
			WebElement saveEmpWorkflowRoute;
		
			
			//Miscellaneous route
			
			@FindBy(xpath="//*[text()='Miscellaneous']")
			WebElement miscellaneous;
			
			@FindBy(xpath="//*[@id=\"emp-misc-columns\"]//span")
			WebElement chkMiscColumn;
			
		
			//Change Password On Login
			
			@FindBy(id="txtNewPassword")
			WebElement newPassword;
			
			@FindBy(id="txtConfirmPassword")
			WebElement confirmNewPassword;
			
			@FindBy(id="btnSavePassword")
			WebElement confirmPassSave;
			
			
	//Terminate Employee
			@FindBy(xpath="//*[text()='Disciplinary']")
			WebElement disciplinary;
			
			@FindBy(xpath="//*[@id=\"emp-disciplinary\"]/div[2]/div[2]/div[1]/div/div/div/div")
			WebElement chkEmployeeTerminated;
			
			@FindBy(xpath="//button[text()='Yes']")
			WebElement yesOptionTerminated;
			
			//@FindBy(xpath="//table[@class='table-condensed']/tbody//tr//td[@class='active day']")
			Date date = new Date(); 
		
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); 
			String formattedDate = sdf. format(date); 
			String cdate=formattedDate.substring(0, 2);
			
			//@FindBy(xpath="//table[@class='table-condensed']/tbody/tr//td[text()='"+cdate"+']")
			@FindBy(xpath="//td[text()='13']")
			WebElement selectCurrentDate;
			
			
			
			@FindBy(id="txtEmployeeTerminationRemarks")
			WebElement termindatedRemarks;
			
			@FindBy(id="btnSaveEmployee")
			WebElement desciplinarySave;
			
	// Constructor
	public JiViewsEmployeeAdministration(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean Login(String userid, String pwd) throws Exception {
		webAction.setText(userName, userid);
		webAction.setText(password, pwd);
		Thread.sleep(100);
		webAction.clickUsingJavaScript(signIn);
		return false;


	}
	
	
	
	public boolean addSkill(String skill,String desc,String seq,String rank) throws Exception {
		webAction.click(olm);
		webAction.click(demo);
		webAction.click(systemSetup);
		webAction.click(systemDefLink);
		webAction.click(skillLefNav);
		webAction.click(buttonoAddSkill);
		webAction.setText(skillCode_CreaeteSkill, skill);
		webAction.setText(skillCodeDescription, desc);
		webAction.setText(sequence, seq);
		webAction.setText(fixedRanking, rank);
		webAction.click(saveSkill);
		
		
		return false;
	}
	
	public boolean empCategory() throws Exception {
		webAction.clickUsingJavaScript(olm);
		webAction.click(demo);
		webAction.click(systemSetup);
		webAction.click(systemDefLink);
		webAction.click(empCategory);
		return false;
	}
	

	public boolean empAdd(String empid,String desc,String seq) throws Exception {
		webAction.click(olm);
		webAction.click(demo);
		webAction.click(systemSetup);
		webAction.click(systemDefLink);
		webAction.click(empCategory);
		webAction.click(empCategoryAdd);
		webAction.setText(empCode, empid);
		webAction.setText(empDesc, desc);
		webAction.setText(empSeq, seq);
		webAction.click(SaveButton);
		Thread.sleep(100);
	//String success_message=assert_EmpAdd.getText().trim();
		//System.out.println(success_message);
		//Assert.assertEquals(success_message,"Employment Basis updated successfully");
		return false;
	}
	
	public boolean addRoles(String role,String desc,String skill) throws Exception {
		//webAction.click(olm);
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", olm);
		webAction.click(demo);
		webAction.click(systemSetup);
		webAction.click(systemDefLink);
		webAction.click(rolesLefNav);
		webAction.click(buttonAddNew);
		webAction.setText(roleName, role);
		webAction.setText(roleDescription, desc);
		//dropdown.selectByValue(skillCode, skill);
		dropdown.selectByIndex(skillCode, 0);
		webAction.click(saveRole);
		
		
		return false;
	}

	
	public boolean addRoleGroup(String roleGrup,String desc,String skill) throws Exception {
		//webAction.click(olm);
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", olm);
		
	//	webAction.waitUntilElementIsClickable(AddLeaveProfile);
		webAction.click(demo);
		webAction.click(systemSetup);
		webAction.click(systemDefLink);
		webAction.click(roleGroupLeftNav);
		
		webAction.setText(roleGroupName, roleGrup);
		webAction.click(moveAll);
		//dropdown.selectByValue(skillCode, skill);
		dropdown.selectByIndex(skillCode, 0);
		webAction.click(saveRoleGroup);
		
		
		return false;
	}
	
	public boolean addSkills(String skill,String desc,String seq,String rank) throws Exception {
		webAction.click(olm);
		webAction.click(demo);
		webAction.click(systemSetup);
		webAction.click(systemDefLink);
		webAction.click(skillLefNav);
		webAction.click(buttonoAddSkill);
		webAction.setText(skillCode_CreaeteSkill, skill);
		webAction.setText(skillCodeDescription, desc);
		webAction.setText(sequence, seq);
		webAction.setText(fixedRanking, rank);
		webAction.click(saveSkill);
		
		
		return false;
	}
	
	public boolean empProfileAdd(String a,String b,String c,String d,String e,String f,String g,String h) throws Exception {
	
		//Thread.sleep(500);
		
		Thread.sleep(3000);
		webAction.clickUsingJavaScript(olm);
		Thread.sleep(3000);
		//webAction.waitUntilElementIsClickable(olmLink);
		webAction.clickUsingJavaScript(olmLink);
		
		//webAction.wa
		Thread.sleep(500);
		webAction.clickUsingJavaScript(systemSetup);
		Thread.sleep(500);
		webAction.clickUsingJavaScript(employeeAdmin);
		Thread.sleep(500);
		webAction.clickUsingJavaScript(empProfile);
		Thread.sleep(500);
		webAction.clickUsingJavaScript(empAddEmp);
		Thread.sleep(500);
		webAction.setText(employeeNumber, a);
		
		webAction.setText(badgeNumber, b);
		webAction.setText(firstName, c);
		webAction.setText(lastName, d);
		webAction.setText(birthDate, e);
		webAction.setText(addressLine1, f);
		Thread.sleep(100);
		webAction.setText(postCode, g);
		Thread.sleep(100);
		webAction.setText(cityName, h);
		Thread.sleep(100);
		dropdown.selectByIndex(gender, 0);
		Thread.sleep(100);
		dropdown.selectByIndex(countryName, 0);
		Thread.sleep(100);
		dropdown.selectByIndex(employmentBasis, 0);
	//	dropdown.selectByIndex(payGroup, 1);
		dropdown.selectByIndex(scheduleRule, 0);
		
		
		dropdown.selectByIndex(payGroup, 1);
		//String test=dropdown.alertGettext();
		//System.out.println(test);
		//dropdown.selectByIndex(payGroup, 1);
		//Thread.sleep(2000);
		//dropdown.sele
		webAction.waitUntilElementIsClickable(saveEmployees);
		webAction.clickUsingJavaScript(saveEmployees);
	//	saveEmployee.click();
		Thread.sleep(2000);
		// String Expected="Employee Number [10021] already exists. Please choose another name.";
		//  String Ex="Employee Profile created successfully"; 
		  String Actual=successToast_Message.getText(); 
		  System.out.println(Actual);
		  Assert.assertTrue(Actual.contains("Profile created successfully")); 
		  System.out.println("testing completed");
		 		return true;
		
	}
	
	public boolean empProfileAddAlreadyExisting(String a,String b,String c,String d,String e,String f,String g,String h) throws Exception {
		webAction.click(olm);
		//webAction.click(demo);
		webAction.click(olmLink);

		
		webAction.click(systemSetup);
		webAction.click(employeeAdmin);
		webAction.click(empProfile);
		webAction.click(empAddEmp);
		webAction.setText(employeeNumber, a);
		
		webAction.setText(badgeNumber, b);
		webAction.setText(firstName, c);
		webAction.setText(lastName, d);
		webAction.setText(birthDate, e);
		webAction.setText(addressLine1, f);
		webAction.setText(postCode, g);
		webAction.setText(cityName, h);
		dropdown.selectByIndex(gender, 0);
		dropdown.selectByIndex(countryName, 0);
		dropdown.selectByIndex(employmentBasis, 1);
	//	dropdown.selectByIndex(payGroup, 1);
		dropdown.selectByIndex(scheduleRule, 0);
		
		
		dropdown.selectByIndex(payGroup, 1);
		//String test=dropdown.alertGettext();
		//System.out.println(test);
		//dropdown.selectByIndex(payGroup, 1);
		//Thread.sleep(2000);
		//dropdown.sele
		Thread.sleep(2000);
		webAction.waitUntilElementIsClickable(saveEmployees);
		webAction.clickUsingJavaScript(saveEmployees);
	//	saveEmployee.click();
		Thread.sleep(2000);
		
		  //String  Expected="Employee Number [10021] already exists. Please choose another name.";
		 // String Ex="Employee Profile created successfully"; 
		  String Actual=successToast_Message.getText(); 
		  System.out.println(Actual);
		  Assert.assertTrue(Actual.contains("already exists. Please choose another name"));
		 
		//
		return false;
		
	}
	
	public boolean empSearch(String a) throws Exception {
		//webAction.click(demo);
				webAction.click(olm);
				Thread.sleep(1000);
				webAction.click(olmLink);

				
				webAction.click(systemSetup);
				webAction.click(employeeAdmin);
				webAction.click(empProfile);
				
				Thread.sleep(5000);
				webAction.setText(searchEmp, a);
			//	Thread.sleep(10000);
				
				
				WebElement baseTable = driver.findElement(By.tagName("table"));
				//To find third row of table
				WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"emp-list\"]/tbody/tr"));
				String rowtext = tableRow.getText();
				System.out.println("Third row of table : "+rowtext);

				//to get 3rd row's 2nd column data
				WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"emp-list\"]/tbody/tr[1]/td[2]"));
				String valueIneed = cellIneed.getText();
				System.out.println("Cell value is : " + valueIneed); 
				
				
				  String expectdempid=empIdSearchResult.getText(); System.out.println(a);
				  System.out.println(expectdempid); Assert.assertEquals(a, expectdempid);
				 
		
		return false;
	}
	
	public boolean empSearchByName(String a) throws Exception {
		//webAction.click(demo);
				webAction.click(olm);
				Thread.sleep(1000);
				webAction.click(olmLink);

				
				webAction.click(systemSetup);
				webAction.click(employeeAdmin);
				webAction.click(empProfile);
				
				Thread.sleep(5000);
				webAction.setText(searchEmp, a);
				//Thread.sleep(10000);
				
				
				WebElement baseTable = driver.findElement(By.tagName("table"));
				//To find third row of table
				WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"emp-list\"]/tbody/tr"));
				String rowtext = tableRow.getText();
				System.out.println("Third row of table : "+rowtext);

				//to get 3rd row's 2nd column data
				WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"emp-list\"]/tbody/tr[1]/td[3]"));
				String valueIneed = cellIneed.getText();
				System.out.println("Cell value is : " + valueIneed); 
				
				
				  String expectdempid=empIdSearchResultName.getText(); System.out.println(a);
				  System.out.println(expectdempid); 
				  Assert.assertEquals(a, expectdempid);
				 
		
		return false;
	}
	
	
	public boolean empUpdate(String a,String b,String c,String d,String e,String f,String g,String h,String i,String j,String k,String l) throws Exception {
		//webAction.click(demo);
				webAction.click(olm);
				//Thread.sleep(1000);
				webAction.waitUntilElementIsClickable(olmLink);
				webAction.click(olmLink);

				
				webAction.click(systemSetup);
				webAction.click(employeeAdmin);
				webAction.click(empProfile);
				
				Thread.sleep(5000);
				webAction.setText(searchEmp, a);
				//Thread.sleep(10000);
				
				webAction.click(empProfileEdit);
				Thread.sleep(3000);
				
				//webAction.setText(employeeNumber, a);
				//webAction.setText(badgeNumber, b);
				webAction.setText(firstName, c);
				webAction.setText(lastName, d);
				webAction.clearText(birthDate);
				webAction.setText(birthDate, e);
				webAction.click(birthDate);
				birthDate.sendKeys(Keys.ENTER);
				webAction.setText(addressLine1, f);
				webAction.setText(postCode, g);
				webAction.setText(cityName, h);
				webAction.setText(state, i);
				Thread.sleep(100);
				dropdown.selectByIndex(gender, 1);
				dropdown.selectByIndex(countryName, 1);
				dropdown.selectByIndex(employmentBasis, 1);
			//	dropdown.selectByIndex(payGroup, 1);
				dropdown.selectByIndex(scheduleRule, 0);
				
				
				dropdown.selectByIndex(payGroup, 1);
				
				//Thread.sleep(10000);
				
				webAction.scrollUp();
				//webAction.waitUntilElementIsClickable(saveEmployees);
				//webAction.click(saveEmployees);
				webAction.clickUsingJavaScript(saveEmployees);
			//	saveEmployee.click();
				//Thread.sleep(2000);
				
				
			//	webAction.waitUntilElementIsVisible(successToast_Message);
				// String Actual=successToast_Message.getText(); 
				 // System.out.println(Actual);
				 //Assert.assertTrue(Actual.contains("updated successfully"));
				 
				 
		
		return false;
	}
	

	public boolean empUpdateDuplicate(String a,String b,String c,String d,String e,String f,String g,String h) throws Exception {
		//webAction.click(demo);
				webAction.click(olm);
				Thread.sleep(1000);
				webAction.click(olmLink);

				
				webAction.click(systemSetup);
				webAction.click(employeeAdmin);
				webAction.click(empProfile);
				
				Thread.sleep(5000);
				webAction.setText(searchEmp, a);
				//Thread.sleep(10000);
				
				webAction.click(empProfileEditDuplicate);
				Thread.sleep(3000);
				webAction.setText(employeeNumber, b);//new employee number from badgeNum
				webAction.setText(lastName, d);
				webAction.setText(birthDate, e);
				webAction.setText(addressLine1, f);
				webAction.setText(postCode, g);
				webAction.setText(cityName, h);
				dropdown.selectByIndex(gender, 0);
				dropdown.selectByIndex(countryName, 0);
				dropdown.selectByIndex(employmentBasis, 1);
			//	dropdown.selectByIndex(payGroup, 1);
				dropdown.selectByIndex(scheduleRule, 0);
				
				
				dropdown.selectByIndex(payGroup, 1);
				
				Thread.sleep(10000);
				webAction.waitUntilElementIsClickable(saveEmployees);
			
				//webAction.click(saveEmployees);
				webAction.clickUsingJavaScript(saveEmployees);
				
				
				
				 String Expected="Employee Number [10021] already exists. Please choose another name.";
				  String Ex="Employee Profile created successfully"; 
				  String Actual=successToast_Message.getText(); 
				  System.out.println(Actual);
				  Assert.assertTrue(Actual.contains("Profile created successfully")); 
				 
				 
		
		return false;
	}
	
	
	public boolean empAddContacts_Positive(String a,String b,String c,String d,String e,String f,String g,String h) throws Exception {
		//webAction.click(demo);
				webAction.click(olm);
				Thread.sleep(1000);
				webAction.click(olmLink);

				
				webAction.click(systemSetup);
				webAction.click(employeeAdmin);
				webAction.click(empProfile);
				
				Thread.sleep(5000);
				webAction.setText(searchEmp, a);
				//Thread.sleep(10000);
				
				webAction.click(empProfileEdit);
				Thread.sleep(3000);
				
				//webAction.click(contactsSubMenu);
				
				webAction.waitUntilElementIsClickable(contactsSubMenu);			
				//webAction.click(saveEmployees);
				webAction.clickUsingJavaScript(contactsSubMenu);
				
				webAction.click(contactsAdd);
				
				webAction.setText(contactName, e);
				
				webAction.click(saveContactButton);
				
			//	Thread.sleep(10000);
				//webAction.waitUntilElementIsClickable(saveEmployees);			
				//webAction.click(saveEmployees);
				//webAction.clickUsingJavaScript(saveEmployees);
				
				
				//  String Ex="Add New Contact - Success"; 
				  String Actual=successToast_Message.getText(); 
				  System.out.println(Actual);
				  Assert.assertTrue(Actual.contains("Add New Contact - Success")); 
				 
				 
		
		return false;
	}
	
	public boolean empAddContacts_Negative(String a,String b,String c,String d,String e,String f,String g,String h) throws Exception {
		//webAction.click(demo);
				webAction.click(olm);
				Thread.sleep(1000);
				webAction.click(olmLink);

				
				webAction.click(systemSetup);
				webAction.click(employeeAdmin);
				webAction.click(empProfile);
				
				Thread.sleep(5000);
				webAction.setText(searchEmp, a);
				//Thread.sleep(10000);
				
				webAction.click(empProfileEdit);
				Thread.sleep(3000);
				
				webAction.waitUntilElementIsClickable(contactsSubMenu);			
				//webAction.click(saveEmployees);
				webAction.clickUsingJavaScript(contactsSubMenu);
				webAction.clickUsingJavaScript(contactsAdd);
				
				webAction.setText(contactName, e);
				
				webAction.click(cancelContactButton);
				
				Thread.sleep(10000);
				webAction.waitUntilElementIsClickable(saveEmployees);			
				//webAction.click(saveEmployees);
				webAction.clickUsingJavaScript(saveEmployees);
				
				
				//  String Ex="Create Employee Profile - JiViews"; 
				  String Actual=driver.getTitle(); 
				  System.out.println(Actual);
				  Assert.assertTrue(Actual.contains("Employee Profile - JiViews")); 
		return false;
	}
	

	public boolean empAddexcludedSkills_Positive(String a,String b,String c,String d,String e,String f,String g,String h) throws Exception {
		//webAction.click(demo);
				webAction.click(olm);
				Thread.sleep(1000);
				webAction.click(olmLink);

				
				webAction.click(systemSetup);
				webAction.click(employeeAdmin);
				webAction.click(empProfile);
				
				Thread.sleep(5000);
				webAction.setText(searchEmp, a);
				//Thread.sleep(10000);
				
				webAction.click(empProfileEdit);
				//Thread.sleep(3000);
				
			//	webAction.click(excludedSkillsSubMenu);
				webAction.waitUntilElementIsVisible(excludedSkillsSubMenu);
				webAction.clickUsingJavaScript(excludedSkillsSubMenu);
				
				webAction.clickUsingJavaScript(addNewExcludedSkills);
				
				dropdown.selectByIndex(excludedSkillDesc, 0);
				
				
				webAction.setText(excludedSkillStartDate, f);
				webAction.setText(excludedSkillEndDate, g);
				
				webAction.click(saveExcludedSkill);
				
				//Thread.sleep(10000);
			//	webAction.waitUntilElementIsClickable(saveEmployees);			
				//webAction.click(saveEmployees);
				//webAction.clickUsingJavaScript(saveEmployees);
				
				
				//  String Ex="Add Excluded Skill - Success"; 
				webAction.waitUntilElementIsVisible(successToast_Message);
				  String Actual=successToast_Message.getText(); 
				  System.out.println(Actual);
				  Assert.assertTrue(Actual.contains("Add Excluded Skill - Success")); 
				  
				 
				 
		
		return false;
	}
	
	public boolean empAddexcludedSkills_Negative(String a,String b,String c,String d,String e,String f,String g,String h) throws Exception {
		Thread.sleep(500);
		webAction.clickUsingJavaScript(olm);
		Thread.sleep(1000);
		webAction.click(olmLink);

		
		webAction.click(systemSetup);
		webAction.click(employeeAdmin);
		webAction.click(empProfile);
		
		Thread.sleep(5000);
		webAction.setText(searchEmp, a);
		//Thread.sleep(10000);
		
		webAction.click(empProfileEdit);
		//Thread.sleep(3000);
	//	webAction.waitUntilElementIsClickable(excludedSkillsSubMenu);
		webAction.clickUsingJavaScript(excludedSkillsSubMenu);
	//	webAction.click(excludedSkillsSubMenu);
		webAction.clickUsingJavaScript(addNewExcludedSkills);
		
		dropdown.selectByIndex(excludedSkillDesc, 0);
		
		
		webAction.setText(excludedSkillStartDate, f);
		webAction.setText(excludedSkillEndDate, g);
				
				webAction.click(cancelExcludedSkill);
				
				//Thread.sleep(10000);
			//	webAction.waitUntilElementIsClickable(saveEmployees);			
				//webAction.click(saveEmployees);
				//webAction.clickUsingJavaScript(saveEmployees);
				
				
				//  String Ex="Add Excluded Skill - Success"; 
				
				//  String Ex="Create Employee Profile - JiViews"; 
				//  String Actual=driver.getTitle(); 
				 // System.out.println(Actual);
				  //Assert.assertTrue(Actual.contains("Employee Profile - JiViews")); 
				 
				 
		
		return false;
	}
	
	public boolean empAddRoles_Positive(String a,String b,String c,String d,String e,String f,String g,String h) throws Exception {
		//webAction.click(demo);
				webAction.click(olm);
				Thread.sleep(1000);
				webAction.click(olmLink);

				
				webAction.click(systemSetup);
				webAction.click(employeeAdmin);
				webAction.click(empProfile);
				
				Thread.sleep(5000);
				webAction.setText(searchEmp, a);
				//Thread.sleep(10000);
				
				webAction.click(empProfileEdit);
				Thread.sleep(3000);
				
				webAction.click(rolesSubMenu);
				dropdown.selectByIndex(primaryRole, 1);
				
				webAction.click(removeAllEmpProfile);
				webAction.click(moveAllEmpProfile);
				webAction.click(skillCodeEdit);
				webAction.click(saveSkillCompetencyDetails);
				
				Thread.sleep(5000);
			//	webAction.waitUntilElementIsClickable(saveEmployees);			
				//webAction.click(saveEmployees);
				//webAction.clickUsingJavaScript(saveEmployees);
				
				
				  String Ex="Update Skill Competency - Success"; 
				  String Actual=successToast_Message.getText(); 
				  System.out.println(Actual);
				  Assert.assertTrue(Actual.contains("Update Skill Competency - Success")); 
				 
				 
		
		return false;
	}
	
	
	public boolean empAddRoles_RemoveAllRoles(String a,String b,String c,String d,String e,String f,String g,String h) throws Exception {
		//webAction.click(demo);
				webAction.click(olm);
				Thread.sleep(1000);
				webAction.click(olmLink);

				
				webAction.click(systemSetup);
				webAction.click(employeeAdmin);
				webAction.click(empProfile);
				
				Thread.sleep(5000);
				webAction.setText(searchEmp, a);
				//Thread.sleep(10000);
				
				webAction.click(empProfileEdit);
			//	Thread.sleep(3000);
				webAction.waitUntilElementIsClickable(rolesSubMenu);
				webAction.clickUsingJavaScript(rolesSubMenu);
				dropdown.selectByIndex(primaryRole, 1);
				
				webAction.click(removeAllEmpProfile);
				webAction.click(moveAllEmpProfile);
				webAction.clickUsingJavaScript(removeAllEmpProfile);
			//	webAction.click(removeAllEmpProfile);
				webAction.scrollDown();
				webAction.clickUsingJavaScript(skillCodeEditCancel);
				//webAction.click(skillCodeEdit);
				webAction.scrollDown();
				webAction.waitUntilElementIsClickable(saveSkillCompetencyDetails);
				webAction.click(saveSkillCompetencyDetails);
				
				Thread.sleep(5000);
			//	webAction.waitUntilElementIsClickable(saveEmployees);			
				//webAction.click(saveEmployees);
				//webAction.clickUsingJavaScript(saveEmployees);
				
				
				  String Ex="Update Skill Competency - Success"; 
				  String Actual=successToast_Message.getText(); 
				  System.out.println(Actual);
				  Assert.assertTrue(Actual.contains("Update Skill Competency - Success")); 
				 
				 
		
		return false;
	}
	
	
	public boolean empAdd_security(String a,String b,String c,String d,String e,String f,String g,String h) throws Exception {
		//webAction.click(demo);
				Thread.sleep(500);
				webAction.clickUsingJavaScript(olm);
			//	webAction.click(olm);
				Thread.sleep(1000);
				webAction.click(olmLink);

				
				webAction.click(systemSetup);
				webAction.click(employeeAdmin);
				webAction.click(empProfile);
				
				Thread.sleep(5000);
				webAction.setText(searchEmp, a);
				//Thread.sleep(10000);
				
				webAction.click(empProfileEdit);
			
				//webAction.waitUntilElementIsClickable(securitySubMenu);
				Thread.sleep(5000);
				
				webAction.click(securitySubMenu);
				
			//	Actions action = new Actions(driver);
				//WebElement we = driver.findElement(By.xpath("//*[text()='Security']"));
				//action.moveToElement(we).click().build().perform();
				Thread.sleep(5000);
				//webAction.waitUntilElementIsVisible(addEmployeeOU);
				//webAction.click(addEmployeeOU);
				Actions actions2 = new Actions(driver);
				actions2.moveToElement(addEmployeeOU).click().build().perform();
		
				dropdown.selectByIndex(orgUnitName, 0);
				dropdown.selectByIndex(orgUnitName, 1);
			
   
		//	webAction.click(saveEmployeeOU);
				Thread.sleep(5000);
		//	webAction.clickUsingJavaScript(saveEmployeeOU);
				
				//saveEmployeeOU.sendKeys(Keys.ENTER);
			
				webAction.waitUntilElementIsVisible(saveEmployeeOU);
			
				
				 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", saveEmployeeOU);
			
			//	((JavascriptExecutor) driver).executeScript("var x= document.getElementsByClassName('btn btn-sm btn-outline-primary icon-btn mx-1 save')[0];"+"x.click();");
				
		//	Actions actions1 = new Actions(driver);
			//actions1.moveToElement(saveEmployeeOU).click().build().perform();
				
		
			//	Thread.sleep(2000);
				
			//	webAction.click(securitySubMenu);
				
			//	Actions actions = new Actions(driver);
				//actions.moveToElement(saveEmployees).click().build().perform();
				// ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", saveEmployees);
				// webAction.click(b);
				 //webAction.setText(birthDate, e);
			//	 webAction.clickUsingJavaScript(saveEmployees);
			
				//Actions actionssave = new Actions(driver);
				//actionssave.moveToElement(saveEmployees).click().build().perform();
				 webAction.waitUntilElementIsVisible(saveEmployees);
					
				 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", saveEmployees);
				
					Thread.sleep(2000);
					 webAction.clickUsingJavaScript(saveEmployees);
					 Thread.sleep(2000);
					System.out.println("testing");
				// webAction.clickUsingJavaScript(saveEmployees);
				  String Ex="Update Skill Competency - Success"; 
				  String Actual=successToast_Message.getText(); 
				  System.out.println(Actual);
				 Assert.assertTrue(Actual.contains("Employee Profile updated successfully")); 
				 
				 
		
		return false;
	}
	
	
	public boolean empAdd_ESSAdd(String a,String b,String c,String d,String e,String f,String g,String h) throws Exception {
		//webAction.click(demo);
				Thread.sleep(500);
				webAction.clickUsingJavaScript(olm);
				Thread.sleep(1000);
				webAction.click(olmLink);

				
				webAction.click(systemSetup);
				webAction.click(employeeAdmin);
				webAction.click(empProfile);
				
				Thread.sleep(5000);
				webAction.setText(searchEmp, a);
				//Thread.sleep(10000);
				
				webAction.click(empProfileEdit);
				Thread.sleep(3000);
				
				webAction.clickUsingJavaScript(ESSSubMenu);
				webAction.clickUsingJavaScript(AddLeaveProfile);
				Thread.sleep(200);
				dropdown.selectByIndex(empLeaveProfileName, 0);
				webAction.click(saveLeaveProfile);
				
				webAction.click(addEmpWorkflowRoute);
				dropdown.selectByIndex(workFlowModuleName, 0);
				dropdown.selectByIndex(workflowRouteName, 0);
				webAction.click(saveEmpWorkflowRoute);
				
				Thread.sleep(5000);
				webAction.waitUntilElementIsClickable(saveEmployees);			
				//webAction.click(saveEmployees);
				webAction.clickUsingJavaScript(saveEmployees);
				
				
				
				/*
				 * String Ex="Update Skill Competency - Success"; String
				 * Actual=successToast_Message.getText(); System.out.println(Actual);
				 * Assert.assertTrue(Actual.contains("Update Skill Competency - Success"));
				 */
				 
				 
		
		return false;
		//assertion not working in the application
	}
	
	
	public boolean empAdd_Misc(String a,String b,String c,String d,String e,String f,String g,String h) throws Exception {
		//webAction.click(demo);
				webAction.click(olm);
				Thread.sleep(1000);
				webAction.click(olmLink);

				
				webAction.click(systemSetup);
				webAction.click(employeeAdmin);
				webAction.click(empProfile);
				
				Thread.sleep(5000);
				webAction.setText(searchEmp, a);
				//Thread.sleep(10000);
				
				webAction.click(empProfileEdit);
				Thread.sleep(3000);
				
				webAction.clickUsingJavaScript(miscellaneous);
			//	miscellaneous.sendKeys(Keys.TAB);
				webAction.clickUsingJavaScript(chkMiscColumn);
				//webAction.click(chkMiscColumn);
				
				
				Thread.sleep(5000);
				webAction.waitUntilElementIsClickable(saveEmployees);			
				//webAction.click(saveEmployees);
				webAction.clickUsingJavaScript(saveEmployees);
				
				
				
				
				 
		
		return false;
		
	}
	
	public boolean empTermindate(String a) throws Exception {
		//webAction.click(demo);
		
		
		
		
				Thread.sleep(500);
				webAction.clickUsingJavaScript(olm);
				Thread.sleep(1000);
				webAction.click(olmLink);

				
				webAction.click(systemSetup);
				webAction.click(employeeAdmin);
				webAction.click(empProfile);
				
				Thread.sleep(5000);
				webAction.setText(searchEmp, a);
				//Thread.sleep(10000);
				
				webAction.click(empProfileEdit);
				Thread.sleep(3000);
				webAction.clickUsingJavaScript(disciplinary);
				Thread.sleep(3000);
				webAction.scrollDown();
				//webAction.scrollIntoeEement(chkEmployeeTerminated);
				
				webAction.click(chkEmployeeTerminated);
				webAction.click(yesOptionTerminated);
				
				List<WebElement> t =driver.findElements(By.xpath("//table[@class='table-condensed']/tbody/tr/td"));
				
				System.out.println("Date:"+cdate);
			
			      //list traversal
			      for (int k = 0; k<t.size(); k++) {
			         //check date
			         String dt = t.get(k).getText();
			         if (dt.equals(cdate)) {
			        	 webAction.clickUsingJavaScript( t.get(k));
			            //t.get(k).click();
			            break;
			         }
			      }
				//webAction.click(selectCurrentDate);
				webAction.setText(termindatedRemarks, "Testing Disciplinary");
				webAction.scrollUp();
				webAction.clickUsingJavaScript(desciplinarySave);
				Thread.sleep(5000);
				System.out.println("Testing");
				
				 
		
		return false;
		//assertion not working in the application
	}
	
}
	      
	
