package com.pom.YourLogo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_Page {
	public WebDriver driver;
	
	@FindBy(xpath="//label//following-sibling::input[@name='email']")
	private WebElement email;
	
	@FindBy(xpath="//span//child::input")
	private WebElement password;
	
	@FindBy(xpath="//span//child::i[@class='icon-lock left']")
	private WebElement signin;

	public Sign_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignin() {
		return signin;
	}
	
	

}
