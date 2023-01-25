package com.BasicSelenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Iframe {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);	
		
		driver.findElement(By.xpath("//a[@id='u_0_0_be']")).click();
		Thread.sleep(3000);
		
		driver.close();
	}

}
