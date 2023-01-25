package com.BasicSelenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1211 {
	public static void main(String []args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		Dimension d = new Dimension(300, 200);
		driver.manage().window().setSize(d);
		Thread.sleep(5000);
		
		Dimension size = driver.manage().window().getSize();
		System.out.println("Dimension of browser are "+d);
		
		Point p = new Point(580,120);
		driver.manage().window().setPosition(p);
		Thread.sleep(5000);
		
		Point Position = driver.manage().window().getPosition();
		System.out.println("Position of browser is: "+p);
		Thread.sleep(5000);
		
			
		driver.close();
	}

}
