package com.infosys.netBanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.infosys.netBanking.baseClass.BaseClass;
import com.infosys.netBanking.browseFactory.BrowseFactory;
import com.infosys.netBanking.pages.LoginPage;
import com.infosys.netBanking.utilities.ExcelUtility;
import com.infosys.netBanking.utilities.commonMethods;

public class TC_002 extends BaseClass {

	WebDriver driver;
	LoginPage loginpage;
	@BeforeMethod
	public void setUp() {
		
		driver=BrowseFactory.initaiteBrowser();
		loginpage=PageFactory.initElements(driver, LoginPage.class);
		logger.info("Url is getting opened");
	}
	
	
	@Test(dataProvider="Login Details",dataProviderClass=ExcelUtility.class)

	public void test_002(String userName,String password) {
		commonMethods.sendData(loginpage.txtUserName, driver,userName);
		commonMethods.sendData(loginpage.txtPassword, driver,password);
	    commonMethods.click(loginpage.loginButton, driver, "click on the item");
	   
		
	} 
	
	@AfterMethod
	public void tearDown() {
		
	//	commonMethods.closeBrowser(driver);
	}
}
