package com.puu_n_pui.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utility {

	public static WebDriver selectBrowser(String browser) {
		WebDriver driver = null;
		WebDriver driver1=null;
		WebDriver driver2=null;
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "../../DRIVERS/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "../../DRIVERS/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		System.out.println("hello");
		System.out.println("hello raj");
		return driver;
	}

}
