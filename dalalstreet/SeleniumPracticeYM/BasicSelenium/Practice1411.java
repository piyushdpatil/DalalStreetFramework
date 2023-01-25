package com.BasicSelenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class Practice1411 {
	public static void main(String []args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.get("https://www.amazon.in/");
		//driver.get("https://www.facebook.com/");
		driver.get("https://www.instagram.com/");
		
		//driver.findElement(By.tagName("input")).sendKeys("abc@gmail.com"); NW
		//driver.findElement(By.name("email")).sendKeys("abc@gmail.com");NW
		//driver.findElement(By.id("u_0_0_w+")).click();
		driver.findElement(By.name("username")).sendKeys("abc@gmail.com");
		//driver.findElement(By.name("username")).sendKeys("9970819317");
		//driver.findElement(By.name("password")).sendKeys("abccom");
		//driver.findElement(By.id("pass")).sendKeys("abc");
		//driver.findElement(By.linkText("https://www.facebook.com/recover/initiate/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjY4NDQ3MTYxLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D&amp")).click();
		//driver.findElement(By.id("u_0_0_cV")).click();
		//driver.findElement(By.id("nav-search-submit-button")).click();
		//Thread.sleep(3000);
		
		/*Dimension d = new Dimension(400,500);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		
		Dimension size = driver.manage().window().getSize();
		System.out.println("Set Size = "+d);
		
		Point p = new Point(300,400);
		driver.manage().window().setPosition(p);
		
		Point position = driver.manage().window().getPosition();
		System.out.println("set position = " +p);
		Thread.sleep(3000);*/
		
		
		
		
		
		
		//driver.close();
	}

}
