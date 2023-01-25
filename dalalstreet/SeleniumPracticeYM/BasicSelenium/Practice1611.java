package com.BasicSelenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;

public class Practice1611 {
	public static void main(String []args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		Dimension d = new Dimension(500,500);
		driver.manage().window().setSize(d);
		
		Dimension size = driver.manage().window().getSize();
		System.out.println("Set Size" +d);
		
		Point p = new Point(600,300);
		driver.manage().window().setPosition(p);
		Thread.sleep(1000);
		Point Position = driver.manage().window().getPosition();
		System.out.println("Position" +Position);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		//locator absolute xpath
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")).sendKeys("abc123");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
		driver.navigate().back();
		driver.navigate().back();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
		
		// locator relative xpath
		/*driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']")).sendKeys("apple iphone");
		driver.findElement(By.xpath("//input[@id = 'nav-search-submit-button']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		//Thread.sleep(2000);
		*/
		//driver.close();
	
	
	}

}
