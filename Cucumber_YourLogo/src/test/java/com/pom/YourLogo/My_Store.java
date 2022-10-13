package com.pom.YourLogo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Store {
	public WebDriver driver;
	
	
	@FindBy(xpath="//a[@title='Log in to your customer account']")
	private WebElement Login;

	public My_Store(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogin() {
		return Login;
	}

}
