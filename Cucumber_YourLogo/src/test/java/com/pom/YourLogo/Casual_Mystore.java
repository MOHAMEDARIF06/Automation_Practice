package com.pom.YourLogo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Casual_Mystore {
	
	public WebDriver driver;
	@FindBy(xpath="//a[@class='product_img_link']//child::img")
	private WebElement image;
	
	
	@FindBy(xpath="//div//child::iframe")
	private WebElement iframe;
	
	@FindBy(xpath="//button//child::span[.='Add to cart']")
	private WebElement addTocart;

	public Casual_Mystore(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
		
	}

	public WebElement getImage() {
		return image;
	}

	public WebElement getIframe() {
		return iframe;
	}

	public WebElement getAddTocart() {
		return addTocart;
	}
	
	
}


