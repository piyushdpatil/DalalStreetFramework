package com.BasicSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DownloadDoc {
	public static void main(String []args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
		Thread.sleep(3000);
		
		driver.switchTo().frame("callout");
		driver.findElement(By.xpath("//button[@class='M6CB1c rr4y5c']")).click();
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath(" //input[@class='gLFyf']")).sendKeys("Automation Testing");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(" //input[@class='gNO89b']")).click();
		Thread.sleep(10000);
		
		driver.quit();
		
	}

}
