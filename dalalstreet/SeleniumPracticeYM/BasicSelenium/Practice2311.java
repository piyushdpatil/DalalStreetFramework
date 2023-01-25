package com.BasicSelenium;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Practice2311 {
	public static void main(String []args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","E:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		Thread.sleep(3000);
		
		js.executeScript("scrollBy(0, 500)");
		Thread.sleep(2000);
		//to take screenshot create local variable
		
		TakesScreenshot ts = ((TakesScreenshot)driver); 
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		// To store taken screenshot
		
		String path = "C:\\Users\\Asus\\Desktop\\Screens\\amazon1.jpg";
		File Destination = new File(path);
		FileHandler.copy(src, Destination);
		Thread.sleep(3000);
		
		
		driver.close();
		
	}

}

/*
package com.selenium;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Iframe {
	public static void main (String[]args){
	System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();//Upcasting
	
	driver.manage().window().maximize(); //browser window maximize
	
	driver.manage().deleteAllCookies();   //delete al
	drive
driver.get("https://demo.guru99.com/test/guru99home/");
	
	driver.switchTo().frame("a077aa5e");  //switching to the iframe by ID/NAME
	driver.findElement(By.xpath("/html/body/a")).click();
	
	System.out.println("******** WE ARE ON THE IFRAME*************");
	
	

	     //driver.switchTo().defaultContaint(); //sub frame to main frameor parent frame
	}*/

