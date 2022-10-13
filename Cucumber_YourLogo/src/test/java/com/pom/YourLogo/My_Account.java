package com.pom.YourLogo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Account {
	public WebDriver driver;
	
	@FindBy(xpath="//ul/preceding-sibling::a[.='Women']")
	private WebElement women;
	
	@FindBy(xpath="//a[.='Casual Dresses']//preceding::a[.='Casual Dresses']")
	private WebElement casualdress;

	public My_Account(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getCasualdress() {
		return casualdress;
	}
	
	

}
