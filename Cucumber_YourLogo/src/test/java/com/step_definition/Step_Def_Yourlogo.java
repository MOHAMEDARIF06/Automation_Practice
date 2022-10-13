package com.step_definition;

import org.openqa.selenium.WebDriver;

import com.BaseClass.BaseClass_Methods;
import com.Page_Manager.Your_Logo_POManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Step_Def_Yourlogo extends BaseClass_Methods {

	public static WebDriver driver = BaseClass_Methods.driver;
	public static Your_Logo_POManager manager = new Your_Logo_POManager(driver);

	@Before
	public void Sign_In() {
		click(manager.getStore().getLogin());

		Timesout(3);
	}

	@After
	public void log_Out() {
		click(manager.getOrder().getLogout());
		driver.navigate().to("http://automationpractice.com/index.php");

	}

	@When("User Enter The {string} In The Email Address Textbox And It Changes To Green Colour With Tick Mark")
	public void user_enter_the_in_the_email_address_textbox_and_it_changes_to_green_colour_with_tick_mark(
			String email) {
		send_keys(manager.getSignin().getEmail(), "srtaarif2020@gmail.com");
	}

	@When("User Enter The {string} In The Password Textbox Field")
	public void user_enter_the_in_the_password_textbox_field(String password) {
		send_keys(manager.getSignin().getPassword(), "12345");

	}

	@Then("User Click The Sign In Button And It Navigates To The My Account Module In The My Store Application")
	public void user_click_the_sign_in_button_and_it_navigates_to_the_my_account_module_in_the_my_store_application() {
		click(manager.getSignin().getSignin());
	}

	@When("User Click The Casual Dresses In The Women Categories And It Navigates To The Casual Dresses Module")
	public void user_click_the_casual_dresses_in_the_women_categories_and_it_navigates_to_the_casual_dresses_module() {
		move_To_Element(driver, manager.getAccount().getWomen());
		click(manager.getAccount().getCasualdress());
	}

	@When("user Click The Image")
	public void user_click_the_image() {
		click(manager.getCasual().getImage());
	}

	@When("user Switch The Frame")
	public void user_switch_the_frame() {
		frame_by_element(manager.getCasual().getIframe());
	}

	@When("User Click The Add To Cart Button To Add The Dress In The Cart And It Shows Frame Module")
	public void user_click_the_add_to_cart_button_to_add_the_dress_in_the_cart_and_it_shows_frame_module() {
		click(manager.getCasual().getAddTocart());
	}

	@When("User Click The Proceed To Checkout Button In The Frame Field And It Navigates To The Order Module")
	public void user_click_the_proceed_to_checkout_button_in_the_frame_field_and_it_navigates_to_the_order_module() {
		Timesout(20);
		click(manager.getOrder().getCheckout());
	}

	@When("User Click The Proceed To Checkout Button And It Navigates To The Address Field")
	public void user_click_the_proceed_to_checkout_button_and_it_navigates_to_the_address_field() {
		click(manager.getOrder().getOrder());
	}

	@When("User Click The Proceed To Checkout Button And It Navigates To The Shipping Field")
	public void user_click_the_proceed_to_checkout_button_and_it_navigates_to_the_shipping_field() {
		click(manager.getOrder().getAddress());
	}

	@When("User Click The Checkbox In The Terms Of Services  Field")
	public void user_click_the_checkbox_in_the_terms_of_services_field() {
		click(manager.getOrder().getButton());
	}

	@When("User Click The Proceed To Checkout Button And It Navigates To The Payment Field")
	public void user_click_the_proceed_to_checkout_button_and_it_navigates_to_the_payment_field() {
		click(manager.getOrder().getConfirm());
	}

	@When("User Click The Pay By Check Button In The Payment Field To Order The Product")
	public void user_click_the_pay_by_check_button_in_the_payment_field_to_order_the_product() {
		click(manager.getOrder().getPay());
		Timesout(10);
	}

	@Then("User Click The I Confirm My Order Button To Successfully Order The Product")
	public void user_click_the_i_confirm_my_order_button_to_successfully_order_the_product() {
		click(manager.getOrder().getConfirmorder());
	}
	@When("User Click The Casual Dresses In The Dresses Categories And It Navigates To The Casual Dresses Module")
	public void user_click_the_casual_dresses_in_the_dresses_categories_and_it_navigates_to_the_casual_dresses_module() {
		move_To_Element(driver, manager.getPage().getDress());
		click(manager.getPage().getCasual());
	}
	@When("user Click The Image In The Dresses Module")
	public void user_click_the_image_in_the_dresses_module() {

		click(manager.getPage().getImage());
	}
	@When("user Switch The Frame To Another Frame")
	public void user_switch_the_frame_to_another_frame() {
		frame_by_element(manager.getPage().getFrame());
		
	}
	@When("User Click The Add To Cart Button To Add The Dress")
	public void user_click_the_add_to_cart_button_to_add_the_dress() {
		click(manager.getPage().getAddtocart());
	}
	@When("User Click The Proceed To Checkout Button In The Frame Field")
	public void user_click_the_proceed_to_checkout_button_in_the_frame_field() {
		Timesout(20);
		click(manager.getPage().getCheckout());
	}
	@When("User Click The Proceed To Check out Button And It Navigates To The Address Field")
	public void user_click_the_proceed_to_check_out_button_and_it_navigates_to_the_address_field() {
		click(manager.getPage().getSummary());
	}
	@When("User Click The Proceed To Check out Button And It Navigates To The Shipping Field")
	public void user_click_the_proceed_to_check_out_button_and_it_navigates_to_the_shipping_field() {
		click(manager.getPage().getSignin());
	}
	@When("User Click The Checkbox In The Terms Of Services  Field In The Shipping Field")
	public void user_click_the_checkbox_in_the_terms_of_services_field_in_the_shipping_field() {
		click(manager.getPage().getAddress());
	}
	@When("User Click The Proceed To Checkout Button And It Navigates To The Payment Module")
	public void user_click_the_proceed_to_checkout_button_and_it_navigates_to_the_payment_module() {
		click(manager.getPage().getShipping());
	}
	@When("User Click The Pay By Check Button In The Payment Field")
	public void user_click_the_pay_by_check_button_in_the_payment_field() {
		click(manager.getPage().getPayment());
	}
	@Then("User Click The I Confirm My Order Button To Successfully Order The Dress")
	public void user_click_the_i_confirm_my_order_button_to_successfully_order_the_dress() {
		click(manager.getPage().getMyorder());
	}




}
