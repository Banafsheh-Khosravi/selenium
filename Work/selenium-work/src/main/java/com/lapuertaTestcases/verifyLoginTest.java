package com.lapuertaTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.lapuerta.LoginPage;

import Helper.BrowserFactory;

public class verifyLoginTest {
	
	
	@Test
	public void checkValidUser(){
		//This will launch browser and specific url
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bani.khosravinia\\Desktop\\Work\\selenium-work\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = BrowserFactory.startBrowser("chrome", "https://staging_xvbnwi:EGS5ab8STy4B@michiganhispaniccollaborativeorg.stage./%22/login/");
		
		//create page object using page factory. if I pass LoginPage that will return page object of same class
		LoginPage log_page = PageFactory.initElements(driver, LoginPage.class); //page to initialize is LoginPage
		//initialize the members like driver.findElement()
		
		//call the method
		log_page.login_lapuerta("test", "123");
		driver.quit();
	
	}
	

}
