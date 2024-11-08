package com.jivi.auto.driver;

import java.util.List;

import org.testng.TestNG;
import org.testng.collections.Lists;

import com.jivi.auto.reusablecomponents.GlobalVariables;
import com.jivi.auto.reusablecomponents.Initialize;
import com.jivi.auto.utilities.XmlTestSuiteGenerator;

public class JiviewsMainClass extends GlobalVariables {
	public static boolean bLoginStatus = false;
	public static String strID = System.getProperty("user.name");
	public static String rootFolderPath = System.getProperty("user.dir");
	public static String downloadPath = "c:/users/"+strID+"/Downloads/";	

	public static void main(String args[]) throws Exception {
		Initialize initial = new Initialize();
		initial.initializeObjects();
		XmlTestSuiteGenerator xmlTestSuiteGenerator = new XmlTestSuiteGenerator();
		xmlTestSuiteGenerator.generateTestNgXmlSuite();
		TestNG testng = new TestNG();
		List<String> suites = Lists.newArrayList();
		suites.add(workingDir + "/testng.xml");
		testng.setTestSuites(suites);
		testng.run();
		
		//Jivi solutions
	}
}

//updated 27-Dec-2012 test
//test
	