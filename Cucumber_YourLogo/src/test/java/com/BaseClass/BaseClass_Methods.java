package com.BaseClass;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass_Methods {

	public static WebDriver driver;

	public static WebDriver get_Browser(String browser_Type) {
		if (browser_Type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser_Type.equalsIgnoreCase("edge")) {
			System.out.println("edge location");

		}
		driver.manage().window().maximize();
		return driver;

	}

	public static void run_url(String get_url) {
		if (get_url.equalsIgnoreCase("adactine")) {
			driver.get("https://adactinhotelapp.com/");
		} else if (get_url.equalsIgnoreCase("your_logo")) {
			driver.get("http://automationpractice.com/index.php");
		}

	}

	public static String get_title() {
		String title = driver.getTitle();
		return title;

	}

	public static String get_url() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		return currentUrl;

	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void send_keys(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void clear(WebElement element) {
		element.clear();

	}

	public static String get_text(WebElement element) {
		String text = element.getText();
		System.out.println(text);
		return text;

	}

	public static String get_Tagname(WebElement element) {
		String tagName = element.getTagName();
		System.out.println(tagName);
		return tagName;

	}

	public static Point get_location(WebElement element) {
		Point location = element.getLocation();
		System.out.println(location);
		return location;
	}

	public static Dimension get_size(WebElement element) {
		Dimension size = element.getSize();
		System.out.println(size);
		return size;
	}

	public static String get_Attribute(WebElement element, String name) {
		String attribute = element.getAttribute(name);
		System.out.println(attribute);
		return attribute;
	}

	public static String get_cssvalue(WebElement element, String Name) {
		String cssValue = element.getCssValue(Name);
		System.out.println(cssValue);
		return cssValue;
	}

	public static boolean displayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;

	}

	public static boolean enabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;

	}

	public static boolean selected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;

	}

	public static void Screen_Shot(String path) throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File(path);
		FileUtils.copyFile(srcfile, destfile);

	}

	public static void alerts(String name) {
		if (name.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		} else if (name.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();

		}
	}

	public static WebDriver frame_by_element(WebElement element) {
		WebDriver frame = driver.switchTo().frame(element);
		return frame;
	}

	public static WebDriver frame_by_index(int index) {
		WebDriver frame = driver.switchTo().frame(index);
		return frame;
	}

	public static WebDriver frame_by_name(String name) {
		WebDriver frame = driver.switchTo().frame(name);
		return frame;

	}

	public static void click_Actions(WebDriver d, WebElement e) {
		Actions a = new Actions(d);
		a.click(e).build().perform();

	}

	public static void move_To_Element(WebDriver d, WebElement e) {
		Actions a = new Actions(d);
		a.moveToElement(e).build().perform();
	}

	public static void right_Click(WebDriver d, WebElement e) {
		Actions a = new Actions(d);
		a.contextClick().build().perform();

	}

	public static void double_click(WebDriver d, WebElement e) {
		Actions a = new Actions(d);
		a.doubleClick().build().perform();
	}

	public static void drag_and_drop(WebDriver d, WebElement source, WebElement target) {
		Actions a = new Actions(d);
		a.dragAndDrop(source, target).build().perform();

	}

	public static Timeouts Timesout(int sec) {
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));

		return implicitlyWait;
		
	}
	
	public static void select_By_Index(WebElement element,int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
		
	}
	public static void select_by_value(WebElement element,String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}
	public void select_by_Text(WebElement element,String text) {
		Select s= new Select(element);
		s.selectByVisibleText(text);
		
	}
	public boolean is_Multiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		return multiple;
	}
	public static void get_Options(WebElement element,int index) {
		Select s = new Select(element);
		List<WebElement> all_options = s.getOptions();
		for (int i = 0; i < all_options.size(); i++) {
			WebElement options = all_options.get(index);
			String text = options.getText();
			System.out.println(text);
		}	
	}
		public static void get_SelectedOptions(WebElement element) {
			Select s = new Select(element);
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for (WebElement allSelectedoptions : allSelectedOptions) {
			String text = allSelectedoptions.getText();
			System.out.println(text);
				
			}
			
		}
		 public static void get_FirstOption(WebElement element) {
			 Select s = new Select(element);
			  WebElement firstSelectedOption = s.getFirstSelectedOption();
			  String text = firstSelectedOption.getText();
			  System.out.println(text);
		}
		 

	 }


