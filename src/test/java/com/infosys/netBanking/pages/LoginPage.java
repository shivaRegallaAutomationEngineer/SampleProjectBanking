package com.infosys.netBanking.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
   WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath="//input[@name='uid']")
	public WebElement txtUserName;
	@FindBy(xpath="//input[@name='password']")
	public WebElement txtPassword;
	@FindBy(xpath="//input[@name='btnLogin']")
	public WebElement loginButton;
	
}
