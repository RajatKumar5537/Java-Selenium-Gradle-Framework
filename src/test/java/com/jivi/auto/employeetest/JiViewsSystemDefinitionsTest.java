package com.jivi.auto.employeetest;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.jivi.auto.employeepages.JiViewsEmployeeAdministration;
import com.jivi.auto.pageobjectutils.FrameWindowHandler;
import com.jivi.auto.pageobjectutils.POMCommon;
import com.jivi.auto.pageobjectutils.WebElementKeys;
import com.jivi.auto.utilities.BaseTest;


public class JiViewsSystemDefinitionsTest extends BaseTest {
	
	
	JiViewsEmployeeAdministration jiviewsHomePage;
	POMCommon pomCommon;
	WebElementKeys webAction = new WebElementKeys();
	FrameWindowHandler windowHandler = new FrameWindowHandler();
	//JiViewsEmployeeTest emptest= new JiViewsEmployeeTest();
	
	Faker faker = new Faker();

	String name = faker.name().fullName();
	String firstName = faker.name().firstName();
	String lastName = faker.name().lastName(); 
	String streetAddress = faker.address().streetAddress(); 
	public String publicempNum=faker.numerify("10######");
	
	
	@FindBy(xpath="//*[@class='toast-message']")
	WebElement successToast_Message;
	
	@FindBy(xpath="//*[@id=\"emp-list_filter\"]//input")
	WebElement searchEmp;
	
	@FindBy(xpath="(//button[@type='button'])[5]")
	WebElement empProfileEdit;
	
	
	
	@FindBy(id="txtNewPassword")
	WebElement newPasswordOne;
	
	@FindBy(id="txtConfirmPassword")
	WebElement newConfirmPassword;
	
	@FindBy(id="btnSavePassword")
	WebElement savePassword;
	
	@FindBy(xpath="//*[@id='dvOrgUnitDropdown']/a/i")
	WebElement olm;
	
	@FindBy(xpath="//*[@id='dvGlobalOrganizationUnitTreeView']/ul/li[4]")
	WebElement olmLink;
	
	@FindBy(xpath = "//*[@id='lblSelectedParent']")
	WebElement systemSetup;
	
	@FindBy(xpath="//*[text()='Employee Administration']")
	WebElement employeeAdmin;
	
	@FindBy(id="346")
	WebElement empProfile;
	
	
	@Test
	public void VerifyLogin() throws Exception {
		
		System.out.println("testing login");
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
		jiviewsHomePage.Login(userId, loginpwd);
		String homeAssert=driver.getTitle();
		System.out.println(homeAssert);
		Assert.assertEquals(homeAssert, "Login - JIVIEWS");
		webAction.waitForPageLoad(2000);
	
		
	}
	
	@Test
	public void VerifyRolesAdd() throws Exception {
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
		String rl=dataTable.get("Role");
		//String name = faker.name().fullName();
		//String rd = faker.buffy().quotes();
		//System.out.println(rd);
		String rd=dataTable.get("RoleDesc");
		String sk=dataTable.get("Skill");
	
		jiviewsHomePage.Login(userId, loginpwd);
		webAction.waitForPageLoad(2000);
		jiviewsHomePage.addRoles(rl, rd, sk);
		//jiviewsRoles.addRoles(rl, rd, sk);
	
		
	}
	
	@Test
	public void VerifySkillAdd() throws Exception {
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
		String sk=dataTable.get("Skill");
		String de=dataTable.get("SkillDesc");
		String se=dataTable.get("Seq");
		String ran=dataTable.get("FixedRanking");
		jiviewsHomePage.Login(userId, loginpwd);
		webAction.waitForPageLoad(2000);
		jiviewsHomePage.addSkill(sk, de, se, ran);
		//jiviewsSkills.addSkill(sk, de, se, ran);
	
		
	}
	
	@Test
	public void VerifyEmpCategory() throws Exception {
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
		jiviewsHomePage.Login(userId, loginpwd);
	//	webAction.waitForPageLoad(2000);
		jiviewsHomePage.empCategory();
		//jiviewsSystemDef.empCategory();
		
		
	}
	
	@Test
	public void VerifyEmpAdd() throws Exception {
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
	//	String empid=dataTable.get("EmpId");
		//String empid = faker.idNumber().invalid();
		
		String empid=faker.numerify("99#####");
		System.out.println(empid);
		String desc=dataTable.get("EmpDesc");
		String sequen=dataTable.get("Sequence");
		jiviewsHomePage.Login(userId, loginpwd);
		webAction.waitForPageLoad(2000);
		jiviewsHomePage.empAdd(empid, desc, sequen);
		//jiviewsSystemDef.empAdd(empid, desc, sequen);
		
		
		
	}

	@Test
	public void VerifyTesting() throws Exception {
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		//JiViewsEmployee jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployee.class);
	//	String userId=dataTable.get("UserId");
		//String loginpwd=dataTable.get("pwd");
		System.out.println("testing");
		//jiviewsSystemDef.empAdd(empid, desc, sequen);
		
		
		
	}
	
	@Test
	public void VerifyEmpAddinEmpProfile() throws Exception {
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
		//String empNum=dataTable.get("EmpId");
		//String empNum = faker.idNumber().invalid();
		
		System.out.println(publicempNum);
		String badgeNum=dataTable.get("EmpDesc");
		String firstN=dataTable.get("Sequence");
		String lastN=dataTable.get("Skill");
		String birthDate=dataTable.get("SkillDesc");
		//String emppBasis=dataTable.get("Seq");
		String address1=dataTable.get("FixedRanking");
		String address2=dataTable.get("Sequence");
		String post=dataTable.get("Role");
		String city=dataTable.get("RoleDesc");
	//	String country=dataTable.get("Skills");
		//String sRule=dataTable.get("SRule");
		//String pGroup=dataTable.get("PayGroup");
		jiviewsHomePage.Login(userId, loginpwd);
		webAction.waitForPageLoad(2000);
		jiviewsHomePage.empProfileAdd(publicempNum,badgeNum,firstN,lastN,birthDate,address1,post,city);
		//jiviewsSystemDef.empAdd(empid, desc, sequen);
		
		//return empNum;
		
	}
	
	//public String empNumber= emptest.VerifyEmpAddinEmpProfile();
	
	@Test
	public void VerifyEmpAddinEmpProfileAlreadyExist() throws Exception {
		
		
		
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
		//String empNum=dataTable.get("EmpId");
		String badgeNum = faker.idNumber().invalid();
		System.out.println(badgeNum);
		
		//String badgeNum=dataTable.get("EmpDesc");
		String firstN=dataTable.get("Sequence");
		String lastN=dataTable.get("Skill");
		String birthDate=dataTable.get("SkillDesc");
		//String emppBasis=dataTable.get("Seq");
		String address1=dataTable.get("FixedRanking");
		String address2=dataTable.get("Sequence");
		String post=dataTable.get("Role");
		String city=dataTable.get("RoleDesc");
	//	String country=dataTable.get("Skills");
		//String sRule=dataTable.get("SRule");
		//String pGroup=dataTable.get("PayGroup");
		jiviewsHomePage.Login(userId, loginpwd);
		webAction.waitForPageLoad(2000);
		jiviewsHomePage.empProfileAddAlreadyExisting(publicempNum,badgeNum,firstN,lastN,birthDate,address1,post,city);
		//jiviewsSystemDef.empAdd(empid, desc, sequen);
		
		
	}
	
	@Test
	public void VerifEmpIDSerach() throws Exception {
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
		//String empNum=dataTable.get("EmpId");
		
		jiviewsHomePage.Login(userId, loginpwd);
		//String empNum= VerifyEmpAddinEmpProfile();
		System.out.println(publicempNum);
		jiviewsHomePage.empSearch(publicempNum);
		
	}
	
	
	@Test
	public void VerifEmpNameSearch() throws Exception {
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
		String empNum=dataTable.get("EmpId");
		jiviewsHomePage.Login(userId, loginpwd);
		jiviewsHomePage.empSearchByName(empNum);
		
		
		
		
		
	}
	
	@Test
	public void VerifyEmpUpdate() throws Exception {
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
		String empNum=dataTable.get("EmpId");
		
		
		String badgeNum = faker.idNumber().invalid();
		System.out.println(badgeNum);
		
		
		//String badgeNum=dataTable.get("EmpDesc");
		String firstN=dataTable.get("Sequence");
		String lastN=dataTable.get("Skill");
		String birthDate=dataTable.get("SkillDesc");
		//String emppBasis=dataTable.get("Seq");
	//	String address1=dataTable.get("FixedRanking");
		String address1 = faker.address().streetAddress();
	//	String address2=dataTable.get("Sequence");
		String post=dataTable.get("Role");
		String city=dataTable.get("RoleDesc");
		String state = faker.address().state();
		
		String country=dataTable.get("Skills");
		String sRule=dataTable.get("SRule");
		String pGroup=dataTable.get("PayGroup");
		jiviewsHomePage.Login(userId, loginpwd);
		webAction.waitForPageLoad(2000);
		jiviewsHomePage.empUpdate(empNum,badgeNum,firstN,lastN,birthDate,address1,post,city,state,country,sRule,pGroup);
		//jiviewsSystemDef.empAdd(empid, desc, sequen);
		
		
	}
	
	@Test
	public void VerifyEmpUpdateDuplicate() throws Exception {
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
		String empNum=dataTable.get("EmpId");
		
		
		
		//String badgeNum=dataTable.get("EmpDesc");
		String badgeNum=faker.idNumber().valid();
		System.out.println(badgeNum);//new employee code
		
		String firstN=dataTable.get("Sequence");
		String lastN=dataTable.get("Skill");
		String birthDate=dataTable.get("SkillDesc");
		//String emppBasis=dataTable.get("Seq");
		String address1=dataTable.get("FixedRanking");
		//String address2=dataTable.get("Sequence");
		String post=dataTable.get("Role");
		String city=dataTable.get("RoleDesc");
	//	String country=dataTable.get("Skills");
		//String sRule=dataTable.get("SRule");
		//String pGroup=dataTable.get("PayGroup");
		jiviewsHomePage.Login(userId, loginpwd);
		webAction.waitForPageLoad(2000);
		jiviewsHomePage.empUpdateDuplicate(empNum,badgeNum,firstN,lastN,birthDate,address1,post,city);
		//jiviewsSystemDef.empAdd(empid, desc, sequen);
		
		
	}
	
	
	@Test
	public void VerifyEmpUpdateContactsPositive() throws Exception {
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
		String empNum=dataTable.get("EmpId");
		
		
		
		String badgeNum=dataTable.get("EmpDesc");
		String firstN=dataTable.get("Sequence");
		String lastN=dataTable.get("Skill");
		String birthDate=dataTable.get("SkillDesc");
		//String emppBasis=dataTable.get("Seq");
		String address1=dataTable.get("FixedRanking");
	//	String address2=dataTable.get("Sequence");
		String post=dataTable.get("Role");
		String city=dataTable.get("RoleDesc");
	//	String country=dataTable.get("Skills");
		//String sRule=dataTable.get("SRule");
		//String pGroup=dataTable.get("PayGroup");
		jiviewsHomePage.Login(userId, loginpwd);
		webAction.waitForPageLoad(2000);
		jiviewsHomePage.empAddContacts_Positive(empNum,badgeNum,firstN,lastN,birthDate,address1,post,city);
		//jiviewsSystemDef.empAdd(empid, desc, sequen);
		
		
	}
	
	
	@Test
	public void VerifyEmpUpdateContactsNegative() throws Exception {
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
		String empNum=dataTable.get("EmpId");
		
		
		
		String badgeNum=dataTable.get("EmpDesc");
		String firstN=dataTable.get("Sequence");
		String lastN=dataTable.get("Skill");
		String birthDate=dataTable.get("SkillDesc");
		//String emppBasis=dataTable.get("Seq");
		String address1=dataTable.get("FixedRanking");
		String address2=dataTable.get("Sequence");
		String post=dataTable.get("Role");
		String city=dataTable.get("RoleDesc");
	//	String country=dataTable.get("Skills");
		//String sRule=dataTable.get("SRule");
		//String pGroup=dataTable.get("PayGroup");
		jiviewsHomePage.Login(userId, loginpwd);
		webAction.waitForPageLoad(2000);
		jiviewsHomePage.empAddContacts_Negative(empNum,badgeNum,firstN,lastN,birthDate,address1,post,city);
		//jiviewsSystemDef.empAdd(empid, desc, sequen);
		
		
	}
	
	
	@Test
	public void VerifyEmpUpdateExcludedSkillsPositive() throws Exception {
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
		String empNum=dataTable.get("EmpId");
		
		
		
		String badgeNum=dataTable.get("EmpDesc");
		String firstN=dataTable.get("Sequence");
		String lastN=dataTable.get("Skill");
		String birthDate=dataTable.get("SkillDesc");
		//String emppBasis=dataTable.get("Seq");
		String address1=dataTable.get("FixedRanking");
		String address2=dataTable.get("Sequence");
		String post=dataTable.get("Role");
		String city=dataTable.get("RoleDesc");
	//	String country=dataTable.get("Skills");
		//String sRule=dataTable.get("SRule");
		//String pGroup=dataTable.get("PayGroup");
		jiviewsHomePage.Login(userId, loginpwd);
		webAction.waitForPageLoad(2000);
		jiviewsHomePage.empAddexcludedSkills_Positive(empNum,badgeNum,firstN,lastN,birthDate,address1,post,city);
		//jiviewsSystemDef.empAdd(empid, desc, sequen);
		
		
	}
	
	@Test
	public void VerifyEmpUpdateExcludedSkillsNegative() throws Exception {
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
		String empNum=dataTable.get("EmpId");
		
		
		
		String badgeNum=dataTable.get("EmpDesc");
		String firstN=dataTable.get("Sequence");
		String lastN=dataTable.get("Skill");
		String birthDate=dataTable.get("SkillDesc");
		//String emppBasis=dataTable.get("Seq");
		String address1=dataTable.get("FixedRanking");
		String address2=dataTable.get("Sequence");
		String post=dataTable.get("Role");
		String city=dataTable.get("RoleDesc");
	//	String country=dataTable.get("Skills");
		//String sRule=dataTable.get("SRule");
		//String pGroup=dataTable.get("PayGroup");
		jiviewsHomePage.Login(userId, loginpwd);
		webAction.waitForPageLoad(2000);
		jiviewsHomePage.empAddexcludedSkills_Negative(empNum,badgeNum,firstN,lastN,birthDate,address1,post,city);
		//jiviewsSystemDef.empAdd(empid, desc, sequen);
		
		
	}
	
	@Test
	public void VerifyEmpUpdateAddRolesPositive() throws Exception {
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
		String empNum=dataTable.get("EmpId");
		
		
		
		String badgeNum=dataTable.get("EmpDesc");
		String firstN=dataTable.get("Sequence");
		String lastN=dataTable.get("Skill");
		String birthDate=dataTable.get("SkillDesc");
		//String emppBasis=dataTable.get("Seq");
		String address1=dataTable.get("FixedRanking");
		String address2=dataTable.get("Sequence");
		String post=dataTable.get("Role");
		String city=dataTable.get("RoleDesc");
	//	String country=dataTable.get("Skills");
		//String sRule=dataTable.get("SRule");
		//String pGroup=dataTable.get("PayGroup");
		jiviewsHomePage.Login(userId, loginpwd);
		webAction.waitForPageLoad(2000);
		jiviewsHomePage.empAddexcludedSkills_Negative(empNum,badgeNum,firstN,lastN,birthDate,address1,post,city);
		//jiviewsSystemDef.empAdd(empid, desc, sequen);
		
		
	}
	
	@Test
	public void VerifyEmpUpdateAddRolesNegative() throws Exception {
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
		String empNum=dataTable.get("EmpId");
		
		
		
		String badgeNum=dataTable.get("EmpDesc");
		String firstN=dataTable.get("Sequence");
		String lastN=dataTable.get("Skill");
		String birthDate=dataTable.get("SkillDesc");
		//String emppBasis=dataTable.get("Seq");
		String address1=dataTable.get("FixedRanking");
		String address2=dataTable.get("Sequence");
		String post=dataTable.get("Role");
		String city=dataTable.get("RoleDesc");
	//	String country=dataTable.get("Skills");
		//String sRule=dataTable.get("SRule");
		//String pGroup=dataTable.get("PayGroup");
		jiviewsHomePage.Login(userId, loginpwd);
		webAction.waitForPageLoad(2000);
		jiviewsHomePage.empAddRoles_RemoveAllRoles(empNum,badgeNum,firstN,lastN,birthDate,address1,post,city);
		//jiviewsSystemDef.empAdd(empid, desc, sequen);
		
		
	}
	
	@Test
	public void VerifyEmpUpdateSecurity() throws Exception {
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
		String empNum=dataTable.get("EmpId");
		
		
		
		String badgeNum=dataTable.get("EmpDesc");
		String firstN=dataTable.get("Sequence");
		String lastN=dataTable.get("Skill");
		String birthDate=dataTable.get("SkillDesc");
		//String emppBasis=dataTable.get("Seq");
		String address1=dataTable.get("FixedRanking");
		String address2=dataTable.get("Sequence");
		String post=dataTable.get("Role");
		String city=dataTable.get("RoleDesc");
	//	String country=dataTable.get("Skills");
		//String sRule=dataTable.get("SRule");
		//String pGroup=dataTable.get("PayGroup");
		jiviewsHomePage.Login(userId, loginpwd);
		webAction.waitForPageLoad(2000);
		jiviewsHomePage.empAdd_security(empNum,badgeNum,firstN,lastN,birthDate,address1,post,city);
		//jiviewsSystemDef.empAdd(empid, desc, sequen);
		
		
	}
	
	
	@Test
	public void VerifyEmpUpdateESS() throws Exception {
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
		String empNum=dataTable.get("EmpId");
		
		
		
		String badgeNum=dataTable.get("EmpDesc");
		String firstN=dataTable.get("Sequence");
		String lastN=dataTable.get("Skill");
		String birthDate=dataTable.get("SkillDesc");
		//String emppBasis=dataTable.get("Seq");
		String address1=dataTable.get("FixedRanking");
		String address2=dataTable.get("Sequence");
		String post=dataTable.get("Role");
		String city=dataTable.get("RoleDesc");
	//	String country=dataTable.get("Skills");
		//String sRule=dataTable.get("SRule");
		//String pGroup=dataTable.get("PayGroup");
		jiviewsHomePage.Login(userId, loginpwd);
		webAction.waitForPageLoad(2000);
		jiviewsHomePage.empAdd_ESSAdd(empNum,badgeNum,firstN,lastN,birthDate,address1,post,city);
		//jiviewsSystemDef.empAdd(empid, desc, sequen);
		
		
	}
	
	
	@Test
	public void VerifyEmpUpdateMisc() throws Exception {
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
		String empNum=dataTable.get("EmpId");
		
		
		
		String badgeNum=dataTable.get("EmpDesc");
		String firstN=dataTable.get("Sequence");
		String lastN=dataTable.get("Skill");
		String birthDate=dataTable.get("SkillDesc");
		//String emppBasis=dataTable.get("Seq");
		String address1=dataTable.get("FixedRanking");
		String address2=dataTable.get("Sequence");
		String post=dataTable.get("Role");
		String city=dataTable.get("RoleDesc");
	//	String country=dataTable.get("Skills");
		//String sRule=dataTable.get("SRule");
		//String pGroup=dataTable.get("PayGroup");
		jiviewsHomePage.Login(userId, loginpwd);
		webAction.waitForPageLoad(2000);
		jiviewsHomePage.empAdd_Misc(empNum,badgeNum,firstN,lastN,birthDate,address1,post,city);
		//jiviewsSystemDef.empAdd(empid, desc, sequen);
		
		
	}
	
	@Test
	public void VerifyLoginwithNewEmployee() throws Exception {
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
	//	String userId=dataTable.get("UserId");
		//String loginpwd=dataTable.get("pwd");
		String loginpwd="Emp"+publicempNum+"$1";
		System.out.println(loginpwd);
		jiviewsHomePage.Login(publicempNum, loginpwd);
		String homeAssert=driver.getTitle();
		System.out.println(homeAssert);
		Assert.assertEquals(homeAssert, "Login - JIVIEWS");
		webAction.waitForPageLoad(2000);
		Thread.sleep(5000);
	
		
	}	
	
	@Test
	public void VerifyTerminateAndLoginwithNewEmployee() throws Exception {
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
	//	String userId=dataTable.get("UserId");
		//String loginpwd=dataTable.get("pwd");
		
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
		jiviewsHomePage.Login(userId, loginpwd);
		
		
		
		
		Thread.sleep(2000);
		
		
		
		//webAction.setText(newPasswordOne, "AdminDEMO$1");
		//webAction.setText(newConfirmPassword, "AdminDEMO$1");
		
		//String loginpwdnew="AdminDEMO$1";
		//jiviewsHomePage.Login(publicempNum, loginpwdnew);
		String tes="10143417";
		jiviewsHomePage.empTermindate(tes);
		
			
		
//		String loginpwds="Emp"+publicempNum+"$1";
//		System.out.println(loginpwd);
	//	jiviewsHomePage.Login(publicempNum, loginpwds);
		
		
	
		
	}	
	
	@Test
	public void VerifyLoginwTermindatedEmp() throws Exception {
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
	//	String userId=dataTable.get("UserId");
		//String loginpwd=dataTable.get("pwd");
		
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
		jiviewsHomePage.Login(userId, loginpwd);
		
		
		
		
		Thread.sleep(2000);
		
		
		
		//webAction.setText(newPasswordOne, "AdminDEMO$1");
		//webAction.setText(newConfirmPassword, "AdminDEMO$1");
		
		//String loginpwdnew="AdminDEMO$1";
		//jiviewsHomePage.Login(publicempNum, loginpwdnew);
		String tes="10143417";
		jiviewsHomePage.empTermindate(tes);
		
			
		
	//	String loginpwds="Emp"+publicempNum+"$1";
		//System.out.println(loginpwd);
		//jiviewsHomePage.Login(publicempNum, loginpwds);
		
		
	
		
	}	
	
	@Test
	public void VerifyEmpProCreationFiveEmp() throws Exception {
		
		
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		JiViewsEmployeeAdministration jiviewsHomePage=PageFactory.initElements(driver, JiViewsEmployeeAdministration.class);
		String userId=dataTable.get("UserId");
		String loginpwd=dataTable.get("pwd");
		//String empNum=dataTable.get("EmpId");
		//String empNum = faker.idNumber().invalid();
		
		String badgeNum=dataTable.get("EmpDesc");
		String firstN=dataTable.get("Sequence");
		String lastN=dataTable.get("Skill");
		String birthDate=dataTable.get("SkillDesc");
		//String emppBasis=dataTable.get("Seq");
		String address1=dataTable.get("FixedRanking");
		String address2=dataTable.get("Sequence");
		String post=dataTable.get("Role");
		String city=dataTable.get("RoleDesc");
	//	String country=dataTable.get("Skills");
		//String sRule=dataTable.get("SRule");
		//String pGroup=dataTable.get("PayGroup");
		jiviewsHomePage.Login(userId, loginpwd);
		//webAction.waitForPageLoad(2000);
		Thread.sleep(10000);
		String publicempN1=faker.numerify("10######");
		System.out.println("Employee Number One : "+publicempN1);
		NumberOne=publicempN1;
		
		//empArray.add(publicempN1);
		jiviewsHomePage.empProfileAdd(publicempN1,badgeNum,firstN,lastN,birthDate,address1,post,city);
		
				//jiviewsSystemDef.empAdd(empid,
		//webAction.waitForPageLoad(2000);
		Thread.sleep(10000);
		String publicempN2=faker.numerify("10######");
		System.out.println("Employee Number Two : "+publicempN2);
		NumberTwo=publicempN2;
		jiviewsHomePage.empProfileAdd(publicempN2,badgeNum,firstN,lastN,birthDate,address1,post,city);
		
	//	webAction.waitForPageLoad(2000);
		Thread.sleep(10000);
		String publicempN3=faker.numerify("10######");
		System.out.println("Employee Number Three : "+publicempN3);
		NumberThree=publicempN3;
		jiviewsHomePage.empProfileAdd(publicempN3,badgeNum,firstN,lastN,birthDate,address1,post,city);
		
		
		//webAction.waitForPageLoad(2000);
		Thread.sleep(10000);
		String publicempN4=faker.numerify("10######");
		System.out.println("Employee Number Four : "+publicempN4);
		NumberFour=publicempN4;
		jiviewsHomePage.empProfileAdd(publicempN4,badgeNum,firstN,lastN,birthDate,address1,post,city);
		
	//	webAction.waitForPageLoad(2000);
		Thread.sleep(10000);
		String publicempN5=faker.numerify("10######");
		System.out.println("Employee Number Five : "+publicempN5);
		NumberFive=publicempN5;
		jiviewsHomePage.empProfileAdd(publicempN5,badgeNum,firstN,lastN,birthDate,address1,post,city);
		Thread.sleep(1000);
		
	}	
	
}
