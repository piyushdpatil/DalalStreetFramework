package com.BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleFire {
	public static void main(String []args) {
		//first set property in script 
		System.setProperty("webdriver.gecko.driver", "E:\\Software\\geckodriver.exe");
		//second create object
		
		WebDriver driver = new FirefoxDriver();
				
	}
}
	