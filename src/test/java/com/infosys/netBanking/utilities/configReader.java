package com.infosys.netBanking.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configReader {
//E:\AutomationProject\Guru99BankingApplication\src\test\resources\PropertyData\ApplicationProperty.properties

  private static    Properties prop= new Properties();
   public static    FileInputStream fis= null;
  //Constructor is used to intialize the instance variables during object creation
public configReader() {
	try {
		fis=new FileInputStream(".\\src\\test\\resources\\PropertyData\\ApplicationProperty.properties");
	    prop.load(fis);
	   
	    
	
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
}
//will get the string value from the properties file

public  String getTestData(String element) {
	
	String value=prop.getProperty(element);
	return value;
	
}

public  int getintValue(String element) {
	String value=prop.getProperty(element);
	return Integer.parseInt(value);
	
}

}
