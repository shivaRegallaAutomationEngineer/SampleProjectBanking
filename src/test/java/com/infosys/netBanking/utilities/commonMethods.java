package com.infosys.netBanking.utilities;

import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.infosys.netBanking.baseClass.BaseClass;



public class commonMethods extends BaseClass{
	public static WebDriverWait wait;
	public static WebElement wElement;
	public static WebElement elementToVisible(WebElement ele,WebDriver driver) {
		try { wait= new WebDriverWait(driver,30);
		 wElement=wait.until(ExpectedConditions.visibilityOf(ele));
		}
		catch(NoSuchElementException e) {
			e.printStackTrace();
		}
		return wElement;
		
	}
	
	public static boolean sendData(WebElement ele,WebDriver driver,String data) {
		elementToVisible(ele,driver);
		if(ele==null) {
			return false;
		}else {
			ele.sendKeys(data);
			return true;
		}
		
		
		
	}
	
	public static boolean click(WebElement ele,WebDriver driver,String data) {
		elementToVisible(ele,driver);
		if(ele==null) {
			return false;
		}else {
			ele.click();
			return true;
		}
		
		
		
	}
	
	public static void getTitle(WebDriver driver,String expectedTitle ) {
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
	     Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	
	public static void closeBrowser(WebDriver driver) {
		driver.close();
	}

	
	
	

	
	
}
