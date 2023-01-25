package com.BasicSelenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Maildownload {
			public static void main(String []args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.navigate().to("https://mail.google.com/mail/u/0/#inbox/FMfcgzGqRZjcwhMXPxShFmgqkkSzpZdC");		
			Thread.sleep(3000);
			driver.findElement(By.id("identifierId")).sendKeys("yogesh.marathe@dpsnashik.in");	
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[1]/div/form/span/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input")).sendKeys("AmrRoh@123");
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();
			Thread.sleep(5000);
			
			//driver.close();
			
			
			}

}
