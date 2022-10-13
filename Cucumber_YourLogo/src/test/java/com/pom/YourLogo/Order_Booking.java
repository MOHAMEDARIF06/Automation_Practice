package com.pom.YourLogo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Booking {
	public WebDriver driver;
	
	@FindBy(xpath="//a//child::span[normalize-space()='Proceed to checkout']")
	private WebElement checkout;
	
	@FindBy(xpath="//a//child::span[.='Proceed to checkout']")
	private WebElement order;
	
	@FindBy(xpath="//button//child::span[.='Proceed to checkout']")
	private WebElement address;
	
	@FindBy(xpath="//span//child::input[@id='cgv']")
	private WebElement button;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement confirm;
	
	@FindBy(xpath="//p//child::a[@title='Pay by check.']")
	private WebElement pay;
	
	@FindBy(xpath="//button//child::span[.='I confirm my order']")
	private WebElement confirmorder;
	
	@FindBy(xpath="//div//child::a[@title='Log me out']")
	private WebElement logout;

	public Order_Booking(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
			
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getOrder() {
		return order;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getButton() {
		return button;
	}

	public WebElement getConfirm() {
		return confirm;
	}

	public WebElement getPay() {
		return pay;
	}

	public WebElement getConfirmorder() {
		return confirmorder;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	

}
