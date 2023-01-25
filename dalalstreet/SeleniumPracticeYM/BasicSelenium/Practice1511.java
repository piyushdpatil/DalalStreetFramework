package com.BasicSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1511 {
	public static void main(String []args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		
		Dimension d = new Dimension(500, 500);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		Dimension Size = driver.manage().window().getSize();
		System.out.println("Dimension " +d);
		
		Point p = new Point(800, 500);
		driver.manage().window().setPosition(p);
		Thread.sleep(1000);
		
		Point position = driver.manage().window().getPosition();
		System.out.println("Position "+p);
		driver.manage().window().maximize();
		
		//driver.findElement(By.className("inputtext _55r1 _6luy _9npi")).sendKeys("abc2");
		//driver.findElement(By.name("username")).sendKeys("abc@gmail.com");
		//driver.findElement(By.name("password")).sendKeys("123456");
		//driver.findElement(By.className("_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p _abcm")).click();
		
		//driver.findElement(By.cssSelector("button[class ='_acan _acap _acas']")).click();
		
		driver.findElement(By.cssSelector("a[class = '_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Yogesh");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Yogesh");
		
		//driver.findElement(By.className("_ab37")).click();
		Thread.sleep(2000);
		//driver.findElement(By.linkText("Forgot password?")).click();
		//Thread.sleep(2000);
		
		
		
		
		
		//driver.close();
		
		
	}

}
