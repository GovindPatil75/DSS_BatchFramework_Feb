package com.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {

	
	public static ExtentTest Test;
	public static void custom_Sendkeys(WebElement element,String value,String fieldname) {
		try {
		if(element.isEnabled()==true) {
			element.sendKeys(value);
			Test.log(Status.PASS, fieldname +"=value succfully send ="+value);
		}
		}catch(Exception e) {
			Test.log(Status.FAIL, e.getMessage());
			
		}
		
	}
	
	public static void custom_click(WebElement element,String fieldname) {
		
		try {
			element.click();
			Test.log(Status.PASS, "Clicked Succefully="+fieldname);
			
		}catch(Exception e) {
			Test.log(Status.FAIL, e.getMessage());
		
		}
	}
	
	public static void custom_handleDropDown(WebElement element,String text) {
		try {
		     Select select=new Select(element);
		     select.selectByVisibleText(text);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
}
