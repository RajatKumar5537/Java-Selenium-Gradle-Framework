package com.jivi.auto.utilities;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.jivi.auto.reusablecomponents.GlobalVariables;


public class LoadProperties extends GlobalVariables{

	public static Properties getProperties() {
		try {
			InputStream objFileReader = new FileInputStream(GlobalVariables.workingDir + "/src/test/resources/configuration/config.properties");
			Properties objProperties = new Properties();
			objProperties.load(objFileReader);
			return objProperties;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
