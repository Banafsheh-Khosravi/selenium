// Create all the locators
package com.lapuerta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;




public class LoginPage {
	WebDriver drive;

	//Constructor : ldriver comes from page factory. we will initialize to local driver
	public LoginPage (WebDriver ldriver) {
		this.drive = ldriver;

	}

	@FindBy(id = "username-1324")
	WebElement username;

	@FindBy(how = How.ID, using = "user_password-1324")
	WebElement password;

	@FindBy(how = How.ID, using = "um-submit-btn")
	// you can store all web element to cache memory
	// @CacheLookup
	WebElement signin;


	public void login_lapuerta(String uid, String pass) {
		username.sendKeys(uid);
		password.sendKeys(pass);
		signin.click();
	}

}
