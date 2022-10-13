package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.BaseClass.BaseClass_Methods;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./Feature", glue = "com.step_definition", plugin = {"html:Reports/Yourlogo_Runner.html"})

public class YourLogo_Runner {
	public static WebDriver driver;

	@BeforeClass
	public static void set_Up() {
		driver = BaseClass_Methods.get_Browser("chrome");
		BaseClass_Methods.run_url("your_logo");

	}

	@AfterClass
	public static void tear_Down() {
		 driver.close();

	}

}
