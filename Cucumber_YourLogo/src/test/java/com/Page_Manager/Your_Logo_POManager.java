package com.Page_Manager;

import org.openqa.selenium.WebDriver;

import com.pom.YourLogo.Casual_Mystore;
import com.pom.YourLogo.Dresses_Page;
import com.pom.YourLogo.My_Account;
import com.pom.YourLogo.My_Store;
import com.pom.YourLogo.Order_Booking;
import com.pom.YourLogo.Sign_Page;

public class Your_Logo_POManager {

	public WebDriver driver;
	private Sign_Page signin;
	private My_Store store;
	private My_Account account;
	private Casual_Mystore casual;
	private Order_Booking order;
	private Dresses_Page page;
	
	

	public Your_Logo_POManager(WebDriver driver) {
		this.driver = driver;
	}

	public Dresses_Page getPage() {
		if (page == null) {
			page = new Dresses_Page(driver);

		}
		return page;
	}

	

	public Sign_Page getSignin() {
		if (signin == null) {
			signin = new Sign_Page(driver);
		}
		return signin;

	}

	public My_Store getStore() {
		if (store == null) {
			store = new My_Store(driver);

		}
		return store;
	}

	public My_Account getAccount() {
		if (account == null) {
			account = new My_Account(driver);

		}
		return account;
	}

	public Casual_Mystore getCasual() {
		if (casual == null) {
			casual = new Casual_Mystore(driver);

		}
		return casual;
	}

	public Order_Booking getOrder() {
		if (order == null) {
			order = new Order_Booking(driver);

		}
		return order;
	}

}