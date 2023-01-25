package com.selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
  
public class BrokenLinks {
	public static void main(String[]args) throws InterruptedException, IOException {
		//WebDriverManager.chromedriver.setup();
		//Set properties
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//maximize 
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//get URL
		driver.get("https://demo.guru99.com/test/newtours/");
		//provide thread.sleep
		Thread.sleep(3000);
		//find all URl present in web page
		List <WebElement> links = driver.findElements(By.tagName("a"));
		//Count the number of links 
		System.out.println(links.size());
		
		for (int i=0; i<links.size();i++) {                                                                                          
			// take each link 
			WebElement element = links.get(i);
			//get href attribute of Url
			String url = element.getAttribute("href");
			URL link = new URL(url);// URL class for getting links
			// for making connections to URL
			HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();
			Thread.sleep(2000);
			//Establish Connection
			httpconn.connect();
			// get response code
			int responsecode = httpconn.getResponseCode();
			if(responsecode >=400) {
				System.out.println(url +"-"+ " is a broken url");
			}else {
				System.out.println(url + "- " + "is a valid link");
			}
		}
		
	}

}
