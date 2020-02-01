package com.infosys.netBanking.baseClass;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BaseClass {

	public static WebDriver driver=null;
	public static WebDriverWait wait;
	public static WebElement wElement;
	public static Logger logger;
	public static WebDriver getDriver() {
		logger=Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j.properties");
		
		if(driver==null) {
		return driver;
		}
		else {
			return driver;
		}
		
	}
	
	public static void setDriver(WebDriver driver) {
		BaseClass.driver = driver;
	}
	
	
}
