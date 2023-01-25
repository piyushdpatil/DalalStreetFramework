package com.BasicSelenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1111 {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.get("https://web.whatsapp.com/");
		driver.navigate().to("https://web.whatsapp.com/");
		Thread.sleep(10000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		
		Dimension d = new Dimension(600,200);
		driver.manage().window().setSize(d); // Resizing the browser window
		
		Dimension size = driver.manage().window().getSize(); // to get dimensions of the current window. 
		System.out.println("Size declared is " +size);
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
