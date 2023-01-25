package com.BasicSelenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollingfunction {
	public static void main(String []args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("scrollBy(0, 5000)");
		
		Thread.sleep(3000);
		
		js.executeScript("scrollBy(2000, 0)");
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
	}

}
