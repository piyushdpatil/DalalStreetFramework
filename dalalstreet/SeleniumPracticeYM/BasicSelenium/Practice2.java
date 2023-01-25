package com.BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https:/www.facebook.com");
		driver.navigate().to("https:/www.facebook.com");
		Thread.sleep(3000);
		//driver.navigate().forward();
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.manage().deleteAllCookies();
		driver. close();
	}

}
