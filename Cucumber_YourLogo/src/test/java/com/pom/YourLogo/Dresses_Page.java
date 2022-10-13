package com.pom.YourLogo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses_Page {
	public WebDriver driver;

	@FindBy(xpath = "(//li//child::a[.='Dresses'])[2]")
	private WebElement dress;

	@FindBy(xpath = "//a[.='Casual Dresses']//following::a[.='Casual Dresses']")
	private WebElement casual;

	@FindBy(xpath = "//a//child::img[@title='Printed Dress']")
	private WebElement image;

	@FindBy(xpath = "//div//child::iframe")
	private WebElement frame;

	@FindBy(xpath = "//button//child::span[.='Add to cart']")
	private WebElement addtocart;

	@FindBy(xpath = "//a//child::span[normalize-space()='Proceed to checkout']")
	private WebElement checkout;

	@FindBy(xpath = "//a//child::span[.='Proceed to checkout']")
	private WebElement summary;

	@FindBy(xpath = "//button//child::span[.='Proceed to checkout']")
	private WebElement signin;

	@FindBy(xpath = "//span//child::input[@type='checkbox']")
	private WebElement address;

	@FindBy(xpath = "//button//child::span[normalize-space()='Proceed to checkout']")
	private WebElement shipping;

	public Dresses_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

	public WebElement getDress() {
		return dress;

	}

	public WebElement getCasual() {
		return casual;
	}

	public WebElement getImage() {
		return image;
	}

	public WebElement getFrame() {
		return frame;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getSummary() {
		return summary;
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getShipping() {
		return shipping;
	}

	public WebElement getPayment() {
		return payment;
	}

	public WebElement getMyorder() {
		return myorder;
	}

	public WebElement getLogout() {
		return logout;
	}

	@FindBy(xpath = "//p//child::a[@class='cheque']")
	private WebElement payment;

	@FindBy(xpath = "//button//child::span[.='I confirm my order']")
	private WebElement myorder;

	@FindBy(xpath = "//div//child::a[@class='logout']")
	private WebElement logout;

}
