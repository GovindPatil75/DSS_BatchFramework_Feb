package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {

	// Encapsulation =data hiding+Abstraction
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement txt_email;
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement txt_password;
	
	@FindBy(how=How.XPATH,using="//button[@id='loginbutton']")
	private WebElement btn_login;

	public LoginPom(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getTxt_email() {
		return txt_email;
	}

		public WebElement getTxt_password() {
		return txt_password;
	}
	public WebElement getBtn_login() {
		return btn_login;
	}	
}
