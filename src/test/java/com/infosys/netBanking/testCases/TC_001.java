package com.infosys.netBanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.infosys.netBanking.baseClass.BaseClass;
import com.infosys.netBanking.browseFactory.BrowseFactory;
import com.infosys.netBanking.pages.LoginPage;

import com.infosys.netBanking.utilities.commonMethods;

public class TC_001 extends BaseClass {

	WebDriver driver;
	LoginPage loginpage;
	@BeforeMethod
	public void setUp() {
		
		driver=BrowseFactory.initaiteBrowser();
		loginpage=PageFactory.initElements(driver, LoginPage.class);
		logger.info("Url is getting opened");
	}
	
	
	@Test()

	public void test_001() {
		commonMethods.sendData(loginpage.txtUserName, driver,"mngr243153");
		commonMethods.sendData(loginpage.txtPassword, driver,"EtUdUpu");
	    commonMethods.click(loginpage.loginButton, driver, "click on the item");
	    logger.info("user successfully Login");
	   commonMethods.getTitle(driver,"Guru99 Bank Manager HomePage");
		
	} 
	
	@AfterMethod
	public void tearDown() {
		
		commonMethods.closeBrowser(driver);
	}
}
