package com.BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
	public static void main(String []args) throws InterruptedException {
		// initialize chrome - set property for that
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver.exe");
		//create object of webdriver 
		WebDriver driver = new ChromeDriver();
		//manage window size - maximize 
		driver.manage().window().maximize();
		//manage window size - minimize 
		//driver.manage().window().minimize();
		//manage window size - make it full screen. 
		//driver.manage().window().fullscreen();
		//visit to any website
		driver.get("https://www.amazon.in/");
		//add time delay to stay on that website
		Thread.sleep(2000);
		driver.get("https://www.facebook.com");
		
	}

}
